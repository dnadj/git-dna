/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.web.converter;

import com.dna.tools.tracker.expense.domain.Store;
import com.dna.tools.tracker.expense.factory.ApplicationContextFactory;
import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author deena
 */
@FacesConverter(value = "storeConvert")
public class StoreConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ExpenseTrackerService expenseTrackerService = ApplicationContextFactory.getExpenseTrackerService();
        Store store = null;
        try {
            Long storeId = Long.parseLong(value);
            store = expenseTrackerService.retrieveStore(storeId);
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid Store"));
        }
        return store;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String returnValue = null;
        if (value != null) {
            returnValue = ((Store) value).getId().toString();
        }
        return returnValue;
    }
}

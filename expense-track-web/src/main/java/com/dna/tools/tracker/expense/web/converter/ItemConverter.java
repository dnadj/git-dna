/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.web.converter;

import com.dna.tools.tracker.expense.domain.Item;
import com.dna.tools.tracker.expense.factory.ApplicationContextFactory;
import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author deena
 */
@FacesConverter(value="itemConvert")
public class ItemConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ExpenseTrackerService expenseTrackerService = ApplicationContextFactory.getExpenseTrackerService();
        Item item=expenseTrackerService.retrieveItem(new Long(value));
        return item;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String returnValue=null;
        if (value!=null) {
            returnValue=((Item)value).getId().toString();
        }
        return returnValue;
    }

}

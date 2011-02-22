/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.web;

import com.dna.tools.tracker.expense.domain.Store;
import com.dna.tools.tracker.expense.factory.ApplicationContextFactory;
import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author deena
 */
@ManagedBean
@SessionScoped
public class StoreEntryBean {

    private String name;
    private String suburb;
    private String address;
    private String state;
    private String postCode;
    private ExpenseTrackerService expenseTrackerService = ApplicationContextFactory.getExpenseTrackerService();

    public ExpenseTrackerService getExpenseTrackerService() {
        return expenseTrackerService;
    }

    public void setExpenseTrackerService(ExpenseTrackerService expenseTrackerService) {
        this.expenseTrackerService = expenseTrackerService;
    }

    public String add() {
        expenseTrackerService.addStore(createStore());
        return "index";
    }

    public Store createStore() {
        Store store = new Store();
        store.setName(name);
        store.setSuburb(suburb);
        store.setAddress(address);
        store.setState(state);
        store.setPostCode(postCode);
        return store;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
}

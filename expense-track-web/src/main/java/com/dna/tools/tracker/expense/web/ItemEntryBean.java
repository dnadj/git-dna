/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.web;

import com.dna.tools.tracker.expense.domain.Item;
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
public class ItemEntryBean {
    private String name;
    private String category;
    private String brand;
    private String description;

    private ExpenseTrackerService expenseTrackerService = ApplicationContextFactory.getExpenseTrackerService();

    public ExpenseTrackerService getExpenseTrackerService() {
        return expenseTrackerService;
    }

    public void setExpenseTrackerService(ExpenseTrackerService expenseTrackerService) {
        this.expenseTrackerService = expenseTrackerService;
    }

    public String add() {
        expenseTrackerService.addItem(createItem());
        return "index";
    }

    public Item createItem() {
        Item item = new Item();
        item.setName(name);
        item.setCategory(category);
        item.setBrand(brand);
        item.setDescription(description);
        return item;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.service;

import com.dna.tools.tracker.expense.dao.ExpenseTrackerDao;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author deena
 */
public class PersonalExpenseTrackerService implements ExpenseTrackerService {

    private ExpenseTrackerDao expenseTrackerDao;

    public ExpenseTrackerDao getExpenseTrackerDao() {
        return expenseTrackerDao;
    }

    @Inject
    public void setExpenseTrackerDao(ExpenseTrackerDao expenseTrackerDao) {
        this.expenseTrackerDao = expenseTrackerDao;
    }

    @Override
    public void addPurchase(Purchase purchase) {
        System.out.println("Service call success");
        expenseTrackerDao.addPurchase(purchase);
    }

    @Override
    public List getAllItemsList() {
        return expenseTrackerDao.getAllItemsList();
    }

    @Override
    public List getAllStoresList() {
        return expenseTrackerDao.getAllStoresList();
    }
}

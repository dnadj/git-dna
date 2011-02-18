/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.dao;

import com.dna.tools.tracker.expense.domain.Purchase;
import java.util.List;

/**
 *
 * @author deena
 */
public interface ExpenseTrackerDao {

    public void addPurchase(Purchase purchase);

    public List getAllItemsList();

    public List getAllStoresList();
}

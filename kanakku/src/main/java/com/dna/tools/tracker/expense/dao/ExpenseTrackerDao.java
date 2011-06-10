/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.dao;

import com.dna.tools.tracker.expense.domain.Item;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.dna.tools.tracker.expense.domain.Store;
import java.util.List;

/**
 *
 * @author deena
 */
public interface ExpenseTrackerDao {

    public void addPurchase(Purchase purchase);

    public List getAllItemsList();

    public List getAllStoresList();

    public void addItem(Item item);

    public void addStore(Store store);

    public List<Item> searchItems(String query);

    public List<Store> searchStores(String query);

    public Item retrieveItem(Long id);

    public Store retrieveStore(Long id);
}

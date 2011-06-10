/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.web;

import com.dna.tools.tracker.expense.domain.Item;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.dna.tools.tracker.expense.domain.Store;
import com.dna.tools.tracker.expense.factory.ApplicationContextFactory;
import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author deena
 */
@ManagedBean
@SessionScoped
public class PurchaseEntryBean {

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    private static final long serialVersionUID = 1L;
    private String itemId;
    private String itemName;
    private String storeId;
    private String storeName;
    private String qty;
    private String unit;
    private String cost;
    private Date date;
    private List<Item> itemList;
    private List storeList;
    private Item selectedItem;
    private Store selectedStore;

    public Store getSelectedStore() {
        return selectedStore;
    }

    public void setSelectedStore(Store selectedStore) {
        this.selectedStore = selectedStore;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public List<Item> completeItem(String query) {
        return expenseTrackerService.searchItems(query);
    }

    public List<Store> completeStore(String query) {
        return expenseTrackerService.searchStores(query);
    }

    public List getStoreList() {
        if (storeList == null) {
            storeList = expenseTrackerService.getAllStoresList();
        }
        return storeList;
    }

    public void setStoreList(List storeList) {
        this.storeList = storeList;
    }
    private ExpenseTrackerService expenseTrackerService = ApplicationContextFactory.getExpenseTrackerService();

    public ExpenseTrackerService getExpenseTrackerService() {
        return expenseTrackerService;
    }

    public void setExpenseTrackerService(ExpenseTrackerService expenseTrackerService) {
        this.expenseTrackerService = expenseTrackerService;
    }

    public List getItemList() {
        if (itemList == null) {
            itemList = expenseTrackerService.getAllItemsList();
        }
        return itemList;
    }

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public String add() {

        expenseTrackerService.addPurchase(createPurchase());

        return ("index");
    }

    public void handleItemSelect(SelectEvent event) {
        //this.selectedItem=expenseTrackerService.retrieveItem(new Long((String)event.getObject()));
        this.itemId=(String)event.getObject();
    }
    public void handleStoreSelect(SelectEvent event) {
        //this.selectedStore=expenseTrackerService.retrieveStore(new Long((String)event.getObject()));
        this.storeId=(String)event.getObject();
    }

    public Purchase createPurchase() {
        //this.selectedItem=expenseTrackerService.retrieveItem(new Long(itemId));
        //this.selectedStore=expenseTrackerService.retrieveStore(new Long(storeId));
        Purchase purchase = new Purchase();
        purchase.setItem(selectedItem);
        purchase.setStore(selectedStore);
        purchase.setCost(new Float(cost));
        purchase.setPurchaseDate(date);
        purchase.setUnit(unit);
        purchase.setQty(new Long(qty));
        return purchase;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

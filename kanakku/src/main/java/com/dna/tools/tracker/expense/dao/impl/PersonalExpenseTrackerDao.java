/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.dao.impl;

import com.dna.tools.tracker.expense.dao.AbstractHibernateDao;
import com.dna.tools.tracker.expense.dao.ExpenseTrackerDao;
import com.dna.tools.tracker.expense.domain.Item;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.dna.tools.tracker.expense.domain.Store;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author deena
 */
public class PersonalExpenseTrackerDao extends AbstractHibernateDao implements ExpenseTrackerDao {

    @Override
    public void addPurchase(Purchase purchase) {
        getSession().saveOrUpdate(purchase);
    }

    @Override
    public List getAllItemsList() {
        String hql="from Item";
        //Session session=sessionFactory.getCurrentSession();

        return getSession().createQuery(hql).list();
    }
    @Override
    public List getAllStoresList() {
         String hql="from Store";
        //Session session=sessionFactory.getCurrentSession();

        return getSession().createQuery(hql).list();

    }

    @Override
    public void addItem(Item item) {
        getSession().saveOrUpdate(item);
    }

    @Override
    public void addStore(Store store) {
        getSession().saveOrUpdate(store);
    }

    @Override
    public List<Item> searchItems(String query) {
        String hql="from Item i where i.name like :itemName";

        Query q=getSession().createQuery(hql);
        q.setParameter("itemName", "%"+query+"%");
        return q.list();
    }

    @Override
    public List<Store> searchStores(String query) {
        String hql="from Store s where s.name like :storeName";

        Query q=getSession().createQuery(hql);
        q.setParameter("storeName", "%"+query+"%");
        return q.list();
    }

    @Override
    public Item retrieveItem(Long id) {
        return (Item)getSession().get(Item.class, id);
    }

    @Override
    public Store retrieveStore(Long id) {
        return (Store)getSession().get(Store.class, id);
    }
}

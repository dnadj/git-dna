/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.dao.impl;

import com.dna.tools.tracker.expense.domain.Item;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.dna.tools.tracker.expense.domain.Store;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deena
 */
public class PersonalExpenseTrackerDaoTest {

    public PersonalExpenseTrackerDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addPurchase method, of class PersonalExpenseTrackerDao.
     */
    @Test
    public void testAddPurchase() {
        System.out.println("addPurchase");
        Purchase purchase = null;
        PersonalExpenseTrackerDao instance = new PersonalExpenseTrackerDao();
        instance.addPurchase(purchase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllItemsList method, of class PersonalExpenseTrackerDao.
     */
    @Test
    public void testGetAllItemsList() {
        System.out.println("getAllItemsList");
        PersonalExpenseTrackerDao instance = new PersonalExpenseTrackerDao();
        List expResult = null;
        List result = instance.getAllItemsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStoresList method, of class PersonalExpenseTrackerDao.
     */
    @Test
    public void testGetAllStoresList() {
        System.out.println("getAllStoresList");
        PersonalExpenseTrackerDao instance = new PersonalExpenseTrackerDao();
        List expResult = null;
        List result = instance.getAllStoresList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class PersonalExpenseTrackerDao.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item item = null;
        PersonalExpenseTrackerDao instance = new PersonalExpenseTrackerDao();
        instance.addItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStore method, of class PersonalExpenseTrackerDao.
     */
    @Test
    public void testAddStore() {
        System.out.println("addStore");
        Store store = null;
        PersonalExpenseTrackerDao instance = new PersonalExpenseTrackerDao();
        instance.addStore(store);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
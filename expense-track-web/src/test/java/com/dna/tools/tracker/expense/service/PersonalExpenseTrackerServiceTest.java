/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.service;

import com.dna.tools.tracker.expense.dao.ExpenseTrackerDao;
import com.dna.tools.tracker.expense.domain.Purchase;
import com.dna.tools.tracker.expense.util.SessionFactoryUtil;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author deena
 */
public class PersonalExpenseTrackerServiceTest extends TestCase {
    
    public PersonalExpenseTrackerServiceTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {

        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
       // SessionFactoryUtil.getInstance();
        super.tearDown();
    }

    /**
     * Test of getExpenseTrackerDao method, of class PersonalExpenseTrackerService.
     */
    public void testGetExpenseTrackerDao() {
        System.out.println("getExpenseTrackerDao");
        //PersonalExpenseTrackerService instance = new PersonalExpenseTrackerService();
        ExpenseTrackerDao expResult = null;
        //ExpenseTrackerDao result = instance.getExpenseTrackerDao();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}

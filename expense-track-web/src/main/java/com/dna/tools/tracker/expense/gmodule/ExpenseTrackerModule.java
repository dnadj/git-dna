/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.gmodule;

import com.dna.tools.tracker.expense.dao.ExpenseTrackerDao;
import com.dna.tools.tracker.expense.dao.impl.PersonalExpenseTrackerDao;
import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import com.dna.tools.tracker.expense.service.PersonalExpenseTrackerService;
import com.google.inject.AbstractModule;

/**
 *
 * @author deena
 */
public class ExpenseTrackerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ExpenseTrackerDao.class).to(PersonalExpenseTrackerDao.class);
        bind(ExpenseTrackerService.class).to(PersonalExpenseTrackerService.class);
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.factory;

import com.dna.tools.tracker.expense.service.ExpenseTrackerService;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author deena
 */
public class ApplicationContextFactory {
    private ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    private static ApplicationContextFactory contextFactory=new ApplicationContextFactory();

    public static ApplicationContextFactory getInstance() {
        return contextFactory;
    }

    public DataSource getDataSource() {
        return (DataSource)context.getBean("dataSource");
    }

    public SessionFactory getSessionFactory() {
        return (SessionFactory)context.getBean("sessionFactory");
    }

    public static SessionFactory createSessionFactory() {
        return ApplicationContextFactory.getInstance().getSessionFactory();
    }

    public static ExpenseTrackerService getExpenseTrackerService() {
        return (ExpenseTrackerService)ApplicationContextFactory.getInstance().context.getBean("expenseTrackerService");
    }
}

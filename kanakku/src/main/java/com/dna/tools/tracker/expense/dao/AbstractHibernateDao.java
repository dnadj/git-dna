/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.dao;

import com.dna.tools.tracker.expense.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author deena
 */
public class AbstractHibernateDao {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}

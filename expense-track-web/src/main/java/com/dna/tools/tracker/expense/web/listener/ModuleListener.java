/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.web.listener;

import com.dna.tools.tracker.expense.gmodule.ExpenseTrackerModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author deena
 */
public class ModuleListener implements ServletContextListener {

    @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {
    ServletContext servletContext = servletContextEvent.getServletContext();
    servletContext.removeAttribute(Injector.class.getName());
  }

    @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    Injector injector = Guice.createInjector(new  ExpenseTrackerModule());
    ServletContext servletContext = servletContextEvent.getServletContext();
    servletContext.setAttribute(Injector.class.getName(), injector);
  }
}

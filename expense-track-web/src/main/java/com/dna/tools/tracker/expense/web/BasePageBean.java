/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.tools.tracker.expense.web;

import com.google.inject.Injector;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author deena
 */
public abstract class BasePageBean implements Serializable {

    private Injector injector;

    public BasePageBean() {
    }

    public Injector getInjector() {
        if (injector == null) {
            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().
                    getExternalContext().getContext();
            injector = (Injector) servletContext.getAttribute(Injector.class.getName());
        }
        return injector;
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }

    @PostConstruct
    public void init() {
        getInjector().injectMembers(this);
    }
}

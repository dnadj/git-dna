/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.domain;

/**
 *
 * @author deena
 */
public class Store {
    private Long id;
    private String name;
    private String suburb;
    private String Address;
    private String state;
    private String postCode;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
}

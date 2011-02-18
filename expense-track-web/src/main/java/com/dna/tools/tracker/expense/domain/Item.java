/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.domain;

/**
 *
 * @author deena
 */
public class Item {
    private Long id;
    private String name;
    private String category;
    private String description;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

}

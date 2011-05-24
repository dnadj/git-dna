/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.shared;

import java.io.Serializable;

/**
 *
 * @author deena
 */
public class Item implements Serializable {
    private Long id;
    private String name;
    private String desciption;

    public Item() {
        
    }

    public Item(Long id, String name, String desciption) {
        this.id = id;
        this.name = name;
        this.desciption = desciption;
    }

    

    public String getDesciption() {
        return desciption;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    

}

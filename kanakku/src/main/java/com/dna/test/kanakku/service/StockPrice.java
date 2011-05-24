/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.service;

/**
 *
 * @author deena
 */
public class StockPrice {

    private String symbol;
    private double price;
    private double change;

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public StockPrice(String symbol, double price, double change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }
    
}

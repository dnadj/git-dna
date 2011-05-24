/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.test.kanakku.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.SuggestOracle;

/**
 *
 * @author deena
 */
public class HelloWorld implements EntryPoint {

    public void onModuleLoad() {
        MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
   oracle.add("Cat");
   oracle.add("Dog");
   oracle.add("Horse");
   oracle.add("Canary");

   //SuggestBox box = new SuggestBox(oracle);
   SuggestOracle oracleb=new ItemSuggestionOracle();
   SuggestBox box=new SuggestBox(oracleb);
        // Add it to the root panel.
        RootPanel.get().add(box);

    }
}

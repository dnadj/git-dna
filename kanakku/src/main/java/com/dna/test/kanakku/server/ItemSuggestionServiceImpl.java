/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.server;

import com.dna.test.kanakku.client.ItemSuggestionService;
import com.dna.test.kanakku.shared.Item;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 *
 * @author deena
 */

public class ItemSuggestionServiceImpl  extends RemoteServiceServlet implements ItemSuggestionService
{

    public Item[] getItems(String itemName) {
        Item[] items=new Item[3];
        items[0]=new Item(1L, "AA", "ZZ");
        items[1]=new Item(2L, "BB", "YY");
        items[2]=new Item(3L, "CC", "XX");
        return items;
    }

}

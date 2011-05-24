/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.client;

import com.dna.test.kanakku.shared.Item;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author deena
 */
public interface ItemSuggestionServiceAsync {
    void getItems(String itemName, AsyncCallback<Item[]> callback);
}

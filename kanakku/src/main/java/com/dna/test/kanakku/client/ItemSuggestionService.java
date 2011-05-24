/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.client;

import com.dna.test.kanakku.shared.Item;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author deena
 */
@RemoteServiceRelativePath("itemService")
public interface ItemSuggestionService extends RemoteService {

    public Item[] getItems(String itemName);

}

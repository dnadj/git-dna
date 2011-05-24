/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.test.kanakku.server;

import com.dna.test.kanakku.shared.Item;
import java.util.List;

/**
 *
 * @author deena
 */
public interface ItemSearcher {
    public List<Item> getItems(String searchName);

    public Item getItem(String matchingItemName);

    public Item retrieveItem(Long itemId);
}

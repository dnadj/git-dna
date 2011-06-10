/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dna.tools.tracker.expense.web;

import com.dna.tools.tracker.expense.domain.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deena
 */
public class AutoCompleteBean {

	private Item selectedItem;

	private List<Item> items;

	public AutoCompleteBean() {
		items = new ArrayList<Item>();

		items.add(new Item(10L,"Messi"));
		items.add(new Item(11L,"Ibrahimovic"));
		items.add(new Item(12L,"Henry"));
		items.add(new Item(13L,"Iniesta"));
		items.add(new Item(14L,"Xavi"));
		items.add(new Item(15L,"Puyol"));
	}

	public Item getSelectedItem() {
		return selectedItem;
	}
	public void setSelectedItem(Item selectedItem) {
		this.selectedItem = selectedItem;
	}

	public List<Item> completeItem(String query) {
		List<Item> suggestions = new ArrayList<Item>();

		for(Item p : items) {
			if(p.getName().startsWith(query))
				suggestions.add(p);
		}

		return suggestions;
	}
}

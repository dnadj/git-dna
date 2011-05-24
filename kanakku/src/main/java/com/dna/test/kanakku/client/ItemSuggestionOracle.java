/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.test.kanakku.client;

import com.dna.test.kanakku.shared.Item;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.SuggestOracle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author deena
 */
public class ItemSuggestionOracle extends SuggestOracle {

    private static final String JSON_URL = GWT.getModuleBaseURL() + "items/";
    private ItemSuggestionServiceAsync itemSuggestionService = GWT.create(ItemSuggestionService.class);

    @Override
    public void requestSuggestions(final Request request, final Callback callback) {
        if (itemSuggestionService == null) {
            itemSuggestionService = GWT.create(ItemSuggestionService.class);
        }

        // Set up the callback object.
        AsyncCallback<Item[]> asyncCallback = new AsyncCallback<Item[]>() {

            public void onFailure(Throwable caught) {
                // TODO: Do something with errors.
            }

            public void onSuccess(Item[] result) {
                List<Suggestion> suggestions = new ArrayList<Suggestion>();
                ItemSuggestion itemSuggestion = null;
                for (int i = 0; result  !=null && i < result.length; i++) {
                    Item item = result[i];
                    itemSuggestion = new ItemSuggestion(item.getName(), item.getDesciption());
                    suggestions.add(itemSuggestion);
                    
                }
                Response response = new Response();
                response.setSuggestions(suggestions);
                callback.onSuggestionsReady(request, response);
            }
        };

        // Make the call to the stock price service.
        itemSuggestionService.getItems(request.getQuery(), asyncCallback);

//
//        List<Suggestion> suggestions = new ArrayList<Suggestion>();
//        suggestions.add(new ItemSuggestion("123", "Deena"));
//        suggestions.add(new ItemSuggestion("456", "KK"));
//        Response response = new Response();
//        response.setSuggestions(suggestions);
//        callback.onSuggestionsReady(request, response);
    }
}

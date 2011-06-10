/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dna.test.kanakku.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DatePicker;

import java.util.Date;

/**
 *
 * @author deena
 */
public class PurchaseEntry implements EntryPoint {

    private SuggestBox suggestBox;
    private SuggestOracle oracle;
    private VerticalPanel mainPanel = new VerticalPanel();
    private TextBox price = new TextBox();
    private TextBox unit = new TextBox();
    private TextBox quantity = new TextBox();
    private FlexTable mainFlexTable = new FlexTable();
    private Button button = new Button();
    private DatePicker datePicker = new DatePicker();
    //private TextBox purchaseDate = new TextBox();
    private DateBox purchaseDate = new DateBox();

    public void onModuleLoad() {
        mainFlexTable.setText(0, 0, "Item ");

        oracle = new ItemSuggestionOracle();
        suggestBox = new SuggestBox(oracle);
        mainFlexTable.setWidget(0, 1, suggestBox);

        mainFlexTable.setText(1, 0, "Price ");
        mainFlexTable.setWidget(1, 1, price);
        mainFlexTable.setText(2, 0, "Unit ");
        mainFlexTable.setWidget(2, 1, unit);
        mainFlexTable.setText(3, 0, "Quantity ");
        mainFlexTable.setWidget(3, 1, quantity);
        mainFlexTable.setText(4, 0, "Date ");
        mainFlexTable.setWidget(4, 1, purchaseDate);


        DateBox.Format format = new DateBox.Format() {

            DateTimeFormat dateFormat = DateTimeFormat.getFormat("dd MMM yy");

            public String format(DateBox dateBox, Date date) {

                return (date != null) ? dateFormat.format(date) : dateFormat.format(new Date());
            }

            public Date parse(DateBox dateBox, String text, boolean reportError) {
                return dateFormat.parse(text);
            }

            public void reset(DateBox dateBox, boolean abandon) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        purchaseDate.setFormat(format);




        mainPanel.add(mainFlexTable);

        button.setText("Submit");

        button.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                addItem();
            }
        });


        mainPanel.add(button);

        RootPanel.get("item").add(mainPanel);





    }

    public void addItem() {
        //TODO addItem
    }
}

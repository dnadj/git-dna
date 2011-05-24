package com.dna.test.jersey;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author deena
 */
@Path("/stockwatcher/myName")
public class JaxbBeanResource {
    @GET
    @Produces("text/plain")
    public String getMapBean() {
        // Return some cliched textual content
        StockPrice price=new StockPrice("ABC", 123.00, 1.0);
        List<StockPrice> prices=new ArrayList<StockPrice>();
        prices.add(price);
        price=new StockPrice("DEF", 555.00, 2.0);
        prices.add(price);
    Gson gson = new Gson();
    
    Map<String, Object> map=new HashMap<String, Object>();
    map.put("symbol", "ABC");
    map.put("price", 123.00);
    map.put("change", 1.0);
       String json= gson.toJson(prices);
       return json;
    }
}

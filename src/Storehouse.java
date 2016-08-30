/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aidan
 */
public class Storehouse {

    // Inside the storehouse, the prices (and soon also the stocks) of the 
    // products have to be stored into a Map<String, Integer> variable! The 
    // type of the object so created can be HashMap, but you should use the 
    // interface Map for the variable type (see 40.4.2)

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        // , adding to the storehouse a product whose price and number of 
        // stocks are the parameter values
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        // returns the price of the parameter product;
        // if the product is not available in the storehouse, the method 
        // returns -99
        int returnValue = -99;
        if (this.prices.containsKey(product)) {
            returnValue = this.prices.get(product);
        }
        return returnValue;
    }
}

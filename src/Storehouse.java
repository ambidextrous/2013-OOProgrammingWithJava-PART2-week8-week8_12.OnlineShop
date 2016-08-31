/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    private Map<String, Integer> goods;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.goods = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        // , adding to the storehouse a product whose price and number of 
        // stocks are the parameter values
        this.prices.put(product, price);
        this.goods.put(product, stock);
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

    public int stock(String product) {
        //returns the stock of the parameter product.
        if (!this.goods.containsKey(product)) {
            return 0;
        }
        return this.goods.get(product);
    }

    public boolean take(String product) {
        // decreases the stock of the parameter product by one, and it 
        // returns true if the object was available in the storehouse. If 
        // the product was not in the storehouse, the method returns false, 
        // the product stock cannot go below zero.
        if (!this.goods.containsKey(product)) {
            return false;
        }
        if (this.goods.get(product) > 0) {
            int stockOfItem = this.goods.get(product);
            stockOfItem--;
            this.goods.replace(product, stockOfItem);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        // returns a name set of the products contained in the storehouse
        Set<String> availableProducts = this.goods.keySet();
        return availableProducts;
    }
}

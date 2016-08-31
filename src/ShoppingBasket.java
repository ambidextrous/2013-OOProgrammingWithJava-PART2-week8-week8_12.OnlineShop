/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aidan
 */
public class ShoppingBasket {

    private List<Purchase> basketContents;

    public ShoppingBasket() {
        this.basketContents = new LinkedList<Purchase>();
    }

    public void add(String product, int price) {
        // adds a purchase to the shopping basket;
        // the purchase is defined by the parameter product, and its price is the second parameter.        
        boolean alreadyInBasket = false;
        Purchase existingPurchase = null;
        for (Purchase purchase : this.basketContents) {
            if (purchase.getProduct().equals(product)) {
                alreadyInBasket = true;
                existingPurchase = purchase;
            }
        }
        if (alreadyInBasket) {
            existingPurchase.increaseAmount();
        } else {
            Purchase currentPurchase = new Purchase(product, 1, price);
            this.basketContents.add(currentPurchase);
        }
    }

    public int price() {
        // returns the shopping basket total price
        int totalPrice = 0;
        for (Purchase purchase : this.basketContents) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase purchase : this.basketContents) {
            System.out.println(purchase);
        }
    }
}

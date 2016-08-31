/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aidan
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    
    public Purchase(String product, int amount, int unitPrice) {
        // , which creates a purchase corresponding the parameter product. The 
        // product unit amount of purchase is clarified by the parameter amount, 
        // and the third parameter is the unit price
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        //, which returns the purchase price. This is obtained by raising the 
        // unit amount by the unit price
        return this.amount * this.unitPrice;
    }
    
    public void increaseAmount() {
        // increases by one the purchase unit amount
        this.amount++;
    }
    
    @Override
    public String toString() {
        // returns the purchase in a string form like the following
        // milk: 4
        return this.product + ": "+this.amount;
    }



       
//    // Experiment begins here
//    @Override
//    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//
//        if (getClass() != object.getClass()) {
//            return false;
//        }
//
//        Purchase compared = (Purchase) object;
//
//        if (this.product == null || !this.product.equals(compared.getRegCode())) {
//            return false;
//        }        
//        
//        if (this.country == null || !this.country.equals(compared.getCountry())) {
//            return false;
//        }
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        if (this.regCode == null) {
//            return 7;
//        }
//
//        return this.country.hashCode() + this.regCode.hashCode();
//    }     

    public String getProduct() {
        return product;
    }
    
}

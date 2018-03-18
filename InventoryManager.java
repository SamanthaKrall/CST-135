package com.company;

import javafx.collections.ObservableList;
import java.util.ArrayList;

public class InventoryManager extends Product{
    protected ObservableList<String> basketObservableList;
    protected ArrayList<String> basketList = new ArrayList<String>();
    InventoryManager(){

    }
    public boolean addInventoryToBasket(Product p, int quantity){
        String errorMessage = "";
        if(product.getTemporaryQuantity() == 0){
            errorMessage = "Out of stock of " + product.getName();
        }else{
            errorMessage = "There are only "+ product.getQuantity() + " left of " + product.getName();
        }
        return false;
    }else{
        product.setTemporaryQuantity(product.getTemporaryQuantity() - quantity);
        basketList.add(product.getName() + " - " + product.getProductID() + " -$ " + product.getPrice());

    }
    public void removeFromBasket(Sispenser mainDispenser, int productID, int Item){
        basketObservableList.remove(item);
        for(int count = 0; count < basketList.size(); count++){
            String[] itemToRemove = basketList.get(count).split(" - ");
            if(Integer.parseInt(itemToRemove[1]) == productID){
                basketList.remove(count);
            }
        }
        for(int count =0; count < mainDispenser.getProducts().size(); count++){
            Product product = mainDispenser.getProducts().get(count);
            if(product.getProductID() == productID){
                product.setTemporaryQuantity(product.getTemporaryQuantity() + 1);
            }
        }
    }
    public int getDrinks(){
        int amount =0;
        for(int count =0; count <productsArray.size(); count++){
            if(productsArray.get(count) instanceof Drinks){
                amount = amount +1;
            }
        }
        return amount;
    }
    public int getChips(){
        int amount =0;
        for(int count =0; count< productArray.size(); count++){
            if(productsArray.get(count) instanceof Chips){

                amount = amount +1;
            }
        }
        return amount;
    }
    public int getCandy(){
        int amount =0;
        for(int count =0; count < productsArray.size(); count ++){
            if(productsArray.get(count) instanceof Candy) {
                amount = amount +1;

            }
        }
        return amount;
    }
    public int getGum(){
        int amount =0;
        for(int count =0; count < productsArray.size(); count++){
            if(productsArray.get(count) instanceof Gum){
                amount = amount +1;
            }
        }
        return amount;
    }

}

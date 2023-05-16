package aula16_05;

import java.util.ArrayList;
import java.util.Arrays;


public class Book {
    private String name;
    private double price;
    private int qty = 0;
    //Author author1[] = new Author[50]; // em vez disso usa-se o arraylist
    ArrayList<Author> authorV = new ArrayList<Author>();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public ArrayList<Author> getAuthorV() {
        return authorV;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString(){
//        String aux = "";
//        for(int i =0; i< authorV.size();i++){
//            aux = aux + authorV.get(i);
//        }
        
        System.out.println("Book[name=" + name + ", authors"+ Arrays.toString(authorV)+"Author[name]}]");
    }

}

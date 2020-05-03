package by.lukash.FinalProject.repository;

import by.lukash.FinalProject.bean.Product;

import java.util.LinkedList;
import java.util.List;


public class ProductRepository  {

    private static List<Product> product = new LinkedList<>();

    public ProductRepository(){
    }

    public static List<Product> getProduct() {
        return product;
    }

}

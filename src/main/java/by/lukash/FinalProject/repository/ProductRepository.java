package by.lukash.FinalProject.repository;

import by.lukash.FinalProject.bean.Entity;
import by.lukash.FinalProject.interfaces.RepositoryInterface;
import by.lukash.FinalProject.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends AbstractRepository implements RepositoryInterface {

    private List<Product> products = new ArrayList<Product>();
    @Override
    public void add(Product product) {
        int listSize = products.size();
        product.setId(listSize);
        products.add(product);
    }
    @Override
    public Product getById (Integer id) {
        return products.get(id);
    }
    public void printAll(){
        for (Entity product: products){
            System.out.println(product);
        }
    }


}

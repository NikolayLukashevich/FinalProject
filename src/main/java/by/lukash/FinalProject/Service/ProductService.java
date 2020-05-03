package by.lukash.FinalProject.Service;

import by.lukash.FinalProject.bean.Product;
import by.lukash.FinalProject.interfaces.RepositoryInterface;
import by.lukash.FinalProject.repository.ProductRepository;

import java.math.BigDecimal;


public class ProductService implements RepositoryInterface {

    @Override
    public void add(Product product) {
        ProductRepository.getProduct().add(product);
    }

    @Override
    public Product getById(Long idProduct) {
        for (Product product : ProductRepository.getProduct()) {
            if (product.getIdProduct().compareTo(idProduct) == 0) {
                System.out.println("Product by id: " + idProduct + " is = " + product);
                return product;
            }
        }
        return null;
    }

    @Override
    public void printAll() {
        for (Product product : ProductRepository.getProduct()) {
            System.out.println(product);
        }
    }

    @Override
    public void removeById(Long idProduct) {
        for (Product product : ProductRepository.getProduct()) {
            if (product.getIdProduct().equals(idProduct)) {
                ProductRepository.getProduct().remove(product);
                return;
            }
        }
    }
    public void addDiscountToProductByName(String name) {
        for (Product entry : ProductRepository.getProduct()) {
            {if (entry.getNameProduct().equals(name)) {
                entry.setActualPrice(entry.getPrice().subtract(entry.getPrice().multiply(entry.setDiscount(BigDecimal.valueOf(0.2)))));
                return;
            }
            }
        }
    }
}





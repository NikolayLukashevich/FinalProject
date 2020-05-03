package by.lukash.FinalProject.interfaces;

import by.lukash.FinalProject.bean.Product;

public interface RepositoryInterface {
    void add (Product product);
    Product getById (Long idProduct);
    void printAll();
    void removeById (Long idProduct);
}

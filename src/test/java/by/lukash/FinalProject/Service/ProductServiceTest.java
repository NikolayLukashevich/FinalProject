package by.lukash.FinalProject.Service;

import by.lukash.FinalProject.bean.Product;

import by.lukash.FinalProject.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;



import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;


public class ProductServiceTest {
    @Test
    public void getByIdTest() {
        List<Product> ProductRepo = new LinkedList<>();

        Product product = new Product("Манго", "Вкусный, сочный", Product.Category.FRUIT, BigDecimal.valueOf(6.99));
        Product product1 = new Product("Арбуз", "Большой, красый", Product.Category.BERRIES, BigDecimal.valueOf(2.99));
        Product product2 = new Product("Огурец", "Длинный, зелёный", Product.Category.VEGETABLE, BigDecimal.valueOf(3.50));
        ProductRepo.add(product);
        ProductRepo.add(product1);
        ProductRepo.add(product2);
        Long expected1 = 1L;
        Long actual1 = product.getIdProduct();
        Assert.assertEquals(expected1, actual1);
        Long expected2 = 2L;
        Long actual2 = product1.getIdProduct();
        Assert.assertEquals(expected2, actual2);
        Long expected3 = 3L;
        Long actual3 = product2.getIdProduct();
        Assert.assertEquals(expected3, actual3);
    }
}


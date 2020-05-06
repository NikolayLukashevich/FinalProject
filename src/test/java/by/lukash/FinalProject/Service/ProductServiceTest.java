package by.lukash.FinalProject.Service;

import by.lukash.FinalProject.bean.Product;

import by.lukash.FinalProject.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;



public class ProductServiceTest {
    ProductService productService = new ProductService();
    Product product = new Product(
            "Манго",
            "Вкусный, сочный",
            Product.Category.FRUIT,
            BigDecimal.valueOf(10), //Price
            BigDecimal.valueOf(0.5),//Discount
            BigDecimal.valueOf(5)   //actualPrice
    );
@Before
        public void setUp(){
    ProductRepository.getProduct().clear();
    ProductRepository.getProduct().add(product);
}

    @Test
    public void getByIdTest() {
        Product actual = product;
        Product expected = productService.getById(1L);
        Assert.assertEquals(expected, actual);
           }

    @Test
    public void add() {
        Product actual = productService.getById(1L);
        Product expected = productService.getById(1L);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addDiscountToProductByNameTest() {
        productService.addDiscountToProductByName("Манго", BigDecimal.valueOf(0.5));
        Assert.assertEquals(BigDecimal.valueOf(5.0), product.getActualPrice());
    }
//
//    @Test
//    void printAll() {
//
//    }

    @Test
    public void removeById() {
    ProductRepository.getProduct().remove(product);
    boolean actual = ProductRepository.getProduct().isEmpty();
    Assert.assertEquals(true, actual);
    }
}



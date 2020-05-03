package by.lukash.FinalProject.bean;


import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Product implements Serializable {

    public BigDecimal price;
    private Long idProduct;
    private String nameProduct;
    private String description;
    private BigDecimal discount;
    Category productCategory;
    private static AtomicLong GUID = new AtomicLong();
    private BigDecimal actualPrice;

    public Product() {
        GUID.set(0);
    }
    public Product(String nameProduct,String description,Category category, BigDecimal price,BigDecimal discount, BigDecimal actualPrice) {
        productCategory = category;
        this.price = price;
        this.nameProduct = nameProduct;
        this.description = description;
        this.discount = discount;
        this.actualPrice = actualPrice;
        idProduct = GUID.incrementAndGet();
    }
    public Product(String nameProduct,String description, Category category, BigDecimal price) {
        productCategory = category;
        this.description = description;
        this.price = price;
        this.nameProduct = nameProduct;
        idProduct = GUID.incrementAndGet();
    }

    public enum Category {
        FRUIT,
        VEGETABLE,
        BERRIES
    }

     public BigDecimal setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
        return actualPrice;
    }

    public BigDecimal setDiscount(BigDecimal discount) {
        this.discount = discount;
        return discount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }
}


package by.lukash.FinalProject.bean;


import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class Product extends Entity implements Serializable {

    private BigDecimal price;
    Category productCategory;

    public Product(Integer id, String name, BigDecimal price, Category category) {
        super(id, name);
        productCategory = category;
        this.price = price;
    }

    public enum Category {
        FRUIT,
        VEGETABLE,
        BERRIES
    }

}


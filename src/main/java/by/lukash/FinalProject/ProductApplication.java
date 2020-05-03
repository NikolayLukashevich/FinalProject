package by.lukash.FinalProject;

//import by.lukash.FinalProject.Annotation.AnnotationService.LazyLoadService;
//import by.lukash.FinalProject.Annotation.AnnotationService.SimpleLoadService;
import by.lukash.FinalProject.Service.ProductService;
import by.lukash.FinalProject.bean.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.math.BigDecimal;

//import static by.lukash.FinalProject.Annotation.AnnotationService.inspectService.inspectService;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ProductApplication.class, args);
		Product product = new Product("Манго", "Вкусный, сочный", Product.Category.FRUIT, BigDecimal.valueOf(6.99));
		Product product1 = new Product("Арбуз", "Большой, красый", Product.Category.BERRIES, BigDecimal.valueOf(2.99));
		Product product2 = new Product("Огурец", "Длинный, зелёный", Product.Category.VEGETABLE, BigDecimal.valueOf(3.50));
		ProductService productService = new ProductService();


//		productService.removeById(Long.valueOf(1));
//		productService.printAll();

		productService.add(product);
		productService.add(product1);
		productService.add(product2);
		productService.printAll();
		productService.addDiscountToProductByName("Манго");
		productService.getById(Long.valueOf(1));

//		Annotation
//		inspectService(LazyLoadService.class);
//		inspectService(SimpleLoadService.class);
//		inspectService(String.class);
	}
}

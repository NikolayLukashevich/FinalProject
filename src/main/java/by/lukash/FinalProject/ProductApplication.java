package by.lukash.FinalProject;

import by.lukash.FinalProject.Annotation.AnnotationService.LazyLoadService;
import by.lukash.FinalProject.Annotation.AnnotationService.SimpleLoadService;
import by.lukash.FinalProject.bean.Product;
import by.lukash.FinalProject.repository.ProductRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

import static by.lukash.FinalProject.Annotation.AnnotationService.inspectService.inspectService;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		Product product = new Product(null, "product", BigDecimal.valueOf(123.5555)  , Product.Category.FRUIT);
		Product product1 = new Product(null, "product1", BigDecimal.valueOf (123.6666), Product.Category.BERRIES);;
		Product product2 = new Product(null, "product2", BigDecimal.valueOf (123.7777), Product.Category.VEGETABLE);;
		ProductRepository productRepository = new ProductRepository();
		productRepository.add(product);
		productRepository.add(product1);
		productRepository.add(product2);
//		productRepository.printAll();

		Product productFromRepository = productRepository.getById(0);

		System.out.println(productFromRepository);

		//Annotation
		inspectService(LazyLoadService.class);
		inspectService(SimpleLoadService.class);
		inspectService(String.class);
	}





	//		SpringApplication.run(ProductApplication.class, args);
}

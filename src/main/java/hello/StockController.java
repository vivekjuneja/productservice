package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	
	  @RequestMapping("/products/{id}/stock")
	    public Product addProduct(@PathVariable(value="id") String id) {
	        return new Product(counter.incrementAndGet(),
	                            String.format(template, name));
	    }

}

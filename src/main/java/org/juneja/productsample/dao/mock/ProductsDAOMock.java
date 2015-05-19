package org.juneja.productsample.dao.mock;

import hello.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.juneja.productsample.utils.RandomUtils;

/**
 * Generate a mocked Data Source to test the application
 * 
 * @author admin
 *
 */
public class ProductsDAOMock {

	private static final int PRODUCT_ID_START = 1;
	private static final int DEFAULT_NUMBER_OF_PRODUCTS = 10;

	private static ProductsDAOMock prodDaoMock;

	private Map<Long, Product> productInventory = new HashMap<Long, Product>();
	private final AtomicLong counter = new AtomicLong(PRODUCT_ID_START);

	private Product generateProduct() {
		Product sampleProduct = new Product(counter.incrementAndGet(),
				RandomUtils.generateRandomStr());
		return sampleProduct;
	}

	private void init(int numberOfProducts) {

		Product eachProduct = null;

		// Generate number of products
		for (int i = 0; i < numberOfProducts; i++) {
			eachProduct = generateProduct();
			productInventory.put(eachProduct.getId(), eachProduct);
		}

	}

	public void printProducts() {
		Iterator<Long> productInventoryIterator = productInventory.keySet()
				.iterator();

		while (productInventoryIterator.hasNext()) {
			System.out.println(productInventory.get(productInventoryIterator
					.next()));
		}
	}

	public static ProductsDAOMock newInstance(int numberOfProducts) {
		if (prodDaoMock == null) {
			prodDaoMock = new ProductsDAOMock(numberOfProducts);
		}
		return prodDaoMock;
	}

	private ProductsDAOMock() {
		this(DEFAULT_NUMBER_OF_PRODUCTS);
	}

	private ProductsDAOMock(int numberOfProducts) {
		init(numberOfProducts);
	}

	public Product retrieveProduct(long id) {
		return productInventory.get(id);
	}

}

package org.juneja.productsample.dao.mock;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

public class ProductsDAOMockTest {

	@Test
	public void test() {


		
	}
	
	public static void main(String[] args) {
		ProductsDAOMock prodDaoMock = ProductsDAOMock.newInstance(5);
		
		prodDaoMock.printProducts();
	}
}

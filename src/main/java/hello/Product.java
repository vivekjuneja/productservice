package hello;

public class Product {

	private final long id;
	private final String content;
	private long stockQuantity;

	public Product(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", content=" + content
				+ ", stockQuantity=" + stockQuantity + "]";
	}
	
	
}

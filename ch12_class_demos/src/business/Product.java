package business;

public class Product implements Comparable {
	
	private String code;
	private String description;
	private double price;
	protected static int count = 0;   // since static, all instances will have the same value
	
	public Product(String code, String description, double price) {
		super();   	// doesn't actually do anything
					// means parent = java.lang.????
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public Product() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
	//	return description;
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}
	
	public static void increasePrice(Product p) {
		double price = p.getPrice() * 2;
		p.setPrice(price); 
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Product) {  			// checks if object is an instance of product
			Product product2 = (Product) object;  	// cast object as a Product
			if (code.equalsIgnoreCase(product2.getCode()) ) {
				return true;  						// could check all fields if needed
			}
		}
		return false;
	}

	@Override
	public int compareTo(Object arg0) {
		// compare products by code
		Product p = (Product)arg0;
		int c = this.code.compareTo(p.getCode());
		return c;
	}

}

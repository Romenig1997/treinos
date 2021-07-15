package entitites;

public class ProductVect {

		
		private String name;
		private double price;
		
		public ProductVect() {
			
		}
		
		public ProductVect(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setProce(double price) {
			this.price = price;
		}


}

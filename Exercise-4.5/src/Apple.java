
public class Apple extends Fruit {
	protected int quantity;
	protected double price, discount, totalPrice;

	public Apple(String name, int quantity, double price) {
		super(name);
		this.quantity = quantity;
		this.price = price;

		if (name.equals("Apple")) {
			Discount a = new AppleDiscount();
			System.out.println("Discount rate\t:" + (a.rateOfDiscount() * 100) + "%");
			discount = (1 - a.rateOfDiscount());
			totalPrice = totalPrice(discount);
		} else if (name.equals("Red Apple")) {
			Discount r = new RedAppleDiscount();
			System.out.println("Discount rate\t: " + (r.rateOfDiscount() * 100) + "%");
			discount = (1 - r.rateOfDiscount());
			totalPrice = totalPrice(discount);
		} else if (name.equals("Green Apple")) {
			Discount g = new GreenAppleDiscount();
			System.out.println("Discount rate\t: " + (g.rateOfDiscount() * 100) + "%");
			discount = (1 - g.rateOfDiscount());
			totalPrice = totalPrice(discount);
		}
	}

	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public double totalPrice(double discount) {
		return this.quantity * this.price * discount;
	}

	public double totalPrice(int quantity) {
		return quantity * this.price;
	}

	public double totalPrice(int quantity, double price) {
		return quantity * price;
	}

	public String promotion() {
		String juice = "\nBuy at least 6 apples to get free apple juice!";
		if (this.quantity > 6) {
			juice = "\nCongratulations! You get a bottle of free apple juice!";
		}
		return juice;
	}

	public String vitamin() {
		return "\nApples contains vitamin A and C!";
	}

	public String toString() {
		return "\nName\t\t: " + this.name + "\nQuantity\t: RM " + this.quantity + "\nUnit Price\t: RM " + this.price
				+ "\nTotal Price\t: RM " + this.totalPrice + promotion() + vitamin();
	}
}

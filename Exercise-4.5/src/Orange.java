
public class Orange extends Fruit {
	private String colour, taste;
	private int quantity;
	private double price, shipping, discount, totalPrice;

	public Orange(String name, String colour, String taste, int quantity, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.price = price;

		if (quantity < 5) {
			System.out.println("No discount for purchase of less than 5 oranges.");
			totalPrice = totalPrice();
		} else if (quantity < 10){
			Discount o = new OrangeDiscount();
			System.out.println("Discount rate\t: " + (o.rateOfDiscount() * 100) + "%");
			discount = (1 - o.rateOfDiscount());
			totalPrice = totalPrice(discount);
		}
		else {
			price = 0.99;
			System.out.println("Price of orange is RM0.99 for every purchase of more than 10 oranges!");
			totalPrice = totalPrice();
		}
	}

	public String vitamin() {
		return "\nOranges contains vitamin A,B and C!";
	}

	public double shipping() {
		if (this.quantity < 5) {
			this.shipping = 5.00;
		} else if (this.quantity < 10) {
			this.shipping = 3.00;
		} else {
			this.shipping = 0.00;
		}
		return this.shipping;
	}

	public double totalPrice() {
		return this.quantity * this.price;
	}
	
	public double totalPrice(double discount) {
		return this.quantity * this.price * discount;
	}

	public String toString() {
		return "\nName\t\t: " + this.name + "\nColour\t\t: " + this.colour + "\nTaste\t\t: " + this.taste
				+ "\nQuantity\t: " + this.quantity + "\nUnit Price\t: RM " + this.price + "\nTotal Price\t: RM "
				+ this.totalPrice + "\nShipping Fee\t: RM " + shipping() + "\nTotal Price(Include Shipping): RM"
				+ (totalPrice() + shipping()) + vitamin();
	}
}

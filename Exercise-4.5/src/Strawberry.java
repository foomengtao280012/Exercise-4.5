
public class Strawberry extends Fruit {
	private String colour, taste;
	private int quantity;
	private double weight, price, discount, totalPrice;

	public Strawberry(String name, String colour, String taste, int quantity, double weight, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;

		if (totalWeight(quantity, weight) < 0.5) {
			System.out.println("No discount for purchase of less than 0.5kg.");
			totalPrice = totalPrice(quantity, weight);
		} else {
			Discount s = new StrawberryDiscount();
			System.out.println("Discount rate\t: " + (s.rateOfDiscount() * 100) + "%");
			discount = (1 - s.rateOfDiscount());
			totalPrice = totalPrice(quantity, weight, discount);
		}
	}

	public String vitamin() {
		return "\nStrawberries contains vitamin C!";
	}

	public double totalWeight(int quantity, double weight) {
		return quantity * weight;
	}

	public double totalPrice(int quantity, double weight) {
		return quantity * weight * price;
	}

	public double totalPrice(int quantity, double weight, double discount) {
		return quantity * weight * price;
	}

	public String toString() {
		return "\nName\t\t: " + this.name + "\nColour\t\t: " + this.colour + "\nTaste\t\t: " + this.taste
				+ "\nNumber of box\t: " + this.quantity + "\nWeight per box\t: " + this.weight + "kg"
				+ "\nTotal weight\t: " + totalWeight(quantity, weight) + "kg" + "\nPrice per kg\t: RM " + this.price
				+ "\nTotal Price\t: RM " + this.totalPrice + vitamin();
	}
}
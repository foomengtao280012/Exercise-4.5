
public abstract class Fruit {
	protected String name;
	public Fruit(String name) {
		this.name = name;
	    System.out.println(name + " constructor is invoked");
	    System.out.println();
	  }
	
	public String vitamin() {
		return "\nFruits are generally rich in vitamin C!";
	}
	
	public String toString() {
		return vitamin();
	}
}
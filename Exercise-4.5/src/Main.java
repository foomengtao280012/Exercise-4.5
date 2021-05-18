
public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple", 2, 1.2);
		System.out.println(a);
		System.out.println();
	    
		RedApple b = new RedApple("Red Apple", "Red", "Sweet", 4, 1.4);
		System.out.println(b);
		System.out.println();
	    
		GreenApple c = new GreenApple("Green Apple", "Green", "Sour", 5, 1.3);
		System.out.println(c);
		System.out.println();
	    
		Orange d = new Orange("Orange", "Orange", "Sweet", 8, 0.7);
		System.out.println(d);
		System.out.println();
	    
		Strawberry e = new Strawberry("Strawberry", "Red", "Sweet", 4, 0.8, 5);
		System.out.println(e);
		System.out.println();
	}

}

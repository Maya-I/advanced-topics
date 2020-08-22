package passing_parameters;

public class MainIceCream {

	public static void main(String[] args) {
		IceCreamShop myIceCream = new IceCreamShop("Vanilla");
		System.out.println("#1 main -> " + myIceCream);
		
		changeFlavor(myIceCream);
		System.out.println("#2 main -> " + myIceCream);
	}
	
	public static void changeFlavor(IceCreamShop icecream) {
		System.out.println("#1 method -> " + icecream);
		icecream = new IceCreamShop("Passion fruit");
		System.out.println("#2 method -> " + icecream);
	}

}

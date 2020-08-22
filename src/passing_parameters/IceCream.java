package passing_parameters;

public class IceCream {

	public static void main(String[] args) {
		int iceCreamBalls = 2;
		System.out.println("#1 main -> " + iceCreamBalls);
		addIceCreamBall(iceCreamBalls);
		System.out.println("#2 main -> " + iceCreamBalls);	
	}
	
	public static void addIceCreamBall(int iceCreamBalls) {
			System.out.println("#1 method -> " + iceCreamBalls);
			iceCreamBalls = iceCreamBalls + 1;
			System.out.println("#2 method -> " + iceCreamBalls);
		}
}

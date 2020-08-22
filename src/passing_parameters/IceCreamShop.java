package passing_parameters;

public class IceCreamShop {
	String flavor;

	public IceCreamShop(String flavor) {
		this.flavor = flavor;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "IceCreamShop [flavor=" + flavor + "]";
	}
	

}

package encapsulation;

public class Mainclass {
	public static void main(String[] args) {
		Addedfunctionality a1=new Addedfunctionality();
		a1.setDoors("opened");
		a1.setDriver("not seated");
		a1.setEngine("off");
		a1.setSpeed(0);
		System.out.println(a1.run());
	}

}

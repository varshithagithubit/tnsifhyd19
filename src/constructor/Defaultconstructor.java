package constructor;

public class Defaultconstructor {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public  Defaultconstructor() {
		doors="closed";
		engine="on";
		driver="seated";
		speed=40;
		}
	 public String run() {
		 if(doors.equals("closed")&& engine.equals("on") && driver.equals("seated")&& speed>0) {
			 return "car is running";	 
		 }
		 else {
			 return "car is not running";
		 }
	 }	 


public static void main(String[] args) {
	Defaultconstructor d1=new Defaultconstructor();
	System.out.println(d1.run());
	
}
	



}
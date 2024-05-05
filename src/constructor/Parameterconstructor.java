package constructor;

public class Parameterconstructor {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Parameterconstructor(String doors,String driver,String engine,int speed) {
		this.doors=doors;
		this.engine=engine;
		this.driver=driver;
		this.speed=speed;	
	}
	
	public String run() {
		if(doors.equals("closed")&&  driver.equals("seated")&& engine.equals("on")&& speed>0) {
			return "car is running";
			}
		else {
			return "car is not running";
				}
	}

	public static void main(String[] args) {
		Parameterconstructor p1=new Parameterconstructor("closed","seated","on",40);
		Parameterconstructor p2= new Parameterconstructor("opened","notseated","off",0);
		System.out.println(p1.run());
		System.out.println(p2.run());
		
		
		

	}

}

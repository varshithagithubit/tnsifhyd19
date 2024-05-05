package com.sample;

public class Approach1 {
	String batsman="virat kohli";
	static String bowler="bumrah";
	void display() {
		System.out.println("cricket");
	}
	static String display1() {
		return "bowler";	
	}
	public static void main(String[] args) {
		Approach1 A1=new Approach1();
		System.out.println(A1.batsman);
		A1.display();
		System.out.println(Approach1.bowler);
		String returnedValue = Approach1.display1();
		System.out.println(returnedValue);
		
		
	}
	

}

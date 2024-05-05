package com.sample;

public class Sample {
	
	

	//Accessing local variable

int a =10; //instance variable
static int b=20; //static variable



public static void main(String[] args) {
	
	int c=30; //local variable
	
	
	//Accessing instance Variable by creating objects
	Sample s1 = new Sample();
	System.out.println(s1.a);
	
	// Accessing static variable through class
	
	System.out.println(Sample.b);
	
	//or Accessing same static variable by specific variable itself
	
System.out.println(b);
System.out.println(c);
}
}

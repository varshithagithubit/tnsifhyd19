package college;
import java.lang.*;
import java.util.*;
public class builtinpackage {
	String str="hello, world!";
	String[] months= {"september","october","november","december"};
	int num[]= {20,43,60,70,86,2,10,45,100,5};

	public static void main(String[] args) {
		builtinpackage b1=new builtinpackage();
		builtinpackage b2=new builtinpackage();
		System.out.println("returns a string representation:"+b1.toString());
		System.out.println("length of the string is:"+b1.str.length());
		System.out.println(" returns boolean value:"+b1.equals(b2));
		List<String> month_list= Arrays.asList(b1.months);	
		System.out.println("converts array to list:"+month_list);
		Arrays.sort(b1.num);
		System.out.println("sort the array:"+Arrays.toString(b1.num));
		
		
	}	
		
		
}		
		
		
	
	
	
	
	
	
	
	
	
	



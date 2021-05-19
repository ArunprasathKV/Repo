package Org.test;


import java.util.ArrayList;
import java.util.List;

public class DataTable {
public static void main(String[] args) {
	List<String>emp = new ArrayList<String>();
	emp.add("Ram");
	emp.add("Ram@gmail.com");
	emp.add("Java");
	String s = emp.get(1);
	System.out.println(s);
	
	
}
}

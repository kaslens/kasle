package Selenium;

public class Strings_starts_with_java2 {
public static void main(String[]args) {
	String name="Selenium";
	boolean position=name.startsWith("i",5);
	System.out.println(position);
	if(position)
	{
		System.out.println("Testcase is fail");
		
	}
	else
		System.out.println("Testcase is pass");
}
}

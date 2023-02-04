package Selenium;

public class String_starts_with {

	public static void main(String[] args) {
		String name="selenium with java";
boolean position=name.startsWith("m,6");

//System.out.println(position);
if(position)
{
	System.out.println("Testcase is fail");
}
else
{
System.out.println("Testcase is pass");
}}
}
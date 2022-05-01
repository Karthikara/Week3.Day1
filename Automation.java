package org.bank;

public class Automation implements Language,TestTool{
public void java()
{
	System.out.println("Java is a language");
}
public void selenium()
{
	System.out.println("Selenium is a Testing tool");
}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		
	}

}

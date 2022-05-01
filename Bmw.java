package week3.Day1;

public class Bmw extends Car{
public void autoPark() {
	System.out.println("Car is parked automatically");
}
public void handBrake() {
	System.out.println("h");
}
public void getBrakes() {
	this.handBrake();
	super.handBrake();
	
}
}

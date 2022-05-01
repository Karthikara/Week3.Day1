package week3.Day1;

public class MyCar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vehicle obj=new Vehicle();
         obj.applyBrake();
         obj.soundHorn();
         Car action= new Car();
        action.handBrake();
         action.turnAC();
         Bmw parkBmw=new Bmw();
        parkBmw.autoPark();
        parkBmw.handBrake();
        parkBmw.getBrakes();
	}
}

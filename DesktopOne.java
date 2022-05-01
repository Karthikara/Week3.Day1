package org.System;

public class DesktopOne extends ComputerONE{
public void desktopSize() {
	System.out.println("15inches");
}
public static void main(String args[]) {
	DesktopOne size=new DesktopOne();
	size.desktopSize();
	ComputerONE model=new ComputerONE();
	model.computerModel();
}
}

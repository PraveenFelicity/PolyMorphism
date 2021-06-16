package com.mod;

public class Iphone8Plus extends Iphone8{

	public void Memory () {
		System.out.println("256gb");
	}
	@Override
	public void camera() {
		System.out.println("25MP");
	}
	@Override
	public void screenSize() {
		System.out.println("9 Inches");
	}
	public static void main (String[] args) {
		Iphone8Plus i = new Iphone8Plus ();
		i.Memory();
		i.camera();
		i.softwares();
		i.screenSize();
	}
}

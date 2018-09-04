package com.others;

public class DemoTest {
	public void on(){
		System.out.println("DemoTest.main()");
	}
	public static void main(String[] args) {
		DemoTest dTest  = new DemoTest();
		dTest.on();
		Sup sup = new Sup();
		sup.in();
		
	}
}
class Sup{
	public void in(){
		System.out.println("Sup.in()");
	}
}

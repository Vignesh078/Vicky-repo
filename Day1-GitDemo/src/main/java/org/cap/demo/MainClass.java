package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass c1=new SalesClass();
		Demo d=new Demo();
		System.out.println("Hello World!!!");
		greet();
		c1.show();
		d.display();
	}

	public static void greet() {
		System.out.println("welcome");
		for(int i=0;i<5;i++) {
		System.out.println("Testing....."); }
		System.out.println("git rep...");
		
	}
}

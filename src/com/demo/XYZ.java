package com.demo;

public class XYZ {
	public void ele() {
		System.out.println("ele");
	}
	
	public static void add(){
		XYZ a = new XYZ();
		a.ele();
	}

	public static void main(String[] args) {
		add();
		
	}
}
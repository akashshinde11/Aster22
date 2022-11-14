package com.demo;

public  class Meth {
	public  Meth(){
		System.out.println("This is constructor");
	}
	static{
		System.out.println("This is Static block");
	}
	{
	System.out.println("This is an instance block");
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		
		Meth b=new Meth();
		System.out.println(i);
	}
}

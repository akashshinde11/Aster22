package com.demo;

public class Block {
		public  Block(){
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
			Block b=new Block();
			System.out.println(i);
	    }
	}


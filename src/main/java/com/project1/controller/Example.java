package com.project1.controller;
public class Example{
	public void application(){
	 System.out.println("Outside");
	}
	public static void main(String[] args){
    System.out.println("inside");
	Example e=new Example();
	e.application();
	
	}
}


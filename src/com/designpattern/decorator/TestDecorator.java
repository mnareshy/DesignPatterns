package com.designpattern.decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		RedBorderDecorator redBorder = new RedBorderDecorator(circle);
		BlueFillDecorator blueFill = new BlueFillDecorator(redBorder);
		
		blueFill.draw();
		
		System.out.println("________________________");
		
		circle.draw();
		
		
		
		
		
		
	}

}

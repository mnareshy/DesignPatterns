package com.designpattern.facade;

public class ShapeMaker {
	
	private Shape circle = null;
	private Shape rectangle = null;
	private Shape square = null;
	
	public ShapeMaker()
	{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
		
	}
	
	
	public void drawCircle()
	{
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle.draw();
	}
	
	public void drawSquare()
	{
		square.draw();
	}

}

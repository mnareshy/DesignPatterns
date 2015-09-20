package com.designpattern.decorator;

public abstract class ShapeDecorator implements Shape {
	
	public Shape shape = null;
	
	public ShapeDecorator(Shape shape)
	{
		this.shape = shape;
	}
	
	@Override
	public void draw()
	{
		shape.draw();
	}
}

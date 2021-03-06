package com.designpattern.decorator;

public class RedBorderDecorator extends ShapeDecorator{

	public Shape shape = null;

	public RedBorderDecorator(Shape shape)
	{
		super(shape);
		this.shape =shape;
	}

	@Override
	public void draw() {
		setRedBorder();
		shape.draw();
	}

	private void setRedBorder(){
		System.out.println("Border Color: Red");
	}

}

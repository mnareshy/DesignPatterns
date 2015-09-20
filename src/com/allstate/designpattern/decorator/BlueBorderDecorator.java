package com.allstate.designpattern.decorator;

public class BlueBorderDecorator extends ShapeDecorator{

	public Shape shape = null;

	public BlueBorderDecorator(Shape shape)
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
		System.out.println("Border Color: Blue");
	}

}

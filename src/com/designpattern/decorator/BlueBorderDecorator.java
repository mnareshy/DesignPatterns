package com.designpattern.decorator;

public class BlueBorderDecorator extends ShapeDecorator{

	public Shape shape = null;

	public BlueBorderDecorator(Shape shape)
	{
		super(shape);
		this.shape =shape;
	}

	@Override
	public void draw() {
		setBlueBorder();
		shape.draw();
	}

	private void setBlueBorder(){
		System.out.println("Border Color: Blue");
	}

}

package com.designpattern.decorator;

public class BlueFillDecorator extends ShapeDecorator{

	public Shape shape = null;

	public BlueFillDecorator(Shape shape)
	{
		super(shape);
		this.shape =shape;
	}

	@Override
	public void draw() {
		setBlueFill();
		shape.draw();
	}

	private void setBlueFill(){
		System.out.println("Fill Color: Blue");
	}

}

package Abstracts;

import java.awt.Graphics;

public abstract class ObstructionView {
	protected int boxDimension;
	protected double x;
	protected double y;
	protected int halfDimension;

	// Render
	public abstract void render(Graphics g);

	// Constructor
	public ObstructionView() {
	}

	// Getters Setters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public int getBoxDimension() {
		return boxDimension;
	}
	public int getHalfDimension() {
		return halfDimension;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	public void setBoxDimension(int boxDimension){
		this.boxDimension = boxDimension;
		this.halfDimension = boxDimension/2;
	}

}

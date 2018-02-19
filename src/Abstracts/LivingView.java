package Abstracts;

import java.awt.Color;
import java.awt.Graphics;

public abstract class LivingView {

	protected int boxDimension;
	protected double x;
	protected double y;
	protected int halfDimension;

	// Render
	public abstract void render(Graphics g);

	// Constructor
	public LivingView() {
	}

	// Getters Setters
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public int getBoxDimension() {
		return this.boxDimension;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setBoxDimension(int boxDimension) {
		this.boxDimension = boxDimension;
	}
}

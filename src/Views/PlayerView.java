package Views;

import java.awt.Color;
import java.awt.Graphics;

import Abstracts.LivingView;

public class PlayerView extends LivingView {

	private double x;
	private double y;
	private int boxDimension;

	// Constructor
	public PlayerView() {
	}

	// Render
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect((int) x, (int) y, boxDimension, boxDimension);
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

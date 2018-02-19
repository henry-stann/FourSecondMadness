package Controllers;

import java.awt.Graphics;

import Models.WallModel;
import Top.Game;
import Views.WallView;

public class WallController {
	private WallView wallView;
	private WallModel wallModel;

	// Render
	// WallController renders WallView
	public void render(Graphics g) {
		wallView.setX(wallModel.getX());
		wallView.setY(wallModel.getY());
		wallView.setBoxDimension(wallModel.getBoxDimension());
		wallView.render(g);
	}


	// Constructor
	// WallController Constructs WallView and WallModel
	WallController() {
		wallView = new WallView();
		wallModel = new WallModel();
	}
	
	
	// Getters Setters
	public double getWallX() {
		return wallModel.getX();
	}

	public double getWallY() {
		return wallModel.getY();
	}
	
	public int getWallBoxDimension() {
		return wallModel.getBoxDimension();
	}
	public int getWallHalfDimension() {
		return wallModel.getHalfDimension();
	}

	public void setWallX(double x) {
		wallModel.setX(x);
	}

	public void setWallY(double y) {
		wallModel.setY(y);
	}
	public void setWallBoxDimension(int boxDimension){
		wallModel.setBoxDimension(boxDimension);
	}

}

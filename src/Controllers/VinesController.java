package Controllers;

import java.awt.Graphics;

import Models.VinesModel;
import Models.WallModel;
import Top.Game;
import Views.VinesView;
import Views.WallView;


public class VinesController {

	private VinesView vinesView;
	private VinesModel vinesModel;

	// Render
	// WallController renders WallView
	public void render(Graphics g) {
		vinesView.setX(vinesModel.getX());
		vinesView.setY(vinesModel.getY());
		vinesView.setBoxDimension(vinesModel.getBoxDimension());
		vinesView.render(g);
	}

	// Constructor
	// WallController Constructs VinesView and VinesModel
	VinesController() {
		vinesView = new VinesView();
		vinesModel = new VinesModel();
	}

	// Getters Setters
	public double getVinesX() {
		return vinesModel.getX();
	}

	public double getVinesY() {
		return vinesModel.getY();
	}
	
	public int getVinesBoxDimension() {
		return vinesModel.getBoxDimension();
	}
	public int getVinesHalfDimension() {
		return vinesModel.getHalfDimension();
	}

	public void setVinesX(double x) {
		vinesModel.setX(x);
	}

	public void setVinesY(double y) {
		vinesModel.setY(y);
	}
	public void setVinesBoxDimension(int boxDimension){
		vinesModel.setBoxDimension(boxDimension);
	}


}

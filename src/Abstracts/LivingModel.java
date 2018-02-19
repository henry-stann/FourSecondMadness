package Abstracts;

import Storage.ItemBag;

public abstract class LivingModel {

	protected int boxDimension;
	protected double x;
	protected double y;
	protected int halfDimension;
	protected ItemBag itemBag;
	
	//Constructor
	public LivingModel(){
		itemBag = new ItemBag();
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
	
	public ItemBag getItemBag() {
		return itemBag;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setBoxDimension(int boxDimension) {
		this.boxDimension = boxDimension;
		this.halfDimension = boxDimension / 2;
	}
}

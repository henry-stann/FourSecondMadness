package Models;

import Storage.ItemBag;

public class MyButtonModel {

	private int[] buttonXYD;
	private int shopRow;
	private int shopColumn;
	private int shopBoxDimension;
	private int inventoryX;
	private int inventoryY;
	private int inventoryBoxDimension;
	private boolean visible;
	
	//Render
	public void render(){
		
	}
	
	//Construct
	public MyButtonModel(int[] buttonXYD){
		this.buttonXYD = buttonXYD;
		this.shopRow = buttonXYD[0];
		this.shopColumn = buttonXYD[1];
		this.shopBoxDimension = buttonXYD[2];
		this.inventoryX = buttonXYD[3];
		this.inventoryY = buttonXYD[4];
		this.inventoryBoxDimension = buttonXYD[5];
		}
		
	
	
	//Getters Setters
	
	public boolean isVisible(){
		return visible;
	}
	
	public int[] getButtonXYD(){
		return buttonXYD;
	}
	
	public void setVisible(boolean tf){
		this.visible = tf;
	}

}

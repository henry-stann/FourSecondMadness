package Views;

import java.awt.Color;
import java.awt.Graphics;

public class MyButtonView {

	private int[] buttonXYD;
	private int boxDimension;
	private int column;
	private int row;

	// Render
	public void renderFilledSlots(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(column, row, boxDimension, boxDimension);
	}

	public void renderEmptySlots(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(column, row, boxDimension, boxDimension);

	}
	
	//Getters Setters
	public int[] getButtonXYD(){
		return buttonXYD = new int[]{row,column,boxDimension};
	}
	
	public void setButtonXYD(int row, int column, int boxDimension){
		this.row = row;
		this.column = column;
		this.boxDimension = boxDimension;
	}


}

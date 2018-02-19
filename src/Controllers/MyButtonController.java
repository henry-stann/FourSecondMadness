package Controllers;

import java.awt.Graphics;

import Models.MyButtonModel;
import Storage.ItemBag;
import Top.Game;
import Views.MyButtonView;

public class MyButtonController {

	private MyButtonView myButtonView;
	private MyButtonModel myButtonModel;

	// Render
	public void render(Graphics g) {
		if (myButtonModel.isVisible()) {
			myButtonView.setButtonXYD(myButtonModel.getButtonXYD()[3],
					myButtonModel.getButtonXYD()[4],
					myButtonModel.getButtonXYD()[5]);
		} else {
			myButtonView.setButtonXYD(myButtonModel.getButtonXYD()[0],
					myButtonModel.getButtonXYD()[1],
					myButtonModel.getButtonXYD()[2]);

		}
		myButtonView.renderFilledSlots(g);

		if (myButtonModel.isVisible()) {
			myButtonView.setButtonXYD(myButtonModel.getButtonXYD()[0],
					myButtonModel.getButtonXYD()[1],
					myButtonModel.getButtonXYD()[2]);
		} else {
			myButtonView.setButtonXYD(myButtonModel.getButtonXYD()[3],
					myButtonModel.getButtonXYD()[4],
					myButtonModel.getButtonXYD()[5]);

		}
		myButtonView.renderEmptySlots(g);
	}

	// Constructor
	public MyButtonController(Game game, int[] ButtonXYD) {
		myButtonView = new MyButtonView();
		myButtonModel = new MyButtonModel(ButtonXYD);
	}

	// Getters Setters
	public boolean isVisible() {
		return myButtonModel.isVisible();
	}

	public void setVisible(boolean tf) {
		myButtonModel.setVisible(tf);
	}
}

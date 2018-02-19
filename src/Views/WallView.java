package Views;

import java.awt.Color;
import java.awt.Graphics;

import Abstracts.ObstructionView;

public class WallView extends ObstructionView{

	public void render(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect((int) x, (int) y, boxDimension, boxDimension);

	}

	
	
}

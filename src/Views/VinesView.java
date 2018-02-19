package Views;

import java.awt.Color;
import java.awt.Graphics;

import Abstracts.ObstructionView;

public class VinesView extends ObstructionView{

	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) x, (int) y, boxDimension, boxDimension);

	}

}

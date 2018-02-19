package Views;

import java.awt.Color;
import java.awt.Graphics;

import Top.Game;

public class Level1View {

	//Render
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
	}

	// Constructor
	public Level1View() {
	}
}

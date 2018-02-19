package Top;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import Models.KeyModel;

public class KeyInput extends KeyAdapter {
	// Vars
	private KeyModel keyModel;

	// KeyDown
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_W) {
			// System.out.println("W pressed");
			keyModel.setW(true);
		}
		if (key == KeyEvent.VK_S) {
			keyModel.setS(true);
		}
		if (key == KeyEvent.VK_A) {
			keyModel.setA(true);
		}
		if (key == KeyEvent.VK_D) {
			keyModel.setD(true);
		}
		if (key == KeyEvent.VK_ESCAPE) {
			for (int i = 1; i < 2; i++) {
				if (!keyModel.getEsc()) {
					keyModel.setEsc(true);
					break;
				}
				if (keyModel.getEsc()) {
					keyModel.setEsc(false);
					break;
				}
			}
		}

	}

	// KeyUp
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_W) {
			// System.out.println("W depressed");
			keyModel.setW(false);
		}
		if (key == KeyEvent.VK_S) {
			keyModel.setS(false);
		}
		if (key == KeyEvent.VK_A) {
			keyModel.setA(false);
		}
		if (key == KeyEvent.VK_D) {
			keyModel.setD(false);
		}
	}

	// Constructor
	public KeyInput(KeyModel keyModel) {
		this.keyModel = keyModel;
	}

}

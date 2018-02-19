package Top;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Controllers.MainController;

public class Game extends Canvas implements Runnable {
	// Vars
	public static final int WIDTH = 640;
	private static final int RESOLUTION = 12 / 9;
	public static final int HEIGHT = WIDTH / RESOLUTION;
	public static final int XOFFSET = 40;
	public static final int YOFFSET = 60;
	public static int xBoundary = WIDTH - XOFFSET;
	public static int yBoundary = HEIGHT - YOFFSET;
	public static final int midY = yBoundary/2;
	public static final int midX = xBoundary/2;
	private boolean running = false;
	public static final int FPS = 120;
	private Thread thread;
	private static final long serialVersionUID = 1L;
	private long lastTime;
	private long now;
	private Graphics g;
	private MainController mainController;

	// Game Loop
	public void run() {
		lastTime = System.currentTimeMillis();
		this.requestFocusInWindow();
		while (running) {
			now = System.currentTimeMillis();
			if (now - lastTime > 1000 / FPS) {
				lastTime = now;
				render();
			}

		}
		stop();
	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
	     if (mainController != null) {
	    	 mainController.render(g);
	         } 
	         
		g.dispose();
		bs.show();
	}

	// Start Stop
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Main
	public static void main(String[] args) {
		new Game();
	}

	// Constructor
	public Game() {
		System.out.println("Creating window");
		new Window(WIDTH, HEIGHT, "4 Second Madness", this);
		System.out.println("Window created");
		mainController = new MainController(this);
		System.out.println("Started!");

	}
}




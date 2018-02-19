package Views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Top.Game;

public class MenuView {

	private boolean[] itemList = new boolean[] { false, true };
	private String titleString;
	private Font titleFont;
	private int titleX;
	private int titleY;
	private int[] shopInterface;
	private int[] inventoryInterface;
	private String inventoryString;
	private Font inventoryFont;
	private int inventoryX;
	private int inventoryY;
	private String shopString;
	private Font shopFont;
	private int shopX;
	private int shopY;

	public void renderBackground(Graphics g) {
		renderTitle(g);
		renderShopAndInventoryInterfaces(g);
		renderShopAndInventoryTitles(g);

	}

	private void renderTitle(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.WHITE);
		g.drawString(titleString, titleX, titleY);
		
	}
	


	private void renderShopAndInventoryInterfaces(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(shopInterface[0], shopInterface[1], shopInterface[2],
				shopInterface[3]);
		g.fillRect(inventoryInterface[0], inventoryInterface[1],
				inventoryInterface[2], inventoryInterface[3] - 200);
		// Why does this -200 have no impact?
		
	}

	private void renderShopAndInventoryTitles(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(shopFont);
		g.drawString(shopString, shopX, shopY);
		g.setFont(inventoryFont);
		g.drawString(inventoryString, inventoryX, inventoryY);

	}



	// Getters Setters
	public void setTitle(String titleString, Font titleFont, int[] titleXY) {
		this.titleString = titleString;
		this.titleFont = titleFont;
		this.titleX = titleXY[0];
		this.titleY = titleXY[1];
	}



	public void setInventoryName(String inventoryString, Font inventoryFont,
			int[] inventoryXY) {
		this.inventoryString = inventoryString;
		this.inventoryFont = inventoryFont;
		this.inventoryX = inventoryXY[0];
		this.inventoryY = inventoryXY[1];

	}


	public void setShopName(String shopString, Font shopFont, int[] shopXY) {
		this.shopString = shopString;
		this.shopFont = shopFont;
		this.shopX = shopXY[0];
		this.shopY = shopXY[1];

	}

	public void setShopInterface(int[] shopInterface) {
		this.shopInterface = shopInterface;
	}

	public void setInventoryInterface(int[] inventoryInterface) {
		this.inventoryInterface = inventoryInterface;

	}

}

package Models;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Storage.ItemBag;
import Top.Game;

public class MenuModel {

	// 1 = healthPack
	// 2 = manaPack
	// 3 = armor
	// 4 = magicResistance
	// 5 = gauntlets
	// 6 = wings
	// 7 = goggles

	private int shopBoxDimension = 60;
	private int inventoryBoxDimension = 20;
	private int shopBuffer = 20;
	private int inventoryBuffer = 5;
	private int shopDistance = shopBoxDimension + shopBuffer;
	private int inventoryDistance = inventoryBoxDimension + inventoryBuffer;
	private int titleX = 100;
	private int titleY = 100;
	private int[] titleXY;
	private int[] shopXY;
	private int[] inventoryXY;
	private int column1 = titleX + 36;
	private int column2 = column1 + 1 * shopDistance;
	private int column3 = column1 + 2 * shopDistance;
	private int column4 = column1 + 3 * shopDistance;
	private int column5 = column1 + 4 * shopDistance;
	private int row1 = titleY + 120;
	private int row2 = row1 + 1 * shopDistance;
	private int row3 = row1 + 2 * shopDistance;
	private int row4 = row1 + 3 * shopDistance;
	private int row5 = row1 + 4 * shopDistance;
	private boolean[] itemList = new boolean[] { false, true };
	private int[] gogglesXYD;
	private int[] healthPackXYD;
	private Font titleFont = new Font("arial", Font.BOLD, 50);
	private Font shopFont = new Font("arial", Font.BOLD, 15);
	private Font inventoryFont = shopFont;
	private String titleString = "4Second Madness";
	private String shopString = "Ol' Shoppe";
	private String inventoryString = "inventory";
	private int[] armorXYD;
	private int[] manaPackXYD;
	private int[] magicResistanceXYD;
	private int[] gauntletsXYD;
	private int[] wingsXYD;
	private int[][] masterXYD;
	public static final int itemGraphics = 6;
	private int inventoryRow2 = Game.yBoundary;
	private int inventoryRow1 = inventoryRow2 - inventoryDistance;
	private int inventoryRowSpecial = (inventoryRow2 + inventoryRow1) / 2;
	private int inventoryColumn1 = 0 + (int) 2 * inventoryDistance;
	private int inventoryColumn2 = inventoryColumn1 + 1 * inventoryDistance;
	private int inventoryColumn3 = inventoryColumn1 + 2 * inventoryDistance;
	private int inventoryColumn4 = inventoryColumn1 + 3 * inventoryDistance;
	private int smallestShopX = column1 - shopBuffer;
	private int largestShopX = column4 + 2 * shopBuffer;
	private int smallestShopY = row1 - shopBuffer;
	private int largestShopY = row1 + shopDistance;
	private int smallestInventoryX = inventoryColumn1 - inventoryBuffer;
	private int largestInventoryX = inventoryColumn3 + inventoryBuffer;
	private int smallestInventoryY = inventoryRow1 - inventoryBuffer;
	private int largestInventoryY = smallestInventoryY;
	// Why does largestInventoryY have no impact?
	private int inventoryNameX = smallestInventoryX;
	private int inventoryNameY = smallestInventoryY;
	private int shopNameX = smallestShopX;
	private int shopNameY = smallestShopY;
	
	
	// Constructor
	public MenuModel() {
		masterXYD = new int[ItemBag.itemsAvailable][itemGraphics];
		masterXYD[0] = healthPackXYD = new int[] { row1, column1,
				shopBoxDimension, inventoryRow1, inventoryColumn1,
				inventoryBoxDimension };
		masterXYD[1] = manaPackXYD = new int[] { row1, column2,
				shopBoxDimension, inventoryRow1, inventoryColumn2,
				inventoryBoxDimension };
		masterXYD[2] = armorXYD = new int[] { row1, column3, shopBoxDimension,
				inventoryRow1, inventoryColumn3, inventoryBoxDimension };
		masterXYD[3] = magicResistanceXYD = new int[] { row1, column4,
				shopBoxDimension, inventoryRow2, inventoryColumn1,
				inventoryBoxDimension };
		masterXYD[4] = gauntletsXYD = new int[] { row1, column5,
				shopBoxDimension, inventoryRow2, inventoryColumn2,
				inventoryBoxDimension };
		masterXYD[5] = wingsXYD = new int[] { row2, column1, shopBoxDimension,
				inventoryRow2, inventoryColumn3, inventoryBoxDimension };
		masterXYD[6] = gogglesXYD = new int[] { row2, column2,
				shopBoxDimension, inventoryRowSpecial, inventoryColumn4,
				inventoryBoxDimension };
	}

	// Getters Setters

	public String getTitleString() {
		return titleString;
	}

	public Font getTitleFont() {
		return titleFont;
	}

	public int[] getTitleXY() {
		return titleXY = new int[] { titleX, titleY };
	}

	public String getShopString() {
		return shopString;
	}

	public Font getShopFont() {
		return shopFont;
	}

	public int[] getShopXY() {
		return shopXY = new int[] { shopNameX, shopNameY };
	}

	public String getInventoryString() {
		return inventoryString;
	}

	public Font getInventoryFont() {
		return inventoryFont;
	}

	public int[] getInventoryXY() {
		return inventoryXY = new int[] { inventoryNameX, inventoryNameY };
	}

	public int[][] getMasterXYD() {
		return masterXYD;
	}

	public int[] getPurchaseInterface() {
		return new int[] { smallestShopX, smallestShopY, largestShopX,
				largestShopY };
	}

	public int[] getInventoryInterface() {
		return new int[] { smallestInventoryX, smallestInventoryY,
				largestInventoryX, largestInventoryY };
	}

}

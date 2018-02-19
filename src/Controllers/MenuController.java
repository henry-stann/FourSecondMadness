package Controllers;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import Models.MenuModel;
import Storage.ItemBag;
import Top.Game;
import Views.MenuView;

public class MenuController {

	// 1 = healthPack
	// 2 = manaPack
	// 3 = armor
	// 4 = magicResistance
	// 5 = gauntlets
	// 6 = wings
	// 7 = goggles

	private MenuView menuView;
	private MenuModel menuModel;
	private MyButtonController myButtonItemsController[] = new MyButtonController[ItemBag.itemsAvailable];

	// Render
	public void render(Graphics g, ItemBag itemBag) {
		menuView.setShopInterface(menuModel.getPurchaseInterface());
		menuView.setInventoryInterface(menuModel.getInventoryInterface());
		menuView.setTitle(menuModel.getTitleString(), menuModel.getTitleFont(),
				menuModel.getTitleXY());
		menuView.setInventoryName(menuModel.getInventoryString(), menuModel.getInventoryFont(),
				menuModel.getInventoryXY());
		menuView.setShopName(menuModel.getShopString(), menuModel.getShopFont(),
				menuModel.getShopXY());
		
		menuView.renderBackground(g);
		for (int i = 0; i < ItemBag.itemsAvailable; i++) {
			myButtonItemsController[i].setVisible(itemBag.accessItems()[i]);
			myButtonItemsController[i].render(g);
		}
	}

	// Constructor
	public MenuController(Game game) {
		menuModel = new MenuModel();
		menuView = new MenuView();
		for (int i = 0; i < ItemBag.itemsAvailable; i++) {
			myButtonItemsController[i] = new MyButtonController(game,
					menuModel.getMasterXYD()[i]);
		}

	}

}

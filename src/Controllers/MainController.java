package Controllers;

import java.awt.Color;
import java.awt.Graphics;

import Models.KeyModel;
import Storage.ItemBag;
import Top.Game;
import Views.Level1View;

public class MainController {

	private KeyModel mainKey;
	private MenuController menu;
	private Level1Controller level1Controller;
	private ItemBag itemBag;

	// Render
	// MainController renders Level1, player, and accesses shop
	public void render(Graphics g) {
		if (mainKey.getEsc()) {
			itemBag = level1Controller.getPlayerItemBag();
			menu.render(g, itemBag);
			return;
		}
		level1Controller.render(g);


	}

	// Constructor
	// MainController constructs background, keyListner to switch to shop,
	// PlayerController, ShopController
	public MainController(Game game) {
		mainKey = new KeyModel(game);
		level1Controller = new Level1Controller(game);
		menu = new MenuController(game);
	}
}

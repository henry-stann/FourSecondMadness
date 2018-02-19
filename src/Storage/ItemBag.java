package Storage;

import java.util.Arrays;

public class ItemBag {

	// 1 = healthPack
	// 2 = manaPack
	// 3 = armor
	// 4 = magicResistance
	// 5 = gauntlets 
	// 6 = wings
	// 7 = goggles

	public static final int itemsAvailable = 7;
	private boolean[] itemsHave = new boolean[itemsAvailable];

	public boolean[] accessItems() {
		return itemsHave;
	}

	// Constructor
	public ItemBag() {
//		for(int i=0;i<itemsAvailable;i++){
//			itemsHave[i] = true;
//		}
		itemsHave[0] = true;
		itemsHave[1] = true;
	}

	// Getters Setters
	public boolean[] getItems() {
		return itemsHave;
	}

	public void buyItem(String item) {
		// this.itemsHave = itemsHave + item;
	}
}

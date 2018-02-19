package Controllers;

import java.awt.Graphics;

import Storage.ItemBag;
import Top.Game;
import Views.Level1View;

public class Level1Controller {
	private PlayerController playerController;
	private Level1View level1View;
	private WallController wall1Controller;
	private WallController wall2Controller;
	private VinesController vines1Controller;

	// Render
	public void render(Graphics g) {
		level1View.render(g);
		wall1Controller.render(g);
		wall2Controller.render(g);
		vines1Controller.render(g);
		slowMovement(vines1Controller, playerController);
		playerController.movement();
		preventCollision(wall1Controller, playerController);
		preventCollision(wall2Controller, playerController);
		playerController.render(g);
	}

	// if player intersects a wall
	// reset player position to nearest edge
	// (allows players moving fast enough to go through a wall)
	private void preventCollision(WallController wallController,
			PlayerController playerController) {
		int playerDimension = playerController.getBoxDimension();
		int playerHalfDimension = playerController.getHalfDimension();
		double playerNorth = playerController.getY();
		double playerSouth = playerNorth + playerDimension;
		double playerMidY = playerNorth + playerHalfDimension;
		double playerWest = playerController.getX();
		double playerEast = playerWest + playerDimension;
		double playerMidX = playerWest + playerHalfDimension;
		double wallNorth = wallController.getWallY();
		double wallSouth = wallNorth + wallController.getWallBoxDimension();
		double wallMidY = wallNorth + wallController.getWallHalfDimension();
		double wallWest = wallController.getWallX();
		double wallEast = wallWest + wallController.getWallBoxDimension();
		double wallMidX = wallWest + wallController.getWallHalfDimension();
		double xCorrection = 0;
		double yCorrection = 0;

		if (wallWest < playerEast && playerWest < wallEast
				&& wallNorth < playerSouth && playerNorth < wallSouth) {
			if (playerMidX <= wallMidX && wallWest < playerEast) {
				xCorrection = playerEast - wallWest; // gives positive
			}
			if (wallMidX < playerMidX && playerWest < wallEast) {
				xCorrection = playerWest - wallEast; // gives negative
			}
			if (playerMidY <= wallMidY && wallNorth < playerSouth) {
				yCorrection = playerSouth - wallNorth; // gives positive
			}
			if (wallMidY < playerMidY && playerNorth < wallSouth) {
				yCorrection = playerNorth - wallSouth;
			}

			if (Math.abs(yCorrection) <= Math.abs(xCorrection)) {
				// System.out.println("xCorrection = " + xCorrection
				// + "yCorrection = " + yCorrection);
				if (playerMidY <= wallMidY)
					playerController.setY(wallNorth - playerDimension);
				if (wallMidY < playerMidY)
					playerController.setY(wallSouth);
			}
			if (Math.abs(xCorrection) < Math.abs(yCorrection)) {
				if (wallMidX < playerMidX)
					playerController.setX(wallEast);
				if (playerMidX <= wallMidX)
					playerController.setX(wallWest - playerDimension);
			}

		}
	}
	
	// if the player intersects the vines, 
	// their movement = 10%
	private void slowMovement(VinesController vinesController,
			PlayerController playerController){
		int playerDimension = playerController.getBoxDimension();
		double playerNorth = playerController.getY();
		double playerSouth = playerNorth + playerDimension;
		double playerWest = playerController.getX();
		double playerEast = playerWest + playerDimension;
		double vinesNorth = vinesController.getVinesY();
		double vinesSouth = vinesNorth + vinesController.getVinesBoxDimension();
		double vinesWest = vinesController.getVinesX();
		double vinesEast = vinesWest + vinesController.getVinesBoxDimension();

		if ((vinesWest < playerEast && playerWest < vinesEast)
				&& (vinesNorth < playerSouth && playerNorth < vinesSouth)) {

			playerController.setMaxMoveSpeed(playerController.getMaxMoveSpeed()/10);
		}

		
	}

	// Constructor
	Level1Controller(Game game) {
		level1View = new Level1View();
		addTerain();
		addPlayer(game);
	}

	private void addTerain() {
		wall1Controller = new WallController();
		wall1Controller.setWallBoxDimension(100);
		wall1Controller.setWallX(Game.midX * 3 / 2);
		wall1Controller.setWallY(Game.midY * 3 / 2);
		wall2Controller = new WallController();
		wall2Controller.setWallBoxDimension(100);
		wall2Controller.setWallX(Game.midX / 2);
		wall2Controller.setWallY(Game.midY);
		vines1Controller = new VinesController();
		vines1Controller.setVinesBoxDimension(20);
		vines1Controller.setVinesX(Game.midX * 5 / 4);
		vines1Controller.setVinesY(Game.midY * 1 / 4);
		System.out.println("Terrain loaded");
	}

	private void addPlayer(Game game) {
		playerController = new PlayerController(game);
		playerController.setBoxDimension(20);
		playerController.setX(Game.midX);
		playerController.setY(Game.midY / 2);
		System.out.println("Player imported");
	}
	
	// Getters Setters
	public ItemBag getPlayerItemBag(){
		return playerController.getItemBag();
	}
}

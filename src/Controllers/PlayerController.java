package Controllers;

import java.awt.Graphics;

import Models.KeyModel;
import Models.PlayerModel;
import Storage.ItemBag;
import Top.Game;
import Views.PlayerView;

public class PlayerController {

	private PlayerView playerView;
	private PlayerModel playerModel;
	private KeyModel playerKey;
	private double move;
	private double maxMove = 5;
	public final double normalMove = 5;

	// Render
	// PlayerController renders PlayerModel updates and PlayerView
	public void render(Graphics g) {
		clampX();
		clampY();
		playerView.setX(playerModel.getX());
		playerView.setY(playerModel.getY());
		playerView.setBoxDimension(playerModel.getBoxDimension());
		playerView.render(g);
	}

		
	public void movement() {
		if ((playerKey.getA() || playerKey.getD()) &&
			(playerKey.getW() || playerKey.getS())) {
				move = maxMove*0.707;
			} else {
				move = maxMove;
			}
		setMaxMoveSpeed(normalMove);
			
		

		if (playerKey.getW()) {
			// System.out.println("wDown");
			playerModel.setY(playerModel.getY() - move);
		}
		if (playerKey.getS()) {
			// System.out.println("sDown");
			playerModel.setY(playerModel.getY() + move);
		}
		if (playerKey.getA()) {
			// System.out.println("aDown");
			playerModel.setX(playerModel.getX() - move);
		}
		if (playerKey.getD()) {
			// System.out.println("dDown");
			playerModel.setX(playerModel.getX() + move);
		}
		
		
	}
	
	private void clampX() {
		if (playerModel.getX() >= Game.xBoundary + playerModel.getBoxDimension())
			playerModel.setX(Game.xBoundary + playerModel.getBoxDimension());
		if (playerModel.getX() <= 0)
			playerModel.setX(0);
	}

	private void clampY() {
		if (playerModel.getY() >= Game.yBoundary + playerModel.getBoxDimension())
			playerModel.setY(Game.yBoundary + playerModel.getBoxDimension());
		if (playerModel.getY() <= 0)
			playerModel.setY(0);
	}


	// Constructor
	//PlayerController Constructs PlayerView and PlayerModel.
	PlayerController(Game game) {
		playerView = new PlayerView();
		playerModel = new PlayerModel();
		playerKey = new KeyModel(game);
	}
	
	
	// Getters Setters
	public double getX() {
		return playerModel.getX();
	}

	public double getY() {
		return playerModel.getY();
	}
	
	public int getBoxDimension() {
		return playerModel.getBoxDimension();
	}
	public int getHalfDimension() {
		return playerModel.getHalfDimension();
	}

	public ItemBag getItemBag() {
		return playerModel.getItemBag();
	}
	
	public double getMaxMoveSpeed(){
		return maxMove;
	}

	public void setX(double x) {
		playerModel.setX(x);
	}

	public void setY(double y) {
		playerModel.setY(y);
	}
	public void setBoxDimension(int boxDimension){
		playerModel.setBoxDimension(boxDimension);
	}

	public void setMaxMoveSpeed(double maxMoveSpeed) {
		maxMove = maxMoveSpeed;
	}

	
	


}

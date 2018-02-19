package Models;

import java.util.Arrays;

import Top.Game;
import Top.KeyInput;

public class KeyModel  {
	
	
	//Vars
	private boolean[] pressingWSAD;
	private int arraySize = 4;
	private Object playerHandler;
	private boolean esc;

	
	//Constructor
	public KeyModel(Game game){
	pressingWSAD = new boolean[arraySize];
	Arrays.fill(pressingWSAD,false);
	game.addKeyListener(new KeyInput(this));

	}
	
	//Getters Setters
	public boolean getW(){
		return pressingWSAD[0];
	}
	public boolean getS(){
		return pressingWSAD[1];
	}
	public boolean getA(){
		return pressingWSAD[2];
	}
	public boolean getD(){
		return pressingWSAD[3];
	}
	public boolean getEsc(){
		return esc;
	}
	public void setW(boolean tf){
		pressingWSAD[0] = tf;
	}
	public void setS(boolean tf){
		pressingWSAD[1] = tf;
	}
	public void setA(boolean tf){
		pressingWSAD[2] = tf;
	}
	public void setD(boolean tf){
		pressingWSAD[3] = tf;
	}

	public void setEsc(boolean tf) {
		esc = tf;
	}

	
}
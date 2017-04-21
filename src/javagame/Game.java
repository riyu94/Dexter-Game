package javagame;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import java.net.*;

public class Game extends StateBasedGame{
 public static final String gamename="Radhe Game!";
 public static final int menu=0;
 public static final int play=1;
 public static final int play1=2;
 public static final int play2=3;
 public static final int play3=4;
 public static final int play4=5;
 public static final int play5=6;
 public static final int play6=7;
 public static final int end=8;
 public static final int won=8;

 
	public Game(String gamename)
	{
		super(gamename); /*Title*/
		this.addState(new Menu(menu));/*States of game*/
		this.addState(new Play(play));
		this.addState(new Play1(play1));
		this.addState(new Play2(play2));
		this.addState(new Play3(play3));
		this.addState(new Play4(play4));
		this.addState(new Play5(play5));
		this.addState(new Play6(play6));
		this.addState(new Last(end));
		this.addState(new Win(won));
		
	}
	public void initStatesList(GameContainer gc) throws SlickException /*important method of statebasedgame*/
	{
		this.getState(menu).init(gc,this);/*initialization of states in gc*/
		this.getState(play).init(gc,this);
		this.getState(play1).init(gc,this);
		this.getState(play2).init(gc,this);
		this.getState(play3).init(gc,this);
		this.getState(play4).init(gc,this);
		this.getState(play5).init(gc,this);
		this.getState(play6).init(gc,this);
		this.getState(end).init(gc,this);
		this.getState(won).init(gc,this);
		this.enterState(menu);            /*enter into state menu*/
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try
		{
			appgc=new AppGameContainer(new Game(gamename));/*create a window in which there is a game*/
			appgc.setDisplayMode(640,360,false); /*false-nofullscreen*/
		    appgc.start();/*size and start the game*/
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	

	}

}

package javagame;
import java.io.PrintWriter;



import org.newdawn.slick.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.state.*;
public class Menu extends BasicGameState 
{ 
	 Image back;
	 Image pla;
	 Image ex;
 public Menu(int state)
 {
}/*constructor*/
 public void init(GameContainer gc,StateBasedGame sbg) throws SlickException
 {
	 back=new Image("res/backgg.jpg");
	 pla=new Image("res/playn.png");
	 ex=new Image("res/exit.png");
	 }/*initialization*/
 public void render(GameContainer gc,StateBasedGame sbg,Graphics g) throws SlickException
 {
	 g.drawImage(back,0,0);
	 g.drawImage(pla,20,130);
	 g.drawImage(ex,460,127);
	 }/*actually draws g like paint brush*/
 public void update(GameContainer gc,StateBasedGame sbg,int delta) throws SlickException
 {
	 Input input=gc.getInput();
	 int xpos=Mouse.getX();
	 int ypos=Mouse.getY();
	 if((xpos<=211&&xpos>=20)&&(ypos<=201&&ypos>=130))
	 {
		 if(input.isMouseButtonDown(0))
		 {
			 sbg.enterState(1);
		 }
	 }
	 if((xpos<=618&&xpos>=460)&&(ypos<=194&&ypos>=125))
	 {
		 if(input.isMouseButtonDown(0))
		 {
			System.exit(0);
		 }
	 }
	 }/*animation*/
 public int getID()
 {
	 return 0;
 }
}
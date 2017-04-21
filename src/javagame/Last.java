package javagame;
import org.newdawn.slick.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.state.*;
public class Last extends BasicGameState 
{ 
	 Image back;
	 Image ov;
 public Last(int state)
 {
	
}/*constructor*/
 public void init(GameContainer gc,StateBasedGame sbg) throws SlickException
 {
	 back=new Image("res/backgg.jpg");
	 ov=new Image("res/over.png");
	 }/*initialization*/
 public void render(GameContainer gc,StateBasedGame sbg,Graphics g) throws SlickException
 {
	 g.drawImage(back,0,0);
	 g.drawImage(ov,0,0);
	 g.drawString("click on screen to exit",200,50);
	 }/*actually draws g like paint brush*/
 public void update(GameContainer gc,StateBasedGame sbg,int delta) throws SlickException
 {
	 Input input=gc.getInput();
		 if(input.isMouseButtonDown(0))
		 {
			System.exit(0);
		 }
	 }
	 /*animation*/
 public int getID()
 {
	 return 8;
 }
}
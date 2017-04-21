package javagame;
import org.newdawn.slick.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.state.*;
public class Win extends BasicGameState 
{ 
	 Image backk;

 public Win(int state)
 {
	
}/*constructor*/
 public void init(GameContainer gc,StateBasedGame sbg) throws SlickException
 {
	 backk=new Image("res/40.jpg");
	
	 }/*initialization*/
 public void render(GameContainer gc,StateBasedGame sbg,Graphics g) throws SlickException
 {
	 g.drawImage(backk,0,0);
 }
 public void update(GameContainer gc,StateBasedGame sbg,int delta) throws SlickException
 {
	
	 
	 }/*animation*/
 public int getID()
 {
	 return 9;
 }
}
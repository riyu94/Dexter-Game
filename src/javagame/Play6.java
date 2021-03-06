package javagame;
	import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
	public class Play6 extends BasicGameState 
	{
		
	   Image backgr;
	   int i;
	   Image ob;
		Animation deel,ini;
		Animation fall,ovr;
		boolean jump=false;
		boolean quit=false;
		int[] duration={200,200};
		float xpo=0;
		float ypo=0;
		float xp=300;
		float yp=280;
		 float xposhift=xpo+0;
		 float yposhift=ypo+210;
	 public Play6(int state)
	 {
		 
	}/*constructor*/
	 public void init(GameContainer gc,StateBasedGame sbg) throws SlickException
	 {
		
		 backgr=new Image("res/30.jpg");
		 ob=new Image("res/o.png");
		 Image[] actor={new Image("res/9.png"),new Image("res/9.png")};
		 Image[] back={new Image("res/11.png"),new Image("res/11.png")};
			deel=new Animation(actor,duration,false);
			
			ini=deel;
		 }/*initialization*/
	 
	 public void render(GameContainer gc,StateBasedGame sbg,Graphics g) throws SlickException
	 {
		 backgr.draw(xpo,ypo);
		 ob.draw(xp,yp);
		 g.drawString("x:"+xpo+" y:"+ypo,400,20);
		 ini.draw(xposhift,yposhift);
		 }/*actually draws g like paint brush*/

	 public void update(GameContainer gc,StateBasedGame sbg,int delta) throws SlickException
	 {
		
		 Input input=gc.getInput();
		
		 if(input.isKeyDown(Input.KEY_RIGHT)){
			 ini=deel;
			 xpo-=delta*.5f;
			 xp-=delta*.5f;
		 }
		
		
		 if(xpo<=-180)
			{
				 if(input.isKeyDown(Input.KEY_UP)&&!jump) 
		      {
		    	  yposhift-=70f*delta;
		          jump=true;
		          ini=deel;
		      }
			}
			if(xpo<=-220)
			{
				 if(!(input.isKeyDown(Input.KEY_UP)&&!jump)) 
			      {
			    	if(input.isKeyDown(Input.KEY_RIGHT)&&!jump)
			    			{
			    		try{
			    	    	Thread.sleep(1000);
			    	    	}
			    	    	catch(InterruptedException ie)
			    	    	{
			    	    		ie.printStackTrace();
			    	    	}
			    		sbg.enterState(8);
			    			}
			    	}
			     
				}
			
			
		    	if(xpo<=-360&&jump)
		    		{
		    	    	  yposhift=210;
		    	    	  }
		    	
		    	if(xpo<=-820)
		    		sbg.enterState(9);
		 
		
	 }

	 
		 /*animation*/
	 public int getID()
	 {
		 return 7;
	 }
	}



import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 
import java.util.ArrayList;

public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key; 
	private String gameState;
	private String 
	private String 
	private Player leon;
	
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
		gameState="start";
		leon = new Player(400, 300);
	}

	//test
	//hello
		
		

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics(); 
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		g2d.setFont( new Font("SANS_SERIF", Font.BOLD, 20));
		
		g2d.drawString(String.valueOf(key)+" testing font", 50, 110);
		
		
		if(playerMoveVertical=="up"){
			leon.move("y",-1);
		}
		if(playerMoveVertical=="down"){
			leon.move("y",1);
		}
		if(playerMoveHorizontal=="left"){
			leon.move("x",-1);
		}
		if(playerMoveHorizontal=="right"){
			leon.move("x",1);
		}

		g2d.fillRect(leon.getX(), leon.getY(), leon.getW(), leon.getH());
		
		
		twoDgraph.drawImage(back, null, 0, 0);

	}

	
	



	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		key= e.getKeyCode();
		System.out.println(key);
		if (key==87){ //W
			
		}
		if (key==83){ //S
			
		}
		if (key==65){ //A
			
		}
		if (key==68){ //D
			
		}
		
		
	
	}
	

	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		

	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}

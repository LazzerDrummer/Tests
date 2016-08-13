import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class Painting extends JComponent {
	private static final long serialVersionUID = 7684382000314660093L;
	public void paint(Graphics g) {
		drawNotFilledCenteredCircle(g,(int)Ezrubber.x,200,6);
		
		
    
	}
	
	public void drawNotFilledCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.drawOval(x,y,r,r);
		}
}


public class Ezrubber {
	public static double x=350;
	public static double v=0;
	public static double dt=0.1;
	public static double km=10;
	public static double kf=0.1;
	public static void main(String[] args) {
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, 400, 400);
	    Painting myCanvas = new Painting();
		window.getContentPane().add(myCanvas);
	    window.setVisible(true);
	    
	    for(int step=0;step<1000000;step++)
		{
	    	timeStep();
			window.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static void timeStep(){
		double a = -km*(x-200);
		a-=v*kf;
		v+=a*dt;
		x+=v*dt;	
//		if(x<=0 || x>=400){
//			v*=-1;
//		}
	}

}
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class Painting extends JComponent {
	private static final long serialVersionUID = 7684382000314660093L;
	public void paint(Graphics g) {
		
		drawNotFilledCenteredCircle(g,(int)Ezrubber.x,(int)Ezrubber.y,Ezrubber.diameter);
		g.drawRect (0, 0, Ezrubber.Rectx, Ezrubber.Recty);
		
		
    
	}
	
	public void drawNotFilledCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.drawOval(x,y,r,r);
		}
}


public class Ezrubber {
	public static int Rectx = 500;
	public static int Recty = 500;
	public static int diameter =14;
	public static double x=100;
	public static double y=10;
	public static double vx=100;
	public static double vy=130;
	public static double dt=0.008;
	public static double km=10;
	public static double kf=0.1;
	public static void main(String[] args) {
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, Rectx+100, Recty+100);
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
//		double a = -km*(x-200);
		double ax=0;
		double ay=50;
		ax-=vx*kf;
		vx+=ax*dt;
		x+=vx*dt;
		ay-=vy*kf;
		vy+=ay*dt;
		y+=vy*dt;
		if(x>(Recty-diameter/2)){
			vx*=-1;
			x=(Recty-diameter/2);
		}
		if(x<=diameter/2){
			vx*=-1;
			x=diameter/2;
		}
		if(y>(Recty-diameter/2)){
			vy*=-1;
			y=(Recty-diameter/2);
		}
		if(y<=diameter/2){
			vy*=-1;
			y=diameter/2;
		}
		System.out.println(vy+" "+y);
	}

}
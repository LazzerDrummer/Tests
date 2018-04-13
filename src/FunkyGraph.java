import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
	private static final long serialVersionUID = 7684382000314660093L;
	public void paint(Graphics g) {
		//The variable zoom zooms the function. Also Increases the number of pixels added at x=x+0.01/zoom.
		double zoom=50;
	    g.drawLine(0,500,1000,500);
	    g.drawLine(500, 0, 500, 1000);
	
	    for(double x=-500/zoom;x<500/zoom;x=x+0.01/zoom)
	    {
	    	g.drawLine((int)(zoom*x+500),(int)(-zoom*f(x)+500),(int)(zoom*x+500),(int)(-zoom*f(x)+500));
	    }
    
	}
	/**
	 * Put any functions you like
	 * x+2
	 * 2x-6
	 * Math.pow(x,3)
	 * Math.sin(x)
	 * @param x
	 * @return
	 */
	public double f(double x){
		return Math.sin(10*x)+Math.pow(x, 2)+0.1;
	}
}

public class FunkyGraph {
	public static void main(String[] args) {
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, 1000, 1000);
	    MyCanvas myCanvas = new MyCanvas();
		window.getContentPane().add(myCanvas);
	    window.setVisible(true);

	}

}

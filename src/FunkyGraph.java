import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
  public void paint(Graphics g) {
	double zoom=100;
    g.drawLine(0,500,1000,500);
    g.drawLine(500, 0, 500, 1000);

    for(double x=-500/zoom;x<500/zoom;x=x+0.01/zoom)
    {
    	g.drawLine((int)(zoom*x+500),(int)(-zoom*f(x)+500),(int)(zoom*x+500),(int)(-zoom*f(x)+500));
    }
    
  }
  public double f(double x){
	  return Math.sin(10*x)+Math.pow(x, 2)+0.1;
  }
}

public class FunkyGraph {
	public static void main(String[] args) {
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, 1000, 1000);
	    window.getContentPane().add(new MyCanvas());
	    window.setVisible(true);

	}

}


import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

    class Canvas extends JComponent {
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g) {
		int i;
		g.drawLine(0,500,1000,500);
	    g.drawLine(500, 0, 500, 1000);
	    for(i=0;i<Perceptron.n.length;i++){
	    	if(Perceptron.n[i][2]==1)
	    		drawFilledCenteredCircle(g,Perceptron.n[i][0]+500,500-Perceptron.n[i][1],4);
	    	else
	    		drawNotFilledCenteredCircle(g,Perceptron.n[i][0]+500,500-Perceptron.n[i][1],4);
	    }
		drawPerceptron(g,Perceptron.w0,Perceptron.w1,Perceptron.w2);
    
	}
	
	public void drawFilledCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.fillOval(x,y,r,r);

		}
	
	public void drawNotFilledCenteredCircle(Graphics g, int x, int y, int r) {
		  x = x-(r/2);
		  y = y-(r/2);
		  g.drawOval(x,y,r,r);
		}
	
	public void drawPerceptron(Graphics g, double w0, double w1, double w2) {
		  g.drawLine(0,(int)(500-(-w0+500*w1)/w2), 1000, (int)(500-(-w0-500*w1)/w2));
		
		}
}
public class Perceptron {
	public static int[][]n = new int[6][3];
	public static double w0=100,w1=1,w2=1;
	public static void main(String[] args) {
	    JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, 1000, 1000);
	    Canvas Canvas = new Canvas();
		window.getContentPane().add(Canvas);
	    window.setVisible(true);
		
		n[0][0]=80;
		n[0][1]=150;
		n[0][2]=1;
		n[1][0]=90;
		n[1][1]=170;
		n[1][2]=0;
		n[2][0]=60;
		n[2][1]=170;
		n[2][2]=0;
		n[3][0]=100;
		n[3][1]=140;
		n[3][2]=1;
		n[4][0]=40;
		n[4][1]=165;
		n[4][2]=1;
		n[5][0]=90;
		n[5][1]=160;
		n[5][2]=1;
		
		for(int step=0;step<1000000;step++)
		{
			for(int i=0;i<n.length;i++){
				double output=w0 + n[i][0]*w1 + n[i][1]*w2;
				if(output>0 && n[i][2]==0){
					w0-=100;
					w1-=n[i][0];
					w2-=n[i][1];	
				}
				if(output<0 && n[i][2]==1){
					w0+=100;
					w1+=n[i][0];
					w2+=n[i][1];	
				}
			}
			window.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

}
	



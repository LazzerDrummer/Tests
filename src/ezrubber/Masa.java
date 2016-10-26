package ezrubber;

import java.awt.Graphics;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Masa extends JComponent{
	int Rectx = 200;
	int Recty = 200;
	Bila[] bilele;
	
	public Masa(int numarBile){
		bilele= new Bila[numarBile];
		for (int i = 0; i < bilele.length; i++) {
			bilele[i] = new Bila(this);
		}
	}
	
	public void paint(Graphics g) 
	{
		for (int i = 0; i < bilele.length; i++) {
			bilele[i].drawNotFilledCenteredCircle(g);
		}
		g.drawRect (0, 0, Rectx, Recty);
	}

	public void timeStep() {
		for (int i = 0; i < bilele.length; i++) {
			bilele[i].timeStep();
		}
		
	}
	
	public void Collision (Bila[]bila) {
		int i,j;
		for(i=0;i< bila.length;i++)
		{
			for(j=i+1;j<bila.length;j++)
			{
				if(bila[i].isTouching(bila[j]))
				{
				System.out.println("boop");
				}
			}
		}
	}
	
}

package ezrubber;

import java.awt.Graphics;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Masa extends JComponent{
	int Rectx = 800;
	int Recty = 800;
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
	
	public void checkCollisions (Bila[]bila) 
	{
		for(int i=0;i< bila.length;i++)
		{
			for(int j=i+1;j<bila.length;j++)
			{
				if(bila[i].isTouching(bila[j]))
				{
					switchVelocities(bila[i],bila[j]);
				}
			}
		}
	}
	
	public void switchVelocities (Bila bila1, Bila bila2)
	{
		PointDouble2D vap1 = rotateVelocity(new PointDouble2D(bila1.vx, bila1.vy),
				new PointDouble2D(bila2.x-bila1.x, bila2.y-bila1.y));
		PointDouble2D vap2 = rotateVelocity(new PointDouble2D(bila2.vx, bila2.vy),
				new PointDouble2D(bila2.x-bila1.x, bila2.y-bila1.y));
		
		PointDouble2D transformed1 = new PointDouble2D(vap2.x, vap1.y);
		PointDouble2D transformed2 = new PointDouble2D(vap1.x, vap2.y);

		PointDouble2D vxy1 = rotateVelocity(transformed1, 
				new PointDouble2D(bila2.x-bila1.x, bila1.y-bila2.y));
		PointDouble2D vxy2 = rotateVelocity(transformed2, 
				new PointDouble2D(bila2.x-bila1.x, bila1.y-bila2.y));
		
		bila1.vx = vxy1.x;
		bila1.vy = vxy1.y;
		bila2.vx = vxy2.x;
		bila2.vy = vxy2.y;
		
	}
	public PointDouble2D rotateVelocity(PointDouble2D v, PointDouble2D angle)
	{
		double va;
		double vp;
		double d= Math.sqrt((angle.x)*(angle.x)+(angle.y)*(angle.y));
		va = (v.x*(angle.x)+v.y*(angle.y))/d;
		vp = (-v.x*(angle.y)+v.y*(angle.x))/d;
		return new PointDouble2D(va, vp);
	}
}

package ezrubber3d;

import java.awt.Graphics;

public class Bila3D {
	Cutie masaPeCareSunt;
	double m=1;
	int diameter = 50;
	double x=100;
	double y=10;
	double z=10;
	double vx=100;
	double vy=130;
	double vz=100;
	
	public Bila3D(Cutie masa) {
		masaPeCareSunt = masa;
		x=diameter/2+Math.random()*(masa.Rectx-diameter);
		y=diameter/2+Math.random()*(masa.Recty-diameter);
		z=diameter/2+Math.random()*(masa.Rectz-diameter);
		vx=(Math.random()-0.5)*400;
		vy=(Math.random()-0.5)*400;
		vz=(Math.random()-0.5)*400;
	}

	public void drawNotFilledCenteredCircle(Graphics g) 
	{
		  int ze = (int) (z*Lume3D.CP*Lume3D.Radical2);
		  int zdiameter = (int)((diameter/Lume3D.N)*((((Lume3D.N-1)*z)/masaPeCareSunt.Rectz)+1));
		  int mx = (int) (x-(zdiameter/2))+ze;
		  int my = (int) (y-(zdiameter/2))+ze;
		  g.drawOval(mx,my,zdiameter,zdiameter);
	}

	public void timeStep() {
		double ax=Lume3D.GX;
		double ay=Lume3D.GY;
		double az=Lume3D.GZ;
		ax-=vx*Lume3D.KF;
		vx+=ax*Lume3D.DT;
		x+=vx*Lume3D.DT;
		
		ay-=vy*Lume3D.KF;
		vy+=ay*Lume3D.DT;
		y+=vy*Lume3D.DT;
		
		az-=vz*Lume3D.KF;
		vz+=az*Lume3D.DT;
		z+=vz*Lume3D.DT;
		if(x>(masaPeCareSunt.Rectx-diameter/2)){
			vx*=-1;
			x=(masaPeCareSunt.Rectx-diameter/2);
		}
		if(x<=diameter/2){
			vx*=-1;
			x=diameter/2;
		}
		if(y>(masaPeCareSunt.Recty-diameter/2)){
			vy*=-1;
			y=(masaPeCareSunt.Recty-diameter/2);
		}
		if(y<=diameter/2){
			vy*=-1;
			y=diameter/2;
		}
		if(z>(masaPeCareSunt.Rectz-diameter/2)){
			vz*=-1;
			z=(masaPeCareSunt.Rectz-diameter/2);
		}
		if(z<=diameter/2){
			vz*=-1;
			z=diameter/2;
		}
		
	}

	public boolean isTouching(Bila3D bila) {
		if(Math.sqrt(((x-bila.x)*(x-bila.x))+((y-bila.y)*(y-bila.y)))<=diameter/2+bila.diameter/2)
		{
			return true;
		}
		else return false;
	}

	public double getE() {
		return vx*vx+vy*vy;
	}
}

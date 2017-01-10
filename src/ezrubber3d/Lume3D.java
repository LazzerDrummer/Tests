package ezrubber3d;

import javax.swing.JFrame;

public class Lume3D {
	public static double DT=0.001; //0.1
	public static double KF=0;  //0.2
	public static int NUMAR_BILE = 0;
	public static double GX=0;
	public static double GY=100; // 100
	public static double CP=0.7;
	public static double Radical2 = 0.7071;
	
	Cutie cutie;
	JFrame window;
	
	public Lume3D() {
		cutie= new Cutie(NUMAR_BILE);
		window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, (int)(cutie.Rectx+30+cutie.Rectz*CP*Radical2), (int)(cutie.Recty+100+cutie.Rectz*CP*Radical2));
		window.getContentPane().add(cutie);
	    window.setVisible(true);
	}
	

	private void porneste() {
		for(int step=0;step<1000000;step++)
		{
			cutie.checkCollisions(cutie.bilele);
	    	cutie.timeStep();
			window.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
	public static void main(String[] args) {
		Lume3D lume = new Lume3D();
		lume.porneste();
	}
}



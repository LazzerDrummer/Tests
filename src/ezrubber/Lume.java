package ezrubber;

import javax.swing.JFrame;

public class Lume {
	public static double DT=0.001; //0.1
	public static double KF=0;  //0.2
	public static int NUMAR_BILE = 50;
	public static double GX=0;
	public static double GY=100; // 100
	Masa masa;
	JFrame window;
	
	public Lume() {
		masa= new Masa(NUMAR_BILE);
		window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(30, 30, masa.Rectx+30, masa.Recty+100);
		window.getContentPane().add(masa);
	    window.setVisible(true);
	}
	

	private void porneste() {
		for(int step=0;step<1000000;step++)
		{
			masa.checkCollisions(masa.bilele);
	    	masa.timeStep();
			window.repaint();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
	
	public static void main(String[] args) {
		Lume lume = new Lume();
		lume.porneste();
	}
}



import java.util.Arrays;

public class Lines {

	public static void main(String[] args) {
		int [] sir= {3,2,7,9,3,56,456,46,456,56,5,7865,3453,75,3,67,765,3,542,756,35,3,1};
		int t=sir.length;
		int a;
//		if (t%2!=0)
//			t=t-1;
		System.out.println(Arrays.toString(sir));
		for (int i = 0; i < sir.length/2; i++) {
			a=sir[2*i];
			sir[2*i]=sir[2*i+1];
			sir[2*i+1]=a;		
		}
		System.out.println(Arrays.toString(sir));
		
		//3,2,7,9,3
		//2,3,9,7,3
	}
}

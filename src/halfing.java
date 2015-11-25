import static java.lang.Math.*;

public class halfing {

	public static void main(String[] args) {
		int n=42,a,b=0,i=1,car=1;
		while(n/i>10)
		{
			car++;
			i=i*10;
		}
		System.out.println(car);
		if(car%2!=0)
		{
			a=(int) (n/pow(10,(car/2)+1));
			b=(int) (n%pow(10,(car/2)));
		}
		else
		{
			a=(int) (n/pow(10,car/2));
			b=(int) (n%pow(10,car/2));
		}
		System.out.println(a);
		System.out.println(b);
	}

}

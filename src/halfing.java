import static java.lang.Math.*;

public class halfing {

	public static void main(String[] args) {
		int n=12444,a,b=0,i=1,j=10;
		int count=0;
		while(j-i!=1)
		{
			count++;
			int c = (int)(n/pow(10,(i+j)/2));
			if(c>0)
			{
					i=(i+j)/2;
			}
			else
			{
				j=(i+j)/2;
			}
		}
		System.out.println("count="+count);
		System.out.println(j);
		if(j%2!=0)
		{
			a=(int) (n/pow(10,(j/2)+1));
			b=(int) (n%pow(10,(j/2)));
		}
		else
		{
			a=(int) (n/pow(10,j/2));
			b=(int) (n%pow(10,j/2));
		}
		System.out.println(a);
		System.out.println(b);
	}

}

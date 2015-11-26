import static java.lang.Math.*;

public class halfing {

	public static void main(String[] args) {
		int n=1255122,a,b=0,i=1,j=10;
		while(i!=j)
		{
			if((int)(n/pow(10,(i+j)/2))>0)
			{
				if (j-i!=1)i=(i+j)/2;
				else i=j;
			}
			else
			{
				j=(i+j)/2;
			}
		}
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

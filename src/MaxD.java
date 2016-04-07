
public class MaxD {

	public static void main(String[] args) {
		int a=0,b=10000,i,min,nrdiv=2,contor=1,j,div=0;
		min=a;if(a!=b) a++;
		for(i=a;i<=b;i++)
		{
			div=1;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0) div++;
			}
			if(div==nrdiv)contor++;
			else if(div>nrdiv)
			{
				nrdiv=div;
				min=i;
				contor=1;
			}
			
		}
		System.out.println(min + " " + nrdiv + " " + contor);

	}

}


public class MaxD {

	public static void main(String[] args) {
		int a=0,b=100000000,i,min,nrdiv=2,contor=1,j,div=0,lim,p=1,factor=0,aux;
		min=a;
		//int g;
		
		if(a!=b) a++;
		for(i=a;i<=b;i++)
		{
			if(i%1000000==0)System.out.println(i);
			div=2;
			lim=(int) Math.sqrt(i);
			p=1;
//			for(j=2;j<lim;j++)
//			{
//				if(i%j==0)
//				{
//					g=i/j;
//					lim=g;
//					div+=2;
//					if(g==j)div--;
//				}
//
//			}
			aux=i;
			for(j=2;j<=lim;j++)
			{
				factor=0;
				while(i%j==0)
				{
					i/=j;
					factor++;
				}
				if(factor!=0)
				{	
				p*=(factor+1);
				lim=(int) Math.sqrt(i);
				}
			}
			if(i!=1)p*=2;
			i=aux;
			div=p;
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

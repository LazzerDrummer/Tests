import java.lang.*;

public class Pare {

	public static void main(String[] args) {
		int i=1,d=0,p=0,a=0,b=2000000000,n,Par=0,Doi=0,aux;
		if(a%2==1)a+=1;
		if(b%2==1)b-=1;
		for(n=a;n<=b;n+=2)
		{
			//if(n%10000000==0)System.out.println(n+" ");
			d=0;aux=n;
			i=1;
//			while(n>=i && n>0)
//			{
//				if(n<i*2 || i==1073741824)
//				{
//					n-=i;
//					d++;
//					i=1;
//				}
//				else i*=2;
//				if(d>2) break;
//			}
			while(n>0)
			{
				d+=n%2;
				n>>=1;
				if(d>2) break;
			}
			n=aux;
			if(d==2)Doi++;	
		}
		a=(int) Math.sqrt(a);
		for(i=a;i*i<=b && i*i>=a;i+=2)
		{p++;}
		System.out.println(p+" "+Doi);
		
	}

}

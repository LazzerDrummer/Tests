import java.lang.*;

public class Pare {

	public static void main(String[] args) {
		int i=1,d=0,p=0,a=2,b=300000,n,Par=0,Doi=0,aux;
		if(a%2==1)a+=1;
		if(b%2==1)b-=1;
		for(n=a;n<=b;n+=2)
		{
			//System.out.println(n+" ");
			
			p=0;d=0;aux=n;
			for(i=1;i*i<=n;i++)
			{
				if(n/(i*i)==1 && n%(i*i)==0)
				{p++;break;}
			}
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
				if(n%2==1)d++;
				n/=2;
				
			}
			n=aux;
			Par+=p;
			if(d==2)Doi++;	
		}
		System.out.println(Par+" "+Doi);
		
	}

}

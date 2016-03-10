
public class Mejik {

	public static void main(String[] args) {
		int n=100,i,j=4,g,p,aux;int[] v;boolean nr=false,dir=false;
		v =new int[n];
		for(i=0;i<=n-1;i++)
		{
			nr=false;
			while(!nr)
			{
				j+=2;
				p=(j*j)/2;
				while (p<=((j*j)*3)/4)
				{
					if((p%6==1 || p%6==5)&& p%5!=0)
					{
						dir=false;
						for(g=3;g<=Math.sqrt(p);g++)
						{
							if(p%g==0){dir=true;break;}
						}
						if(!dir)break;
					}
					p++;
				}
				if(dir)continue;
				else
				{
					aux=p;
					p=((j*j)/2)-1;
					dir=true;
					while  (p>=(j*j)-aux)
					{
						if((p%6==1 || p%6==5)&& p%5!=0) 
						{
							dir=false;
							for(g=3;g<=Math.sqrt(p);g++)
							{
								if(p%g==0){dir=true;break;}
							}
							if(!dir)break;
						}
						p--;
					}
					if(!dir && p+aux==j*j)nr=true;
				}
				if(nr)
				{
					v[i]=j*j;
					//System.out.println(v[i]+ " " + aux + " " + p + " ");
				}
			}
		}
		System.out.println(v[n-1]);
	}
	
	
}

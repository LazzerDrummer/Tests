
public class ghiocei {

	public static void main(String[] args) {
		int [][]v=new int[][]{{43,123,82,13},
		   	   				  {14,34,21,8},
		   	   				  {31,12,88,43},
		   	   				  {12,44,22,14}};
		int []f=new int[10];
		f[0]=1;
		int i=0,n=4,s,j;
		for(j=0;j<n;j++)
		{
			for(i=0;i<n;i++)
			{
				s=0;
				while(v[j][i]>0)
				{
					s=s+(v[j][i]%10);
					f[v[j][i]%10]=v[j][i]%10;
					v[j][i]=v[j][i]/10;
				}
				v[j][i]=s;
			}
		}
		i=0;
		if(f[0]==0)
		{
			for(i=1;i<10;i++)
			{
				if(f[i]!=0){System.out.print(f[i]);System.out.print(0);break;}
			}
		}
		for(i++;i<10;i++)
		{
			if(f[i]!=0){System.out.print(f[i]);}
		}
		for(j=0;j<n;j++)
		{
			System.out.println();
			for(i=0;i<n;i++)
			{
				System.out.print(v[j][i] + " ");
			}
		}
		
		
	}

}

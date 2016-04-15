
public class spirala2 {

	public static void main(String[] args) {
		int i,j,c,r,n=7,m=7;
		int[][]v = new int[n][m];
		int lc=m,lr=n;
		int cnt=0,rnt=lr;
		boolean l=true;
		int in=0;
		c=-1;r=0;
		for(i=1;i<=n*m;i++)
		{
			if(in==4)in=0;
			if(rnt==lr){cnt=0;rnt++;};
			if(cnt<lc)
			{
				if(!l){lc--;in++;}
				cnt++;
				l=true;
				if(in==2)
				{c--;}
				else
				{c++;}
				v[r][c]=i;
				continue;
			}
			if(cnt==lc){rnt=0;cnt++;};
			if(rnt<lr)
			{
				if(l){lr--;in++;}
				rnt++;
				l=false;
				if(in==3)
				{r--;}
				else
				{r++;}
				v[r][c]=i;
				continue;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println();
			for(j=0;j<m;j++)
			{
				if(i<n-1){
					if(v[i+1][j]>10 && v[i][j]<10 )
					System.out.printf(v[i][j]+"  ");
					else System.out.printf(v[i][j]+" ");}
				else
				{
					if(v[i-1][j]>10 && v[i][j]<10) {System.out.printf(v[i][j]+"  ");}
					else System.out.printf(v[i][j]+" ");
				}
				
			}
		}
		
	}

}

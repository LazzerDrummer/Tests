
public class reactivi {

	public static void main(String[] args) {
		int []min ={-10,10,-20, 7,7};
		int []max ={ 10,12, 10,10,8};
		//int []x= new int [n+1];
		int i,j,f=1;
		int [][]frigidere = new int [2][min.length+1];
		boolean nou;
		frigidere[0][1]=min[0];frigidere[1][1]=max[0];
		for(i=1;i<min.length;i++)
		{
			nou=true;
			for(j=1;j<=f;j++)
			{
				if(min[i]<=frigidere[0][j])
				{
					if(max[i]>=frigidere[0][j] && max[i]<=frigidere[1][j]) 
					{
						frigidere[1][j]=max[i];nou=false;break;
					}
				}
				else if(min[i]<=frigidere[1][j])
				{
					frigidere[0][j]=min[i];
					if(max[i]<=frigidere[1][j])
					{
						frigidere[1][j]=max[i];nou=false;break;
					}
					nou=false;break;
				}
			}
			if(nou)
			{
				f++;frigidere[0][f]=min[i];frigidere[1][f]=max[i];
			}
		}
		System.out.println(f);
	}

}

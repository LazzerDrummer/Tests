
public class cartele {

	public static void main(String[] args) {
		int n=3,c=2,i;
		int [][]sablon=new int[][]{{1,1,0},
							   	   {0,0,1},
							       {1,0,0}};
		int [][][]cartele=new int[][][]{
								   {{1,0,1},
		   	   						{0,1,1},
		   	   						{0,1,0}},
									
								   {{1,0,1},
			   	   					{1,0,0},
			   	   					{0,1,0}}
		   	   						};
		int indexcartele;
		boolean sol=false;
		for(indexcartele=0;indexcartele<c;indexcartele++)
		{
			sol=false;
			for(i=0;i<4;i++)
			{
				sol=checkCard(n,sablon,cartele[indexcartele],i*90);
				if(sol)break;
				sol=checkMirrorCard(n,sablon,cartele[indexcartele],i*90);
			}
			
			if(sol){System.out.println(1);continue;}
			if(!sol)System.out.println(0);
		}
		
		
	}
	
	public static boolean checkCard(int n,int [][]sablon,int [][]cartele,int degree)
	{
		int column,row;
		if(degree==0){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[row][column])return false;
				}
			}
			return true;
		}
		else if(degree==90){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[column][n-1-row])return false;
				}
			}
			return true;
		}
		else if(degree==180){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[n-1-row][n-1-column])return false;
				}
			}
			return true;
		}
		else if(degree==270){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[n-1-column][row])return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static boolean checkMirrorCard(int n,int [][]sablon,int [][]cartele,int degree)
	{
		int column,row;
		if(degree==0){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[row][n-1-column])return false;
				}
			}
			return true;
		}
		else if(degree==90){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[n-1-column][n-1-row])return false;
				}
			}
			return true;
		}
		else if(degree==180){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[n-1-row][column])return false;
				}
			}
			return true;
		}
		else if(degree==270){
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[column][row])return false;
				}
			}
			return true;
		}
		return false;
	}
}



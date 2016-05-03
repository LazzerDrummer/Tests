
public class cartele {

	public static void main(String[] args) {
		int n=3,c=2;
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
		int indexcartele,row,column;
		boolean sol=true;
		for(indexcartele=0;indexcartele<c;indexcartele++)
		{
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][row][column]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][column][n-1-row]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][n-1-row][n-1-column]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][n-1-column][row]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][row][n-1-column]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][n-1-column][n-1-row]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][n-1-row][column]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			sol=true;
			out:
			for(row=0;row<n;row++)
			{
				for(column=0;column<n;column++)
				{
					if(sablon[row][column]!=cartele[indexcartele][column][row]){sol=false;break out;}
				}
			}
			if(sol){System.out.println(1);continue;}
			if(!sol)System.out.println(0);
		}
	}

}



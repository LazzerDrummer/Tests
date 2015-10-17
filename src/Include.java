public class Include {

	public static void main(String[] args) {
		int [] a= {3,3,8};
		int [] b= {1,3,3,7,8,3,4,3,3,5,6,3,3,3,3,3,6,3,3,6,3,6,3,3};
/*		int v= 0;
		int i=0;
		int tinminte=0;
		for (int j = 0; j < b.length; j++) 
		{	
			if (i==a.length) i=0;
			if (a[i]==b[j])
			{
				if (v==0)tinminte=j;
				v++;
			    i++; 
			    if (v==a.length){System.out.println("YES");return;}
			}
			else 
			{
				if (v!=0)j=tinminte;
				v=0;
				i=0;
			}
		}
		System.out.println("NO");
*/
		
		for (int i = 0; i < b.length-a.length+1; i++) 
		{
			boolean nulamgasit=false;
			for (int j = 0; j < a.length; j++) 
			{
				if (b[i+j]!=a[j])
				{
					nulamgasit=true;
					break;
				}
			}
			if (nulamgasit==false)
			{
				System.out.println("YES");return;
			}
		}
		System.out.println("NO");
	}
	
}



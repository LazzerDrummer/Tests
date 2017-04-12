
public class partitie {

	public static void main(String[] args) {
		int v[]={3,0,2,7,4,1,5,6};
		int i,k=4,j;
		for(i=0;i<k;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(v[j]+(i*8) + " ");
			}
			System.out.println();
			for(j=4;j<8;j++)
			{
				System.out.print(v[j]+(i*8) + " ");
			}
			System.out.println();
		}

	}

}

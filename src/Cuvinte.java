
public class Cuvinte {

	public static void main(String[] args) {
		
		String sa="EDFCBMZYA";
		byte[] a=sa.getBytes();
		int i,j=0,y=0;
		char aux;
		boolean k=true;
		char[] ua= new char[a.length];
		char[] auxua= new char[a.length];
		char[] ub= new char[a.length];
		for(i=0;i<a.length;i++)
		{
			ua[i]=(char)a[i];
			auxua[i]=(char)a[i];
		}
		while(k)
		{
			k=false;j++;
			for(i=0;i<ua.length-j;i++)
			{
				if(ua[i]>ua[i+1])
				{
					k=true;
					aux=ua[i];
					ua[i]=ua[i+1];
					ua[i+1]=aux;		
				}
			}
		}
		k=true;j=0;
		for(i=a.length-1;i>=0;i--)
		{
			if(ub[y]==ua[j]){y--;j++;i++;continue;}
			if(auxua[i]==ua[j]){j++;continue;}
			y++;ub[y]=auxua[i];
		}
		while(y>0)
		{
			if(ub[y]==ua[j]) {y--;j++;}
			else break;
		}
		System.out.println(j);
		
//		for(i=0;i<a.length;i++)
//		{
//			System.out.print(ua[i]);
//		}
		
	}

}


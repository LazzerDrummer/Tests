
public class Adunare {

	public static void main(String[] args) {
		String sa= "999999999999999999999999999999999999999999999999999999999999999999999999999999999";
		String sb= "1";
		String f = "";
		//byte commaCode=46;
		byte zeroCode=48;
		//char cinci =(char) (5+zeroCode);
		//f=f+(char)(7+zeroCode);
		byte[] a=sa.getBytes();
		byte[] b=sb.getBytes();
		int c=0,t=0,i=a.length-1,j=b.length-1;
		if(a.length>=b.length)
		{
			while(j>=0)
			{
				c=((a[i]+b[j])-2*zeroCode+t)%10;
				t=((a[i]+b[j])-2*zeroCode+t)/10;
				f=(char)(c+zeroCode)+f;
				i--;j--;
			}
			while(i>=0)
			{
				c=((a[i])-zeroCode+t)%10;
				t=((a[i])-zeroCode+t)/10;
				f=(char)(c+zeroCode)+f;
				i--;
			}
				
		}
		if (t==1)f="1"+f;
		System.out.println(f);
	}

}

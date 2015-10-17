
public class Stringtoint {

	public static void main(String[] args) {
		String c = "00345555555555556.45634566456456456456" ; 
		double f=0,b=0,g=10;
		int i,j=0;
		byte[] chars=c.getBytes();
		for (i = 0; i < chars.length; i++) {
			if (chars[i]==46){
				while (j<chars.length-i-1)
				{
					b=chars[j+i+1]-48;
					b=b/g;
					f=f+b;
					j++;g=g*10;
				}
				System.out.println("Lazzer's code: "+f);
				break;
			}				
			f=f*10;
			f=f+chars[i]-48;	
		}

		f=0;b=0;
	
		for (i = 0; i < chars.length; i++) {
			if (chars[i]==46){
				break;
			}				
			f*=10;
			f=f+chars[i]-48;	
		}
		b=f;
		f=0;
		for (j=chars.length-i-2;j>=0;j--)
		{
			f=f+chars[j+i+1]-48;
			f/=10.;
		}
		System.out.println("Stupid's code: "+(b+f));return;
	}

}

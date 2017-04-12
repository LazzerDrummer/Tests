
public class secmax {

	public static void main(String[] args) {
		 String na= "1234543112543644";
		 byte[] a=na.getBytes();
		 int i,s=0,p=0,r=0;
		 boolean f=false;
		 int[] v = new int[a.length];
		 for(i=0;i<a.length;i++)
		 {
			 v[i]= (char)a[i];
		 }
		 for(i=1;i<a.length;i++)
		 {
			 if(v[i-1]<v[i])s++; break;
		 }
		 for(i++;i<a.length;i++)
		 {
			 if(v[i-1]==v[i])
			 {
				if(f){r=r+(s*p);f=false;}
				s=0;p=0;continue;
			 }
			 if(v[i-1]<v[i])
			 {
				 if(!f){s++;}
				 else {r=r+(s*p);s=1;p=0;f=false;}
				 continue;
			 }
			 if(v[i-1]>v[i]){p++;f=true;}
		 }
		 if(f=true)r=r+(s*p);
		 System.out.println(r);

	}

}

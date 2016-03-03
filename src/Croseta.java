
public class Croseta {

	public static void main(String[] args) {
		int n=4,s=0,r,aux;
		while (n>3)
		{
			n=10;r=0;
			s+=3;
			aux=s;
				while(s>=2)
				{
					if(s>=3)
					{
						r+=(s/3);
						s/=3;
					}
					else if(s==2)
					{
						r++;
						break;
					}
				}		
			n-=r+aux;
			s=aux;
		}
		System.out.println(s+n);

	}

}

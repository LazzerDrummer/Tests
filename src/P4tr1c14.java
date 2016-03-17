
public class P4tr1c14 {

	public static void main(String[] args) {
		int n=1000,T=999999,e1=(n*(n+1))/2,e2=(n*(n+1))-n,i,K=0;
		if(e1<T && e2>T)
		{
			for(i=1;i<=n;i++)
			{
				K+=(i*(i+1))/2;
			}
			T-=e1;
			for(i=n-1;T>i;i--)
			{
				K+=(i*(i+1))/2;
				T-=i;
			}
			while(T>0)
			{
				K+=i;
				i--;T--;
			}
			System.out.println(K);
		}
		else if(e1>=T)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(1);
		}

	}

}

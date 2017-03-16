
public class PutereRecursiv {

	public static void main(String[] args) {
		System.out.println(putere(5,10));

	}
	public static int putere(int n, int p)
	{
		if(p==0)
			return 1;
		else 
			return n*putere(n,p-1);
	}
}

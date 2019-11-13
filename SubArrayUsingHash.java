import java.util.*;
public class SubArrayUsingHash {
	
	static boolean isSubset(int ar1[],int ar2[],int n,int m)
	{
		
		HashSet<Integer>hset=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(!hset.contains(ar1[i]))
				hset.add(ar1[i]);
		}
		for(int i=0;i<m;i++)
		{
			if(!hset.contains(ar2[i]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ar1[]=new int[n];
		int ar2[]=new int[m];
		for(int i=0;i<n;i++)
		{
			ar1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			ar2[i]=sc.nextInt();
		}
		if(isSubset(ar1, ar2, n, m)) 
	        System.out.println("ar2 is a subset of ar1"); 
	        else
	        System.out.println("ar2 is not a subset of ar1"); 
		
		}
}



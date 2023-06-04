
public class Recursion {
	
	//First Logic
	
	int Fibonacci(int fibo)
	{
		if(fibo<=1)
		{
			return fibo;
		}
		else
		{
			return Fibonacci(fibo-1)+Fibonacci(fibo-2);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object Created
		Recursion R1 = new Recursion();
		
		int n=10;
		
		System.out.println("\n\t\t\t First Logic \n");
		
		for(int i=0;i<=n;i++)
		{
			System.out.print(R1.Fibonacci(i)+" "); 
		}
		
		System.out.println("\n\n\t\t\t Second Logic \n");
		
		int f1=0,f2=1,sum;
		for(int i=0;i<=n;i++)
		{
			
			if(i<=1)
			{
				System.out.print(i+" ");
			}
			else
			{
				sum=f1+f2;
				f1=f2;
				f2=sum;
				System.out.print(sum+" ");
			}
			
		}
			

	}

}

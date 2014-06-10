
public class FibonacciGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonacciNumber(6));
		
		System.out.println(fibonacci(6));
		
	}

	private static int getFibonacciNumber(int n) {
		// TODO Auto-generated method stub
		if(n>=0){
			int a[] = new int[n];
			a[0] =0;
			a[1]=1;
			for(int i=2;i<n;i++){
				a[i] = a[i-1]+a[i-2];
			}
			return a[n-1];
		}
		return -1;
	}
	
	public static int fibonacci(int n){
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return(fibonacci(n-1)+fibonacci(n-2));
	}

}

public class Soal {
	public static void main(String[] args) {
		addZero("1.345.642");
		System.out.println(fibonacci(7));
		printPrimeNumbers(10);
	}
	
	public static void addZero(String money) {
		String[] split = money.split("\\.");
		String concate ="";
		for (int i = 0; i < split.length; i++) {
			concate+=split[i];
		}

		int jumlahNol = concate.length();
		for (int j = 0; j < concate.length(); j++) {
			System.out.print(concate.charAt(j));
			for (int k = 0; k < jumlahNol-1; k++) {
				System.out.print("0");
			}
			jumlahNol--;
			System.out.println();
		}
	}
	
	public static int fibonacci(int number){ 
		if(number == 1 || number == 2) { 
			return 1; 
		} 
		return fibonacci(number-1) + fibonacci(number -2);  
	}
	
	/*
	 * Print bilangan prima sebanyak input user.
	 */
	public static void printPrimeNumbers(int n) {
	    for (int i = 2, jumlahPrima = 0; jumlahPrima < n; i++)
	    {
	        boolean isPrime = true;

	        for (int j = 2; j < i; j++)
	        {
	            if (i % j == 0)
	            {
	                isPrime = false;
	                break;
	            }
	       }
	       if (isPrime)
	       {
	           System.out.println(i);
	           jumlahPrima++;
	       }
	    }
	}
}	
	

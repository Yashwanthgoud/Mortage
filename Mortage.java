
import java.text.NumberFormat;
import java.util.Scanner;



public class Mortage {
	

	

	public static void main(String[] args) {
		
		float m,a;
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of principal amount:");
		float p = scan.nextInt();
		if(p>=1000&&p<=1000000)
			System.out.println("principle amount is:"+p);
		else
			System.out.println("Enter the vlaue of principal amount between 1000 and 1000000");
		
		System.out.print("Enter the intrest rate");
		float r= (float) scan.nextDouble();
		if(r>=1&&r<=30)
			System.out.println("Intrest rate is:"+r);
		else
			System.out.println("Enter the intrest rate btween 1 and 30");
		
		System.out.print("Enter the period(Years)");
		float n= scan.nextFloat();
		if(n>=1&&n<=30)
			System.out.println("Period(Years): "+ n);
		else
			System.out.println("Enter the period value between 1 and 30");
		
		
		p=10000;
		r=r/100/12;
		n=n*12;
		
		
	
		a=(float) Math.pow(1+r, n);
		
		m=(float) (p*((r*a)/(a-1)));
		
		
		System.out.println(NumberFormat.getCurrencyInstance(java.util.Locale.US ).format(m));
		
		

		
	}

	
	}
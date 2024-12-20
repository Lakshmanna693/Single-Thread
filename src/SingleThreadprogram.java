 //Single Thread program

import java.util.Scanner;

public class SingleThreadprogram {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1: Addition operation started");
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int res = num1/num2;
		System.out.println("result is :" +res);
		System.out.println("Task 1: Addition oprtion completed");
		System.out.println("Task 2: Printing oprtion completed");
		for (int i=0; i<1; i++) {
	System.out.println("Ajay");
	Thread.sleep(2000);
	}
	System.out.println("Task 2: printing oprtion completed");
	System.out.println("Task 3: Banking oprtion completed");
	System.out.println("Enter the Account number");
	int acc=sc.nextInt();
	System.out.println("Enter the pincode: ");
	int pin=sc.nextInt();
	System.out.println("Account details recoreded");
	System.out.println("Task 3: Banking oprtion completed");
}

}

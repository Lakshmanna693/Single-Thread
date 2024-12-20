import java.util.InputMismatchException;
import java.util.Scanner;
public class Operations extends Thread {

	public void run() {
		if(Thread.currentThread().getName().equals("Add")){
				Add();
		}
				else if(Thread.currentThread().getName().equals("print")) {
					print();
				}
				else {
					Bank();
				}
	}
	public void Add() {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Task 1: Addition operation started");
			System.out.println("Enter the first number");
			int num1=sc.nextInt();
			System.out.println("Enter the second number");
			int num2=sc.nextInt();
			int res = num1/num2;
			System.out.println("result is :" +res);
			System.out.println("Task 1: Addition oprtion completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}

	public void print() {
		try {
			System.out.println("Task 2: Printing oprtion started");
			for(int i=0;i<5;i++) {
				System.out.println("GATE JAINx BANGLORE");
				Thread.sleep(4000);
			}
		System.out.println("ask 2: Printing oprtion started");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}}
		public void Bank() {
			try(Scanner sc=new Scanner(System.in)){
			System.out.println("Task 2: printing oprtion completed");
			System.out.println("Task 3: Banking oprtion completed");
			System.out.println("Enter the Account number");
			int acc=sc.nextInt();
			System.out.println("Enter the pincode: ");
			int pin=sc.nextInt();
			System.out.println("Account details recoreded");
			System.out.println("Task 3: Banking oprtion completed");
		}
			catch(ArithmeticException e1) {
				e1.printStackTrace();
			}
			catch(InputMismatchException e2) {
				e2.printStackTrace();
		}
	}
}
		

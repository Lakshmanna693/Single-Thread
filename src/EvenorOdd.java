
public class EvenorOdd implements Runnable{
	 static int count=1;
	 Object obj;
	 
	 public EvenorOdd(Object obj){
	this.obj = obj;
	 }
	 @Override
	public void run() {
			 while(count<=15) {
				 if(count%2==0 && Thread.currentThread().getName().equals("Even")) {
					 synchronized(obj){
						 System.out.println("Threadname: "+Thread.currentThread().getName()+"value: "+count);
					
						 try {
							 Thread.sleep(2000);
						 }
						 catch(InterruptedException e) {
							 e.printStackTrace();
						 }
					  count++;
					  try {
						  obj.wait();
					  }
					  catch(Exception e) {
							 e.printStackTrace();
				      }
					 }
				 }
					  
					 if(count%2!=0 && Thread.currentThread().getName().equals("Odd")) {
						 synchronized(obj) {
							 System.out.println("Threadname: "+Thread.currentThread().getName()+"value: "+count);
						 try {
							 Thread.sleep(2000);
						 }
							 catch(InterruptedException e) {
								 e.printStackTrace();
							 }
					      count++;
					      try {
							 obj.notify();
					 }
					      catch(Exception e) {
								 e.printStackTrace();
					      }
						 }
					 }
				 }
			 }
	 }

	


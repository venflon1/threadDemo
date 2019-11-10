
public class ApplicationThread {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("tid: " + Thread.currentThread().getId() +" - thread_name: " + Thread.currentThread().getName() + " - Priority : " + 
					 	 Thread.currentThread().getPriority() + 
						 " - state_thread : " + Thread.currentThread().getState());
		
		/*
		 * istance thread with Runnable interface
		 * */
//		Thread t1 = new Thread( new Runnable(){
//			
//			@Override
//			public void run() {
//				System.out.print("\ntid: " + Thread.currentThread().getId() +" - thread_name: " +" - Priority : " + 
//					 	 Thread.currentThread().getPriority() + 
//						 " - state_thread : " + Thread.currentThread().getState());
//				
//				for(int i=0; i<900; i++)
//					System.out.println("tid: " + Thread.currentThread().getId() + " n° " + i);
//			}
//		});
		
		
		/*
		 * istance thread with lambda expression
		 * */
//		Thread t1 = new Thread( ()->{
//			System.out.print("\ntid: " + Thread.currentThread().getId() +" - thread_name: " +" - Priority : " + 
//				 	 Thread.currentThread().getPriority() + 
//					 " - state_thread : " + Thread.currentThread().getState());
//			
//			for(int i=0; i<900; i++)
//				System.out.println("tid: " + Thread.currentThread().getId() + " n° " + i);
//		});
//		t1.start();
//		
//		for(int i=0; i<900; i++)
//			System.out.println("-->tid: " + Thread.currentThread().getId() + " " + i);
		
		/*
		 * istance thread with extend Thread class
		 * */
		Thread t = new MyThread();
		t.start();
		
	} // end main method
	
	public static class MyThread extends Thread{
		
		@Override
		public void run() {
			System.out.print("\ntid: " + Thread.currentThread().getId() +" - thread_name: " +" - Priority : " + 
				 	 Thread.currentThread().getPriority() + 
					 " - state_thread : " + Thread.currentThread().getState());
			
			for(int i=0; i<900; i++)
				System.out.println("tid: " + Thread.currentThread().getId() + " n° " + i);
		}
	}
}


class multithread implements Runnable{
	public void run(){
		System.out.println("thread is running...");
	}
public static void main(String args[]){
	multithread m1 = new multithread();
	Thread t1= new Thread(m1);
	t1.start();
	}
}
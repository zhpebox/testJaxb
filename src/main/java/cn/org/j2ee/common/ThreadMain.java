package cn.org.j2ee.common;

public class ThreadMain {
	private static volatile boolean running = true;
	
	public static void main(String[] args) {
		try{
			final SpringContainer container = new SpringContainer();
			Runtime.getRuntime().addShutdownHook(new Thread(){
				public void run(){
					try{
						container.stop();
					}catch(Throwable t){
						t.printStackTrace();
						t.getMessage();
					}
					synchronized (ThreadMain.class) {
						running = false;
						ThreadMain.class.notify();
					}
				}
			});
			container.start();
			
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		
		synchronized (ThreadMain.class) {
			while(running){
				try{
					ThreadMain.class.wait();
				}catch(Throwable e){}
			}
		}
	}
}

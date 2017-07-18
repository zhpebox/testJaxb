package cn.org.j2ee.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
	private static final String DEFAULT_SPRING_CONFIG = "classpath*:spring-*.xml";
	private static ClassPathXmlApplicationContext context;
	
	public void start(){
		String[] config = DEFAULT_SPRING_CONFIG.split("[,\\s]+");
		context = new ClassPathXmlApplicationContext(config);
		context.start();
	}
	public void stop(){
		try{
			if(context != null){
				context.stop();
				context.close();
				context = null;
			}
			
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}

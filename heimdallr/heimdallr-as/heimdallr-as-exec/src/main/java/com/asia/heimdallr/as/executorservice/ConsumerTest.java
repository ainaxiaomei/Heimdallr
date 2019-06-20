package com.asia.heimdallr.as.executorservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConsumerTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"consumner-app.xml");
		
//		String arg[] = new String[] {"-A", "-u" ,"-c" ,"5","192.168.2.3"};
//		IFpingService pingService = (IFpingService) context.getBean("FpingService");
//		pingService.fping0(5, arg);
		
		
		
		
	}

}

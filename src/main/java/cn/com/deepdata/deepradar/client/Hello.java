package cn.com.deepdata.deepradar.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

public class Hello {

	private static final Logger logger = LoggerFactory.getLogger(Hello.class);

	public static void main(String[] args) {

		logger.debug("000000000000000000000000000");
		System.err.println("11111111111111111111");
		
		logger.debug("debugggggggggggggggggggg");
		
		logger.info("infoooooooooooooooooo");
		
		final StaticLoggerBinder binder = StaticLoggerBinder.getSingleton();
		Class clazz = binder.getLoggerFactory().getClass();
		System.out.println(clazz);
		System.out.println(ClassUtil.getAbsoluteClassPath(clazz));
		
		System.out.println(binder.getLoggerFactoryClassStr());

	}

}

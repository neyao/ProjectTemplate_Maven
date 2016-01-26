package cn.com.deepdata.deepradar.client;

import java.net.URL;

//import cn.com.deepdata.deepradar.client.DeepRadar;

public class ClassUtil {

	public static String getAbsoluteClassPath(@SuppressWarnings("rawtypes") Class clazz) {
		System.out.println();
		URL url1 = clazz.getClassLoader().getResource("");
		URL url2 = clazz.getClassLoader().getResource(clazz.getName());
		URL url3 = clazz.getClassLoader().getResource(clazz.getName()+".class");
		String classPath = "";
		if (url1 != null) {
			String classpath = url1.toString();
			System.out.println("classPath 1: " + classpath.replace(url1.getProtocol() + ":/", ""));
			classPath = classpath.replace(url1.getProtocol() + ":/", "");
		}
		if (url2 != null) {
			String classpath = url2.toString();
			System.out.println("classPath 2: " + classpath.replace(url2.getProtocol() + ":/", ""));
			classPath = classpath.replace(url2.getProtocol() + ":/", "");
		}
		if (url3 != null) {
			String classpath = url3.toString();
			System.out.println("classPath 3: " + classpath.replace(url3.getProtocol() + ":/", ""));
			classPath = classpath.replace(url3.getProtocol() + ":/", "");
		}

		System.out.println("classPath: " + classPath);
		return classPath;
	}
	
	public static void main(String[] args) {
//		Class clazz = DeepRadar.class;
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getCanonicalName());
//		System.out.println(clazz.getModifiers());
	}

}

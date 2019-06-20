package com.luannh.ExampleBuild;

import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App app = new App();
		System.out.println("Begin app!");
		app.loadProperties("config.properties").forEach((k, v) -> System.out.println(k + ":" + v));

	}

	public Properties loadProperties(String path) {
		Properties prop = new Properties();
		try (InputStream stream = getClass().getClassLoader().getResourceAsStream(path)) {
			prop.load(stream);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("unable log properties file test 1234" + path);
			System.err.println("unable log properties file test 1234" + path);
		}
		return prop;
	}
}

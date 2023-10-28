package BaseUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(getProperties("savanna_userName"));
	}

	public static String getProperties(String key) throws IOException {
		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		// System.out.println(projectPath);
		FileInputStream input = new FileInputStream(projectPath + "/elements/baseElements.properties");
		prop.load(input);
		String element = prop.getProperty(key);
		// System.out.println(element);
		return element;

	}

	public static String getProjectProperties(String key) throws IOException {
		Properties prop = new Properties();
		String projectPath = System.getProperty("user.dir");
		// System.out.println(projectPath);
		FileInputStream input = new FileInputStream(projectPath + "/elements/project.properties");
		prop.load(input);
		String project = prop.getProperty(key);
		// System.out.println(element);
		return project;

	}

}

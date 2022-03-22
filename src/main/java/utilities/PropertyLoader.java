package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Class that extracts properties from the prop file.
 */
public class PropertyLoader {

	private static final String PROP_FILE = "/src/main/resources/application.properties";

	public static String loadProperty(String name) {

		String filepath = System.getProperty("user.dir") + PROP_FILE;
		File file = new File(filepath);

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = "";

		if (name != null) {
			value = prop.getProperty(name);
		}
		return value;
	}
}

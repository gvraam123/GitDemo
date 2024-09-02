package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public void readingfile() throws IOException {
		
		Properties prop = new Properties();
		File f = new File("./configProp/App.Properities");
		FileReader fr=new FileReader(f);
		prop.load(fr);
		prop.get("URL");
	}
	
	

}

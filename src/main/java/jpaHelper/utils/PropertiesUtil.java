package jpaHelper.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jpaHelper.exceptions.JpaHelperException;
import jpaHelper.exceptions.enums.ErrorEnum;

public class PropertiesUtil {
	
	private static final String path = "config.properties";
	
	public static Properties get() throws JpaHelperException {
		Properties p = new Properties();
		
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "config.properties";
	    try {
	    	p.load(new FileInputStream(appConfigPath));	    	   
			
		} catch (IOException e) {
			e.printStackTrace();
			throw  new JpaHelperException(e.getMessage(), ErrorEnum.ERROR_CARGANDO_ARCHIVO);
		}  		    
	    return p;
	}
	
	
	public static boolean  isboolean(String texto) {
		if( texto.equals("TRUE") || texto.equals("true")) {
			return true;
		}
		return false;
	}
	


}

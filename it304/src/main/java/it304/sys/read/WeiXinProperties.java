package it304.sys.read;


import java.io.IOException;
import java.util.Properties;

import it304.util.ReadPropertites;
/**
 * ��ȡ΢�����õķ�����
 * @author DK
 *
 */
public class WeiXinProperties {
	public static String token;
	
	public static  void  read(){
		try {
			Properties load = ReadPropertites.load("weixin.properties");
			token = load.getProperty("token");
			System.out.println(token);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

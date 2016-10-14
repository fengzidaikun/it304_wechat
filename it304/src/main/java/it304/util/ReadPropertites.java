package it304.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 
 * @author DK
 * ��ȡproperties�ļ�������
 *
 */
public class ReadPropertites {
	/**
	 * ����properties�ļ�
	 * @param fileName
	 * @return Properties
	 * @throws IOException
	 */
	public static  Properties load (String fileName) throws IOException{
		Properties props = new Properties();
		 //ReadPropertites ������(������������������)
		InputStream in = ReadPropertites.class.getClassLoader().getResourceAsStream(fileName); 
		props.load(in);
		in.close();
		//String jmsUrl = props.getProperty("JMS.Url"); //��ȡ,����key
		return props;
	}
}

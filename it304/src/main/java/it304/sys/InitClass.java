package it304.sys;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import it304.sys.read.WeiXinProperties;

/**
 * spring�ڴ����������֮���Զ�ִ�е��࣬�������ContextRefreshedEvent�¼���������ʼ������¼���
 * @author DK
 *
 */
public class InitClass implements ApplicationListener<ContextRefreshedEvent>{

	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		WeiXinProperties.read();
	}

}

package it304.bo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it304.model.WeChat;
import it304.util.wechat.SignUtil;



/**
 * ΢����Ϣ�����
 * @author DK
 *
 */
@Controller
@RequestMapping("/weixin")
public class WeiXinEntrance {
	@RequestMapping(value="/api",method = RequestMethod.GET)
	@ResponseBody
	public String xxtInterface(WeChat wc){
		long start = System.currentTimeMillis();
		System.out.println("/api");
		String signature = wc.getSignature(); // ΢�ż���ǩ��  
        String timestamp = wc.getTimestamp(); // ʱ���  
        String nonce = wc.getNonce();// �����  
        String echostr = wc.getEchostr();// ����ַ���  
        System.out.println(wc.toString());
        // ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
        	System.out.println(echostr);
        	System.out.println(((long)System.currentTimeMillis()-start)+"ms");
            return echostr;  
        } else {  
            System.out.println("����΢�ŷ���������������,��С��!");  
            return null;
        }  
	}
	@RequestMapping(value="/test",method = RequestMethod.GET)
	@ResponseBody
	public String test(){
		System.out.println("�𣬱����");
		return "seccuss";
	}
}

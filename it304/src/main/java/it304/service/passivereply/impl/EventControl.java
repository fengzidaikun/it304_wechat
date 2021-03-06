package it304.service.passivereply.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import it304.service.passivereply.IWeChatMessageContrl;
import it304.util.wechat.PackageMessage;

@Component
public class EventControl implements IWeChatMessageContrl {
	@Resource(name = "subscrilbe")
	private IWeChatEvent subscribeEvent;
	@Resource(name = "unsubscrilbe")
	private IWeChatEvent unSubscribeEvent;
	@Resource(name = "click")
	private IWeChatEvent clickEvent;

	@Override
	public String retrunMassage(Map<String, String> whChatMessage) {
		IWeChatEvent iWeChatEvent = null;
		System.out.println("1");
		String Event = whChatMessage.get("Event");
		System.out.println(whChatMessage);
		switch (Event) {
		case "subscribe": // 订阅
			iWeChatEvent = subscribeEvent;
			break;
		case "unsubscribe": // 取消订阅
			iWeChatEvent = unSubscribeEvent;
			break;
		case "CLICK": // 自定义菜单的点击
			iWeChatEvent = clickEvent;
			break;
		default:
			iWeChatEvent = null;
			break;
		}
		if (iWeChatEvent == null) {
			return PackageMessage.messagePackage(PackageMessage.msg_type_text, "sorry,暂不支持", whChatMessage.get("FromUserName"));
		}
		return iWeChatEvent.returnEventMassage(whChatMessage);
	}

}

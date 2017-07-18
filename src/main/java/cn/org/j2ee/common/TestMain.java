package cn.org.j2ee.common;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
	    TbMessage message = new TbMessage();
	    message.setMsgId(110);
	    message.setContent("这是一个测试消息");
	    message.setCreateDate(new Date());

	    String string = XmlBuilder.convertToXml(message);

	    System.out.println(string);
	}
}

package cn.org.j2ee.common;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={
    "msgId","content","createDate"
})
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Message")
public class TbMessage {

    @XmlElement(name="MsgID")
    private Integer msgId;

    @XmlElement(name="Content")
    private String content;

    @XmlElement(name="CreateDate")
    private Date createDate;


	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}

    //省略getter setter、、

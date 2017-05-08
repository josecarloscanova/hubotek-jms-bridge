package org.hubotek.jms;

import java.util.Map;

import org.hubotek.MessageBase;

public class JmsMessageBase implements MessageBase<Map<?,?> , String> {

	private Map<?,?> header;
	
	private String body;
	
	public JmsMessageBase() {
	}

	JmsMessageBase(Map<?, ?> header, String body) {
		super();
		this.header = header;
		this.body = body;
	}

	public Map<?, ?> getHeader() {
		return header;
	}

	public String getBody() {
		return body;
	}

	public void setHeader(Map<?, ?> header) {
		this.header = header;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	

}

package org.hubotek.jms;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import javax.inject.Named;
import javax.jms.JMSException;
import javax.jms.Message;

import org.hubotek.HubotekException;
import org.hubotek.JmsHeaderEnum;

@Named(value="baseHeaderTransformer")
public class BaseHeaderTransformer<T> implements Function<Message,Map<JmsHeaderEnum,Object>> {
	
	public BaseHeaderTransformer() {
	}

	public Map<JmsHeaderEnum,Object> apply(Message message)  {
		Map<JmsHeaderEnum,Object> headers = new EnumMap<JmsHeaderEnum,Object>(JmsHeaderEnum.class);
		try{ 
				headers.put(JmsHeaderEnum.JMSCorrelationID, message.getJMSCorrelationID());
				headers.put(JmsHeaderEnum.JMSDeliveryMode, message.getJMSDeliveryMode());
//				headers.put(JmsHeaderEnum.JMSDestination, message.getJMSDestination());
				headers.put(JmsHeaderEnum.JMSExpiration, message.getJMSExpiration());
				headers.put(JmsHeaderEnum.JMSMessageID, message.getJMSMessageID());
				headers.put(JmsHeaderEnum.JMSPriority, message.getJMSPriority());
				headers.put(JmsHeaderEnum.JMSRedelivered, message.getJMSRedelivered());
//				headers.put(JmsHeaderEnum.JMSReplyTo, message.getJMSReplyTo());
				headers.put(JmsHeaderEnum.JMSTimestamp, message.getJMSTimestamp());
				headers.put(JmsHeaderEnum.JMSType, message.getJMSType());
		}catch(JMSException jmsEx)
		{ 
			throw new HubotekJmsException(jmsEx);
		}
		return headers;
	}

}

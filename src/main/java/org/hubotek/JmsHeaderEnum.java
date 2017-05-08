package org.hubotek;

/**
 * {@link}Enum representing the "standard" header values of the jms {@link}javax.jms.Message
 * @author JoseCanova
 *
 */
public enum JmsHeaderEnum {

	JMSDestination,
	JMSDeliveryMode,
	JMSMessageID, 
	JMSTimestamp,
	JMSCorrelationID,
	JMSReplyTo, 
	JMSRedelivered,
	JMSType,
	JMSExpiration,
	JMSPriority;
	
	
}

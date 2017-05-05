package org.hubotek.jms;

import javax.jms.Message;

import org.hubotek.Processor;

/**
 * Tag interface for message processing.
 * Extends the processor tag functional interface to specializes the generic terms.
 * @author JoseCanova
 *
 * @param <T>
 */
@FunctionalInterface
public interface JmsMessageProcessor<T> extends Processor<Message,T> {
}

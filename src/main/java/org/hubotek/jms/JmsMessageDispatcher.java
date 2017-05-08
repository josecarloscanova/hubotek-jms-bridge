package org.hubotek.jms;

import org.hubotek.Dispatcher;
import org.hubotek.message.MessageBase;

@FunctionalInterface
public interface JmsMessageDispatcher extends Dispatcher<MessageBase> {
}

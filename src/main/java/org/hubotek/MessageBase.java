package org.hubotek;

public interface MessageBase<S,T> {
	S getHeader();
	T getBody();
}

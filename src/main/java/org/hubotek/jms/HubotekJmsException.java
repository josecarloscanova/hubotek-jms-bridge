package org.hubotek.jms;

import org.hubotek.HubotekException;

public class HubotekJmsException extends HubotekException {

	private static final long serialVersionUID = -1354750958446030133L;

	public HubotekJmsException() {
	}

	public HubotekJmsException(String message) {
		super(message);
	}

	public HubotekJmsException(Throwable cause) {
		super(cause);
	}

	public HubotekJmsException(String message, Throwable cause) {
		super(message, cause);
	}

	public HubotekJmsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

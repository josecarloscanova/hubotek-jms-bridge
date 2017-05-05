package org.hubotek;

public class HubotekException extends RuntimeException {

	private static final long serialVersionUID = -7730598936727331432L;

	public HubotekException() {
	}

	public HubotekException(String message) {
		super(message);
	}

	public HubotekException(Throwable cause) {
		super(cause);
	}

	public HubotekException(String message, Throwable cause) {
		super(message, cause);
	}

	public HubotekException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

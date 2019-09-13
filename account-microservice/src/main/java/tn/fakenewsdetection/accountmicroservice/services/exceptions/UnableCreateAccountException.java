package tn.fakenewsdetection.accountmicroservice.services.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UnableCreateAccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnableCreateAccountException(String message) {
		super(message);
	}
}

package br.com.api.car.tinnova.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.api.car.tinnova.model.BaseResponse;

@RestControllerAdvice
public class GenericErrorHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public BaseResponse handleBadInputGeneric(Exception exception) {

		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setValidRequest(false);
		baseResponse.setStatus("Something strange happened");

		return baseResponse;
	}

}

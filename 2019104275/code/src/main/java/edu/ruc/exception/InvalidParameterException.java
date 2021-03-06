package edu.ruc.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class InvalidParameterException extends Exception {

    public InvalidParameterException(String msg) {
        super(msg);
    }
}

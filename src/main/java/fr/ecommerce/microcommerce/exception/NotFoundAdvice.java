package fr.ecommerce.microcommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFoundAdvice {

    @ExceptionHandler
    public ProblemDetail handle(NotFoundException nfe) {
        var pd = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        pd.setDetail(nfe.getMessage());
        return pd;
    }
}

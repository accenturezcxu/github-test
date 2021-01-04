package com.spring.demo.response;

/**
 * Created by jie.a.xie on 8/27/2020.
 */
public class ErrorResponse {
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

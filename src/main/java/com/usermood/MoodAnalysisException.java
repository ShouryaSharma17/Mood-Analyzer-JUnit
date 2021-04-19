package com.usermood;

public class MoodAnalysisException extends Exception{
    exceptionType type;
    public MoodAnalysisException( exceptionType type, String message) {
        super(message);
        this.type = type;
    }
    enum exceptionType {
    givenNullInput, givenEmptyInput
    }
}
package com.moodAnalyser;

public class MoodAnalyzerException extends Exception{
	public ExceptionType type;
	public String message;
	
	
	public enum ExceptionType{
		NULL,EMPTYSTRING
	}
	public MoodAnalyzerException(String message,ExceptionType type) {
		super(message);
		this.type = type;
	}
	
}

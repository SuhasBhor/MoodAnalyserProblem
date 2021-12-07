package com.moodAnalyser;

public class MoodAnalyser {
	
	String message;
	
	public MoodAnalyser(String message) {    //constructor 
		super();
		this.message = message;
	}
	
	public String analyseMood() {           //Method
		try {
			if(message.contains("Sad")) 
				return "Sad";
			else
				return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}

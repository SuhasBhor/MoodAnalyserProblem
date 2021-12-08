package com.moodAnalyser;

public class MoodAnalyser {
	
	String message;
	
	public MoodAnalyser(String message) {    //constructor 
		super();
		this.message = message;
	}
	
	public String analyseMood() throws Exception{           //Method
		if(message == null) {
			throw new MoodAnalyzerException("Message Can't Be Null");
		}
		else if(message.equals("")) {
			throw new MoodAnalyzerException("Message Can't Be Empty");
		}
		else if(message.contains("Sad")) 
				return "Sad";
		else
				return "Happy";
	}
}

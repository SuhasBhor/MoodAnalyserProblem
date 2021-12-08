package com.moodAnalyser;

import com.moodAnalyser.MoodAnalyzerException.ExceptionType;

public class MoodAnalyser {
	
	String message;
	
	public MoodAnalyser(String message) {    //constructor 
		super();
		this.message = message;
	}

	public String analyseMood() throws Exception { // Method

		try {
			if (message == null) {
				throw new MoodAnalyzerException("Message Can't Be Null ",ExceptionType.NULL);
			}
			/*
			 * else if(message.equals("")) { throw new
			 * MoodAnalyzerException("Message Can't Be Empty"); }
			 */
			else if (message.contains("Sad"))
				return "Sad";
			else
				return "Happy";
		} catch (MoodAnalyzerException e) {
			System.out.println(e);
			return "Happy";
			//e.printStackTrace();
		}
	}
}

package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moodAnalyser.MoodAnalyser;
import com.moodAnalyser.MoodAnalyzerException;

public class MoodAnalyserTest {
	@Test
	public void sadMessage() throws Exception{
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Sad", mood);
	}
	
	@Test
	public void happyMessage() throws Exception{
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
	
	@Test
	public void nullMessage() throws Exception{
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
}

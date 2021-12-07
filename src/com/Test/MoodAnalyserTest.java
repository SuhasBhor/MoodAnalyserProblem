package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moodAnalyser.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void sadMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I'm In Sad Mood");
		assertEquals("Sad", mood);
	}
	@Test
	public void happyMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I'm In Any Mood");
		assertEquals("Happy", mood);
	}
}

package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moodAnalyser.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void sadMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Sad", mood);
	}
	@Test
	public void nullMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
	@Test
	public void happyMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
}

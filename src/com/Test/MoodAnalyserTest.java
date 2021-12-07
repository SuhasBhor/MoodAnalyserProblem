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
	public void happyMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm In Happy Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("Happy", mood);
	}
}

package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moodAnalyser.MoodAnalyser;

public class MoodAnalyserTest {
	@Test
	public void testMessage() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("Suhas");
		assertEquals("Sad", mood);
	}
}

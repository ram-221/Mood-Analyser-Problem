package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

	
	
	@Test
	public void givenMessage_WhenProper_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood= moodAnalyser.analysrMood("This Is a Sad Message");
		System.out.println(mood);
		Assertions.assertEquals("SAD", mood);
	}
	

	@Test
	public void givenMessage_WhenProper_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood= moodAnalyser.analysrMood("This Is a happy Message");
		System.out.println(mood);
		Assertions.assertEquals("HAPPY", mood);
	}
}

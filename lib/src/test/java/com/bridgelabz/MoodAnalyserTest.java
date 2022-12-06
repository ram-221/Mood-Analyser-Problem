package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

/* analyseMood method can just return
		Happy to pass this Test Case (TC)*/
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("I am in any mood");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY", mood);
    }
}

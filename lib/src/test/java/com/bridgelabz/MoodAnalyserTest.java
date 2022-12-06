package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

/*8analyseMood method can just return
		SAD to pass this Test Case (TC)*/
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyserMood("I am in sad mood");
        System.out.println(mood);
        Assertions.assertEquals("SAD", mood);
    }
}

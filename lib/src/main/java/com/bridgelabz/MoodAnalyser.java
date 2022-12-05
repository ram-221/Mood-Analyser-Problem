package com.bridgelabz;

public class MoodAnalyser {

	public String analysrMood(String message) {
		if(message.contains("sad")) {
		return "SAD";
		}else {
			return "HAPPY";
		}
	}

}

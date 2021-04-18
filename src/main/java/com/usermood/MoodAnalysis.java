package com.usermood;

public class MoodAnalysis {
    String message;
    public MoodAnalysis(){
    }
    public MoodAnalysis(String message) {
        this.message = message;
    }
    public String analyze_mood() {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

package com.usermood;

public class MoodAnalysis {
    String message;
    public MoodAnalysis(){
    }
    public MoodAnalysis(String message) {
        this.message = message;
    }
    public String analyze_mood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
     }
    }

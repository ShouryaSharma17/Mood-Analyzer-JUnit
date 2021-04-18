package com.usermood;

public class MoodAnalysis {
        //Method to Analyze And Respond Sad or Happy On Finding Word SAD
        public String analyze_mood(String message) {
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
    }


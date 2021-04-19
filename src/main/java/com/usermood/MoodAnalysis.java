package com.usermood;

public class MoodAnalysis {
    String message;
    public MoodAnalysis(String message) {
        this.message = message;
    }
    public String analyze_mood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyze_mood();
    }
    public String analyze_mood() throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.givenNullInput, "You Have Passed Null, Please Enter Proper Mood");
        }
     }
    }

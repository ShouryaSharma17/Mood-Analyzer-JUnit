package com.usermood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnHappy() {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.analyze_mood("I am in any mood");
        Assert.assertEquals("HAPPY",mood);
    }
}

package com.usermood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.analyze_mood("I am in a sad mood");
        Assert.assertEquals("SAD",mood);

    }
}

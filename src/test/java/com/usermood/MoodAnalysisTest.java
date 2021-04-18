package com.usermood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String mood = moodAnalysis.analyze_mood("This is a sad message");
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalysis moodAnalysis=new MoodAnalysis();
        String mood= moodAnalysis.analyze_mood("This is a Happy message");
        Assert.assertEquals("HAPPY",mood);
    }

}

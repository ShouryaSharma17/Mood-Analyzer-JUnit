package com.usermood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
            MoodAnalysis mood_test = new MoodAnalysis();
            mood_test.message = "This is a Sad Message";
            String mood_Test = mood_test.analyze_mood();
            Assert.assertEquals("SAD", mood_Test);
        }
}


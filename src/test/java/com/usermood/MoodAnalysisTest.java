package com.usermood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenNull_throwsException() {
            MoodAnalysis mood_test = new MoodAnalysis(null);
            mood_test.message = null;
            String mood_Test = mood_test.analyze_mood();
            Assert.assertEquals("HAPPY", mood_Test);
        }
}


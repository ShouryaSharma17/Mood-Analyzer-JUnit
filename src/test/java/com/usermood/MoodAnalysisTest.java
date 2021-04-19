package com.usermood;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalysisTest {
    @Test
    public void givenNull_throwsException() {
            MoodAnalysis mood_test = new MoodAnalysis(null);
            try {
                mood_test.analyze_mood();
            }
            catch (MoodAnalysisException e) {
                Assert.assertEquals(MoodAnalysisException.exceptionType.givenNullInput, e.type);
            }
    }
}


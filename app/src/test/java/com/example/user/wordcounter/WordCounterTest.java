package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void emptyStringPassed() {
        assertEquals(0, wordCounter.countWords(" "));
    }

    @Test
    public void StringOfTextTest() {
        assertEquals(2,wordCounter.countWords("Hello World!"));
    }
}

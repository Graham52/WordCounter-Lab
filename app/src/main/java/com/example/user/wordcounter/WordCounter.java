package com.example.user.wordcounter;

/**
 * Created by user on 19/03/2018.
 */

public class WordCounter {

    public int countWords(String stringOfText){
        if (stringOfText == null || stringOfText.isEmpty())
            return 0;
        else
            return stringOfText.split("\\s+").length;
    }

}

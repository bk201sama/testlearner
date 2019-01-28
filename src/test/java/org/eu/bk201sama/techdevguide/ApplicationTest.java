package org.eu.bk201sama.techdevguide;

import  org.eu.bk201sama.techdevguide.findlongestword.FindLongestWord;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    /**
     * find the longest substring in S and D
     * lesson one https://techdevguide.withgoogle.com/paths/foundational/find-longest-word-in-dictionary-that-subsequence-of-given-string/#code-challenge
     */
    @Test
    public void testFindLongestWord() {
        String S = "abppplee";
        String[] D = {"able", "ale", "apple", "bale", "kangaroo"};
        //correct result
        String actual = FindLongestWord.findLongestWord(S,D);
        System.out.println(actual);
        String expect = "apple";
        Assert.assertEquals(actual,expect);
    }
}

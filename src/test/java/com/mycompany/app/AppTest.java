package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for the App.
 */
public class AppTest {
    @Test
    public void shouldCombine2And3Correctly() {
        ArrayList<String> combinations = App.possibleLetterCombinations(new Integer[]{2, 3});

        assertEquals("ad", combinations.get(0));
        assertEquals("ae", combinations.get(1));
        assertEquals("af", combinations.get(2));
        assertEquals("bd", combinations.get(3));
        assertEquals("be", combinations.get(4));
        assertEquals("bf", combinations.get(5));
        assertEquals("cd", combinations.get(6));
        assertEquals("ce", combinations.get(7));
        assertEquals("cf", combinations.get(8));
    }

    @Test
    public void shouldCombine1And3Correctly() {
        ArrayList<String> combinations = App.possibleLetterCombinations(new Integer[]{1, 3});

        assertEquals("d", combinations.get(0));
        assertEquals("e", combinations.get(1));
        assertEquals("f", combinations.get(2));
    }

    @Test
    public void shouldCombine3And6And9Correctly() {
        ArrayList<String> combinations = App.possibleLetterCombinations(new Integer[]{3, 6, 9});

        assertEquals("dmw", combinations.get(0));
        assertEquals("dmx", combinations.get(1));
        assertEquals("dmy", combinations.get(2));
        assertEquals("dmz", combinations.get(3));
        assertEquals("dnw", combinations.get(4));
        assertEquals("dnx", combinations.get(5));
        assertEquals("dny", combinations.get(6));
        assertEquals("dnz", combinations.get(7));
        assertEquals("dow", combinations.get(8));
        assertEquals("dox", combinations.get(9));
        assertEquals("doy", combinations.get(10));
        assertEquals("doz", combinations.get(11));
        assertEquals("emw", combinations.get(12));
        assertEquals("emx", combinations.get(13));
        assertEquals("emy", combinations.get(14));
        assertEquals("emz", combinations.get(15));
        assertEquals("enw", combinations.get(16));
        assertEquals("enx", combinations.get(17));
        assertEquals("eny", combinations.get(18));
        assertEquals("enz", combinations.get(19));
        assertEquals("eow", combinations.get(20));
        assertEquals("eox", combinations.get(21));
        assertEquals("eoy", combinations.get(22));
        assertEquals("eoz", combinations.get(23));
        assertEquals("fmw", combinations.get(24));
        assertEquals("fmx", combinations.get(25));
        assertEquals("fmy", combinations.get(26));
        assertEquals("fmz", combinations.get(27));
        assertEquals("fnw", combinations.get(28));
        assertEquals("fnx", combinations.get(29));
        assertEquals("fny", combinations.get(30));
        assertEquals("fnz", combinations.get(31));
        assertEquals("fow", combinations.get(32));
        assertEquals("fox", combinations.get(33));
        assertEquals("foy", combinations.get(34));
        assertEquals("foz", combinations.get(35));
    }
}

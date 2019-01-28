package org.eu.bk201sama.techdevguide.findlongestword;


public class FindLongestWord {
    public static String findLongestWord(String s, String[] d) {
        String longest = "";
        for (String t : d) {
            if (isSubString(t, s)) {
                if (t.length() > longest.length()) {
                    longest = t;
                }
            }
        }
        return longest;
    }

    private static boolean isSubString(String subString, String parentString) {
        char[] subChar = subString.toCharArray();
        int last = 0;
        for (char aSubChar : subChar) {
            int j = parentString.indexOf(aSubChar);
            if (j < last) {
                return false;
            }
        }
        return true;
    }
}

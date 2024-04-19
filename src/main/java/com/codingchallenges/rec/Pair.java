package com.codingchallenges.rec;

public class Pair {

    private String userName;
    private int wordCount;

    public Pair(String userName, int wordCount) {
        this.userName = userName;
        this.wordCount = wordCount;
    }

    public String getUserName() {
        return userName;
    }

    public int getWordCount() {
        return wordCount;
    }
}

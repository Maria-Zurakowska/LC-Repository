package com.codingchallenges.rec;

import java.util.*;
/* Imagine a log file that abridges chats. An example might be:
09:00 <paul> hi!
09:31 <kate> hello!
09:45 <paul> can you link the design?

where Paul said 6 total words and Kate said 1.
Your goal is to present the top n users who have the highest total word count in descending order.
You need to write a function that takes an integer n and a filepath.
You are provided a helper function, parse_log, which returns a list of usernames and word counts for each
message parsed.
* */
public class Chat {

    public static void main(String[] args) {

        int n = 2;
        List<Pair> usersWithTopCountListSorted = getUsersWithTopWordCount(n, "file");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < usersWithTopCountListSorted.size(); i++) {

            Pair pair = new Pair(usersWithTopCountListSorted.get(i).getUserName(), usersWithTopCountListSorted.get(i).getWordCount());

            sb.append("Name: ");
            sb.append(pair.getUserName());
            sb.append(" | ");
            sb.append(" ");
            sb.append("WordCount: ");
            sb.append(pair.getWordCount());
            sb.append("\n");
        }
        String result = sb.toString();
        System.out.println(result);
    }

    public static List<Pair> getUsersWithTopWordCount(int n, String filepath) {

        List<Pair> usersWithWordCount = parseLog(filepath);
        Map<String, Integer> nameToWordCount = new HashMap<>();
        List<Pair> topWordCountUsersList = new ArrayList<>();

        Comparator comparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair first, Pair second) {
                int firstWordCount = first.getWordCount();
                int secondWordCount = second.getWordCount();

                return secondWordCount - firstWordCount;
            }
        };

        for (Pair pair : usersWithWordCount) {
            String userName = pair.getUserName();
            int wordCount = pair.getWordCount();
            int storedWordCount = nameToWordCount.getOrDefault(userName, -1);

            if (storedWordCount == -1) {
                nameToWordCount.put(userName, wordCount);
            } else {
                nameToWordCount.put(userName, wordCount + storedWordCount);
            }
        }

        for (String userName : nameToWordCount.keySet()) {
            int value = nameToWordCount.get(userName);
            topWordCountUsersList.add(new Pair(userName, value));
        }
        topWordCountUsersList.sort(Comparator.comparing(Pair::getWordCount).reversed());

        return topWordCountUsersList.stream().limit(n).toList();
    }

    public static List<Pair> parseLog(String filepath) {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair("Anna", 3));
        list.add(new Pair("Kasia", 3));
        list.add(new Pair("Anna", 4));
        list.add(new Pair("Ola", 2));
        list.add(new Pair("Ewa", 1));
        list.add(new Pair("Anna", 5));

        return list;
    }
}

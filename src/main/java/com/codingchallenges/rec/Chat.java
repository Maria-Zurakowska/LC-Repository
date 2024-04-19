package com.codingchallenges.rec;
import java.util.*;

/* Imagine a log file that abridges chats. An example might be:
10:00 <john> hi!
10:01 <maria> hello!
10:07 <john> can you link the design?

where John said 6 total words and Maria said 1.
Your goal is to present the top N users who have the highest total word count in descending order.
You need to write a function that takes an integer n and a filepath.
You are provided a helper function, parse_log, which returns a list of usernames and word counts for each
message parsed.
* */
public class Chat {

    public static void main(String[] args) {

      getUsersWithTopWordCount(3, "A");
    }

    public static List<Pair> getUsersWithTopWordCount(int n, String filepath){

        List<Pair> listOfUsersWithWordCount = parseLog(filepath);
        Map<String, Integer> userNameToWordCount = new HashMap<>();

        for (int i = 0; i < listOfUsersWithWordCount.size(); i++) {

            if(userNameToWordCount.containsKey(listOfUsersWithWordCount.get(i).getUserName())){
                Integer oldValue = userNameToWordCount.get(listOfUsersWithWordCount.get(i).getUserName());
                Integer newValue = oldValue + listOfUsersWithWordCount.get(i).getWordCount();
                userNameToWordCount.put(listOfUsersWithWordCount.get(i).getUserName(), newValue);

            } else {
                userNameToWordCount.put(listOfUsersWithWordCount.get(i).getUserName(), listOfUsersWithWordCount.get(i).getWordCount());
            }
        }
        return null;
    }
    public static List<Pair> parseLog(String filepath){

        List<Pair> list = new ArrayList<>();
        list.add(new Pair("Anna", 3));
        list.add(new Pair("Kasia", 3));
        list.add(new Pair("Ola", 2));
        list.add(new Pair("Anna", 4));
        list.add(new Pair("Ewa", 1));
        list.add(new Pair("Anna", 5));

        return list;
    }
}

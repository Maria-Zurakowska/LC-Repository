package com.codingchallenges.cs;
/*
* Given a year, return the century it is in.
* The first century spans from the year 1 up to and including the year 100,
* the second - from the year 101 up to and including the year 200, etc.
*/

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CenturyFromYear {

    public static void main(String[] args) {

        int year = 201;

        log.info(String.valueOf(getCenturyFromYear(year)));
    }

    public static int getCenturyFromYear(int year){

        if(year <= 0){

            return -1;
        }

        int century = year / 100;

        if(year % 100 == 0){

            return century;
        }

        return century + 1;
    }
}

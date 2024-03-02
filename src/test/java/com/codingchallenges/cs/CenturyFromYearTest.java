package com.codingchallenges.cs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenturyFromYearTest {

    @Test
    public void testGetCenturyFromYearWithNegativeYear() {

        // Given: a negative year
        int year = -100;

        // When: getCenturyFromYear is called
        int result = CenturyFromYear.getCenturyFromYear(year);

        // Then: the result should be -1
        assertEquals(-1, result);
    }

    @Test
    public void testGetCenturyFromYearWithYearZero() {

        // Given: the year zero
        int year = 0;

        // When: getCenturyFromYear is called
        int result = CenturyFromYear.getCenturyFromYear(year);

        // Then: the result should be -1
        assertEquals(-1, result);
    }

    @Test
    public void testGetCenturyFromYearWithYearInFirstCentury() {

        // Given: a year in the first century
        int year = 99;

        // When: getCenturyFromYear is called
        int result = CenturyFromYear.getCenturyFromYear(year);

        // Then: the result should be 1
        assertEquals(1, result);
    }

    @Test
    public void testGetCenturyFromYearAtCenturyBoundary() {

        // Given: a year at the boundary of a century
        int year = 2000;

        // When: getCenturyFromYear is called
        int result = CenturyFromYear.getCenturyFromYear(year);

        // Then: the result should be 20
        assertEquals(20, result);
    }

    @Test
    public void testGetCenturyFromYearJustAfterCenturyBoundary() {

        // Given: a year just after the boundary of a century
        int year = 1901;

        // When: getCenturyFromYear is called
        int result = CenturyFromYear.getCenturyFromYear(year);

        // Then: the result should be 20
        assertEquals(20, result);
    }
}

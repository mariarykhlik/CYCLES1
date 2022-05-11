package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    void shouldCountSqrInBorders(int bottom, int top, int expected) {

        SqrService service = new SqrService();

        int actual = service.sqrCount(bottom, top);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSqrOnBottom() {

        SqrService service = new SqrService();

        int expected = 1;
        int actual = service.sqrCount(9801, 10_000);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSqrOnTop() {

        SqrService service = new SqrService();

        int expected = 1;
        int actual = service.sqrCount(0, 100);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSqrBelowBottom() {

        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.sqrCount(0, 99);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountSqrUpperTop() {

        SqrService service = new SqrService();

        int expected = 0;
        int actual = service.sqrCount(9802, 10_000);
        assertEquals(expected, actual);
    }
}

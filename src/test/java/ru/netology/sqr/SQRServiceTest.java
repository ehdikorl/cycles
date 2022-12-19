package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldcalCulateSquardUpperBound() {
        SQRService service = new SQRService();
        int expected = 3;
        int min = 100;
        int max = 150;
        int actual = service.calculateSquard(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldcalCulateSquardLowerBound() {
        SQRService service = new SQRService();
        int expected = 2;
        int min = 9500;
        int max = 10000;
        int actual = service.calculateSquard(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSquardAverageValue() {
        SQRService service = new SQRService();
        int expected = 13;
        int min = 4500;
        int max = 6500;
        int actual = service.calculateSquard(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateZeroSquaresUpperBound() {
        SQRService service = new SQRService();
        int expected = 0;
        int min = 9802;
        int max = 9900;
        int actual = service.calculateSquard(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateZeroSquaresLowerBound() {
        SQRService service = new SQRService();
        int expected = 0;
        int min = 45;
        int max = 99;
        int actual = service.calculateSquard(min, max);

        assertEquals(expected, actual);
    }
}
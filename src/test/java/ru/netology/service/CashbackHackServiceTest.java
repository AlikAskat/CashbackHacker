package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void calculateBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    void calculateBonus2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = cashbackHackService.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);


    }

    @Test
    void calculateBonus3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }
}
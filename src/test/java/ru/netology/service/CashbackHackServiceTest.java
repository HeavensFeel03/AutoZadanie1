package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldCasbackIfAmount1900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }


    @Test
    public void ShouldCasbackIfAmount1800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCasbackIfAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCasbackIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
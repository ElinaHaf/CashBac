package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldGetRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int expected = cashbackHackService.remain(amount);
        int actual = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRemainZeroOn1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int expected = cashbackHackService.remain(amount);
        int actual = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetRemainZeroOn3000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 3000;

        int expected = cashbackHackService.remain(amount);
        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRemainOn950() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 950;

        int expected = cashbackHackService.remain(amount);
        int actual = 50;

        assertEquals(expected, actual);
    }


}
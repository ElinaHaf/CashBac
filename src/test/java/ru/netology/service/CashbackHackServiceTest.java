package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

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

}
package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test

    void shouldRemainIfAmountBelow1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test

    void shouldRemain0IfAmount1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test

    void shouldRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test

    void shouldRemainIfAmountMinus() {

        CashbackHackService service = new CashbackHackService();
        int amount = -800;

        int actual = service.remain(amount);
        int expected = 1800;
        assertEquals(actual, expected);
    }

    @Test

    void shouldRemainIfAmount0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }


}
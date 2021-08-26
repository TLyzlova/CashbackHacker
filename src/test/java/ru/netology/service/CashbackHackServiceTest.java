package ru.netology.service;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @org.testng.annotations.Test

    void shouldRemainIfAmountBelow1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    void shouldRemainIfAmount1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemainIfAmountMinus() {

        CashbackHackService service = new CashbackHackService();
        int amount = -800;

        int actual = service.remain(amount);
        int expected = 1800;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void shouldRemainIfAmount0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}
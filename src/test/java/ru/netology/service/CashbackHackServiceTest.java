package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void shouldRemainIfAmountBelow1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldRemain0IfAmount1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldRemainIfAmountMinus() {

        CashbackHackService service = new CashbackHackService();
        int amount = -800;

        int actual = service.remain(amount);
        int expected = 1800;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldRemainIfAmount0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}
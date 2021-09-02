package ru.netology.service;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.Test

    public void shouldRemainIfAmountBelow1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldRemain0IfAmount1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldRemainIfAmountMinus() {

        CashbackHackService service = new CashbackHackService();
        int amount = -800;

        int actual = service.remain(amount);
        int expected = 1800;
        assertEquals(expected, actual);
    }

    @org.junit.Test

    public void shouldRemainIfAmount0() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

}
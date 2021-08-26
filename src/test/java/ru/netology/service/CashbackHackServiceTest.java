package ru.netology.service;

//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @Test

    void shouldRemainIfAmountBelow1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    void shouldRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

}
package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {


    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1200);
        int expected = 800;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}

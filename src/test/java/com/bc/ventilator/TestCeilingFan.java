package com.bc.ventilator;

import com.bc.ventilator.internal.CeilingFan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCeilingFan {
    private Fan fan;

    @BeforeEach
    public void initializeEach() {
         fan = new CeilingFan();
    }
    @Test
    public void testInitialValues() {

        assertEquals(0, fan.getSpeed());
        assertEquals(true, fan.isClockwiseRotation());
    }

    @Test
    public void testPullSpeedCord() {

        for (int i = 0; i < 3; i++) {

            fan.pullSpeedCord();
        }
        assertEquals(3, fan.getSpeed());
        assertEquals(true, fan.isClockwiseRotation());
    }

    @Test
    public void testPullSpeedCordStop() {

        for (int i = 0; i < 4; i++) {

            fan.pullSpeedCord();
        }
        assertEquals(0, fan.getSpeed());
        assertEquals(true, fan.isClockwiseRotation());
    }

    @Test
    public void testPullReverseCord() {

        fan.pullReverseCord();

        assertEquals(0, fan.getSpeed());
        assertEquals(false, fan.isClockwiseRotation());
    }

    @Test
    public void testPullReverseCordWithSpeed() {

        for (int i = 0; i < 3; i++) {

            fan.pullSpeedCord();
        }

        fan.pullReverseCord();

        assertEquals(3, fan.getSpeed());
        assertEquals(false, fan.isClockwiseRotation());

        fan.pullReverseCord();

        assertEquals(3, fan.getSpeed());
        assertEquals(true, fan.isClockwiseRotation());
    }
}
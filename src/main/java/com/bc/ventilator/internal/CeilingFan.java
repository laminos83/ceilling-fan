package com.bc.ventilator.internal;

import com.bc.ventilator.Fan;

/**
 * This class represent a basic implementation of ceiling fan
 *
 * @author lamine
 * @version 1.0
 */

public class CeilingFan implements Fan {
    private static final int MAX_SPEED = 3;
    private boolean clockwiseRotation;
    private int currentSpeed;

    public CeilingFan() {
        this.clockwiseRotation = true;
    }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }

    @Override
    public boolean isClockwiseRotation() {
        return this.clockwiseRotation;
    }

    @Override
    public void pullSpeedCord() {

        currentSpeed = ++currentSpeed % (MAX_SPEED + 1);
        operate();
    }

    @Override
    public void pullReverseCord() {
        this.clockwiseRotation = !this.clockwiseRotation;
    }

    private void operate() {

    }
}

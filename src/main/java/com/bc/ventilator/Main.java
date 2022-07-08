package com.bc.ventilator;

import com.bc.ventilator.internal.CeilingFan;

/**
 *
 * @author lamine
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Fan fan = new CeilingFan();
        fan.pullSpeedCord();

        System.out.printf("current speed:%d%n", fan.getSpeed());
        System.out.printf("Rotation clockwise :%b%n", fan.isClockwiseRotation());

        fan.pullReverseCord();

        System.out.printf("current speed:%d%n", fan.getSpeed());
        System.out.printf("Rotation clockwise :%b%n", fan.isClockwiseRotation());
    }
}

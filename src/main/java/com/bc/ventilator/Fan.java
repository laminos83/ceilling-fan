package com.bc.ventilator;
/**
 *
 * @author lamine
 * @version 1.0
 */

public interface Fan {
    /**
     * returns the current speed of the fan
     * @return current speed of the fan
     */
    int getSpeed();

    /**
     * Tests if the rotation is clockwise
     * @return true if the rotation is set clockwise and false otherwise
     */
    boolean isClockwiseRotation();

    /**
     * Increases the speed of the fan each time it is pulled
     *  If the maximum speed is reached, the speed returns to 0”
     */
    void pullSpeedCord();
    /**
     * Reverses the direction of the fan at the current speed setting
     */
    void pullReverseCord();
}

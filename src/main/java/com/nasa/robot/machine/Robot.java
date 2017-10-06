package com.nasa.robot.machine;

import com.nasa.robot.exception.RobotOutOfAreaException;

public class Robot {

    private int x = 0;
    private int y = 0;
    private State state = State.N;

    public void goToNorth() throws RobotOutOfAreaException {
        this.y++;
        if (y > 4) {
            throw new RobotOutOfAreaException();
        }
    }

    public void goToSouth() throws RobotOutOfAreaException {
        this.y--;
        if (y < 0) {
            throw new RobotOutOfAreaException();
        }
    }

    public void goToEast() throws RobotOutOfAreaException {
        this.x++;
        if (x > 4) {
            throw new RobotOutOfAreaException();
        }
    }

    public void goToWest() throws RobotOutOfAreaException {
        this.x--;
        if (x < 0) {
            throw new RobotOutOfAreaException();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + state +
                ')';
    }
}

package com.nasa.robot.machine;

import com.nasa.robot.exception.RobotOutOfAreaException;

public interface StateEventListener {

    void move(Robot robot) throws RobotOutOfAreaException;

    void turn(Robot robot, Command command);
}

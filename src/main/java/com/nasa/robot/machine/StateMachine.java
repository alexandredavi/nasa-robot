package com.nasa.robot.machine;

import com.nasa.robot.exception.InvalidCommandException;
import com.nasa.robot.exception.RobotException;
import com.nasa.robot.exception.RobotOutOfAreaException;

public class StateMachine implements StateEventListener {

    public void move(Robot robot) throws RobotOutOfAreaException {
        robot.getState().move(robot);
    }

    public void turn(Robot robot, Command command) {
        robot.getState().turn(robot, command);
    }

    public Robot executeCommands(String commands) throws RobotException {
        Robot robot = new Robot();
        for (int i = 0; i < commands.length(); i++) {
            executeCommand(robot, Character.toString(commands.charAt(i)));
        }
        return robot;
    }

    private void executeCommand(Robot robot, String commandToExecute) throws RobotException {
        try {
            Command command = Command.valueOf(commandToExecute);
            switch (command) {
                case M:
                    move(robot);
                    break;
                case R:
                case L:
                    turn(robot, command);
                    break;
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidCommandException();
        }
    }
}

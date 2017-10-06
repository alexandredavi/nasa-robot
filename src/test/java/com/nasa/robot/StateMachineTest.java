package com.nasa.robot;

import com.nasa.robot.exception.RobotException;
import com.nasa.robot.machine.Robot;
import com.nasa.robot.machine.State;
import com.nasa.robot.machine.StateMachine;
import org.junit.Assert;
import org.junit.Test;

public class StateMachineTest {

    @Test
    public void executeCommandsMMRMMRMM() {
        try {
            StateMachine machine = new StateMachine();
            Robot robot = machine.executeCommands("MMRMMRMM");
            Assert.assertTrue(robot.getX() == 2);
            Assert.assertTrue(robot.getY() == 0);
            Assert.assertTrue(robot.getState() == State.S);
        } catch (RobotException e) {
            Assert.fail();
        }
    }

    @Test
    public void executeCommandsMML() {
        try {
            StateMachine machine = new StateMachine();
            Robot robot = machine.executeCommands("MML");
            Assert.assertTrue(robot.getX() == 0);
            Assert.assertTrue(robot.getY() == 2);
            Assert.assertTrue(robot.getState() == State.W);
        } catch (RobotException e) {
            Assert.fail();
        }
    }

    @Test(expected = RobotException.class)
    public void executeCommandsAAA() throws RobotException {
        StateMachine machine = new StateMachine();
        machine.executeCommands("AAA");
    }

    @Test(expected = RobotException.class)
    public void executeCommandsMMMMMMMMMMMMMMMMMMMMMMMM() throws RobotException {
        StateMachine machine = new StateMachine();
        machine.executeCommands("MMMMMMMMMMMMMMMMMMMMMMMM");
    }
}

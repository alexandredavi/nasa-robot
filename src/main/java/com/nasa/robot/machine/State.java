package com.nasa.robot.machine;

import com.nasa.robot.exception.RobotOutOfAreaException;

public enum State implements StateEventListener {

    N {
        public void move(Robot robot) throws RobotOutOfAreaException {
            robot.goToNorth();
        }

        public void turn(Robot robot, Command command) {
            robot.setState(Command.L == command ? W : E);
        }
    },
    S {
        public void move(Robot robot) throws RobotOutOfAreaException {
            robot.goToSouth();
        }

        public void turn(Robot robot, Command command) {
            robot.setState(Command.L == command ? E : W);
        }
    },
    E {
        public void move(Robot robot) throws RobotOutOfAreaException {
            robot.goToEast();
        }

        public void turn(Robot robot, Command command) {
            robot.setState(Command.L == command ? N : S);
        }
    },
    W {
        public void move(Robot robot) throws RobotOutOfAreaException {
            robot.goToWest();
        }

        public void turn(Robot robot, Command command) {
            robot.setState(Command.L == command ? S : N);
        }
    }
}

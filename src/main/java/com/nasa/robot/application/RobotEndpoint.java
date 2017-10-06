package com.nasa.robot.application;

import com.nasa.robot.exception.RobotException;
import com.nasa.robot.machine.StateMachine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotEndpoint {

    @RequestMapping(value = "/rest/mars/{commands}", method = RequestMethod.GET)
    public ResponseEntity<String> executeCommands(@PathVariable("commands") String commands) {
        try {
            return ResponseEntity.ok(new StateMachine().executeCommands(commands).toString());
        } catch (RobotException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}

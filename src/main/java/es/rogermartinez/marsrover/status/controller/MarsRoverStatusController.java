package es.rogermartinez.marsrover.status.controller;

import es.rogermartinez.marsrover.MarsRover;
import es.rogermartinez.marsrover.base.Message;
import es.rogermartinez.marsrover.status.message.StatusMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarsRoverStatusController {

    private MarsRover marsRover;

    @Autowired
    public MarsRoverStatusController(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @RequestMapping("/marsrover/status")
    public Message status() {
        return new StatusMessage(marsRover.getStatus());
    }
}

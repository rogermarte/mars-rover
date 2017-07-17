package es.rogermartinez.marsrover.position.controller;

import es.rogermartinez.marsrover.MarsRover;
import es.rogermartinez.marsrover.Position;
import es.rogermartinez.marsrover.base.Message;
import es.rogermartinez.marsrover.position.message.PositionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarsRoverPositionController {

    private static final String MARSROVER_POSITION = "/marsrover/position";
    private MarsRover marsRover;

    @Autowired
    public MarsRoverPositionController(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @RequestMapping(method = RequestMethod.GET, value = MARSROVER_POSITION)
    public Position getPosition() {
        return marsRover.getPosition();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/marsrover/position")
    public Message putPosition(@RequestBody Position position) {
        marsRover.move(position);
        return new PositionMessage(position);
    }
}

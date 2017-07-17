package es.rogermartinez.marsrover;

import org.springframework.stereotype.Component;

@Component
public class MarsRover {

    private String status = "OK";
    private Position position = new Position(0f, 0f);

    public String getStatus(){
        return status;
    }

    public void move(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }
}

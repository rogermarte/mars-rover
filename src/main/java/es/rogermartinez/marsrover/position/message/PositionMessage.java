package es.rogermartinez.marsrover.position.message;

import es.rogermartinez.marsrover.Position;
import es.rogermartinez.marsrover.base.Message;

public class PositionMessage implements Message {

    private Position position;

    public PositionMessage(Position position) {
        this.position = position;
    }

    @Override
    public String getType() {
        return "position";
    }

    @Override
    public String getValue() {
        return "New position: " + position.getLatitude() + ", " + position.getLongitude();
    }
}

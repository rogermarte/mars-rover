package es.rogermartinez.marsrover.status.message;

import es.rogermartinez.marsrover.base.Message;

public class StatusMessage implements Message {
    private String value;

    public StatusMessage(String value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "status";
    }

    @Override
    public String getValue() {
        return value;
    }
}

package es.rogermartinez.marsrover;

public class Position {

    private float latitude;
    private float longitude;

    public Position(){
        latitude = 0f;
        longitude = 0f;
    }

    public Position(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}

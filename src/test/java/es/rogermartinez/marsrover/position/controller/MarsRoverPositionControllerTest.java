package es.rogermartinez.marsrover.position.controller;

import es.rogermartinez.marsrover.Position;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class MarsRoverPositionControllerTest {

    private static final String MARSROVER_POSITION = "/marsrover/position";

    @Test
    public void should_return_new_position_when_position_is_updated() throws Exception {
        given().contentType("application/json")
                .body(new Position(1f, 1f))
                .when().put(MARSROVER_POSITION).then()
                .statusCode(200).body("type", equalTo("position"))
                .body("value", containsString("New position"));

        given().when().get(MARSROVER_POSITION)
                .then()
                .assertThat()
                .body("latitude", equalTo(1f))
                .body("longitude", equalTo(1f));
    }

}
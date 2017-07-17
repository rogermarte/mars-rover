package es.rogermartinez.marsrover.status.controller;

import org.junit.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class MarsRoverControllerTest {

    @Test
    public void should_return_status_ok_when_mars_over_is_working() throws Exception {
        get("/marsrover/status")
                .then()
                .assertThat()
                .body("value", equalTo("OK"))
                .body("type", equalTo("status"));
    }

}
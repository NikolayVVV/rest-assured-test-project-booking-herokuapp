package clients;

import config.AppConfig;
import dto.BookingDTO;
import io.restassured.response.ValidatableResponse;
import specs.RequestSpecs;
import specs.ResponseSpecs;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BookingClient {

    public ValidatableResponse getToken() {
        System.out.println("\nGET TOKEN\n");
        Map<String, Object> authBody = new HashMap<>();
        authBody.put("username", AppConfig.getUsername());
        authBody.put("password", AppConfig.getPassword());
        return given().spec(RequestSpecs.requestPostForAuth())
                .log().uri()
                .body(authBody)
                .post("/auth")
                .then()
                .spec(ResponseSpecs.responseAuth())
                .log().body();
    }

    public ValidatableResponse patchRequest(String token, BookingDTO booking) {
        System.out.println("\nPATCH POSITIVE\n");
        Map<String, Object> bookingBody = new HashMap<>();
        bookingBody.put("firstname", booking.getFirstname());
        bookingBody.put("lastname", booking.getLastname());
        return given().spec(RequestSpecs.requestPostForPatch(token))
                .log().uri()
                .body(bookingBody)
                .when()
                .patch("/booking/1")
                .then()
                .spec(ResponseSpecs.responsePatch())
                .log().body();
    }


}

package specs;

import dto.BookingDTO;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.ResponseSpecification;
import utils.TestDataGenerator;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ResponseSpecs {

    public static ResponseSpecification responseAuth() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .expectBody("token", notNullValue())
                .expectBody(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/authBooking.json"))
                .build();
    }

    public static ResponseSpecification responsePatch() {
        BookingDTO lastname = TestDataGenerator.getTestBooking();
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .expectBody("lastname", equalTo(lastname.getLastname()))
                .expectBody(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/patchBooking.json"))
                .build();
    }




}

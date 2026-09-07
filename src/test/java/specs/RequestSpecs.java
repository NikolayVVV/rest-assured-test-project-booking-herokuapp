package specs;

import config.RestfulBookerConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public class RequestSpecs {

    public static RequestSpecification requestPostForAuth() {
        return new RequestSpecBuilder()
                .setBaseUri(RestfulBookerConfig.BASE_URI)
                .setContentType(JSON)
                .build();
    }

    public static RequestSpecification requestPostForPatch(String token) {
        return new RequestSpecBuilder()
                .setBaseUri(RestfulBookerConfig.BASE_URI)
                .setContentType(JSON)
                .setAccept("application/json")
                .addHeader("Cookie", "token=" + token)
                .build();
    }
}

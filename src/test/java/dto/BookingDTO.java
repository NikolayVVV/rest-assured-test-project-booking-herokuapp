package dto;

import lombok.Data;

import java.util.Map;

@Data
public class BookingDTO {
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private Map<String, String> bookingdates;
    private String additionalneeds;
}


//private static final Map<String, Object> jsonBodyPut = Map.of(
//        "firstname", "John",
//        "lastname", "Smith",
//        "totalprice", 111,
//        "depositpaid", true,
//        "bookingdates", Map.of(
//                "checkin", "2018-01-01",
//                "checkout", "2019-01-01"
//        ),
//        "additionalneeds", "Breakfast"
//);

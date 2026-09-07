package utils;

import dto.BookingDTO;

import java.util.HashMap;
import java.util.Map;

public class TestDataGenerator {

    public static BookingDTO getTestBooking() {
        BookingDTO place = new BookingDTO();

        place.setFirstname("John10");
        place.setLastname("Smith");
        place.setTotalprice(111);
        place.setDepositpaid(true);
        Map<String, String> dates = new HashMap<>();
        dates.put("checkin", "2018-01-01");
        dates.put("checkout", "2019-01-01");
        place.setBookingdates(dates);
        place.setAdditionalneeds("Breakfast");
        return place;
    }

    public static BookingDTO getUpdateFirstnameBooking(String firstname) {
        BookingDTO place = new BookingDTO();
        place.setFirstname(firstname);
        place.setLastname("Smith");
        return place;
    }

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
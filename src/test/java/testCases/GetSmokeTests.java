package testCases;

import clients.BookingClient;
import dto.BookingDTO;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.TestDataGenerator;

public class GetSmokeTests extends BaseTest {

    private final BookingClient bookingClient = new BookingClient();


    @Test(description = "Smoke testing of the Patch method")
    void smokeTestGetRequests() {

        BookingDTO booking = TestDataGenerator.getTestBooking();
        String token = bookingClient.getToken().extract().path("token");
        System.out.println(token);
        bookingClient.patchRequest(token, booking);

        BookingDTO bookingWithUpdateLastname = TestDataGenerator.getUpdateFirstnameBooking("John11");
        bookingClient.patchRequest(token, bookingWithUpdateLastname);




    }


}

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;


public class APITest {
    @Test
    public void TestPOSTRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Testing API")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body(containsString("Testing API"))
        ;
    }

}

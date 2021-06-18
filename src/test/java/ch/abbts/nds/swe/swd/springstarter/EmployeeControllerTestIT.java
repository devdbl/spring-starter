package ch.abbts.nds.swe.swd.springstarter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Tag("IntegrationTest")
public class EmployeeControllerTestIT {
    @Test
    @DisplayName("MyFirstIT")
    public void employeeIT() {
        given().auth().basic("user", "password").
                when().
                    get("/employees").
                then().
                    statusCode(200).body("size()", equalTo(4));
    }
}

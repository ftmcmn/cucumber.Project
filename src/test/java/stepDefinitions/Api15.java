package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Token.generateToken;

public class Api15 {

    Response response;

    @Then("GET request gonderir FC.")
    public void getRequestGonderirFC() {
        response = given().headers("Authorization", "Bearer " + generateToken()).get("https://medunna.com/api/patients/1051");
        response.prettyPrint();
    }

    @And("status kodunun 200 oldugu gorulur FC.")
    public void statusKodununOlduguGorulurFC(int arg0) {
        response.then().statusCode(200);
    }

    @And("tum hasta bilgilerini API response ile alir FC.")
    public void tumHastaBilgileriniAPIResponseIleAlirFC() {
    }
}

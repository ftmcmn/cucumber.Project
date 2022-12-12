package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Patient09;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static utilities.Token.generateToken;

public class Api09 {

    RequestSpecification spec;
    Response response;

    @Given("US15 GET request gonderir")
    public void usGETRequestGonderir() {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "patients", "second", "402002");

    }

    @And("US15 status kodunun 200 oldugu gorulur")
    public void usStatusKodununOlduguGorulur() {

        response=given().spec(spec).headers("Authorization", "Bearer " + generateToken()).get("{first}/{second}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @And("US15 tum hasta bilgilerini API response ile alir")
    public void usTumHastaBilgileriniAPIResponseIleAlir() {
        Patient09 actualData = response.as(Patient09.class);
        System.out.println(actualData);

        Assert.assertEquals("team12", actualData.getCreatedBy());
        Assert.assertEquals(402002, actualData.getId());
        Assert.assertEquals("fatma", actualData.getFirstName());
        Assert.assertEquals("zeynep", actualData.getLastName());
        Assert.assertEquals("2022-12-11T21:00:00Z", actualData.getBirthDate());
        Assert.assertEquals("5528552514", actualData.getPhone());
        Assert.assertEquals("fatma@zyp.com", actualData.getEmail());
        Assert.assertEquals("team88_12admin", actualData.getUser().getCreatedBy());
        Assert.assertEquals("2022-07-15T19:38:40.886671Z", actualData.getUser().getCreatedDate());
        Assert.assertEquals("enrico.fermi", actualData.getUser().getLogin());
        Assert.assertEquals(null, actualData.getAppointments());
    }
}

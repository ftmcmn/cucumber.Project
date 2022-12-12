package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.RoomFtm;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static utilities.Token.generateToken;

public class Api16 {

    RequestSpecification spec;
    Response response;

    @Then("GET request gonderir FCm.")
    public void getRequestGonderirFCm() {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/").build();
        spec.pathParams("first", "rooms", "second", "372491");

    }

    @And("status kodunun {int} oldugu gorulur FCm.")
    public void statusKodununOlduguGorulurFCm(int statusCode) {


        response=given().spec(spec).headers("Authorization", "Bearer " + generateToken()).get("{first}/{second}");
        assertEquals(statusCode, response.getStatusCode());
        response.prettyPrint();
    }

    @And("tum hasta bilgilerini API response ile alir FCm.")
    public void tumHastaBilgileriniAPIResponseIleAlirFCm() {

        RoomFtm expectedData=new RoomFtm("team20","2022-12-05T15:55:39.102687Z","orman manzarali",9000.00,3185,"TWIN",false,372491);

        RoomFtm actualData=response.as(RoomFtm.class);

        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(),actualData.getRoomType());
        assertEquals(expectedData.isStatus(),actualData.isStatus());
        assertEquals(expectedData.getId(),actualData.getId());


    }

    @And("tum hasta bilgilerini API response silinir FCm.")
    public void tumHastaBilgileriniAPIResponseSilinirFCm() {

        //response=given().spec(spec).headers("Authorization", "Bearer " + generateToken()).delete("{first}/{second}");

    }
}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static utilities.DatabaseUtility.getRowMap;

public class db16 {

    Map<String,Object> actualMap;

    @Given("Kullanici connection kurarFC.")
    public void kullaniciConnectionKurarFC() {
        DatabaseUtility.createConnection();
    }

    @Then("Kullanici query olustururFC.")
    public void kullaniciQueryOlustururFC() {

        String query="select * from room where id=372491";
        actualMap=getRowMap(query);
        System.out.println(actualMap);

    }

    @Then("Kullanici oda bilgilerini dogrularFC.")
    public void kullaniciOdaBilgileriniDogrularFC() {

        assertEquals("372491",actualMap.get("id").toString());
        assertEquals("orman manzaralı",actualMap.get("description"));
        assertEquals("3185",actualMap.get("room_number").toString());
        assertEquals("9000.00",actualMap.get("price").toString());
        assertEquals("TWIN",actualMap.get("room_type"));
        assertEquals("2022-12-05 15:55:39.102687",actualMap.get("created_date").toString());


    }
}

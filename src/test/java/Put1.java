import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Put1 {
    //without using json object
    @Test
    public void putMethod(){
        given()
                .header("content-Type","application/json")
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}")
                .when()
                .put("https://reqres.in/api/users/2")
                .then().log().status();
    }

    //with using json objects
    @Test
    public void putMethodJson(){
        JSONObject ref = new JSONObject();
        ref.put("name","morpheus");
        ref.put("job","zion resident" );

        Response res = given()
                .header("content-Type","application/json")
                .body(ref.toString())
                .when()
                .put("https://reqres.in/api/users/2")
                //.then().assertThat().statusCode(200).extract().response();
                .then().assertThat().body("name",equalTo("morpheus")).extract().response();
        System.out.println(res.body().asPrettyString());
        System.out.println(res.statusCode());
    }

}

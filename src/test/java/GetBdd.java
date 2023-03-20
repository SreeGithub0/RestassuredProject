import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetBdd {
    @Test
    public void getMethod() {
       /*Response a=*/ given()
                .when()
                .get("https://reqres.in/api/users?page=2")
               //.then().assertThat().statusCode(200).extract().response();
                .then().log().all();
        //System.out.println(a.body().asPrettyString());
       // System.out.println(a.statusCode());

    }
}

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DeleteBdd {
    @Test
    public void deleteMethod(){
        Response a= given()
                .when()
                .delete("https://reqres.in/api/users/2")
               // .then().extract().response();
                .then().assertThat().statusCode(204).extract().response();
        System.out.println(a.body().asPrettyString());
        System.out.println(a.statusCode());

    }
}

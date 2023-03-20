import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static  io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Post1 {
    @Test
    public void postMethod(){ //without using json
        given()
                .header("content-type","application/json")
                .body("{\n" +
                        "    \"name\": \"Sreedevi\",\n" +
                        "    \"job\": \"QA\"\n" +
                        "}")
                .when()
                .post("https://reqres.in/api/users")
                .then().log().all()/*body()*/;
        //.then().assertThat().statusCode(201).log().all();
    }

    //with using json object
    @Test
    public void postmethodJson(){
        JSONObject ref = new JSONObject();
        ref.put("name","Sreedevi");
        ref.put("job","QA");

        Response res = given()
                .header("content-Type","application/json")
                .body(ref.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().assertThat().statusCode(201).extract().response();
        System.out.println(res.statusCode());

    }
}

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Get1 {
    @Test
    public void getmethod() {
        /* variable*/ Response ab = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(ab.statusCode());
        System.out.println(ab.asPrettyString());
    }
}

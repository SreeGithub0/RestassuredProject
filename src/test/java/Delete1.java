import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Delete1 {
    @Test
    public void Deletemethod(){
        Response a = RestAssured.delete("https://reqres.in/api/users/2");
        System.out.println(a.statusCode());
        System.out.println(a.asPrettyString());
    }
}

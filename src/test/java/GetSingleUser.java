import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetSingleUser
{
    @Test
    public void getSingleUserAPI()
    {
        RestAssured.baseURI = "https://reqres.in";

        Response responseObj = RestAssured
                .given()
                .when()
                .get( "/api/users/3")
        .then()
            .extract().response();
        System.out.println("Status Code: "+ responseObj.getStatusCode());
        System.out.println("Response Body: "+ responseObj.asString());


    }

}

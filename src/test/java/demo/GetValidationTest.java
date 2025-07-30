package demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetValidationTest
{

    @Test
    public void validateUserData()
    {
        RestAssured.baseURI = "https://reqres.in";

        Response responseObj = RestAssured
                .given()
                .when()
                .get( "/api/users/2")
                .then()
                .extract().response();
    }
}

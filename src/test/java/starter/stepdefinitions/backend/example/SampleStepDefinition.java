package starter.stepdefinitions.backend.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class SampleStepDefinition {

    public static String tokenM;
    private Response response;
    @When("prepare get endpoint")
    public void prepareGetEndpoint() {
        Response response = RestAssured.get("https://fap-commons-stg-api.avaldigitallabs.com/sigt/login");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

        RestAssured.baseURI = "https://fap-commons-stg-api.avaldigitallabs.com/";
        RestAssured.given().get("sigt/login").then().statusCode(200)
                .body("token_type", CoreMatchers.notNullValue()).log().all();
    }

    @When("He fetch token ministry")
    public void heFetchTokenMinistry() {
        RestAssured.baseURI = "https://fap-commons-stg-api.avaldigitallabs.com";
        tokenM = RestAssured.given()
                .get("/sigt/login")
                .then()
                .statusCode(200)
                .extract().path("access_token");
    }

    @Then("He should see token ministry")
    public void heShouldSeeTokenMinistry() {
        System.out.println("This is "+ tokenM);
    }

    @When("He requests go through toll")
    public void heRequestsGoThroughToll() {
/*        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","Ferney");
        jsonObject.addProperty("job","Teacher");
        System.out.println(jsonObject);
        */
        Test test = new Test("Ferney","Teacher");
        RestAssured.baseURI = "https://reqres.in";
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(test)
                .when()
                .post("/api/users");
    }

    @Then("He should see success response")
    public void heShouldSeeSuccessResponse() {
       response.then().statusCode(201);
    }
}

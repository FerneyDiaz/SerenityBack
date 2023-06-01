package starter.stepdefinitions.backend;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import starter.restOptions.RestOption;
import starter.restOptions.statusCode.StatusCodeResponse;

public class AuthenticationStepDefinition {
    public static String restApiUrl = null;
    public static String tokenMinistry = null;
    public static ValidatableResponse validatableResponse;
    public static Response response;
    public EnvironmentVariables environmentVariables;

    @Given("{actor} is able to {}")
    public void bslIsAbleToBslServices(Actor actor, String actorServices) {
        if ( actor.getName().trim().equalsIgnoreCase("eks") &&
                actorServices.trim().equalsIgnoreCase("eks service") ){
            restApiUrl = environmentVariables.optionalProperty("restApi.staging.eks.stgBaseUrl")
                    .orElse("https://fap-commons-stg-api.avaldigitallabs.com");

        } else if ( actor.getName().trim().equalsIgnoreCase("eks") &&
                actorServices.trim().equalsIgnoreCase("eks web tag service") ) {
            restApiUrl = environmentVariables.optionalProperty("restApi.staging.eks.webTag.stgBaseUrl")
                    .orElse("https://fap-commons-stg-api-web-tags.avaldigitallabs.com");

        } else if ( actor.getName().trim().equalsIgnoreCase("bsl") &&
                actorServices.trim().equalsIgnoreCase("bsl service") ) {
            restApiUrl = environmentVariables.optionalProperty("restApi.staging.bsl.stgBaseUrl")
                    .orElse("https://fap-commons-stg-api-bsl.avaldigitallabs.com");
        }
    }
    @When("{actor} fetch ministry's access token")
    public void bslFetchMinistrySAccessToken(Actor actor) {
        validatableResponse = RestOption.getResponse(restApiUrl,"/sigt/login");
        StatusCodeResponse.validateStatusCode(validatableResponse,200);
    }

    @Then("{actor} should see access token")
    public void heShouldSeeAccessToken(Actor actor) {
        tokenMinistry = RestOption.getResponsePath(validatableResponse,"access_token");
        Assert.assertThat(tokenMinistry, CoreMatchers.notNullValue());

    }
}

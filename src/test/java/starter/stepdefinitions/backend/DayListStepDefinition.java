package starter.stepdefinitions.backend;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import starter.helper.Helper;
import starter.restOptions.RestOption;
import starter.restOptions.statusCode.StatusCodeResponse;

import static starter.stepdefinitions.backend.AuthenticationStepDefinition.*;

public class DayListStepDefinition {
    Helper helper = new Helper();
    @When("{actor} request total day list to toll operator {}")
    public void heRequestTotalDayListToTollOperator(Actor actor, String tollOperator) {
       response = RestOption.getRequest(restApiUrl,"/v1/listasUsuarios","day",
               helper.generateDate("yyyyMMdd"),
               tokenMinistry,helper.dateServer(),tollOperator);
    }

    @Then("{actor} should see total today list")
    public void heShouldSeeTotalTodayList(Actor actor) {
        StatusCodeResponse.validateStatusCode(response.then(),200);
        Assert.assertThat(RestOption.getResponsePath(response.then(),"message"), CoreMatchers.equalTo("Operacion Exitosa"));
    }
}

package starter.stepdefinitions.backend;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import starter.helper.Helper;
import starter.model.transaction.GoThroughToll;
import starter.restOptions.RestOption;
import starter.restOptions.statusCode.StatusCodeResponse;

import static starter.stepdefinitions.backend.AuthenticationStepDefinition.*;

public class TransactionStepDefinition {
    @When("{actor} requests go through toll with {} {} {} {} {} {} {}")
    public void heRequestsGoThroughTollWithOperatorTollOperator(Actor actor, String tollOperator, String account,
                                                                String plate, String tid, String epc,
                                                                String station, String lane) {
        Helper h = new Helper();
        GoThroughToll goThroughToll = new GoThroughToll(h.randomCodeWithUuid("10172"),tollOperator,h.dateServer(),
                h.dateServer(),account,plate,tid,epc,station,lane,1,2,2,
                "C3","C3",1,"AUT-OMA",plate,"false",
                "2023-05-31T02:30:50.417",h.dayListCode(),"false");
        validatableResponse = RestOption.postRequest(restApiUrl,"/v1/pasos",goThroughToll,
                tokenMinistry,h.dateServer(),"1",tollOperator);
    }

    @Then("He should see successful response")
    public void heShouldSeeSuccessfulResponse() {
        StatusCodeResponse.validateStatusCode(validatableResponse,200);
        Assert.assertThat(RestOption.getResponsePath(validatableResponse,"message"), CoreMatchers.equalTo("Operacion Exitosa"));
    }
}
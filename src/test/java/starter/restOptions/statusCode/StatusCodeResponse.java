package starter.restOptions.statusCode;

import io.restassured.response.ValidatableResponse;

public class StatusCodeResponse {
    public static void validateStatusCode(ValidatableResponse response,int statusCode){
        response.statusCode(statusCode);
    }
}

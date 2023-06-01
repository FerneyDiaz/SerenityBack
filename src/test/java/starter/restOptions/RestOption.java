package starter.restOptions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RestOption {
    public static ValidatableResponse getResponse(String endpoint, String path){
        RestAssured.baseURI = endpoint;
        return RestAssured.given()
                .get(path).then();
    }
    public static String getResponsePath(ValidatableResponse response, String jsonPath){
        return response.extract().path(jsonPath);
    }

    public static Response getRequest(String endpoint, String path, String param, String paramValue, String authorization,
                                      String serverDate, String tollOperator){
        RestAssured.baseURI = endpoint;
        return RestAssured.given()
                .header("Authorization","Bearer "+authorization)
                .header("FechaHoraServidor",serverDate)
                .header("CodigoCorrelacion", 1)
                .header("Solicitante",tollOperator)
                .queryParam(param,paramValue)
                .get(path);
    }
    public static ValidatableResponse postRequest(String endpoint, String path, Object body,
                                       String authorization, String dateTimeServer, String correlationCode,
                                       String tollOperatorCode){
        RestAssured.baseURI = endpoint;
        return RestAssured.given()
                .header("Accept","*/*")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer "+ authorization)
                .header("FechaHoraServidor",dateTimeServer)
                .header("CodigoCorrelacion",correlationCode)
                .header("Solicitante",tollOperatorCode)
                .body(body)
                .when()
                .post(path)
                .then();
    }
}

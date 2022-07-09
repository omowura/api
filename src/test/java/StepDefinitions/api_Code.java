package StepDefinitions;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class api_Code {

        public static void main(String[] args) {
            RestAssured.baseURI = "https://restcountries.com/";
            given().queryParam("codes", "FI").when().get("v3.1/alpha").then().log().all().assertThat().statusCode(200);

            RestAssured.baseURI = "https://restcountries.com/";
            given().queryParam("codes", "SE").when().get("v3.1/alpha").then().log().all().assertThat().statusCode(200);

            RestAssured.baseURI = "https://restcountries.com/";
            given().queryParam("codes", "EE").when().get("v3.1/alpha").then().log().all().assertThat().statusCode(200);


        }
    }

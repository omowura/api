package StepDefinitions;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class api_Name {

        public static void main(String[] args) {
            RestAssured.baseURI= "https://restcountries.com/";
            when().get("v3.1/name/Finland").then().log().all().assertThat().statusCode(200);

            RestAssured.baseURI= "https://restcountries.com/";
            when().get("v3.1/name/Sweden").then().log().all().assertThat().statusCode(200);

            RestAssured.baseURI= "https://restcountries.com/";
            when().get("v3.1/name/Estonia").then().log().all().assertThat().statusCode(200);



        }


    }


import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class api {

    public static class demo_api {

        public static void main(String[] args) {
            RestAssured.baseURI= "https://restcountries.com/";
            when().get("v3.1/name/Finland")
                    .then().log().all().assertThat().statusCode(200);

        }
    }
}

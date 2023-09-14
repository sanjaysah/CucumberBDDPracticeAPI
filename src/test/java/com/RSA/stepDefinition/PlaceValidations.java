package com.RSA.stepDefinition;

import com.RSA.PojoClasses.AddPlace;
import com.RSA.PojoClasses.Locationn;
import com.RSA.resources.TestDataBuild;
import com.RSA.resources.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class PlaceValidations {
    RequestSpecification req, reqspec;
    ResponseSpecification res;
    Response response;
    @Given("Add Place payload")
    public void add_place_payload() throws FileNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Add Place payload");

        req = Utils.getReqSpec("https://rahulshettyacademy.com");

        res = new ResponseSpecBuilder().expectStatusCode(200)
                .expectContentType(ContentType.JSON).build();

        reqspec = given().spec(req).body(TestDataBuild.Add_Place_Payload());

    }
    @When("user calls {string} with Post Http request")
    public void user_calls_with_post_http_request(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user calls {string} with Post Http request");
        response = reqspec.when().post("/maps/api/place/add/json")
                .then().spec(res).extract().response();
    }
    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the API call got success with status code {int}");
        Assert.assertEquals(response.getStatusCode(),int1);
    }
    @Then("{string} code in response body is {string}")
    public void status_code_in_response_body_is(String key, String value) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("{status} code in response body is {string}");
        String res = response.asString();
        JsonPath js = new JsonPath(res);
        Assert.assertEquals(js.get(key).toString(),value,"Success");
    }


}

package com.RSA.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefs {

        @Given("^User is on landing page$")
        public void user_land_page(){
            System.out.println("User is on landing page");
        }
        @When("^User logs in with his \"(.*)\" and \"(.*)\"$")
        public void user_logs_in(String username, String password){
            System.out.println("User logs in with his username "+username+" and password "+password);
        }
        @Then("^Home page is displayed$")
        public void user_Home_page(){
            System.out.println("Home page is displayed");
        }
        @And("^User information is displayed$")
        public void user_info_verify(){
            System.out.println("User information is displayed");
        }

}

Feature: Validating Place API's
  Scenario: Verify if Place is successfully added using AddPlace API
    Given Add Place payload
    When user calls "AddPlaceAPI" with Post Http request
    Then the API call got success with status code 200
    And "status" code in response body is "OK"
    And "scope" code in response body is "APP"
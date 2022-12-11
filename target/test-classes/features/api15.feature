Feature: US15
@api15
  Scenario: TC09

    Then  GET request gonderir FC.
    And status kodunun 200 oldugu gorulur FC.
    And tum hasta bilgilerini API response ile alir FC.
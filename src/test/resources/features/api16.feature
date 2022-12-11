Feature: US16
@api16
  Scenario: TC

    Then  GET request gonderir FCm.
    And status kodunun 200 oldugu gorulur FCm.
    And tum hasta bilgilerini API response ile alir FCm.
@api162
  Scenario: TC02
    Then  GET request gonderir FCm.
    And status kodunun 200 oldugu gorulur FCm.
    And tum hasta bilgilerini API response silinir FCm.
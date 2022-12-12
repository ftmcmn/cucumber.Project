Feature:
@US15Api
  Scenario:

    Given US15 GET request gonderir
    And US15 status kodunun 200 oldugu gorulur
    And US15 tum hasta bilgilerini API response ile alir
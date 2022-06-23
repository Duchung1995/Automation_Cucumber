Feature: Login
  @sanity
  Scenario: Login to home page
    Given User Launch Chrome browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
#    Then URL should be "https://admin-demo.nopcommerce.com/admin/"
#    When User click on Log out link
#    Then URL should be "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
#    And close browser

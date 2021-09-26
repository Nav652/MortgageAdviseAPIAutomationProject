Feature: Get the Request call Back

  @Enter_Form_Details
  Scenario Outline: Enter the mandatory details in the form
    Given User is in Contact-us page
    When User enters the below details in the Request Call back form "<First Name>","<Last Name>","<Email Address>","<Mobile/landline number>","<Best time to call you>","<Reason for enquiry>"

    Then  user should be able to see the entered details in the form
    Examples:
      | First Name | Last Name | Email Address        | Mobile/landline number | Best time to call you | Reason for enquiry |
      | Navitha    | Muniraju  | m.navitha9@gmail.com | 07423211356            | 4 PM                  | Conveyancing       |







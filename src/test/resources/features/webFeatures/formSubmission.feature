Feature: Submit Form
  @smoke
  Scenario Outline: Submit Form twenty times and close browser
    Given user has been provided url
    When The user fills out the form with "<name>", "<email>", "<phone>", "<postCode>","<describe>" , "<priceRange>", "<lookingToBuy>", "<contactMethod>", "<selectPreApproval>","<checkbox>", "<message>"

    Then close the browser successfully

    Examples:
      | name | email | phone | postCode |describe|   priceRange | lookingToBuy | contactMethod | selectPreApproval | checkbox|    message |
      |John Doe|john.doe@example.com|123456789|	2000|First Home Buyers|	$500k-$750k|1-3 months|	Phone Call|	Yes    |inspection|	Tasnim automation 1|
      | Alice Smith     | alice.smith@example.com    | 423456781  | 2001 | Downsizers      | $750k-$1m    | 3-6 months   | Email          | No         | floorplans      | Tasnim automation 2 |
      | Michael Johnson | michael.johnson@example.com| 423456782  | 2002 | Young Family    | $1m-$1.5m    | 6-12 months  | SMS            | Yes        | priceInfo       | Tasnim automation 3 |
      | Emma Wilson     | emma.wilson@example.com    | 423456783  | 2003 | Investor        | $1.5m-$2m    | 12-18 months | Phone Call     | No         | brochure        | Tasnim automation 4 |
      | David Brown     | david.brown@example.com    | 423456784  | 2004 | Just Looking    | $2m-$3m      | 18 months +  | Email          | Yes        | inspection      | Tasnim automation 5 |
      | Olivia Taylor   | olivia.taylor@example.com  | 423456785  | 2005 | Owner Occupier | $3m-$4m      | 1-3 months   | SMS            | No         | floorplans      | Tasnim automation 6 |
      | Ethan Martinez  | ethan.martinez@example.com | 423456755  | 2006 | First Home Buyers | $4m-$5m   | 3-6 months   | Phone Call     | Yes        | priceInfo       | Tasnim automation 7 |
      | Sophia Garcia   | sophia.garcia@example.com  | 423456733  | 2007 | Downsizers      | $5m-$7m      | 6-12 months  | Email          | No         | brochure        | Tasnim automation 8 |
      | Noah Rodriguez  | noah.rodriguez@example.com | 423456744  | 2008 | Young Family    | $7m-$9m      | 12-18 months | SMS            | Yes        | inspection      | Tasnim automation 9 |
      | Mia Hernandez   | mia.hernandez@example.com  | 423456788  | 2009 | Investor        | $9m-$11m     | 18 months +  | Phone Call     | No         | floorplans      | Tasnim automation 10 |
      | Amelia Smith    | amelia.smith@example.com   | 423456781  | 2010 | Just Looking    | $11m-$17m    | 1-3 months   | Email          | Yes        | priceInfo       | Tasnim automation 11 |
      | James Johnson   | james.johnson@example.com  | 423456712  | 2011 | Owner Occupier | $17m-$21m    | 3-6 months   | SMS            | No         | brochure        | Tasnim automation 12 |
      | Isabella Brown  | isabella.brown@example.com | 423456789  | 2012 | First Home Buyers | $21m+     | 6-12 months  | Phone Call     | Yes        | inspection      | Tasnim automation 13 |
      | Benjamin Taylor | benjamin.taylor@example.com| 423456734  | 2013 | Downsizers      | $500k-$750k  | 12-18 months | Email          | No         | floorplans      | Tasnim automation 14 |
      | Charlotte Lee   | charlotte.lee@example.com  | 423456759  | 2014 | Young Family    | $750k-$1m    | 18 months +  | SMS            | Yes        | priceInfo       | Tasnim automation 15 |
      | Daniel Martinez | daniel.martinez@example.com| 423456743  | 2015 | Investor        | $1m-$1.5m    | 1-3 months   | Phone Call     | No         | brochure        | Tasnim automation 16 |
      | Emily Robinson  | emily.robinson@example.com | 423456709  | 2016 | Just Looking    | $1.5m-$2m    | 3-6 months   | Email          | Yes        | inspection      | Tasnim automation 17 |
      | Alexander Clark | alexander.clark@example.com| 423456715  | 2017 | Owner Occupier | $2m-$3m      | 6-12 months  | SMS            | No         | floorplans      | Tasnim automation 18 |
      | William Rodriguez| william.rodriguez@example.com| 423456745| 2018 | First Home Buyers | $3m-$4m   | 12-18 months | Phone Call     | Yes        | priceInfo       | Tasnim automation 19 |
      | Evelyn Hernandez| evelyn.hernandez@example.com| 423456765| 2019 | Downsizers      | $4m-$5m      | 18 months +  | Email          | No         | brochure        | Tasnim automation 20 |

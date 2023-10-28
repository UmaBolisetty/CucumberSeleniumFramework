Feature: Home page

 
@api
 Scenario: API steps
 Then I verify finxact using the method "GET" and path1 "model" path2  "trn"
  Given I invoke finxact API using method "POST" path1 "model" path2  "addr" and body from "Address.json"
  Given I invoke finxact API using method "POST" path1 "core" path2  "customer" and body from "Customer.json"

  
      
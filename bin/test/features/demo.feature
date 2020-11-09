@stories
Feature: academy Choucair
	As a user, I want to lern hou to automate in screanplay at the Choucair Academy with the automation course
	@scenario1
   Scenario: Search for a automation cours
   Given than brandon wants to learn automation at the academy Choucair
   | user		| password		|
   | 43730870	| Choucair2020*	|
   
    When he search for the course ISTQB on the chocair academy plataform
   	| search						|
    | ISTQB Agil Tester Extension	| 
    
    Then the finds the course called
   	| search						|
    | ISTQB Agil Tester Extension	| 
  	

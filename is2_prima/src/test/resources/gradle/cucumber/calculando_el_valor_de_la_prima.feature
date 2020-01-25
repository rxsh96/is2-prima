Feature: Calculando el valor de la prima
	Mi potencial cliente necesita saber el monto a pagar

  Scenario: Cliente de edad apropiada con todos sus puntos de licencia
    Given Que mi potencial cliente tiene edad 30
    When Ha perdido 0 puntos de licencia
    Then Debe pagar un monto de $ 850.0 
    
  Scenario: Cliente de edad apropiada con puntos de licencia incompletos
  	Given Que mi potencial cliente tiene edad 30
  	When Ha perdido 10 puntos de licencia
  	Then Debe pagar un monto de $ 900.0
  	
  Scenario Outline: Cliente presenta su información
  	Given la edad de mi potencial es <age>
  	And Ha perdido <lostPoints> puntos
  	When Quiere saber el valor de la prima
  	Then Su valor a pagar es <primaValue>
  	
  	Examples:
  	| age | lostPoints | primaValue |
    | 18  | 0 				 | 1350				|
    | 37  | 0 				 | 400 	 			|
    | 58  | 2 			 	 | 250 				|
    | 67  | 1				   | 750 				|
    | 45  | 10         | 400        |
  
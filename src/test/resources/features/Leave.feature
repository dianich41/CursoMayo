#diana
#21-05-2022
@Regresion
Feature: Leave principal 

@leave
Scenario Outline: ingreso 
	Given abrir el navegador 
	And diligenciar username <userName> y password <contrasena>
	And llegar hasta leave
		
	Examples:
	|userName|contrasena|
	|Admin   |admin123  |
	
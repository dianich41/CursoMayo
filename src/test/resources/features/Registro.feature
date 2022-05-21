#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco

@Regresion
Feature: Registro en la pagina Orange 

@Caso1
Scenario Outline: ingreso 
	Given abrir el navegador 
	And diligenciar username <userName> y password <contrasena>
		
	Examples:
	|userName|contrasena|
	|Admin   |admin123  |
	
@Caso2
Scenario Outline: agregar empleado 
	Given abrir el navegador 
	And diligenciar username <userName> y password <contrasena>
	And llegar a add employee
	And diligenciar firstname <firstName> y lastname <lastName>
		
	Examples:
	|userName|contrasena|firstName|lastName|
	|Admin   |admin123  |Carolina |Parra   |



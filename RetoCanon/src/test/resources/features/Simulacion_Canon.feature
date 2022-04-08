@stories
Feature:
  Verificar el funcionamiento de la pantalla de simulación de Canon Financiero
  expuesta por el grupo Bancolombia - Leasing, en cuanto a la presentación de los valores calculados

  @scenario1
  Scenario: Verificar el funcionamiento de la pantalla de simulación de Canon Financiero
    Given Laura ingresa a la pagina de bancolombia en la seccion simulacion de canon financiero
    When ingresa los datos necesarios para simular su canon
      | valor     | plazo |
      | 250000000 | 5     |
    And revisa las tasas y tarifas incluidas
    Then verifica los resultados obtenidos para su simulacion
      | credito             |
      | Crédito de Vivienda |

  @scenario2
  Scenario: Verificar el funcionamiento del simulador de canon financiero ingresando datos erroneos
    Given Laura ingresa  seccion simulacion de canon financiero
    When ingresa datos erroneos para simular su canon
      | valor       | plazo |
      | 39999999.99 | 31    |
    Then verifica si permite realizar su simulacion
      | error |
      | El campo no cumple  |
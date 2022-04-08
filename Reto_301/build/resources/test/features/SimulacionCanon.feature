@stories
Feature:
  Verificar el funcionamiento del simulador al calcular y presentar por consola
  los valores desplegados en la tabla “Resultado Simulación”
  @scenario1
  Scenario: Verificar el funcionamiento del simulador de canon financiero
    Given Laura ingresa a la pagina de bancolombia en la seccion simulacion de canon financiero
    When ingresa los datos necesarios para simular su canon
    |valor | plazo | porcentaje |
    |20000000 | 12    | 10         |
    Then verifica los resultados obtenidos para su simulacion
    |modalidad |
    |Vencida   |

  @scenario2
  Scenario: Verificar el funcionamiento del simulador de canon financiero ingresando datos erroneos
    Given Laura ingresa  seccion simulacion de canon financiero
    When ingresa datos erroneos para simular su canon
      |valor | plazo | porcentaje |
      |1000000 | 121 | 9.99       |
    Then verifica si permite realizar su simulacion
      |valormin|valormax|
      |El campo no cumple con el valor mínimo $ 10,000,000|El campo no cumple con el valor máximo 120|
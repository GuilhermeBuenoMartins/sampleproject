Feature: Calcular
  A calculadora deverá ser capaz de, a patir de apenas dois numeros
  inteiros, efetuar as quatro operacões básicas conhecidas (soma,
  subtracao, multiplicacao e divisao).

  Scenario Outline: Operacao de <operation> de dois numeros inteiros
    Given dado dois numeros inteiros quaisquer
    When quando efetuada a opeeracao <operation>
    Then o resultado e obtido
    Examples:
      | operation     |
      | soma          |
      | subtracao     |
      | multiplicacao |
      | divisao       |

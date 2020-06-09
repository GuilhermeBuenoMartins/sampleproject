$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/calculate.feature");
formatter.feature({
  "name": "Calcular",
  "description": "  A calculadora deverá ser capaz de, a patir de apenas dois numeros\n  inteiros, efetuar as quatro operacões básicas conhecidas (soma,\n  subtracao, multiplicacao e divisao).",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Operacao de \u003coperation\u003e de dois numeros inteiros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "dado dois numeros inteiros quaisquer",
  "keyword": "Given "
});
formatter.step({
  "name": "quando efetuada a opeeracao \u003coperation\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "o resultado e obtido",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "operation"
      ]
    },
    {
      "cells": [
        "soma"
      ]
    },
    {
      "cells": [
        "subtracao"
      ]
    },
    {
      "cells": [
        "multiplicacao"
      ]
    },
    {
      "cells": [
        "divisao"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Operacao de soma de dois numeros inteiros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "dado dois numeros inteiros quaisquer",
  "keyword": "Given "
});
formatter.match({
  "location": "step.CalculatorTest.dadoDoisNumerosInteirosQuaisquer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quando efetuada a opeeracao soma",
  "keyword": "When "
});
formatter.match({
  "location": "step.CalculatorTest.quandoEfetuadaAOpeeracaoSoma()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado e obtido",
  "keyword": "Then "
});
formatter.match({
  "location": "step.CalculatorTest.oResultadoEObtido()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Operacao de subtracao de dois numeros inteiros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "dado dois numeros inteiros quaisquer",
  "keyword": "Given "
});
formatter.match({
  "location": "step.CalculatorTest.dadoDoisNumerosInteirosQuaisquer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quando efetuada a opeeracao subtracao",
  "keyword": "When "
});
formatter.match({
  "location": "step.CalculatorTest.quandoEfetuadaAOpeeracaoSubtracao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado e obtido",
  "keyword": "Then "
});
formatter.match({
  "location": "step.CalculatorTest.oResultadoEObtido()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Operacao de multiplicacao de dois numeros inteiros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "dado dois numeros inteiros quaisquer",
  "keyword": "Given "
});
formatter.match({
  "location": "step.CalculatorTest.dadoDoisNumerosInteirosQuaisquer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quando efetuada a opeeracao multiplicacao",
  "keyword": "When "
});
formatter.match({
  "location": "step.CalculatorTest.quandoEfetuadaAOpeeracaoMultiplicacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado e obtido",
  "keyword": "Then "
});
formatter.match({
  "location": "step.CalculatorTest.oResultadoEObtido()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Operacao de divisao de dois numeros inteiros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "dado dois numeros inteiros quaisquer",
  "keyword": "Given "
});
formatter.match({
  "location": "step.CalculatorTest.dadoDoisNumerosInteirosQuaisquer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quando efetuada a opeeracao divisao",
  "keyword": "When "
});
formatter.match({
  "location": "step.CalculatorTest.quandoEfetuadaAOpeeracaoDivisao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado e obtido",
  "keyword": "Then "
});
formatter.match({
  "location": "step.CalculatorTest.oResultadoEObtido()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
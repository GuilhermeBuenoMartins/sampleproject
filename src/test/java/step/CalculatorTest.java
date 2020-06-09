package step;

import action.CalculatorAction;
import config.MobileConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import util.RandomUtil;


import java.net.MalformedURLException;


public class CalculatorTest {

    private CalculatorAction calculatorAction;

    private Integer firstNumber;

    private Integer secondNumber;

    private Integer resultExpected;

    @Before
    public void setUp() throws MalformedURLException {
        calculatorAction = new CalculatorAction(new MobileConfig().getAndroidDriver());
        Assert.assertNotNull(calculatorAction);
    }

    @After
    public void tearDown() {
        Assert.assertTrue(calculatorAction.quitDriver());
    }

    @Given("dado dois numeros inteiros quaisquer")
    public void dadoDoisNumerosInteirosQuaisquer() {
        RandomUtil randomUtil = new RandomUtil();
        firstNumber = randomUtil.getIntegerRandom();
        secondNumber = randomUtil.getIntegerRandom();

        Assert.assertTrue(calculatorAction.fillUpFirstNumberFt(firstNumber));
        Assert.assertTrue(calculatorAction.fillUpSecondNumberFt(secondNumber));
    }

    @When("quando efetuada a opeeracao soma")
    public void quandoEfetuadaAOpeeracaoSoma() {
        resultExpected = firstNumber + secondNumber;

        Assert.assertTrue(calculatorAction.clickSumBtn());
    }

    @When("quando efetuada a opeeracao subtracao")
    public void quandoEfetuadaAOpeeracaoSubtracao() {
        resultExpected = firstNumber - secondNumber;

        Assert.assertTrue(calculatorAction.clickSubtractBtn());
    }

    @When("quando efetuada a opeeracao multiplicacao")
    public void quandoEfetuadaAOpeeracaoMultiplicacao() {
        resultExpected = firstNumber * secondNumber;

        Assert.assertTrue(calculatorAction.clickMultiplyBtn());
    }

    @When("quando efetuada a opeeracao divisao")
    public void quandoEfetuadaAOpeeracaoDivisao() {
        resultExpected = firstNumber / secondNumber;

        Assert.assertTrue(calculatorAction.clickDivideBtn());
    }

    @Then("o resultado e obtido")
    public void oResultadoEObtido() {
        Assert.assertEquals(resultExpected, calculatorAction.getResult());
    }
}

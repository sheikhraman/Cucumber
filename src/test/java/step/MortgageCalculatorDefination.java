package step;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobject.CalculaterPageObject;

import java.util.concurrent.TimeUnit;

public class MortgageCalculatorDefination {
    WebDriver driver;
    CalculaterPageObject calculaterPageObject;
    @Given("^User is on morgtagecalculator home page$")
    public void user_is_on_morgtagecalculator_home_page() {
      System.setProperty("webdriver.chrome.driver","/Users/lutfunrita/Downloads/chromedriver 3");
      driver = new ChromeDriver();
      driver.get("https://www.calculator.net/mortgage-calculator.html");
      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      driver.manage().window().maximize();
    }

    @Then("^User verify home page$")
    public void user_verify_home_page() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"Mortgage Calculator");

    }

    @Then("^User enter \"(.*)\"$")
    public void user_enter_home_price(String string) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.EnterHomePrice(string);

    }

    @Then("^User enter down \"(.*)\"$")
    public void user_enter_down_payment(String dwnpmt) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.EnterDownPayment(dwnpmt);

    }

    @Then("^User select down payment method$")
    public void user_select_down_payment_method() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.SeleceDownPaymentMethod();

    }

    @Then("^User provide loan \"(.*)\"$")
    public void user_provide_loan_term(String lterm) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.LoansTerms(lterm);

    }

    @Then("^User enters interest \"(.*)\"$")
    public void user_enters_interest_rate(String rates) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.InterestRates(rates);

    }

    @Then("^user select start month$")
    public void user_select_start_month() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.MonthStartDate();

    }

    @Then("^User enter starting \"(.*)\"$")
    public void user_enter_starting_year(String styears) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.YearStarts(styears);
    }

    @Then("^User enter property \"(.*)\"$")
    public void user_enter_property_tax(String protaxes) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.PropertyTaxes(protaxes);
    }

    @Then("^User select property tax method$")
    public void user_select_property_tax_method() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.PropertyTaxesMethods();
    }

    @Then("^User enters home \"(.*)\"$")
    public void user_enters_home_insurance(String hinsurances) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.HomeInsurances(hinsurances);
    }

    @Then("^User select home insurance mehtod$")
    public void user_select_home_insurance_mehtod() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.HomeInsMethods();
    }

    @Then("^User enter PMI \"(.*)\"$")
    public void user_enter_PMI_insurance(String pinsurances) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.PMIInsurances(pinsurances);
    }

    @Then("^user select PMI method$")
    public void user_select_PMI_method() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.PmiInsuranceMethods();
    }

    @Then("^user provides HOA \"(.*)\"$")
    public void user_provides_HOA_fee(String hofees) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.HoaFees(hofees);
    }

    @Then("^User select HOA fee method$")
    public void user_select_HOA_fee_method() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.HoafeeMethods();
    }

    @Then("^User entered other \"(.*)\"$")
    public void user_entered_other_cost(String othCosts) {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.OthersCosts(othCosts);
    }

    @Then("^Users selected other cost method$")
    public void users_selected_other_cost_method() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.OthercostsMethods();

    }

    @Then("^User click on calculate button$")
    public void user_click_on_calculate_button() {
        calculaterPageObject = new CalculaterPageObject(driver);
        calculaterPageObject.ClickOnCalculateButton();
    }
    @Given("^Property Taxes Increase$")
    public void property_taxes_increase()  {
     System.out.println("Sheikh");
    }

    @When("^Home Insurance Increase$")
    public void home_insurance_increase()  {

        System.out.println("Rahman");
    }

    @Then("^HOA Fee Increase$")
    public void hoa_fee_increase() throws Throwable {
        System.out.println("Jckhts");
    }

    @Then("^Other Costs Increase$")
    public void other_costs_increase() throws Throwable {
        System.out.println("verygood");
    }
}

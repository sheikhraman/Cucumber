package pageobject;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CalculaterPageObject {
    WebDriver driver;
    @FindBy(css = "#chouseprice")
    WebElement HomePrice;
    @FindBy(css = "#cdownpayment")
    WebElement DownPayment;
    @FindBy(name = "cdownpaymentunit")
    WebElement DownPaymentMethod;
    @FindBy(css = ".innormal")
    WebElement LoanTerm;
    @FindBy(css = "#cinterestrate")
    WebElement InterestRate;
    @FindBy(css = "#cstartmonth")
    WebElement StartMonth;
    @FindBy(css = ".in4char")
    WebElement StartYear;
    @FindBy(css ="#cpropertytaxes")
    WebElement PropertyTax;
    @FindBy(name = "cpropertytaxesunit")
    WebElement PropertyTaxesMethod;
    @FindBy(css = "#chomeins")
    WebElement HomeInsurance;
    @FindBy(name = "chomeinsunit")
    WebElement HomeInsuranceMethod;
    @FindBy(css = "#cpmi")
    WebElement PMIinsurance;
    @FindBy(name = "cpmiunit")
    WebElement PMIInsMethod;
    @FindBy(css = "#choa")
    WebElement HoaFee;
    @FindBy(name = "choaunit")
    WebElement HoaFeeMethod;
    @FindBy(css = "#cothercost")
    WebElement OtherCosts;
    @FindBy(name = "cothercostunit")
    WebElement OtherCostsMethods;
    @FindBy(xpath = "//input[@src='//d26tpo4cm8sb6k.cloudfront.net/img/svg/calculate.svg']")
    WebElement CalculateButton;


    public CalculaterPageObject(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    public void EnterHomePrice(String string){
        HomePrice.click();
        HomePrice.clear();
        HomePrice.sendKeys(string);
    }
    public void EnterDownPayment(String dwnpmt){
        DownPayment.click();
        DownPayment.clear();
        DownPayment.sendKeys(dwnpmt);
    }
    public void SeleceDownPaymentMethod(){
        Select select = new Select(DownPaymentMethod);
        select.selectByIndex(0);
    }
    public void LoansTerms(String lterm){
        LoanTerm.click();
        LoanTerm.clear();
        LoanTerm.sendKeys(lterm);
    }
    public void InterestRates(String rates){
        InterestRate.click();
        InterestRate.clear();
        InterestRate.sendKeys(rates);
    }
    public void MonthStartDate(){
        Select select = new Select(StartMonth);
        select.selectByVisibleText("Dec");
    }
    public void YearStarts(String styears){
        StartYear.click();
        StartYear.clear();
        StartYear.sendKeys(styears);
    }
    public void PropertyTaxes(String protaxes){
        PropertyTax.click();
        PropertyTax.clear();
        PropertyTax.sendKeys(protaxes);
    }
    public void PropertyTaxesMethods(){
        Select select = new Select(PropertyTaxesMethod);
        select.selectByVisibleText("%");
    }
    public void HomeInsurances(String hinsurances){
        HomeInsurance.click();
        HomeInsurance.clear();
        HomeInsurance.sendKeys(hinsurances);
    }
    public void HomeInsMethods(){
        Select select = new Select(HomeInsuranceMethod);
        select.selectByVisibleText("$");
    }
    public void PMIInsurances(String pinsurances){
        PMIinsurance.click();
        PMIinsurance.clear();
        PMIinsurance.sendKeys(pinsurances);
    }
    public void PmiInsuranceMethods(){
        Select select = new Select(PMIInsMethod);
        select.selectByVisibleText("%");
    }
    public void HoaFees(String hofees){
        HoaFee.click();
        HoaFee.clear();
        HoaFee.sendKeys(hofees);
    }
    public void HoafeeMethods(){
        Select select = new Select(HoaFeeMethod);
        select.selectByVisibleText("$");
    }
    public void OthersCosts(String othCosts){
        OtherCosts.click();
        OtherCosts.clear();
        OtherCosts.sendKeys(othCosts);
    }
    public void OthercostsMethods(){
        Select select  = new Select(OtherCostsMethods);
        select.selectByVisibleText("%");
    }
    public void ClickOnCalculateButton(){
        CalculateButton.click();
    }
}

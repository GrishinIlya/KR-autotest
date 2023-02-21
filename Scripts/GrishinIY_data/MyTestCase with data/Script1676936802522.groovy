import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
CSVData data_0 = findTestData("GrishinIY.json")
for (def index in (0..data_0.getRowNumbers() - 1)) {
def col monthly-payment-short = data_0.internallyGetValue("col monthly-payment-short", index)
def field-desired-loan = data_0.internallyGetValue("field-desired-loan", index)
def field-initial-payment = data_0.internallyGetValue("field-initial-payment", index)
def field-credit-term = data_0.internallyGetValue("field-credit-term", index)
def second-name = data_0.internallyGetValue("second-name", index)
def first-name = data_0.internallyGetValue("first-name", index)
def middle-name = data_0.internallyGetValue("middle-name", index)
def passport = data_0.internallyGetValue("passport", index)
def issued-by = data_0.internallyGetValue("issued-by", index)
def issued-date = data_0.internallyGetValue("issued-date", index)
def education = data_0.internallyGetValue("education", index)
def seniority = data_0.internallyGetValue("seniority", index)
def term-work-last-place = data_0.internallyGetValue("term-work-last-place", index)
def confirmation-income-ndfl = data_0.internallyGetValue("confirmation-income-ndfl", index)
def work-place-bank-area = data_0.internallyGetValue("work-place-bank-area", index)
def net-income = data_0.internallyGetValue("net-income", index)
def registration-place-bank-area = data_0.internallyGetValue("registration-place-bank-area", index)
def previous-conviction = data_0.internallyGetValue("previous-conviction", index)
def real-estate = data_0.internallyGetValue("real-estate", index)
def id=credit-message = data_0.internallyGetValue("id=credit-message", index)
def id=credit-rate = data_0.internallyGetValue("id=credit-rate", index)
def id=credit-monthly-payment-full = data_0.internallyGetValue("id=credit-monthly-payment-full", index)
def id=credit-credit-overpayment = data_0.internallyGetValue("id=credit-credit-overpayment", index)
def id=payments-loan-period = data_0.internallyGetValue("id=payments-loan-period", index)

/* "B:@K205< A09B :@548B=>3> :0;L:C;OB>@0" */
selenium.open("http://creditcalculator.pointschool.ru/#")
/* "K?>;=O5< :@0B:89 @0AG5B A> 7=0G5=8O<8 ?> C<>;G0=8N" */
selenium.click("xpath=//div[4]/button")
/* "@>25@O5< >B>1@065=85 @57C;LB0B>2 @0AG5B0" */
assertTrue(selenium.isVisible("xpath=//div[@id='credit-short-result-form']/div"));
/* "@>25@O5< ?>;CG5==K9 565<5AOG=K9 ?;0B56" */
softAssertion.assertEquals(col monthly-payment-short, selenium.getText("id=col monthly-payment-short"))
/* "5@5E>48< ?> AAK;:5 \"70?>;=8B5 0=:5BC\"" */
selenium.click("link=70?>;=8B5 0=:5BC")
/* "0?>;=O5< ?>;O ?0@0<5B@>2 :@548B0" */
selenium.type("name=field-desired-loan", (field-desired-loan).toString())
selenium.type("name=field-initial-payment", (field-initial-payment).toString())
selenium.type("name=field-credit-term", (field-credit-term).toString())
/* "0?>;=O5< 40==K5 705<I8:0" */
selenium.type("name=second-name", (second-name).toString())
selenium.type("name=first-name", (first-name).toString())
selenium.type("name=middle-name", (middle-name).toString())
selenium.type("name=passport", (passport).toString())
selenium.type("name=issued-by", (issued-by).toString())
selenium.type("name=issued-date", (issued-date).toString())
selenium.select("name=education", education)
selenium.select("name=term-work-last-place", term-work-last-place)
selenium.select("name=seniority", seniority)
selenium.select("name=confirmation-income-ndfl", confirmation-income-ndfl)
selenium.select("name=work-place-bank-area", work-place-bank-area)
selenium.type("name=net-income", (net-income).toString())
selenium.select("name=registration-place-bank-area", registration-place-bank-area)
selenium.select("name=previous-conviction", previous-conviction)
selenium.select("name=real-estate", real-estate)
/* "K?>;=O5< ?>;=K9 @0AG5B" */
selenium.click("xpath=//div[4]/button")
/* "45<, ?>:0 ?@>?045B >:=> 2K?>;=5=8O @0AG5B0" */
for (int second = 0;; second++){
    if (second >= 60) fail("timeout")
    try{
        
        if (!selenium.isVisible("id=loadingModalLabel")) break
    } catch (Exception e){
    
    }
    Thread.sleep(1000)
  }
/* "@>25@O5< >B>1@065=85 @57C;LB0B>2 @0AG5B0" */
assertTrue(selenium.isVisible("xpath=//div[@id='credit-full-result-form']/div"));
/* "@>25@O5< ?>;CG5==K5 70G5=8O" */
softAssertion.assertEquals(id=credit-message, selenium.getText("id=credit-message"))
softAssertion.assertEquals(id=credit-rate, selenium.getText("id=credit-rate"))
softAssertion.assertEquals(id=credit-monthly-payment-full, selenium.getText("id=credit-monthly-payment-full"))
softAssertion.assertEquals(id=credit-credit-overpayment, selenium.getText("id=credit-credit-overpayment"))
softAssertion.assertEquals(id=payments-loan-period, selenium.getText("id=payments-loan-period"))
}

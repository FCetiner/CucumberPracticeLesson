package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    //steps

    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {
        Driver.getDriver();
    }
    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
    }
    @Then("ana sayfanin gorunur oldugunu test eder")
    public void anaSayfaninGorunurOldugunuTestEder() {
        String  actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("kullanici signup login butonuna tiklar")
    public void kullaniciSignupLoginButonunaTiklar() {
        mainPageFunctionalities.signupButton.click();
    }

    @Then("kullanici, New User Signup! gorunur oldugunu test eder")
    public void kullanici_new_user_signup_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(mainPageFunctionalities.newUserSignUpText.isDisplayed());
    }


    @When("kullanici isim ve maili girer")
    public void kullaniciIsimVeMailiGirer() {
        mainPageFunctionalities.nameBox.sendKeys(Faker.instance().name().firstName());
        mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Then("kullanici signup butonuna tiklar")
    public void kullaniciSignupButonunaTiklar() {
    mainPageFunctionalities.signupButtonKayitSayfasi.click();
    }

    @Then("acilan sayfasa ENTER ACCOUNT yazisinin gorunur oldugunu test eder")
    public void acilanSayfasaENTERACCOUNTYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());

    }



}

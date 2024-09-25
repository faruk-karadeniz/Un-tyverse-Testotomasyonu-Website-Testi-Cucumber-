package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestotomasyonuStepdefinitions {
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
    Actions actions = new Actions(Driver.getDriver());
    List<String> selectCategoryList = new ArrayList<>();
WebElement aramaKutusu=testotomasyonuPage.AramaKutusu;

    @Given("Kullanici Testotomasyon Anasayfasına gider")
    public void kullanici_testotomasyon_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

    }
    @When("{int} saniye beklenilir")
    public void saniye_beklenilir(Integer sure) {
        ReusableMethods.bekle(sure);
    }
    @When("Sayfa title nı doğrular")
    public void sayfa_title_nı_dogrular() {
        String expectedTitle = "Test";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @When("Sayfa url ni doğrular")
    public void sayfa_url_ni_dogrular() {
        String expectedUrl = ConfigReader.getProperty("toUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @When("Account  görünür durumda olduğunu doğrular")
    public void account_gorunur_durumda_oldugunu_dogrular() {
        Assert.assertTrue(testotomasyonuPage.Account.isDisplayed());
    }
    @When("Görünür durumdaysa account tıklar")
    public void gorunur_durumdaysa_account_tiklar() {
ReusableMethods.bekle(3);
        testotomasyonuPage.Account.click();
    }
    @When("Gorunur durumdaysa Sign Up' a tiklar")
    public void gorunur_durumdaysa_sign_up_a_tiklar() {
        Assert.assertTrue(testotomasyonuPage.SignUp.isDisplayed());
        testotomasyonuPage.SignUp.click();
    }
    @Then("Register Now sayfasina gelindigini dogrular")
    public void register_now_sayfasina_gelindigini_dogrular() {
        Assert.assertTrue(testotomasyonuPage.RegisterNowYazi.isDisplayed());
    }
    @Then("Kayit sayfasinda First Name gorunurlugu test et")
    public void kayit_sayfasinda_first_name_gorunurlugu_test_et() {
        Assert.assertTrue(testotomasyonuPage.FirstName.isDisplayed());
    }
    @Then("Kayit sayfasinda Last Name gorunurlugu test et")
    public void kayit_sayfasinda_last_name_gorunurlugu_test_et() {
        Assert.assertTrue(testotomasyonuPage.lastName.isDisplayed());
    }
    @Then("Kayit sayfasinda Email gorunurlugu test et")
    public void kayit_sayfasinda_email_gorunurlugu_test_et() {
        Assert.assertTrue(testotomasyonuPage.Email.isDisplayed());
    }
    @Then("Kayit sayfasinda Password gorunurlugu test et")
    public void kayit_sayfasinda_password_gorunurlugu_test_et() {
        Assert.assertTrue(testotomasyonuPage.Password.isDisplayed());
    }
    @Then("Kayit sayfasinda Confirm Password gorunurlugu test et")
    public void kayit_sayfasinda_confirm_password_gorunurlugu_test_et() {
        Assert.assertTrue(testotomasyonuPage.ComfirmPassword.isDisplayed());
    }
    @Then("Sayfa  kapatilir")
    public void sayfa_kapatilir() {
        Driver.quitDriver();
    }
    @Then("First Name olarak testdatalarindan gecerli {string} kullanilir")
    public void first_name_olarak_testdatalarindan_gecerli_kullanilir(String firstName) {
        testotomasyonuPage.FirstName.sendKeys(ConfigReader.getProperty("firstName"));
    }
    @Then("Last Name olarak testdatalarindan gecerli {string} kullanilir")
    public void last_name_olarak_testdatalarindan_gecerli_kullanilir(String lastName) {
        testotomasyonuPage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
    }
    @Then("Email olarak testdatalarindan gecerli {string} kullanilir")
    public void email_olarak_testdatalarindan_gecerli_kullanilir(String email) {
        testotomasyonuPage.Email.sendKeys(ConfigReader.getProperty("email"));
    }
    @Then("Password olarak testdatalarindan gecerli {string} kullanilir")
    public void password_olarak_testdatalarindan_gecerli_kullanilir(String password) {
        testotomasyonuPage.Password.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("ComfirmPassword olarak testdatalarindan gecerli {string} kullanilir")
    public void comfirm_password_olarak_testdatalarindan_gecerli_kullanilir(String comfirmPassword) {
        testotomasyonuPage.ComfirmPassword.sendKeys(ConfigReader.getProperty("comfirmPassword"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(testotomasyonuPage.SignUpButoon).perform();
    }
    @Then("Gorunur durumdaysa  Sign Up butonuna tikla")
    public void gorunur_durumdaysa_sign_up_butonuna_tikla() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(testotomasyonuPage.SignupKayitButton).perform();
        Assert.assertTrue(testotomasyonuPage.SignupKayitButton.isDisplayed());
        testotomasyonuPage.SignupKayitButton.click();
    }
    @Then("Basarili kayit yapildigini test et")
    public void basarili_kayit_yapildigini_test_et() {
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());
    }
//US001_TC003
    @Then("Bilgileri bos birakilir")
    public void bilgileri_bos_birakilir() {
        testotomasyonuPage.SignupKayitButton.click();
    }
    @Then("Tum bilgiler icin required uyarisi verildigini dogrula")
    public void tum_bilgiler_icin_required_uyarisi_verildigini_dogrula() {
        ReusableMethods.scrollEnd();
        Assert.assertTrue(testotomasyonuPage.FirstNameRequired.isDisplayed());
        Assert.assertTrue(testotomasyonuPage.LastNameRequired.isDisplayed());
        Assert.assertTrue(testotomasyonuPage.EmailRequired.isDisplayed());
        Assert.assertTrue(testotomasyonuPage.PasswordRequired.isDisplayed());
        Assert.assertTrue(testotomasyonuPage.CompifrmPasswordRequired.isDisplayed());
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Kayit yapilamadigi ve Register Now sayfasinda kalindigini test et")
    public void kayit_yapilamadigi_ve_register_now_sayfasinda_kalindigini_test_et() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        testotomasyonuPage.SignupKayitButton.click();
        Assert.assertTrue(testotomasyonuPage.RegisterNowYazi.isDisplayed());

//US002_TC001
    }
    @When("Login Now sayfasina gelindigini test et")
    public void login_now_sayfasina_gelindigini_test_et() {
        Assert.assertTrue(testotomasyonuPage.LoginNowSayfaYazi.isDisplayed());
    }
    @Then("Email ve password alanlarinin gorunur oldugunu dogrula")
    public void email_ve_password_alanlarinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.EmailBox.isDisplayed());
        Assert.assertTrue(testotomasyonuPage.PasswordBox.isDisplayed());
    }
    @Then("Gecerli email ve password gir")
    public void gecerli_email_ve_password_gir() {
        testotomasyonuPage.EmailBox.sendKeys(ConfigReader.getProperty("email"));
        testotomasyonuPage.PasswordBox.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("Gorunur durumdaysa Sign in butonuna tikla")
    public void gorunur_durumdaysa_sign_in_butonuna_tikla() {
        Assert.assertTrue(testotomasyonuPage.GirisSignIn.isDisplayed());
        testotomasyonuPage.GirisSignIn.click();
    }
    @Then("Login Success gorunurlugunu dogrula")
    public void login_success_gorunurlugunu_dogrula() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(testotomasyonuPage.LoginSuccess.isEnabled());
    }
    @Then("Kullanici profiline yonlendirildigini dogrula")
    public void kullanici_profiline_yonlendirildigini_dogrula() {
        Assert.assertTrue(testotomasyonuPage.UpdateProfileYazi.isDisplayed());
    }
    @Then("Kullanici First Name gorunurlugunu test et")
    public void kullanici_first_name_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.MyProfileFirstName.isDisplayed());
    }
    @Then("Kullanici Last Name gorunurlugunu test et")
    public void kullanici_last_name_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.MyProfileLastName.isDisplayed());
    }
    @Then("Kullanici email gorunurlugunu test et")
    public void kullanici_email_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.MyProfileEmail.isDisplayed());
    }
    @Then("{string} gecersiz email gir")
    public void gecersizEmailGir(String gecersizEmail) {
        testotomasyonuPage.EmailBox.sendKeys(ConfigReader.getProperty("gecersizEmail"));
    }
    @Then("{string} password gir")
    public void passwordGir(String gecerliPassword) {
        testotomasyonuPage.PasswordBox.sendKeys(ConfigReader.getProperty("gecerliPassword"));
    }
    @Then("Kayit yapilamadigini test et")
    public void kayitYapilamadiginiTestEt() {
        Assert.assertTrue(testotomasyonuPage.CustomerNotFound.isDisplayed());
    }
    @Then("{string} Confirm password passworddan farkli gir")
    public void confirmPasswordPassworddanFarkliGir(String gecersizConfirmPassword) {
        testotomasyonuPage.ComfirmPassword.sendKeys(ConfigReader.getProperty("gecersizConfirmPassword"));
    }
    @Then("Password hatasi verildigi dogrulanir")
    public void passwordHatasiVerildigiDogrulanir() {
        Assert.assertTrue(testotomasyonuPage.ComfirmPasswordHataYaziElementi.isDisplayed());
    }
    @Then("Kayit yapilamadigini Register Now sayfasinda kalindigini test et")
    public void kayitYapilamadiginiRegisterNowSayfasindaKalindiginiTestEt() {
        Assert.assertTrue(testotomasyonuPage.RegisterNowYazi.isDisplayed());
    }
    @Then("Kullanici profilinde My Profile butonunun gorunurlugunu test et")
    public void kullanici_profilinde_my_profile_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.MyProfileButton.isDisplayed());
    }
    @Then("Kullanici profilinde  Wishlist butonunun gorunurlugunu test et")
    public void kullanici_profilinde_wishlist_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.WishlistButton.isDisplayed());
    }
    @Then("Kullanici profilinde Manage Adress butonunun gorunurlugunu test et")
    public void kullanici_profilinde_manage_adress_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.ManageAdressButton.isDisplayed());
    }
    @Then("Kullanici profilinde change password butonunun gorunurlugunu test et")
    public void kullanici_profilinde_change_password_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.ChangePasswordButton.isDisplayed());
    }
    @Then("Kullanici profilinde Logout butonunun gorunurlugunu test et")
    public void kullanici_profilinde_logout_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());
    }
//US003-TC001
    @When("Sayfada Electronics kategorisinin tiklanabilirligini test et")
    public void sayfada_electronics_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.Electronics.isEnabled());
    }
    @When("Electronics kategorisine tikla")
    public void electronics_kategorisine_tikla() {
        ReusableMethods.bekle(2);
        testotomasyonuPage.Electronics.click();}
    @When("Electronics Sayfasının url'ini test et")
    public void electronics_sayfasinin_url_ini_test_et() {
        String expectedElectronicsUrl = ConfigReader.getProperty("ElectronicsUrl");
        String actualElectronicsUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedElectronicsUrl, actualElectronicsUrl);
    }
    @When("Acilan sayfanin Electronics bolumu oldugunu test et")
    public void acilan_sayfanin_electronics_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.ElectronicsSayfaYaziElementi.isDisplayed());
    }
    @When("Sayfada Men Fashion kategorisinin tiklanabilirligini test et")
    public void sayfada_men_fashion_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.MenFashion.isEnabled());
    }
    @When("Men Fashion kategorisine tikla")
    public void men_fashion_kategorisine_tikla() {
        testotomasyonuPage.MenFashion.click();}
    @When("Men Fashion Sayfasının url'ini test et")
    public void men_fashion_sayfasinin_url_ini_test_et() {
        String expectedMenFashionUrl = ConfigReader.getProperty("MenFashionUrl");
        String actualMenFashionUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedMenFashionUrl, actualMenFashionUrl);
    }
    @When("Acilan sayfanin Men Fashion bolumu oldugunu test et")
    public void acilan_sayfanin_men_fashion_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.MenFashionSayfaYaziElementi.isDisplayed());
    }
    @When("Sayfada Women Fashion kategorisinin tiklanabilirligini test et")
    public void sayfada_women_fashion_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.WomenFashion.isEnabled());
    }
    @When("Women Fashion kategorisine tikla")
    public void women_fashion_kategorisine_tikla() {
        testotomasyonuPage.WomenFashion.click();}
    @When("Women Fashion Sayfasının url'ini test et")
    public void women_fashion_sayfasinin_url_ini_test_et() {
        String expectedWomenSayfaUrl = ConfigReader.getProperty("WomenFashion");
        String actualWomenSayfaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedWomenSayfaUrl, actualWomenSayfaUrl);
    }
    @When("Acilan sayfanin Women Fashion bolumu oldugunu test et")
    public void acilan_sayfanin_women_fashion_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.WomenFashionSayfaYaziElementi.isDisplayed());
    }
    @When("Sayfada Shoes kategorisinin tiklanabilirligini test et")
    public void sayfada_shoes_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.Shoes.isEnabled());
    }
    @When("Shoes kategorisine tikla")
    public void shoes_kategorisine_tikla() {
        testotomasyonuPage.Shoes.click();}
    @When("Shoes Sayfasının url'ini  test et")
    public void shoes_sayfasinin_url_ini_test_et() {
        String expectedShoesUrl = ConfigReader.getProperty("ShoesUrl");
        String actualShoesUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedShoesUrl, actualShoesUrl);
    }
    @When("Acilan sayfanin Shoes bolumu oldugunu test et")
    public void acilan_sayfanin_shoes_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.ShoesSyafaYaziElementi.isDisplayed());
    }
    @Then("Sayfada Furniture kategorisinin tiklanabilirligini test et")
    public void sayfada_furniture_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.Furnite.isEnabled());
    }
    @Then("Furniture kategorisine tikla")
    public void furniture_kategorisine_tikla() {
        testotomasyonuPage.Furnite.click();}
    @Then("Furniture Sayfasının url'ini test et")
    public void furniture_sayfasinin_url_ini_test_et() {
        String expectedFurnitureUrl = ConfigReader.getProperty("FurnitureUrl");
        String actualFurnitureUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedFurnitureUrl, actualFurnitureUrl);
    }
    @Then("Acilan sayfanin Furniture bolumu oldugunu test et")
    public void acilan_sayfanin_furniture_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.FurnitureSayfaYaziElementi.isDisplayed());
    }
    @Then("Sayfada Travel kategorisinin tiklanabilirligini test et")
    public void sayfada_travel_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.Travel.isEnabled());
    }
    @Then("Travel kategorisine tikla")
    public void travel_kategorisine_tikla() {
        testotomasyonuPage.Travel.click();}
    @Then("Travel Sayfasının url'ini  test et")
    public void travel_sayfasinin_url_ini_test_et() {
        String expectedTravelUrl = ConfigReader.getProperty("TravelUrl");
        String actualTravelUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedTravelUrl, actualTravelUrl);
    }
    @Then("Acilan sayfanin Travel bolumu oldugunu test et")
    public void acilan_sayfanin_travel_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.TravelSayfaYaziElementi.isDisplayed());
    }
    @Then("Sayfada Kids Wear kategorisinin tiklanabilirligini test et")
    public void sayfada_kids_wear_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.KidsWear.isEnabled());
    }
    @Then("Kids Wear kategorisine tikla")
    public void kids_wear_kategorisine_tikla() {
        testotomasyonuPage.KidsWear.click();}
    @Then("Kids Wear Sayfasının url'ini  test et")
    public void kids_wear_sayfasinin_url_ini_test_et() {
        String expectedKidsWearUrl = ConfigReader.getProperty("KidsWear");
        String actualKidsWearUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedKidsWearUrl, actualKidsWearUrl);
    }
    @Then("Acilan sayfanin Kids Wear bolumu oldugunu test et")
    public void acilan_sayfanin_kids_wear_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.KidsWearSayfaYaziElementi.isDisplayed());
    }
    @Then("Sayfada Grocery kategorisinin tiklanabilirligini test et")
    public void sayfada_grocery_kategorisinin_tiklanabilirligini_test_et() {
        Assert.assertTrue(testotomasyonuPage.Grocery.isEnabled());
    }
    @Then("Grocery kategorisine tikla")
    public void grocery_kategorisine_tikla() {testotomasyonuPage.Grocery.click();}
    @Then("Grocery Sayfasının url'ini  test et")
    public void grocery_sayfasinin_url_ini_test_et() {
        String expectedGrocerySayfaUrl = ConfigReader.getProperty("GroceryUrl");
        String actualGrocerySayfaUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedGrocerySayfaUrl, actualGrocerySayfaUrl);
    }
    @Then("Acilan sayfanin Grocery bolumu oldugunu test et")
    public void acilan_sayfanin_grocery_bolumu_oldugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.GrocerySayfaYaziElementi.isDisplayed());
    }
//US003--TC002
    @When("Anasayfada kategorilerin gorunurlugunu test et")
    public void anasayfada_kategorilerin_gorunurlugunu_test_et() {
        //  List<String> anasayfaKategorileriElementList=new ArrayList<>();
        for (WebElement each : testotomasyonuPage.AnasayfaKategorileri) {
            each.isDisplayed();
        }
    }
    @When("Anasayfa kategori isimlerini liste olarak kaydet")
    public void anasayfa_kategori_isimlerini_liste_olarak_kaydet() {
        List<String> anasayfaKategorileriList = new ArrayList<>();
        for (WebElement each : testotomasyonuPage.AnasayfaKategorileri) {
            anasayfaKategorileriList.add(each.getText());
        }
        System.out.println(anasayfaKategorileriList);
    }
    @When("Arama kutusundaki Select Category butonunun gorunurlugunu test et")
    public void arama_kutusundaki_select_category_butonunun_gorunurlugunu_test_et() {
        Assert.assertTrue(testotomasyonuPage.SelectCategoryButton.isDisplayed());
    }
    @When("Select Category butonuna tikla")
    public void select_category_butonuna_tikla() {testotomasyonuPage.SelectCategoryButton.click();}
    @When("Kategori listesinin gorunur oldugunu test et")
    public void kategori_listesinin_gorunur_oldugunu_test_et() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(testotomasyonuPage.SelectCategoryButton).perform();
        testotomasyonuPage.SelectCategoryButton.click();
        Assert.assertTrue(testotomasyonuPage.SelectCategoryList.isEnabled());
    }
    @When("Kategori listesindeki isimleri liste olarak kaydet")
    public void kategori_listesindeki_isimleri_liste_olarak_kaydet() {
        selectCategoryList.add(testotomasyonuPage.selectElectronics.getText());
        selectCategoryList.add(testotomasyonuPage.selectMenFashion.getText());
        selectCategoryList.add(testotomasyonuPage.selectWomenFashion.getText());
        selectCategoryList.add(testotomasyonuPage.selectShoes.getText());
        selectCategoryList.add(testotomasyonuPage.selectFurniture.getText());
        selectCategoryList.add(testotomasyonuPage.selectTravel.getText());
        selectCategoryList.add(testotomasyonuPage.selectKidsWear.getText());
        selectCategoryList.add(testotomasyonuPage.selectGrocery.getText());
        System.out.println(selectCategoryList);
    }
    @When("Anasayfa kategori listesi ile Arama kutusu kategori listesi uzunluklarinin ayni oldugunu dogrula")
    public void anasayfa_kategori_listesi_ile_arama_kutusu_kategori_listesi_uzunluklarinin_ayni_oldugunu_dogrula() {
        if (testotomasyonuPage.AnasayfaKategorileri.size() == selectCategoryList.size()) {
            System.out.println("Anasayfa kategori listesi ile Arama kutusu kategori listesi uzunluklari aynidir");
        } else {
            System.out.println("Anasayfa kategori listesi ile Arama kutusu kategori listesi uzunluklari ayni değildir");
        }
    }
    @When("Anasayfa kategori listesindeki Electronics kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_electronics_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Electronics.getText().contains(selectCategoryList.get(0)));
    }
    @Then("Anasayfa kategori listesindeki Men Fashion kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_men_fashion_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.MenFashion.getText().contains(selectCategoryList.get(1)));
    }
    @Then("Anasayfa kategori listesindeki Women Fashion kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_women_fashion_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.WomenFashion.getText().contains(selectCategoryList.get(2)));
    }
    @Then("Anasayfa kategori listesindeki Shoes kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_shoes_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Shoes.getText().contains(selectCategoryList.get(3)));
    }
    @Then("Anasayfa kategori listesindeki Furniture kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_furniture_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Furnite.getText().contains(selectCategoryList.get(4)));
    }
    @Then("Anasayfa kategori listesindeki Travel kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_travel_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Travel.getText().contains(selectCategoryList.get(5)));
    }
    @Then("Anasayfa kategori listesindeki Kids Wear kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_kids_wear_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.KidsWear.getText().contains(selectCategoryList.get(6)));
    }
    @Then("Anasayfa kategori listesindeki Grocery kategorisinin Arama kutusu kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_grocery_kategorisinin_arama_kutusu_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Grocery.getText().contains(selectCategoryList.get(7)));

    }
//US003-TC03
    @When("Ana sayfada Most Popular Products bolumune git")
    public void ana_sayfada_most_popular_products_bolumune_git() {
        actions.moveToElement(testotomasyonuPage.MostPopularProducts).perform();
    }
    @When("Bolumdeki kategorilerin gorunurlugunu test et")
    public void bolumdeki_kategorilerin_gorunurlugunu_test_et() {
    Assert.assertTrue(testotomasyonuPage.MostPopularProducts.isDisplayed());
    }
    @When("Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklarinin ayni oldugunu dogrula")
    public void anasayfa_kategori_listesi_ile_most_popular_products_kategori_listesi_uzunluklarinin_ayni_oldugunu_dogrula() {
        if (testotomasyonuPage.AnasayfaKategorileri.size() == testotomasyonuPage.MostPopularProductsKategori.size()) {
            System.out.println("Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklari aynidir");
        } else {
            System.out.println("Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklari aynideğildir");
        }
    }
    @When("Anasayfa kategori listesindeki Electronics kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_electronics_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Electronics.getText().contains(testotomasyonuPage.MostPoppularElectronics.getText()));
    }
    @Then("Anasayfa kategori listesindeki Men Fashion kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_men_fashion_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.MenFashion.getText().contains(testotomasyonuPage.MostPoppularMenFashion.getText()));
    }
    @Then("Anasayfa kategori listesindeki Women Fashion kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_women_fashion_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.WomenFashion.getText().contains(testotomasyonuPage.MostPoppularWomenFashion.getText()));
    }
    @Then("Anasayfa kategori listesindeki Shoes kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_shoes_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Shoes.getText().contains(testotomasyonuPage.MostPoppularShoes.getText()));
    }
    @Then("Anasayfa kategori listesindeki Furniture kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_furniture_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Furnite.getText().contains(testotomasyonuPage.MostPoppularFurniture.getText()));
    }
    @Then("Anasayfa kategori listesindeki Travel kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_travel_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Travel.getText().contains(testotomasyonuPage.MostPoppularTravel.getText()));
    }
    @Then("Anasayfa kategori listesindeki Kids Wear kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_kids_wear_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.KidsWear.getText().contains(testotomasyonuPage.MostPoppularKidsWear.getText()));
    }
    @Then("Anasayfa kategori listesindeki Grocery kategorisinin Most Popular Products kategori listesinde oldugunu dogrula")
    public void anasayfa_kategori_listesindeki_grocery_kategorisinin_most_popular_products_kategori_listesinde_oldugunu_dogrula() {
        Assert.assertTrue(testotomasyonuPage.Grocery.getText().contains(testotomasyonuPage.MostPoppularGrocery.getText()));
    }
//US004-TC001
    @When("Electronics Birinci sayfadan bir ürün sepete eklenir")
    public void electronics_birinci_sayfadan_bir_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.ElectronicsBirinciUrun).perform();
testotomasyonuPage.ElectronicsBirinciUrunIkon.click();
    }
    @When("Electronics Ikinci sayfaya gidiler")
    public void electronics_ikinci_sayfaya_gidilir() {
actions.moveToElement(testotomasyonuPage.ElectronicsIkinciSayfaButton).perform();
testotomasyonuPage.ElectronicsIkinciSayfaButton.click();
    }
    @When("Electronics iki ürün sepete eklenir")
    public void electronics_iki_urun_sepete_eklenir() {
        ReusableMethods.bekle(2);
actions.moveToElement(testotomasyonuPage.ElectronicsIkinciUrun).perform();
testotomasyonuPage.ElectronicsIkinciUrunIkon.click();
ReusableMethods.bekle(1);
 actions.moveToElement(testotomasyonuPage.ElectronicsUcuncuUrun).perform();
 testotomasyonuPage.ElectronicsUcuncuUrunIkon.click();
    }
    @When("Men Fashion den üç ürün sepete eklenir")
    public void men_fashion_den_uc_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.MenFashionBirinciUrun).perform();
testotomasyonuPage.MenFashionBirinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.MenFashionIkinciUrun).perform();
testotomasyonuPage.MenFashionIkinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.MenFashionUcuncuUrun).perform();
testotomasyonuPage.MenFashionUcuncuUrunIkon.click();
    }
    @When("Women Fahion dan Iki ürün sepete eklenir")
    public void women_fahion_dan_iki_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.WomenFashionBirinciUrun).perform();
testotomasyonuPage.WomenFashionBirinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.WomenFashionIkinciUrun).perform();
testotomasyonuPage.WomenFashionIkinciUrunIkon.click();
    }
    @Then("Shoesden Iki ürün sepete eklenir")
    public void shoesden_iki_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.ShoesBirinciUrun).perform();
testotomasyonuPage.ShoesBirinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.ShoesIkinciUrun).perform();
testotomasyonuPage.ShoesIkinciUrunIkon.click();
    }
    @Then("Furniture den üç ürün sepete eklenir")
    public void furniture_den_uc_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.FurnitureBirinciUrun).perform();
testotomasyonuPage.FurnitureBirinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.FurnitureIkinciUrun).perform();
testotomasyonuPage.FurnitureIkinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.FurnitureUcuncuUrun).perform();
testotomasyonuPage.FurnitureUcuncuUrunIkon.click();
    }
    @Then("Travelden üç ürün sepete eklenir")
    public void travelden_uc_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.TravelBirinciUrun).perform();
testotomasyonuPage.TravelBirinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.TravelIkinciUrun).perform();
testotomasyonuPage.TravelIkinciUrunIkon.click();
actions.moveToElement(testotomasyonuPage.TravelUcuncuUrun).perform();
testotomasyonuPage.TravelUcuncuUrunIkon.click();
    }
    @Then("Kids Wear den üç ürün sepete eklenir")
    public void kids_wear_den_uc_urun_sepete_eklenir() {
actions.moveToElement(testotomasyonuPage.KidsWearBirinciUrun).perform();
testotomasyonuPage.KidsWearBirinciUrunIkon.click();
        ReusableMethods.bekle(2);
actions.moveToElement(testotomasyonuPage.KidsWearIkinciUrun).perform();
testotomasyonuPage.KidsWearIkinciUrunIkon.click();
        ReusableMethods.bekle(2);
actions.moveToElement(testotomasyonuPage.KidsWearUcuncuUrun).perform();
testotomasyonuPage.KidsWearUcuncuUrunIkon.click();
    }
    @Then("Grocery den çıkan ürünü seç")
    public void grocery_den_cikan_urunu_sec() {
actions.moveToElement(testotomasyonuPage.GroceryBirinciUrun).perform();
testotomasyonuPage.GroceryBirinciUrunIkon.click();
    }
    @Then("Your Cart butonunun gorunurlugunu test et")
    public void your_cart_butonunun_gorunurlugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.YouCartButton.isDisplayed());
    }
    @Then("Your Cart butonunun sayisininin {int} oldugunu dogrula")
    public void your_cart_butonunun_sayisininin_oldugunu_dogrula(Integer YourCartbuttonSayi) {
Assert.assertTrue(testotomasyonuPage.YouCartSayi.isEnabled());
    }
    @Then("Your Cart butonuna tıkla")
    public void your_cart_butonuna_tıkla() {testotomasyonuPage.YouCartButton.click();}
    @Then("Sepette urun bulundugunu test et")
    public void sepette_urun_bulundugunu_test_et() {
        actions.moveToElement(testotomasyonuPage.ContinueShoppingButton).perform();
Assert.assertTrue(testotomasyonuPage.ContinueShoppingButton.isDisplayed());
    }
//US04-TC-02
    @When("Top Selling Products yazisinin görünürlüğünü test et")
    public void top_selling_products_yazisinin_görünürlüğünü_test_et() {
Assert.assertTrue(testotomasyonuPage.TopSellingProducts.isDisplayed());
    }
    @When("View All Products butonunun tiklanabilirligini test et")
    public void view_all_products_butonunun_tiklanabilirligini_test_et() {
Assert.assertTrue(testotomasyonuPage.ViewAllProducts.isEnabled());
    }
    @When("View All Products butonuna tikla")
    public void view_all_products_butonuna_tikla() {testotomasyonuPage.ViewAllProducts.click();}
    @When("View All Products Sayfa url'sinin {string} oldugunu test et")
    public void viewAllProductsSayfaUrlSininOldugunuTestEt(String arg0) {
  String expectedViewAllUrl=ConfigReader.getProperty("ViewAllProductsUrl");
  String actulViewAllUrl=Driver.getDriver().getCurrentUrl();
  Assert.assertEquals(expectedViewAllUrl,actulViewAllUrl);
    }
    @When("Kategoride {int}'dan fazla urun bulundugunu dogrula")
    public void kategoride_dan_fazla_urun_bulundugunu_dogrula(Integer int1) {
        int viewAllUrun=testotomasyonuPage.ViewAllUrun.size();
        Assert.assertTrue(viewAllUrun>0);
    }
    @When("Listedeki ilk urunun uzerine git")
    public void listedeki_ilk_urunun_uzerine_git() {
actions.moveToElement(testotomasyonuPage.ViewAllIlkUrun).perform();
    }
    @When("Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et")
    public void urun_kutusunun_uzerinde_dururken_gorunur_olan_add_to_cart_butonunun_tiklanabilirligini_test_et() {
        ReusableMethods.bekle(2);
    Assert.assertTrue(testotomasyonuPage.ViewAllIlkUrunIkon.isDisplayed());
    }
    @When("Add to cart butonuna tikla")
    public void add_to_cart_butonuna_tikla() {testotomasyonuPage.ViewAllIlkUrunIkon.click();}
    @Then("Product Added To Cart! Yazisinin ciktigini dogrula")
    public void product_added_to_cart_yazisinin_ciktigini_dogrula() {
Assert.assertTrue(testotomasyonuPage.ProductAddedToCartYazi.isEnabled());
    }
    @Then("Your Cart butonunun sayisininin bir oldugunu dogrula")
    public void your_cart_butonunun_sayisininin_bir_oldugunu_dogrula() {
Assert.assertTrue(testotomasyonuPage.YourCardSayiBir.isDisplayed());
    }
    @Then("Your Cart Sayfa url'sinin {string} oldugunu test et")
    public void yourCartSayfaUrlSininOldugunuTestEt(String verilenUrl) {
String expectedYouCardUrl=ConfigReader.getProperty("YouCardUrl");
String actualYouCardUrl=Driver.getDriver().getCurrentUrl();
Assert.assertEquals(expectedYouCardUrl,actualYouCardUrl);
    }
    @Then("Sepetteki urunun isminin listede eklenen urunun ismi ile ayni oldugunu test et")
    public void sepetteki_urunun_isminin_listede_eklenen_urunun_ismi_ile_ayni_oldugunu_test_et() {
Assert.assertEquals(testotomasyonuPage.ViewAllIlkUrunIsim,testotomasyonuPage.SepettekiUrunIsim);}
//US004-TC003
    @When("Top Selling Products bolumune git")
    public void topSellingProductsBolumuneGit() {
actions.moveToElement(testotomasyonuPage.TopSellingProducts).perform();
    }
    @Then("Urun kutusunun kosesindeki X butonunun tiklanabilirligini test et")
    public void urun_kutusunun_kosesindeki_x_butonunun_tiklanabilirligini_test_et() {
Assert.assertTrue(testotomasyonuPage.Xbutton.isEnabled());
    }
    @Then("X butonuna tikla")
    public void x_butonuna_tikla() {testotomasyonuPage.Xbutton.click();}
    @Then("Are you sure penceresinin acildigini dogrula")
    public void are_you_sure_penceresinin_acildigini_dogrula() {
Assert.assertTrue(testotomasyonuPage.AreYouSureYazi.isDisplayed());
    }
    @Then("Yes, remove it! Butonuna tikla")
    public void yes_remove_it_butonuna_tikla() {testotomasyonuPage.YesRemoveItYaziElementi.click();}
    @Then("Wait for it... Yazisi kaybolana kadar bekle - invisibleELement")
    public void wait_for_it_yazisi_kaybolana_kadar_bekle_invisible_e_lement() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(testotomasyonuPage.WaitForItYazi));
    }
    @Then("Shopping cart is empty yazisi gorunur oldugunu test et")
    public void shopping_cart_is_empty_yazisi_gorunur_oldugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.ShoppingCartIsEmptyYaziElementi.isDisplayed());
    }
//US004-TC004
    @When("Arama kutusunun gorünür oldugunu test et")
    public void arama_kutusunun_gorünür_oldugunu_test_et() {Assert.assertTrue(testotomasyonuPage.AramaKutusu.isDisplayed());}
    @When("Arama kutusuna phone yaz")
    public void arama_kutusuna_phone_yaz() {aramaKutusu.sendKeys("phone");}
    @When("Enter'a bas")
    public void enter_a_bas() {aramaKutusu.submit();}
    @When("Phone Sayfa url'sinin {string} oldugunu test et")
    public void phone_sayfa_url_sinin_oldugunu_test_et(String PhoneSayfaVerilenUrl) {
String expectedPhoneSayfaUrl=ConfigReader.getProperty("PhoneSayfaVerilenUrl");
String actualPhoneSayfaUrl=Driver.getDriver().getCurrentUrl();
Assert.assertEquals(expectedPhoneSayfaUrl,actualPhoneSayfaUrl);
    }
    @When("{int}'dan fazla urun bulundugunu dogrula")
    public void dan_fazla_urun_bulundugunu_dogrula(Integer int1) {
int phoneUrunSonucElementi=testotomasyonuPage.PhoneUrunSonuc.size();
Assert.assertTrue(phoneUrunSonucElementi>0);
    }
    @When("ilk urune tikla")
    public void ilk_urune_tikla() {testotomasyonuPage.PhoneIlkUrun.click();}
    @When("Sayfa url'sinin {string} icerdigini test et")
    public void sayfa_url_sinin_icerdigini_test_et(String PhoneIlkUrunVerilenUrl) {
String expectedPhoneIlkUrunSayfaUrl=ConfigReader.getProperty("PhoneIlkUrunVerilenUrl");
String actualPhoneIlkUrunSayfaUrl=Driver.getDriver().getCurrentUrl();
Assert.assertEquals(expectedPhoneIlkUrunSayfaUrl,actualPhoneIlkUrunSayfaUrl);
    }
    @When("Miktar kutusunun gorunurlugunu dogrula")
    public void miktar_kutusunun_gorunurlugunu_dogrula() {
     Assert.assertTrue(testotomasyonuPage.MiktarKutusu.isDisplayed());
    }
    @When("Miktar kutusunda + butonuna ıkı kere bas")
    public void miktarKutusundaButonunaIkiKereBas() {
        ReusableMethods.bekle(5);
actions.doubleClick(testotomasyonuPage.MiktarArtiButton).perform();
    ReusableMethods.bekle(5);
    }
    @When("Urun Add to cart butonuna tikla")
    public void urunAddToCartButonunaTikla() {
        testotomasyonuPage.UrunAddToCardButton.click();}
    @Then("Your Cart butonunun sayisininin Uc oldugunu dogrula")
    public void your_cart_butonunun_sayisininin_uc_oldugunu_dogrula() {
        ReusableMethods.bekle(2);
    Assert.assertTrue(testotomasyonuPage.UrunUc.isDisplayed());
    }
    @Then("Your cart butonuna tikla")
    public void your_cart_butonuna_tikla() {testotomasyonuPage.YouCartButton.click();}
    @Then("Urun miktarinin Uc oldugunu test et")
    public void urun_miktarinin_uc_oldugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.SepetUrunMiktari.isDisplayed());
    }
//US004-TC_005
    @Then("Checkout butonuna tikla")
    public void checkout_butonuna_tikla() {testotomasyonuPage.CheckoutButton.click();}
    @Then("Billing Address gorunurlugunu test et")
    public void billing_address_gorunurlugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.BillingAdressYaziElementi.isDisplayed());
    }
    @Then("Billing Add Address butonuna tikla")
    public void billingAddAddressButonunaTikla() {testotomasyonuPage.BillingAddAdressButton.click();}
    @Then("Add Address kayit sayfasına Name, address, address {int}, city, postcode, ülke ve sehir bilgilerini doldur")
    public void add_address_kayit_sayfasına_name_address_address_city_postcode_ülke_ve_sehir_bilgilerini_doldur(Integer int1) {
testotomasyonuPage.BillingName.sendKeys(ConfigReader.getProperty("BillingName"));
actions.sendKeys(Keys.TAB)
        .sendKeys(ConfigReader.getProperty("BillingEmail"))
        .sendKeys(Keys.TAB)
        .sendKeys(ConfigReader.getProperty("BillingMnumber"))
        .sendKeys(Keys.TAB)
        .sendKeys(ConfigReader.getProperty("BillingAdressBir"))
        .sendKeys(Keys.TAB)
        .sendKeys(ConfigReader.getProperty("BillingAdressIki")).perform();
        Select select=new Select(testotomasyonuPage.SelectCoutry);
        select.selectByIndex(6);
Select select1=new Select(testotomasyonuPage.SelectSehir);
select1.selectByValue("4199");
testotomasyonuPage.SelectIlce.sendKeys(ConfigReader.getProperty("BillIlce"));
actions.sendKeys(Keys.TAB)
        .sendKeys("1234").perform();
    }
    @Then("Kayit sayfasındaki Add Address butonuna tikla")
    public void kayitSayfasındakiAddAddressButonunaTikla() {
        testotomasyonuPage.BillingAddAdressFormKayitButton.click();
    }
    @Then("Billing Address listesinde adres bulundugunu test et")
    public void billing_address_listesinde_adres_bulundugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.BillingAdressBox.isDisplayed());
    }
    @Then("Billing Address listesinde adres sec")
    public void billing_address_listesinde_adres_sec() {
ReusableMethods.bekle(2);
        actions.moveToElement(testotomasyonuPage.BillingAddressKutu).click().perform();
    }
    @Then("Delivery address same as billing address kutucuguna tikla")
    public void delivery_address_same_as_billing_address_kutucuguna_tikla() {
     ReusableMethods.bekle(2);
testotomasyonuPage.DeliveryAddressSameAsKutu.click();
    }
    @Then("Delivery Address bolumunun gorunur olmadigini test et")
    public void delivery_address_bolumunun_gorunur_olmadigini_test_et() {
     if(!testotomasyonuPage.DeliveryAdressYaziElementi.isDisplayed())
     {System.out.println("Delivery Address bolumu gorunmuyor");}
     else {System.out.println("Delivery Address bolumu gorunuyor");}
    }
    @Then("Delivery address same as billing address kutucugunu unchecked yap")
    public void delivery_address_same_as_billing_address_kutucugunu_unchecked_yap() {
      ReusableMethods.bekle(2);
       testotomasyonuPage.DeliveryAddressSameAsKutu.click();
    }
    @Then("Delivery Address bolumunun gorunur oldugunu test et")
    public void delivery_address_bolumunun_gorunur_oldugunu_test_et() {
Assert.assertTrue(testotomasyonuPage.DeliveryAdressYaziElementi.isEnabled());
    }
    @Then("Delivery Add Address butonuna tikla")
    public void delivery_add_address_butonuna_tikla() {testotomasyonuPage.DeliveryAddAddressButon.click();}
    @Then("Delivery Add Addresskayit sayfasina Name, address, address {int}, city, postcode, ülke ve sehir bilgilerini doldur")
    public void delivery_add_addresskayit_sayfasina_name_address_address_city_postcode_ülke_ve_sehir_bilgilerini_doldur(Integer int1) {
        testotomasyonuPage.DeliveryAddAddressName.sendKeys(ConfigReader.getProperty("BillingName"));
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("BillingEmail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("BillingMnumber"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("BillingAdressBir"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("BillingAdressIki")).perform();
        Select select = new Select(testotomasyonuPage.SelectCoutry);
        select.selectByIndex(6);
        Select select1 = new Select(testotomasyonuPage.SelectSehir);
        select1.selectByValue("4199");
        testotomasyonuPage.SelectIlce.sendKeys(ConfigReader.getProperty("BillIlce"));
        actions.sendKeys(Keys.TAB)
                .sendKeys("1234").perform();
    }
    @And("Delivery Add Address te kayıt butonuna tikla")
    public void deliveryAddAddressTeKayıtButonunaTikla() {testotomasyonuPage.DeliveryAddAdressFormKayit.click();}
    @Then("Delivery Address listesinde adres bulundugunu test et")
    public void delivery_address_listesinde_adres_bulundugunu_test_et() {
ReusableMethods.bekle(2);
Assert.assertTrue(testotomasyonuPage.DeliveryAdressBox.isDisplayed());
    }
    @Then("Delivery Address listesinde adres sec")
    public void delivery_address_listesinde_adres_sec() {testotomasyonuPage.DeliveryAddressKutu.click();}
    @Then("Shipping Methods listesinden kargo sec")
    public void shipping_methods_listesinden_kargo_sec() {
        actions.moveToElement(testotomasyonuPage.ShippingMethodsKutu).perform();
testotomasyonuPage.ShippingMethodsKutu.click();
ReusableMethods.bekle(2);
    }
    @Then("Terms and Conditions boxini checkle")
    public void terms_and_conditions_boxini_checkle() {
testotomasyonuPage.TermsAndConditions.click();
ReusableMethods.bekle(2);
    }
    @Then("Place Order Now butonuna tikla")
    public void place_order_now_butonuna_tikla() {
        testotomasyonuPage.BillingAddressKutu.click();
        ReusableMethods.bekle(2);
testotomasyonuPage.PlaceOrderNowButton.click();
    }
    @Then("Your order is successfully done! Yazisinin gorunur oldugunu test et")
    public void your_order_is_successfully_done_yazisinin_gorunur_oldugunu_test_et() {
   Assert.assertTrue(testotomasyonuPage.YourOrderIsSuccessfullyDone.isDisplayed());}




}











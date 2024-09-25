Feature: US001 Testotomasyonu Registration doğrulama testi


  Scenario:TC_001 Kullanici Registration sayfasindaki altı özelliği görmelidir.
    Given  Kullanici Testotomasyon Anasayfasına gider
    When  2 saniye beklenilir
    When  Sayfa title nı doğrular
    When  Sayfa url ni doğrular
    When  2 saniye beklenilir
    When Account  görünür durumda olduğunu doğrular
    When Görünür durumdaysa account tıklar
    When  2 saniye beklenilir
    When Gorunur durumdaysa Sign Up' a tiklar
    When  2 saniye beklenilir
    Then Register Now sayfasina gelindigini dogrular
    Then Kayit sayfasinda First Name gorunurlugu test et
    Then Kayit sayfasinda Last Name gorunurlugu test et
    Then Kayit sayfasinda Email gorunurlugu test et
    Then Kayit sayfasinda Password gorunurlugu test et
    Then  Kayit sayfasinda Confirm Password gorunurlugu test et



Scenario: TC_002 Kullanici tüm bilgileri dogru ve eksiksiz girerek kaydi gerçekleştirir
  Given  Kullanici Testotomasyon Anasayfasına gider
  When  2 saniye beklenilir
  When Sayfa url ni doğrular
  When  2 saniye beklenilir
  When Görünür durumdaysa account tıklar
  When  2 saniye beklenilir
  When Gorunur durumdaysa Sign Up' a tiklar
  Then Register Now sayfasina gelindigini dogrular
  Then First Name olarak testdatalarindan gecerli "firstName" kullanilir
  Then Last Name olarak testdatalarindan gecerli "lastName" kullanilir
  Then Email olarak testdatalarindan gecerli "email" kullanilir
  Then Password olarak testdatalarindan gecerli "password" kullanilir
  Then ComfirmPassword olarak testdatalarindan gecerli "comfirmPassword" kullanilir
  Then Gorunur durumdaysa  Sign Up butonuna tikla
  When  2 saniye beklenilir
  Then  Görünür durumdaysa account tıklar
  Then Basarili kayit yapildigini test et
  When  2 saniye beklenilir



  Scenario: TC_003 Kullanici eksik bilgi girdiginde kayit tamamlanmamalidir
 Given Kullanici Testotomasyon Anasayfasına gider
 When  2 saniye beklenilir
 When Sayfa url ni doğrular
 When  2 saniye beklenilir
 When Görünür durumdaysa account tıklar
 When Gorunur durumdaysa Sign Up' a tiklar
 When  2 saniye beklenilir
 Then Register Now sayfasina gelindigini dogrular
 Then Bilgileri bos birakilir
 When  2 saniye beklenilir
 Then Gorunur durumdaysa  Sign Up butonuna tikla
 Then Tum bilgiler icin required uyarisi verildigini dogrula
 When  2 saniye beklenilir
 Then Kayit yapilamadigi ve Register Now sayfasinda kalindigini test et
 When  2 saniye beklenilir



  Scenario: TC_004 Kullanici mail adresini dogru formatta girmediginde kayit tamamlanmamalidir
Given Kullanici Testotomasyon Anasayfasına gider
When  2 saniye beklenilir
When Sayfa url ni doğrular
When  2 saniye beklenilir
When  Görünür durumdaysa account tıklar
Then  Login Now sayfasina gelindigini test et
Then  "gecersizEmail" gecersiz email gir
Then "Gecerli" password gir
When  2 saniye beklenilir
Then  Gorunur durumdaysa Sign in butonuna tikla
When  2 saniye beklenilir
Then  Kayit yapilamadigini test et




    Scenario: TC_005 Kullanici kayitta Confirm Passwordu hatali girer ve başarili kayit yapamaz
 Given Kullanici Testotomasyon Anasayfasına gider
 When   Sayfa url ni doğrular
 When   Görünür durumdaysa account tıklar
 When   Gorunur durumdaysa Sign Up' a tiklar
 When   Register Now sayfasina gelindigini dogrular
 Then First Name olarak testdatalarindan gecerli "firstName" kullanilir
 Then Last Name olarak testdatalarindan gecerli "lastName" kullanilir
 Then Email olarak testdatalarindan gecerli "email" kullanilir
 Then Password olarak testdatalarindan gecerli "password" kullanilir
 Then  "gecersizConfirm" Confirm password passworddan farkli gir
 Then Gorunur durumdaysa  Sign Up butonuna tikla
 Then   Password hatasi verildigi dogrulanir
 Then  Kayit yapilamadigini Register Now sayfasinda kalindigini test et




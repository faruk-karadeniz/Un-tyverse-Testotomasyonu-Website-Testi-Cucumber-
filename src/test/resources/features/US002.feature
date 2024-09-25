Feature: US002 Kullanici olarak giris yapilmali ve ;
 MyProfile, My Orders, Wishlist, Manage Adress,change password ve Logout butonlarini gorebilmelidir

  Scenario: TC_001 Kullanici gecerli email ve sifre girip ve sistemde Account bolumundeki bilgileri gormelidir
 Given Kullanici Testotomasyon Anasayfasına gider
 When Sayfa url ni doğrular
 When  2 saniye beklenilir
 When Görünür durumdaysa account tıklar
 When Login Now sayfasina gelindigini test et
 Then Email ve password alanlarinin gorunur oldugunu dogrula
 Then Gecerli email ve password gir
 Then Gorunur durumdaysa Sign in butonuna tikla
 When  2 saniye beklenilir
 Then Login Success gorunurlugunu dogrula
 When  2 saniye beklenilir
 Then Kullanici profiline yonlendirildigini dogrula
 Then Kullanici First Name gorunurlugunu test et
 Then Kullanici Last Name gorunurlugunu test et
 Then Kullanici email gorunurlugunu test et


 Scenario:TC_002 Kullanici gecerli bir email ve password girdiginde account bolumunde;
 MyProfile, My Orders, Wishlist, Manage Adress,change password ve Logout butonlarini gorebilmeli
Given    Kullanici Testotomasyon Anasayfasına gider
When     Sayfa url ni doğrular
When  3 saniye beklenilir
When     Görünür durumdaysa account tıklar
When     Login Now sayfasina gelindigini test et
When     Email ve password alanlarinin gorunur oldugunu dogrula
When  3 saniye beklenilir
When    Gecerli email ve password gir
When     Gorunur durumdaysa Sign in butonuna tikla
Then     Login Success gorunurlugunu dogrula
Then     Kullanici profiline yonlendirildigini dogrula
When  3 saniye beklenilir
Then    Kullanici profilinde My Profile butonunun gorunurlugunu test et
Then     Kullanici profilinde  Wishlist butonunun gorunurlugunu test et
Then     Kullanici profilinde Manage Adress butonunun gorunurlugunu test et
Then     Kullanici profilinde change password butonunun gorunurlugunu test et
Then     Kullanici profilinde Logout butonunun gorunurlugunu test et
When  3 saniye beklenilir


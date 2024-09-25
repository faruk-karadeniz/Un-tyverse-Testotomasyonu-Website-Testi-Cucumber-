Feature: US003 Anasayfa kategorileri,Select Category listesi ve Most Popular Products kategorileri test edilir

  Scenario:TC_001 Kullanici anasayfada tikladigi kategorinin sayfasina ulasabilmelidir
Given  Kullanici Testotomasyon Anasayfasına gider
When    Sayfa url ni doğrular
When  3 saniye beklenilir
When    Sayfada Electronics kategorisinin tiklanabilirligini test et
When    Electronics kategorisine tikla
When    Electronics Sayfasının url'ini test et
When    Acilan sayfanin Electronics bolumu oldugunu test et
When  3 saniye beklenilir
When    Sayfada Men Fashion kategorisinin tiklanabilirligini test et
When    Men Fashion kategorisine tikla
When    Men Fashion Sayfasının url'ini test et
When    Acilan sayfanin Men Fashion bolumu oldugunu test et
When  3 saniye beklenilir
When     Sayfada Women Fashion kategorisinin tiklanabilirligini test et
When     Women Fashion kategorisine tikla
When     Women Fashion Sayfasının url'ini test et
When     Acilan sayfanin Women Fashion bolumu oldugunu test et
When  3 saniye beklenilir
When     Sayfada Shoes kategorisinin tiklanabilirligini test et
When     Shoes kategorisine tikla
When  3 saniye beklenilir
When     Shoes Sayfasının url'ini  test et
When     Acilan sayfanin Shoes bolumu oldugunu test et
When  3 saniye beklenilir
Then     Sayfada Furniture kategorisinin tiklanabilirligini test et
Then     Furniture kategorisine tikla
Then     Furniture Sayfasının url'ini test et
Then     Acilan sayfanin Furniture bolumu oldugunu test et
When  3 saniye beklenilir
Then     Sayfada Travel kategorisinin tiklanabilirligini test et
Then     Travel kategorisine tikla
Then     Travel Sayfasının url'ini  test et
Then     Acilan sayfanin Travel bolumu oldugunu test et
When  3 saniye beklenilir
Then     Sayfada Kids Wear kategorisinin tiklanabilirligini test et
Then     Kids Wear kategorisine tikla
Then     Kids Wear Sayfasının url'ini  test et
Then     Acilan sayfanin Kids Wear bolumu oldugunu test et
When  3 saniye beklenilir
Then     Sayfada Grocery kategorisinin tiklanabilirligini test et
Then     Grocery kategorisine tikla
Then     Grocery Sayfasının url'ini  test et
Then     Acilan sayfanin Grocery bolumu oldugunu test et



 Scenario: TC_002 Anasayfadaki kategoriler ile Select Category listesindeki kategoriler karşılaştırılır
 Given    Kullanici Testotomasyon Anasayfasına gider
 When    Sayfa url ni doğrular
 When  3 saniye beklenilir
 When   Anasayfada kategorilerin gorunurlugunu test et
 When    Anasayfa kategori isimlerini liste olarak kaydet
 When  3 saniye beklenilir
 When    Arama kutusundaki Select Category butonunun gorunurlugunu test et
 When  3 saniye beklenilir
 When    Select Category butonuna tikla
 When    Kategori listesinin gorunur oldugunu test et
 When    Kategori listesindeki isimleri liste olarak kaydet
 When    Anasayfa kategori listesi ile Arama kutusu kategori listesi uzunluklarinin ayni oldugunu dogrula
 When    Anasayfa kategori listesindeki Electronics kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Men Fashion kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Women Fashion kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Shoes kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Furniture kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Travel kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Kids Wear kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
 Then    Anasayfa kategori listesindeki Grocery kategorisinin Arama kutusu kategori listesinde oldugunu dogrula



  Scenario:TC_003 Anasayfada listelenen kategoriler ile Most Popular Products bolumundeki kategori listesi ayni olmalidir
 Given  Kullanici Testotomasyon Anasayfasına gider
 When Sayfa url ni doğrular
 When Anasayfada kategorilerin gorunurlugunu test et
 When  Anasayfa kategori isimlerini liste olarak kaydet
 When  3 saniye beklenilir
 When Ana sayfada Most Popular Products bolumune git
 When  3 saniye beklenilir
 When  Bolumdeki kategorilerin gorunurlugunu test et
 When  3 saniye beklenilir
 When Kategori listesindeki isimleri liste olarak kaydet
 When Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklarinin ayni oldugunu dogrula
 When Anasayfa kategori listesindeki Electronics kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 Then Anasayfa kategori listesindeki Men Fashion kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 Then Anasayfa kategori listesindeki Women Fashion kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 Then Anasayfa kategori listesindeki Shoes kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 Then Anasayfa kategori listesindeki Furniture kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 Then Anasayfa kategori listesindeki Travel kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 And Anasayfa kategori listesindeki Kids Wear kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
 And Anasayfa kategori listesindeki Grocery kategorisinin Most Popular Products kategori listesinde oldugunu dogrula

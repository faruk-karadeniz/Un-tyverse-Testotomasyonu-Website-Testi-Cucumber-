Feature: US004 Urun satin alma ve alınan urunu sepette ekleme,silme ve onaylama yapilme testi


@E2E
  Scenario:TC_001 Her kategori için random 3 ürün seçilip sepete eklenmelidir
    Given  Kullanici Testotomasyon Anasayfasına gider
    When  Sayfa url ni doğrular
    When  Electronics kategorisine tikla
    When  Electronics Sayfasının url'ini test et
    When Electronics Birinci sayfadan bir ürün sepete eklenir
    When Electronics Ikinci sayfaya gidiler
    When Electronics iki ürün sepete eklenir
    When Men Fashion kategorisine tikla
    When  Men Fashion Sayfasının url'ini test et
    When Men Fashion den üç ürün sepete eklenir
    When  Women Fashion kategorisine tikla
    When  Women Fashion Sayfasının url'ini test et
    When Women Fahion dan Iki ürün sepete eklenir
    Then  Shoes kategorisine tikla
    Then Shoes Sayfasının url'ini  test et
    Then  Shoesden Iki ürün sepete eklenir
    Then  Furniture kategorisine tikla
    Then Furniture Sayfasının url'ini test et
    Then  Furniture den üç ürün sepete eklenir
    Then Travel kategorisine tikla
    Then Travel Sayfasının url'ini  test et
    Then Travelden üç ürün sepete eklenir
    Then Kids Wear kategorisine tikla
    Then  Kids Wear Sayfasının url'ini  test et
    Then Kids Wear den üç ürün sepete eklenir
    Then Grocery kategorisine tikla
    And  Grocery Sayfasının url'ini  test et
    And Grocery den çıkan ürünü seç
    And Your Cart butonunun gorunurlugunu test et
    And Your Cart butonunun sayisininin 20 oldugunu dogrula
    And Your Cart butonuna tıkla
    And Sepette urun bulundugunu test et



Scenario: TC_002 Kullanicinin sepete ekledigi urun ile sepet sayfasinda gorunen urun ayni olmalidir
Given Kullanici Testotomasyon Anasayfasına gider
When Sayfa url ni doğrular
When Top Selling Products yazisinin görünürlüğünü test et
When View All Products butonunun tiklanabilirligini test et
When View All Products butonuna tikla
When View All Products Sayfa url'sinin "verilenUrl" oldugunu test et
When Kategoride 0'dan fazla urun bulundugunu dogrula
When Listedeki ilk urunun uzerine git
When Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
When Add to cart butonuna tikla
Then Product Added To Cart! Yazisinin ciktigini dogrula
Then Your Cart butonunun gorunurlugunu test et
Then Your Cart butonunun sayisininin bir oldugunu dogrula
Then Your Cart butonuna tıkla
Then Your Cart Sayfa url'sinin "verilanUrl" oldugunu test et
Then Sepette urun bulundugunu test et
And Sepetteki urunun isminin listede eklenen urunun ismi ile ayni oldugunu test et



Scenario:TC_003 Kullanici sepet içerisindeki urunleri silebilmeli, sepeti bosaltabilmelidir
Given Kullanici Testotomasyon Anasayfasına gider
When Sayfa url ni doğrular
When Top Selling Products bolumune git
When View All Products butonunun tiklanabilirligini test et
When View All Products butonuna tikla
When View All Products Sayfa url'sinin "verilenUrl" oldugunu test et
When Kategoride 0'dan fazla urun bulundugunu dogrula
When Listedeki ilk urunun uzerine git
When Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
When Add to cart butonuna tikla
When Product Added To Cart! Yazisinin ciktigini dogrula
Then Your Cart butonunun gorunurlugunu test et
Then Your Cart butonunun sayisininin bir oldugunu dogrula
Then Your Cart butonuna tıkla
Then Your Cart Sayfa url'sinin "verilenUrl" oldugunu test et
Then Sepette urun bulundugunu test et
Then Urun kutusunun kosesindeki X butonunun tiklanabilirligini test et
Then X butonuna tikla
And Are you sure penceresinin acildigini dogrula
And Yes, remove it! Butonuna tikla
And Wait for it... Yazisi kaybolana kadar bekle - invisibleELement
And Shopping cart is empty yazisi gorunur oldugunu test et



Scenario:TC_04 Kullanici ürün sayfasinda ürünü sepete eklmeden once ayarladigi miktar kadar ürünü sepette gorebilmelidir
Given Kullanici Testotomasyon Anasayfasına gider
When Sayfa url ni doğrular
When Arama kutusunun gorünür oldugunu test et
When Arama kutusuna phone yaz
When Enter'a bas
When Phone Sayfa url'sinin "PhoneSayfaVerilenUrl" oldugunu test et
When 0'dan fazla urun bulundugunu dogrula
When ilk urune tikla
When Sayfa url'sinin "PhoneIlkUrunVerilenUrl" icerdigini test et
When Miktar kutusunun gorunurlugunu dogrula
When Miktar kutusunda + butonuna ıkı kere bas
When Urun Add to cart butonuna tikla
Then Product Added To Cart! Yazisinin ciktigini dogrula
Then Your Cart butonunun gorunurlugunu test et
Then Your Cart butonunun sayisininin Uc oldugunu dogrula
Then Your cart butonuna tikla
Then Your Cart Sayfa url'sinin "verilenUrl" oldugunu test et
Then Sepette urun bulundugunu test et
Then Urun miktarinin Uc oldugunu test et


@smoke
Scenario:TC_005 Kullanici sepete ekledigi urunlerin siparisini basarili bir sekilde onaylayabilmelidir
Given Kullanici Testotomasyon Anasayfasına gider
When Sayfa url ni doğrular
When Top Selling Products bolumune git
When View All Products butonunun tiklanabilirligini test et
When View All Products butonuna tikla
When View All Products Sayfa url'sinin "verilenUrl" oldugunu test et
When Kategoride 0'dan fazla urun bulundugunu dogrula
When Listedeki ilk urunun uzerine git
When Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
When Add to cart butonuna tikla
When Product Added To Cart! Yazisinin ciktigini dogrula
Then  Your Cart butonunun gorunurlugunu test et
Then Your Cart butonunun sayisininin bir oldugunu dogrula
Then Your cart butonuna tikla
Then Your Cart Sayfa url'sinin "verilenUrl" oldugunu test et
Then Sepette urun bulundugunu test et
Then Checkout butonuna tikla
Then Billing Address gorunurlugunu test et
Then Billing Add Address butonuna tikla
Then Add Address kayit sayfasına Name, address, address 2, city, postcode, ülke ve sehir bilgilerini doldur
Then Kayit sayfasındaki Add Address butonuna tikla
Then Billing Address listesinde adres bulundugunu test et
Then Billing Address listesinde adres sec
Then Delivery address same as billing address kutucuguna tikla
Then Delivery Address bolumunun gorunur olmadigini test et
And Delivery address same as billing address kutucugunu unchecked yap
And Delivery Address bolumunun gorunur oldugunu test et
And Delivery Add Address butonuna tikla
And Delivery Add Addresskayit sayfasina Name, address, address 2, city, postcode, ülke ve sehir bilgilerini doldur
And Delivery Add Address te kayıt butonuna tikla
And Delivery Address listesinde adres bulundugunu test et
And Delivery Address listesinde adres sec
And Shipping Methods listesinden kargo sec
And Terms and Conditions boxini checkle
And Place Order Now butonuna tikla
And Your order is successfully done! Yazisinin gorunur oldugunu test et










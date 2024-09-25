package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class TestotomasyonuPage {

 public TestotomasyonuPage(){PageFactory.initElements(Driver.getDriver(), this);}

 //US_001-->TC_001
@FindBy(xpath = "(//*[text()='Account'])[1]")
 public WebElement Account;
@FindBy(xpath = "//*[@class='sign-up ']")
public WebElement SignUp;
@FindBy(xpath = "//*[text()='Register Now']")
 public WebElement RegisterNowYazi;
@FindBy(xpath = "//*[@id='firstName']")
 public WebElement FirstName;
@FindBy(xpath = "//*[@id='lastName']")
public WebElement lastName;
@FindBy(xpath = "//*[@id='signupemail']")
public WebElement Email;
@FindBy(xpath = "//*[@id='signuppassword']")
public WebElement Password;
    @FindBy(xpath = "//*[@id='comfirmPassword']")
    public WebElement ComfirmPassword;
    @FindBy(xpath = "//*[@class='submitbtn btn-lg']")
    public WebElement SignupKayitButton;
    @FindBy(xpath = "(//*[text()='Logout'])[2]")
    public WebElement LogoutButton;

    //us001-->TC_03
     @FindBy(xpath = "//*[text()='First name is required']")
     public WebElement FirstNameRequired;
    @FindBy(xpath = "//*[text()='First name is required']")
    public WebElement LastNameRequired;
    @FindBy(xpath = "//*[text()='Email address is required']")
    public WebElement EmailRequired;
    @FindBy(xpath = "//*[text()='Password is required']")
    public WebElement PasswordRequired;
    @FindBy(xpath = "//*[text()='Confirm password does not match']")
    public WebElement CompifrmPasswordRequired;
    @FindBy(xpath = "//*[@class='submitbtn btn-lg']")
    public WebElement SignUpButoon;
    @FindBy(xpath = "//*[text()='Customer not found!']")
    public WebElement CustomerNotFound;
    @FindBy(xpath = "//*[text()='Confirm password does not match']")
    public WebElement ComfirmPasswordHataYaziElementi;

//US002-TC_001
  @FindBy(xpath = "//*[text()='Login Now']")
  public WebElement LoginNowSayfaYazi;
  @FindBy(xpath = "//*[@id='email']")
    public WebElement EmailBox;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement PasswordBox;
    @FindBy(xpath = "//*[@id='submitlogin']")
     public WebElement GirisSignIn;
    @FindBy(xpath ="//*[@class='retro-notify-header']")
    public WebElement LoginSuccess;
    @FindBy(xpath = "//*[text()='Update Profile']")
     public WebElement UpdateProfileYazi;
    @FindBy(xpath = "//*[@name='firstName']")
     public WebElement MyProfileFirstName;
    @FindBy(xpath = "//*[@name='lastName']")
    public WebElement MyProfileLastName;
    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement MyProfileEmail;

    //US002_TC002
    @FindBy(xpath = "//*[text()='My Profile']")
   public WebElement MyProfileButton;
    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement WishlistButton;
    @FindBy(xpath = "//*[text()='Manage Address']")
    public WebElement ManageAdressButton;
    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement ChangePasswordButton;

    //US003_TC001
     @FindBy(xpath = "(//*[@class='has-sub'])[1]")
     public WebElement Electronics;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement ElectronicsSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[2]")
    public WebElement MenFashion;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement MenFashionSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[3]")
    public WebElement WomenFashion;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement WomenFashionSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[4]")
    public WebElement Shoes;
    @FindBy(xpath = "//*[@class='current']")
      public WebElement ShoesSyafaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[5]")
    public WebElement Furnite;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement FurnitureSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[6]")
    public WebElement Travel;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement TravelSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[7]")
    public WebElement KidsWear;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement KidsWearSayfaYaziElementi;
    @FindBy(xpath = "(//*[@class='has-sub'])[8]")
    public WebElement Grocery;
    @FindBy(xpath = "//*[@class='current']")
    public WebElement GrocerySayfaYaziElementi;

//US003_TC002
    @FindBy(xpath = "//*[@class='has-sub']")
    public List<WebElement> AnasayfaKategorileri;
    @FindBy(xpath = "(//*[@class='toggle-active'])[1]")
     public WebElement SelectCategoryButton;
    @FindBy(xpath = "//*[@class='dropdown-menu ']")
     public WebElement SelectCategoryList;
    @FindBy(xpath = "(//*[text()='Electronics'])[1]")
    public WebElement selectElectronics;
    @FindBy(xpath = "(//*[text()='Men Fashion'])[1]")
    public WebElement selectMenFashion;
    @FindBy(xpath = "(//*[text()='Women Fashion'])[1]")
    public WebElement selectWomenFashion;
    @FindBy(xpath = "(//*[text()='Shoes'])[1]")
    public WebElement selectShoes;
    @FindBy(xpath = "(//*[text()='Furniture'])[1]")
    public WebElement selectFurniture;
    @FindBy(xpath = "(//*[text()='Travel'])[1]")
    public WebElement selectTravel;
    @FindBy(xpath = "(//*[text()='Kids Wear'])[1]")
    public WebElement selectKidsWear;
    @FindBy(xpath = "(//*[text()='Grocery'])[1]")
    public WebElement selectGrocery;

//US03-TC03
     @FindBy(xpath = "//*[@class='heading-lg ']")
     public WebElement MostPopularProducts;
    @FindBy(xpath = "//*[@class='nav-item ']")
    public List<WebElement> MostPopularProductsKategori;
    @FindBy(xpath = "(//*[@class='nav-item '])[1]")
     public WebElement MostPoppularElectronics;
    @FindBy(xpath = "(//*[@class='nav-item '])[2]")
    public WebElement MostPoppularMenFashion;
    @FindBy(xpath = "(//*[@class='nav-item '])[3]")
    public WebElement MostPoppularWomenFashion;
    @FindBy(xpath = "(//*[@class='nav-item '])[4]")
    public WebElement MostPoppularShoes;
    @FindBy(xpath = "(//*[@class='nav-item '])[5]")
    public WebElement MostPoppularFurniture;
    @FindBy(xpath = "(//*[@class='nav-item '])[6]")
    public WebElement MostPoppularTravel;
    @FindBy(xpath = "(//*[@class='nav-item '])[7]")
    public WebElement MostPoppularKidsWear;
    @FindBy(xpath = "(//*[@class='nav-item '])[8]")
    public WebElement MostPoppularGrocery;

  //US004-TC_001
  @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
  public WebElement ElectronicsBirinciUrun;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
    public WebElement ElectronicsBirinciUrunIkon;
    @FindBy(xpath = "(//*[@class='page-item'])[1]")
    public WebElement ElectronicsIkinciSayfaButton;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
    public WebElement ElectronicsIkinciUrun;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
    public WebElement ElectronicsIkinciUrunIkon;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
    public WebElement ElectronicsUcuncuUrun;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
    public WebElement ElectronicsUcuncuUrunIkon;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
    public WebElement MenFashionBirinciUrun;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
    public WebElement MenFashionIkinciUrun;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
    public WebElement MenFashionUcuncuUrun;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
    public WebElement MenFashionBirinciUrunIkon;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
    public WebElement MenFashionIkinciUrunIkon;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
    public WebElement MenFashionUcuncuUrunIkon;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
    public WebElement WomenFashionBirinciUrun;
    @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
    public WebElement WomenFashionIkinciUrun;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
    public WebElement WomenFashionBirinciUrunIkon;
    @FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
    public WebElement WomenFashionIkinciUrunIkon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement ShoesBirinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
public WebElement ShoesIkinciUrun;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
public WebElement ShoesBirinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
public WebElement ShoesIkinciUrunIkon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement FurnitureBirinciUrun;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
public WebElement FurnitureIkinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
public WebElement FurnitureUcuncuUrun;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement FurnitureBirinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
public WebElement FurnitureIkinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
public WebElement FurnitureUcuncuUrunIkon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
public WebElement TravelBirinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
public WebElement TravelIkinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
public WebElement TravelUcuncuUrun;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement  TravelBirinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
public WebElement  TravelIkinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
public WebElement  TravelUcuncuUrunIkon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement KidsWearBirinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
public WebElement KidsWearIkinciUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
public WebElement KidsWearUcuncuUrun;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
public WebElement KidsWearBirinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
public WebElement KidsWearIkinciUrunIkon;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
public WebElement KidsWearUcuncuUrunIkon;
@FindBy(xpath = "//*[@class='product-box mb-2 pb-1']")
public WebElement GroceryBirinciUrun;
@FindBy(xpath = "//*[@class='add-to-cart-img']")
public WebElement GroceryBirinciUrunIkon;
@FindBy(xpath = "(//*[@class='e-cart'])[2]")
 public WebElement YouCartButton;
@FindBy(xpath = "(//*[text()='20'])[1]")
 public WebElement YouCartSayi;
@FindBy(xpath = "//*[@class='text-left']")
 public WebElement ContinueShoppingButton;

//US0004-TC_02
@FindBy(xpath = "//*[text()=' Top Selling Products  ']")
 public WebElement TopSellingProducts;
@FindBy(xpath = "(//*[@class='view_all'])[1]")
 public WebElement ViewAllProducts;
@FindBy(xpath = "//*[text()='16 Products Found']")
 public List<WebElement> ViewAllUrun;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement ViewAllIlkUrun;
 @FindBy(xpath = "(//*[@class='btn-add-to-cart  d-flex align-items-center'])[1]")
 public WebElement ViewAllIlkUrunIkon;
 @FindBy(xpath = "//*[text()='Product Added To Cart!']")
 public WebElement ProductAddedToCartYazi;
 @FindBy(xpath = "//*[text()='Product Tax']")
 public WebElement ViewAllIlkUrunIsim;
 @FindBy(xpath = "//*[text()='Product Tax']")
 public WebElement  SepettekiUrunIsim;
@FindBy(xpath = "//*[@class='remove']")
 public WebElement Xbutton;
@FindBy(xpath = "//*[text()='Are you sure?']")
 public WebElement AreYouSureYazi;
@FindBy(xpath = "//*[text()='Yes, remove it!']")
 public  WebElement YesRemoveItYaziElementi;
@FindBy(xpath = "//*[text()='Wait for it... ']")
 public WebElement WaitForItYazi;
@FindBy(xpath = "//*[text()='Shopping cart is empty']")
 public WebElement ShoppingCartIsEmptyYaziElementi;
@FindBy(xpath = "(//*[@class='cart-count basket-count'])[1]")
public WebElement YourCardSayiBir;

//US004-TC004
  @FindBy(id = "global-search")
 public WebElement AramaKutusu;
@FindBy(xpath = "//*[text()='4 Products Found']")
 public List<WebElement> PhoneUrunSonuc;
@FindBy(xpath = "(//*[@class='product-box my-2  py-1'])[1]")
public WebElement PhoneIlkUrun;
@FindBy(xpath = "//*[@class='quantity ']")
 public WebElement MiktarKutusu;
@FindBy(xpath = "//div[@class='value-button increase']")
 public WebElement MiktarArtiButton;
@FindBy(xpath = "//*[@class='add-to-cart']")
 public WebElement UrunAddToCardButton;
@FindBy(xpath = "(//*[@class='cart-count basket-count'])[1]")
 public WebElement UrunUc;
@FindBy(xpath = "//*[@value='3']")
 public WebElement SepetUrunMiktari;

//US004--TC_005
 @FindBy(xpath = "//*[@class='button-block button-place']")
 public WebElement CheckoutButton;
 @FindBy(xpath = "//*[text()='  Billing Address ']")
  public WebElement BillingAdressYaziElementi;
  @FindBy(xpath = "//*[@class='btn-add-address']")
 public WebElement BillingAddAdressButton;
 @FindBy(id = "name")
 public WebElement BillingName;
 @FindBy(xpath = "//*[@id='country_id']")
  public WebElement SelectCoutry;
@FindBy(xpath = "//*[@id='add_address_state']")
 public WebElement SelectSehir;
@FindBy(xpath = "//*[@id='city']")
public WebElement SelectIlce;
@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
 public WebElement BillingAddAdressFormKayitButton;
@FindBy(xpath = "//*[@class='address-box']")
 public WebElement BillingAdressBox;
 @FindBy(xpath = "(//*[@class='checkmark'])[1]")
 public WebElement BillingAddressKutu;
@FindBy(xpath = "(//*[@class='checkmark'])[2]")
public WebElement DeliveryAddressSameAsKutu;
@FindBy(xpath = "//*[text()='  Delivery Address ']")
 public WebElement DeliveryAdressYaziElementi;
@FindBy(xpath = "(//*[@class='btn-add-address'])[2]")
 public WebElement DeliveryAddAddressButon;
@FindBy(xpath = "//*[@id='name']")
 public WebElement DeliveryAddAddressName;
@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
 public WebElement DeliveryAddAdressFormKayit;
@FindBy(xpath = "(//*[@class='address-box'])[2]")
 public WebElement DeliveryAdressBox;
@FindBy(xpath = "(//*[@class='checkmark'])[3]")
 public WebElement DeliveryAddressKutu;
@FindBy(xpath = "(//*[@class='checkmark'])[4]")
 public WebElement ShippingMethodsKutu;
@FindBy(xpath = "//*[@name='accept_terms']")
 public WebElement TermsAndConditions;
@FindBy(xpath = "//button[@class='button-block button-place mt-3']")
public WebElement PlaceOrderNowButton;
@FindBy(xpath = "//*[text()='Your order is successfully done!']")
 public WebElement YourOrderIsSuccessfullyDone;

}

package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AmazonPage {
    // page sayfalari o web sayfasinda kullanilacak locate'ler
// ve varsa logIn islemi gibi basit methotlar icin kullanilir.



    // *** page class olusturur olusturmaz ilk yapmamız gereken islem
// parametresiz constructor olusturup icinde ""PageFactory.initElements(webdriver, this)""
// ile driver'a page sayfasinda ilk deger atamasini yapmak olmalidir.***
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;
}

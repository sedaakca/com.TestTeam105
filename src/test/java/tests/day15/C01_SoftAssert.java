package tests.day15;

import org.bouncycastle.util.Arrays;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C01_SoftAssert {
    @Test
    public void test01(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        // amazon anasayfaya gittiğini doğrulayın
        SoftAssert softAssert =new SoftAssert();

        String expectedUrlKelime="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
       softAssert.assertTrue(actualUrl.contains(expectedUrlKelime),"url amazon icermiyor");

        // Nutella aratın
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuclarının nutella içerdiğini doğrulayın

        String aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"),"arama sonuclsri Nutelle İcermiyor");

        //Java aratın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);

        //arama sonuclarının 1000'den fazla oldugunu dogrulayın


        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();

        String[] sonucArr=aramaSonucYazisi.split(" ");


        String javaSonucSayisiStr=sonucArr[3]; //6.000

        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("//W","");//6000

        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);
        softAssert.assertTrue(sonucSayisiInt>1000,"Arama sonucu 1000'den çok değil");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
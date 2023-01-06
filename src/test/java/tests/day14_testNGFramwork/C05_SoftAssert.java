package tests.day14_testNGFramwork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {
    @Test
    public void test01(){
        // 1.adim SoftAssert objesi olusturmak

        SoftAssert softAssert= new SoftAssert();

        // 2.Adim Softassert objesi kullanarak istenilen assertionlari yapin

        softAssert.assertEquals(6,8); //Failed
        System.out.println("1.assertion sonrasi");

        softAssert.assertTrue(5>3); //Passed
        System.out.println("2. asserion sonrasi");

        softAssert.assertFalse(8>5); //Failed
        System.out.println("3.assertion sonrasi");

        // 3.Adim softassert 'e raporla diyecegiz
        softAssert.assertAll();// bu satirda calisma durur, cunku Faild olan assertion var
        System.out.println("assertAll sonrasi");




    }
}

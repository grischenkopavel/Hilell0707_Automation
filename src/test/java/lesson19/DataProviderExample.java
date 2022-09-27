package lesson19;/*
Created by Pavel Gryshchenko on 26.09.2022
*/

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @DataProvider(name = "routes")
    public Object[][] dataProviderMethod(){
        return new Object[][] {{"route_1, https://ithillel.ua"},
                {"route_2 , https://ithillel.ua/contacts"},
                {"route_3 , https://online.ithillel.ua/"}};
    }
    @Test(dataProvider = "routes")
    public void TestCheckingLogo(String data){
        System.out.println("Test started with data: " + data);
        System.out.println("checking logo logic");
    }
}

package model.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    private SelenideElement searchTextInput = $(By.xpath(" //input[@id='search_query_top']"));

    public void setTextToSearchInput(String text){
        searchTextInput.sendKeys(text);
    }

    public void clickSearchButton(){
        $(By.name("submit_search")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[contains(text(),'"+text+"')]")).shouldBe(Condition.visible);
    }
}

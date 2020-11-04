package steps;

import cucumber.api.java.en.Then;
import model.ui.BasicPage;

public class BasicPageDefinition {

    private BasicPage basicPage = new BasicPage();


    @Then("Input product name {string}")
    public void inputProductName(String product) {
        basicPage.setTextToSearchInput(product);
    }

    @Then("Click button search")
    public void clickButton() {
        basicPage.clickSearchButton();
    }

    @Then("Content with {string} visible")
    public void contentWithTextVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}

package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.CountriesSearchSteps;
@RunWith(SerenityRunner.class)
public class CountriesSearchTests {
    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void verifyUS() {
        countriesSearchSteps.searchCountryByCode("US");
        countriesSearchSteps.searchIsExecutedSuccessfully();
        countriesSearchSteps.iShouldFindCountry("United States of America");
    }

    @Test
    public void verifyIndia() {
        countriesSearchSteps.searchCountryByCode("IN");
        countriesSearchSteps.searchIsExecutedSuccessfully();
        countriesSearchSteps.iShouldFindCountry("India");
    }
}

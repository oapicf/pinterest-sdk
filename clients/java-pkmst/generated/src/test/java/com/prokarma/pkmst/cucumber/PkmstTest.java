package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/ad_accounts-report-json/ad_accounts.json",
 "json:./report/boards-report-json/boards.json",
 "json:./report/catalogs-report-json/catalogs.json",
 "json:./report/media-report-json/media.json",
 "json:./report/oauth-report-json/oauth.json",
 "json:./report/pins-report-json/pins.json",
 "json:./report/user_account-report-json/user_account.json",
 })
public class PkmstTest {
}
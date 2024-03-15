package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/ad_accounts-report-json/ad_accounts.json",
 "json:./report/ad_groups-report-json/ad_groups.json",
 "json:./report/ads-report-json/ads.json",
 "json:./report/audience_insights-report-json/audience_insights.json",
 "json:./report/audiences-report-json/audiences.json",
 "json:./report/billing-report-json/billing.json",
 "json:./report/boards-report-json/boards.json",
 "json:./report/bulk-report-json/bulk.json",
 "json:./report/campaigns-report-json/campaigns.json",
 "json:./report/catalogs-report-json/catalogs.json",
 "json:./report/conversion_events-report-json/conversion_events.json",
 "json:./report/conversion_tags-report-json/conversion_tags.json",
 "json:./report/customer_lists-report-json/customer_lists.json",
 "json:./report/integrations-report-json/integrations.json",
 "json:./report/keywords-report-json/keywords.json",
 "json:./report/lead_ads-report-json/lead_ads.json",
 "json:./report/lead_forms-report-json/lead_forms.json",
 "json:./report/media-report-json/media.json",
 "json:./report/oauth-report-json/oauth.json",
 "json:./report/order_lines-report-json/order_lines.json",
 "json:./report/pins-report-json/pins.json",
 "json:./report/product_group_promotions-report-json/product_group_promotions.json",
 "json:./report/product_groups-report-json/product_groups.json",
 "json:./report/resources-report-json/resources.json",
 "json:./report/search-report-json/search.json",
 "json:./report/terms-report-json/terms.json",
 "json:./report/terms_of_service-report-json/terms_of_service.json",
 "json:./report/user_account-report-json/user_account.json",
 })
public class PkmstTest {
}
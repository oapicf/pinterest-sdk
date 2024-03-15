package org.openapitools.controller;

import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.CampaignCreateResponse;
import org.openapitools.model.CampaignResponse;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.CampaignUpdateResponse;
import org.openapitools.model.CampaignsAnalyticsResponseInner;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for CampaignsController
 */
@MicronautTest
public class CampaignsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    CampaignsController controller;

    /**
     * This test is used to validate the implementation of campaignTargetingAnalyticsGet() method
     *
     * The method should: Get targeting analytics for campaigns
     *
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignTargetingAnalyticsGetMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsTargetingType> targetingTypes = Arrays.asList();
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";
        ConversionReportAttributionType attributionTypes = ConversionReportAttributionType.fromValue("INDIVIDUAL");

        // when
        MetricsResponse result = controller.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns/targeting_analytics' to the features of campaignTargetingAnalyticsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignTargetingAnalyticsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns/targeting_analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("targeting_types", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("attribution_types", String.valueOf(ConversionReportAttributionType.fromValue("INDIVIDUAL"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MetricsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsAnalytics() method
     *
     * The method should: Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<CampaignsAnalyticsResponseInner> result = controller.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns/analytics' to the features of campaignsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CampaignsAnalyticsResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsCreate() method
     *
     * The method should: Create campaigns
     *
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-your-campaign/\&quot;&gt;Set up your campaign&lt;/a&gt;. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt; - The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignCreateRequest> campaignCreateRequest = Arrays.asList();

        // when
        CampaignCreateResponse result = controller.campaignsCreate(adAccountId, campaignCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns' to the features of campaignsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsCreateClientApiTest() throws IOException {
        // given
        List<@Valid CampaignCreateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CampaignCreateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsGet() method
     *
     * The method should: Get campaign
     *
     * Get a specific campaign given the campaign ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsGetMethodTest() {
        // given
        String adAccountId = "example";
        String campaignId = "example";

        // when
        CampaignResponse result = controller.campaignsGet(adAccountId, campaignId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns/{campaign_id}' to the features of campaignsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns/{campaign_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("campaign_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CampaignResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsList() method
     *
     * The method should: List campaigns
     *
     * Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsListMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        CampaignsList200Response result = controller.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns' to the features of campaignsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList("example")) // The query format should be multi
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CampaignsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsUpdate() method
     *
     * The method should: Update campaigns
     *
     * Update multiple ad campaigns based on campaign_ids. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; - &lt;p&gt;The values for &#39;lifetime_spend_cap&#39; and &#39;daily_spend_cap&#39; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile. (e.g. USD) &lt;p/&gt; &lt;p&gt;Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.&lt;/p&gt; &lt;p&gt;&lt;strong&gt;Equivalency equations&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;$1 &#x3D; 1,000,000 microdollars&lt;/li&gt;   &lt;li&gt;1 microdollar &#x3D; $0.000001 &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;strong&gt;To convert between currency and microcurrency&lt;/strong&gt;, using dollars as an example currency:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;To convert dollars to microdollars, mutiply dollars by 1,000,000&lt;/li&gt;   &lt;li&gt;To convert microdollars to dollars, divide microdollars by 1,000,000&lt;/li&gt; &lt;/ul&gt;
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignUpdateRequest> campaignUpdateRequest = Arrays.asList();

        // when
        CampaignUpdateResponse result = controller.campaignsUpdate(adAccountId, campaignUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaigns' to the features of campaignsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignsUpdateClientApiTest() throws IOException {
        // given
        List<@Valid CampaignUpdateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaigns").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CampaignUpdateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

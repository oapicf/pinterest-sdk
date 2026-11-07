package org.openapitools.controller;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsItems;
import org.openapitools.model.AdAccountCreate;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import org.openapitools.model.ConversionProductReport;
import org.openapitools.model.ConversionProductReportCreate;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MMMReport;
import org.openapitools.model.MMMReportCreate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.TemplateBasedReport;
import org.openapitools.model.TemplatesList200Response;
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
 * API tests for AdAccountsController
 */
@MicronautTest
public class AdAccountsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AdAccountsController controller;

    /**
     * This test is used to validate the implementation of adAccountAnalytics() method
     *
     * The method should: Get ad account analytics
     *
     *   Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountAnalyticsMethodTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<AdAccountAnalyticsItems> result = controller.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/analytics' to the features of adAccountAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@58d804c0");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, AdAccountAnalyticsItems.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountTargetingAnalyticsGet() method
     *
     * The method should: Get targeting analytics for an ad account
     *
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountTargetingAnalyticsGetMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsAccountTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        MetricsResponse result = controller.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/targeting_analytics' to the features of adAccountTargetingAnalyticsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountTargetingAnalyticsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/targeting_analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4e565a63");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("targeting_types", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("attribution_types", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MetricsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsCreate() method
     *
     * The method should: Create ad account
     *
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsCreateMethodTest() {
        // given
        AdAccountCreate adAccountCreate = new AdAccountCreate();

        // when
        AdAccount result = controller.adAccountsCreate(adAccountCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts' to the features of adAccountsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsCreateClientApiTest() throws IOException {
        // given
        AdAccountCreate body = new AdAccountCreate();
        String uri = UriTemplate.of("/ad_accounts").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@56b0a96d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccount.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsGet() method
     *
     * The method should: Get ad account
     *
     * Get an ad account
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        AdAccount result = controller.adAccountsGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}' to the features of adAccountsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@19e80d2e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccount.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsList() method
     *
     * The method should: List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsListMethodTest() {
        // given
        Boolean includeSharedAccounts = true;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdAccountsList200Response result = controller.adAccountsList(includeSharedAccounts, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts' to the features of adAccountsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2794b7e4");
        request.getParameters()
            .add("include_shared_accounts", String.valueOf(true)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdAccountsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsCreateConversionProductReport() method
     *
     * The method should: Create a request for a brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateConversionProductReportMethodTest() {
        // given
        String adAccountId = "example";
        ConversionProductReportCreate conversionProductReportCreate = new ConversionProductReportCreate(Arrays.asList(), "2024-04-23", org.openapitools.model.ConversionProductReportGranularity.fromValue("TOTAL"), org.openapitools.model.ConversionProductReportLevel.fromValue("ADVERTISER"), "example", "2024-04-17");

        // when
        ConversionProductReport result = controller.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/reports/brand_category_sku' to the features of analyticsCreateConversionProductReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateConversionProductReportClientApiTest() throws IOException {
        // given
        ConversionProductReportCreate body = new ConversionProductReportCreate(Arrays.asList(), "2024-04-23", org.openapitools.model.ConversionProductReportGranularity.fromValue("TOTAL"), org.openapitools.model.ConversionProductReportLevel.fromValue("ADVERTISER"), "example", "2024-04-17");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/reports/brand_category_sku").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@5bed7437");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionProductReport.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsCreateMmmReport() method
     *
     * The method should: Create a request for a Marketing Mix Modeling (MMM) report
     *
     *     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateMmmReportMethodTest() {
        // given
        String adAccountId = "example";
        MMMReportCreate mmMReportCreate = new MMMReportCreate(Arrays.asList(), "2020-12-20", org.openapitools.model.MMMReportGranularity.fromValue("DAY"), org.openapitools.model.MMMReportLevel.fromValue("CAMPAIGN_TARGETING"), "example", "2020-12-20", Arrays.asList());

        // when
        MMMReport result = controller.analyticsCreateMmmReport(adAccountId, mmMReportCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/mmm_reports' to the features of analyticsCreateMmmReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateMmmReportClientApiTest() throws IOException {
        // given
        MMMReportCreate body = new MMMReportCreate(Arrays.asList(), "2020-12-20", org.openapitools.model.MMMReportGranularity.fromValue("DAY"), org.openapitools.model.MMMReportLevel.fromValue("CAMPAIGN_TARGETING"), "example", "2020-12-20", Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/mmm_reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@8c555e6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MMMReport.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsCreateReport() method
     *
     * The method should: Create async request for an account analytics report
     *
     *   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateReportMethodTest() {
        // given
        String adAccountId = "example";
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest("example", org.openapitools.model.Granularity.fromValue("TOTAL"), "example");

        // when
        AdsAnalyticsCreateAsyncResponse result = controller.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/reports' to the features of analyticsCreateReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateReportClientApiTest() throws IOException {
        // given
        AdsAnalyticsCreateAsyncRequest body = new AdsAnalyticsCreateAsyncRequest("example", org.openapitools.model.Granularity.fromValue("TOTAL"), "example");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@519da8ad");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsAnalyticsCreateAsyncResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsCreateTemplateReport() method
     *
     * The method should: Create async request for an analytics report using a template
     *
     *   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateTemplateReportMethodTest() {
        // given
        String adAccountId = "example";
        String templateId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        Granularity granularity = Granularity.fromValue("TOTAL");

        // when
        TemplateBasedReport result = controller.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/templates/{template_id}/reports' to the features of analyticsCreateTemplateReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateTemplateReportClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/templates/{template_id}/reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("template_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@53340eed");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TemplateBasedReport.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsGetConversionProductReport() method
     *
     * The method should: Get advertiser brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetConversionProductReportMethodTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        ConversionProductReport result = controller.analyticsGetConversionProductReport(adAccountId, token).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/reports/brand_category_sku' to the features of analyticsGetConversionProductReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetConversionProductReportClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/reports/brand_category_sku").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@63c88470");
        request.getParameters()
            .add("token", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ConversionProductReport.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsGetMmmReport() method
     *
     * The method should: Get advertiser Marketing Mix Modeling (MMM) report.
     *
     *     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetMmmReportMethodTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        MMMReport result = controller.analyticsGetMmmReport(adAccountId, token).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/mmm_reports' to the features of analyticsGetMmmReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetMmmReportClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/mmm_reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4180978a");
        request.getParameters()
            .add("token", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MMMReport.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsGetReport() method
     *
     * The method should: Get the account analytics report created by the async call
     *
     *   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetReportMethodTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        AdsAnalyticsGetAsyncResponse result = controller.analyticsGetReport(adAccountId, token).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/reports' to the features of analyticsGetReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsGetReportClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7d6497d7");
        request.getParameters()
            .add("token", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsAnalyticsGetAsyncResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of sandboxDelete() method
     *
     * The method should: Delete ads data for ad account in API Sandbox
     *
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void sandboxDeleteMethodTest() {
        // given
        String adAccountId = "example";

        // when
        String result = controller.sandboxDelete(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/sandbox' to the features of sandboxDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void sandboxDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/sandbox").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@ed4adf0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of templatesList() method
     *
     * The method should: List templates
     *
     * Gets all Templates associated with an ad account ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void templatesListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        TemplatesList200Response result = controller.templatesList(adAccountId, bookmark, pageSize, order).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/templates' to the features of templatesList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void templatesListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/templates").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2998435e");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, TemplatesList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

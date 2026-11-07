package org.openapitools.controller;

import org.openapitools.model.AdGroup;
import org.openapitools.model.AdGroupAudienceSizing;
import org.openapitools.model.AdGroupAudienceSizingCreate;
import org.openapitools.model.AdGroupCreateCreate;
import org.openapitools.model.AdGroupUpdateBatchUpdate;
import org.openapitools.model.AdGroupsAnalyticsMetrics;
import org.openapitools.model.AdGroupsCreate200Response;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.DynamicTitlesDownloadCSV;
import org.openapitools.model.DynamicTitlesGetStatus;
import org.openapitools.model.DynamicTitlesProcessCSV;
import org.openapitools.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.model.DynamicTitlesUploadURL;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
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
 * API tests for AdGroupsController
 */
@MicronautTest
public class AdGroupsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AdGroupsController controller;

    /**
     * This test is used to validate the implementation of adGroupsAnalytics() method
     *
     * The method should: Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsAnalyticsMethodTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        Boolean aggregateReportRows = false;
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<AdGroupsAnalyticsMetrics> result = controller.adGroupsAnalytics(startDate, endDate, adGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/analytics' to the features of adGroupsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@224f8b34");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("aggregate_report_rows", String.valueOf(false)) // The query parameter format should be 
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, AdGroupsAnalyticsMetrics.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsAudienceSizing() method
     *
     * The method should: Get audience sizing
     *
     * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsAudienceSizingMethodTest() {
        // given
        String adAccountId = "example";
        AdGroupAudienceSizingCreate adGroupAudienceSizingCreate = new AdGroupAudienceSizingCreate();

        // when
        AdGroupAudienceSizing result = controller.adGroupsAudienceSizing(adAccountId, adGroupAudienceSizingCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/audience_sizing' to the features of adGroupsAudienceSizing() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsAudienceSizingClientApiTest() throws IOException {
        // given
        AdGroupAudienceSizingCreate body = new AdGroupAudienceSizingCreate();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3c289f8");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroupAudienceSizing.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsBidFloorGet() method
     *
     * The method should: Get bid floors
     *
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsBidFloorGetMethodTest() {
        // given
        String adAccountId = "example";
        BidFloorCreate bidFloorCreate = new BidFloorCreate(Arrays.asList());

        // when
        BidFloor result = controller.adGroupsBidFloorGet(adAccountId, bidFloorCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/bid_floor' to the features of adGroupsBidFloorGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsBidFloorGetClientApiTest() throws IOException {
        // given
        BidFloorCreate body = new BidFloorCreate(Arrays.asList());
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/bid_floor").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3c68f516");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BidFloor.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsCreate() method
     *
     * The method should: Create ad groups
     *
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdGroupCreateCreate> adGroupCreateCreate = Arrays.asList();

        // when
        AdGroupsCreate200Response result = controller.adGroupsCreate(adAccountId, adGroupCreateCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups' to the features of adGroupsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsCreateClientApiTest() throws IOException {
        // given
        List<@Valid AdGroupCreateCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@a37d1ae");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroupsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsDynamicTitlesDownloadCsv() method
     *
     * The method should: Get dynamic titles CSV download URL
     *
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesDownloadCsvMethodTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesDownloadCSV result = controller.adGroupsDynamicTitlesDownloadCsv(adAccountId, adGroupId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv' to the features of adGroupsDynamicTitlesDownloadCsv() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesDownloadCsvClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("ad_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@547ffdf7");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DynamicTitlesDownloadCSV.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsDynamicTitlesGetStatus() method
     *
     * The method should: Get dynamic titles status
     *
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesGetStatusMethodTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesGetStatus result = controller.adGroupsDynamicTitlesGetStatus(adAccountId, adGroupId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status' to the features of adGroupsDynamicTitlesGetStatus() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesGetStatusClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("ad_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@436523c9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DynamicTitlesGetStatus.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsDynamicTitlesGetUploadUrl() method
     *
     * The method should: Get dynamic titles upload URL
     *
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesGetUploadUrlMethodTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";

        // when
        DynamicTitlesUploadURL result = controller.adGroupsDynamicTitlesGetUploadUrl(adAccountId, adGroupId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads' to the features of adGroupsDynamicTitlesGetUploadUrl() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesGetUploadUrlClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("ad_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@38deaef6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DynamicTitlesUploadURL.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsDynamicTitlesProcessCsv() method
     *
     * The method should: Process dynamic titles CSV
     *
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesProcessCsvMethodTest() {
        // given
        String adAccountId = "example";
        String adGroupId = "example";
        DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate = new DynamicTitlesProcessCSVCreate("example");

        // when
        DynamicTitlesProcessCSV result = controller.adGroupsDynamicTitlesProcessCsv(adAccountId, adGroupId, dynamicTitlesProcessCSVCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles' to the features of adGroupsDynamicTitlesProcessCsv() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsDynamicTitlesProcessCsvClientApiTest() throws IOException {
        // given
        DynamicTitlesProcessCSVCreate body = new DynamicTitlesProcessCSVCreate("example");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("ad_group_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@c50b2e2");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DynamicTitlesProcessCSV.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsGet() method
     *
     * The method should: Get ad group
     *
     * Get a specific ad group given the ad group ID.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsGetMethodTest() {
        // given
        String adGroupId = "example";
        String adAccountId = "example";

        // when
        AdGroup result = controller.adGroupsGet(adGroupId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}' to the features of adGroupsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_group_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@27eb66da");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroup.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsList() method
     *
     * The method should: List ad groups
     *
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();
        Boolean translateInterestsToNames = false;

        // when
        AdGroupsList200Response result = controller.adGroupsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, entityStatuses, translateInterestsToNames).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups' to the features of adGroupsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4dfa7285");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList()) // The query format should be multi
            .add("translate_interests_to_names", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroupsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsTargetingAnalyticsGet() method
     *
     * The method should: Get targeting analytics for ad groups
     *
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsTargetingAnalyticsGetMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsAdGroupTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");
        List<String> sortColumns = Arrays.asList("example");
        Boolean sortAscending = false;

        // when
        MetricsResponse result = controller.adGroupsTargetingAnalyticsGet(adAccountId, adGroupIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics' to the features of adGroupsTargetingAnalyticsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsTargetingAnalyticsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@9eccd2");
        request.getParameters()
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
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
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))) // The query parameter format should be 
            .add("sort_columns", Arrays.asList("example")) // The query format should be multi
            .add("sort_ascending", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, MetricsResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsUpdate() method
     *
     * The method should: Update ad groups
     *
     * Update multiple existing ad groups.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate = Arrays.asList();

        // when
        AdGroupsCreate200Response result = controller.adGroupsUpdate(adAccountId, adGroupUpdateBatchUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_groups' to the features of adGroupsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsUpdateClientApiTest() throws IOException {
        // given
        List<@Valid AdGroupUpdateBatchUpdate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_groups").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@9d0b981");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroupsCreate200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getAdGroupsByPromotionIdsList() method
     *
     * The method should: List of ad groups using promotions IDs.
     *
     *   Get a list of ad groups that are associated with those promotion ids
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAdGroupsByPromotionIdsListMethodTest() {
        // given
        String adAccountId = "example";
        List<String> promotionIds = Arrays.asList("example");
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        AdGroupsList200Response result = controller.getAdGroupsByPromotionIdsList(adAccountId, promotionIds, bookmark, pageSize, order).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/promotion_applied_entities' to the features of getAdGroupsByPromotionIdsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAdGroupsByPromotionIdsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/promotion_applied_entities").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7571d3d7");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("promotion_ids", Arrays.asList("example")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdGroupsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

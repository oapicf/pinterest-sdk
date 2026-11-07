package org.openapitools.controller;

import org.openapitools.model.Ad;
import org.openapitools.model.AdBatchUpdate;
import org.openapitools.model.AdBatchWriteResponseModel;
import org.openapitools.model.AdCreate;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdsAnalytics;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
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
 * API tests for AdsController
 */
@MicronautTest
public class AdsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    AdsController controller;

    /**
     * This test is used to validate the implementation of adPreviewsCreate() method
     *
     * The method should: Create ad preview with pin or image
     *
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adPreviewsCreateMethodTest() {
        // given
        String adAccountId = "example";
        AdPreviewRequest adPreviewRequest = new AdPreviewRequest();

        // when
        AdPreviewURLResponse result = controller.adPreviewsCreate(adAccountId, adPreviewRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ad_previews' to the features of adPreviewsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adPreviewsCreateClientApiTest() throws IOException {
        // given
        AdPreviewRequest body = new AdPreviewRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ad_previews").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3e7a0462");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdPreviewURLResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adTargetingAnalyticsGet() method
     *
     * The method should: Get targeting analytics for ads
     *
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adTargetingAnalyticsGetMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<AdsAnalyticsAdTargetingType> targetingTypes = Arrays.asList();
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionAttributionWindowDays engagementWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.fromValue("0");
        ConversionReportTimeType conversionReportTime = ConversionReportTimeType.fromValue("TIME_OF_AD_ACTION");
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList();
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");
        List<String> sortColumns = Arrays.asList("example");
        Boolean sortAscending = false;

        // when
        MetricsResponse result = controller.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone, sortColumns, sortAscending).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads/targeting_analytics' to the features of adTargetingAnalyticsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adTargetingAnalyticsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads/targeting_analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@30719cc4");
        request.getParameters()
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("targeting_types", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(ConversionAttributionWindowDays.fromValue("0"))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(ConversionAttributionWindowDays.fromValue("0"))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(ConversionAttributionWindowDays.fromValue("0"))) // The query parameter format should be 
            .add("conversion_report_time", String.valueOf(ConversionReportTimeType.fromValue("TIME_OF_AD_ACTION"))) // The query parameter format should be 
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
     * This test is used to validate the implementation of adsAnalytics() method
     *
     * The method should: Get ad analytics
     *
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsAnalyticsMethodTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<ReportingColumnSync> columns = Arrays.asList();
        Granularity granularity = Granularity.fromValue("TOTAL");
        String adAccountId = "example";
        List<String> pinIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        BigDecimal clickWindowDays = new BigDecimal(78);
        BigDecimal engagementWindowDays = new BigDecimal(78);
        BigDecimal viewWindowDays = new BigDecimal(78);
        String conversionReportTime = "TIME_OF_AD_ACTION";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE");

        // when
        List<AdsAnalytics> result = controller.adsAnalytics(startDate, endDate, columns, granularity, adAccountId, pinIds, adIds, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, campaignIds, reportingTimezone).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads/analytics' to the features of adsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@32f74376");
        request.getParameters()
            .add("pin_ids", Arrays.asList("example")) // The query format should be multi
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList())) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("TOTAL"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("view_window_days", String.valueOf(new BigDecimal(78))) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION") // The query parameter format should be 
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("reporting_timezone", String.valueOf(ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, AdsAnalytics.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsCreate() method
     *
     * The method should: Create ads
     *
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdCreate> adCreate = Arrays.asList();

        // when
        AdBatchWriteResponseModel result = controller.adsCreate(adAccountId, adCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads' to the features of adsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreateClientApiTest() throws IOException {
        // given
        List<@Valid AdCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@6a65ab18");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdBatchWriteResponseModel.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsGet() method
     *
     * The method should: Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsGetMethodTest() {
        // given
        String adId = "example";
        String adAccountId = "example";

        // when
        Ad result = controller.adsGet(adId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads/{ad_id}' to the features of adsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads/{ad_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_id", "example");
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4d2fb22");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Ad.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsList() method
     *
     * The method should: List ads
     *
     * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsListMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        List<EntityStatus> entityStatuses = Arrays.asList();

        // when
        AdsList200Response result = controller.adsList(adAccountId, bookmark, pageSize, order, campaignIds, adGroupIds, adIds, entityStatuses).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads' to the features of adsList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@38f9d0c0");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList()); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsList200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsUpdate() method
     *
     * The method should: Update ads
     *
     * Update multiple existing ads
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsUpdateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid AdBatchUpdate> adBatchUpdate = Arrays.asList();

        // when
        AdBatchWriteResponseModel result = controller.adsUpdate(adAccountId, adBatchUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads' to the features of adsUpdate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsUpdateClientApiTest() throws IOException {
        // given
        List<@Valid AdBatchUpdate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@309dd85a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdBatchWriteResponseModel.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignAdPreviewCreate() method
     *
     * The method should: Create ad preview records for one or more ad groups
     *
     * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewCreateMethodTest() {
        // given
        String adAccountId = "example";
        List<@Valid CampaignAdPreviewCreate> campaignAdPreviewCreate = Arrays.asList();

        // when
        List<CampaignAdPreviewCreate200ResponseInner> result = controller.campaignAdPreviewCreate(adAccountId, campaignAdPreviewCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaign_ad_preview' to the features of campaignAdPreviewCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewCreateClientApiTest() throws IOException {
        // given
        List<@Valid CampaignAdPreviewCreate> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaign_ad_preview").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7767883a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CampaignAdPreviewCreate200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignAdPreviewDelete() method
     *
     * The method should: Delete ad preview records for one or more ad groups
     *
     * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewDeleteMethodTest() {
        // given
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CampaignAdPreviewDelete200ResponseInner> result = controller.campaignAdPreviewDelete(adGroupIds, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaign_ad_preview' to the features of campaignAdPreviewDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaign_ad_preview").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@64ff761f");
        request.getParameters()
            .add("ad_group_ids", Arrays.asList("example")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CampaignAdPreviewDelete200ResponseInner.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignAdPreviewRead() method
     *
     * The method should: Fetch ad preview records for one or more ad groups
     *
     * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewReadMethodTest() {
        // given
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds = Arrays.asList("example");
        String adAccountId = "example";

        // when
        List<CampaignAdPreview> result = controller.campaignAdPreviewRead(adGroupIds, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/campaign_ad_preview' to the features of campaignAdPreviewRead() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void campaignAdPreviewReadClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/campaign_ad_preview").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@12f6d590");
        request.getParameters()
            .add("ad_group_ids", Arrays.asList("example")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, CampaignAdPreview.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

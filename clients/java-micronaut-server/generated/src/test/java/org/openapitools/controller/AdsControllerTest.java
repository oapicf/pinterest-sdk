package org.openapitools.controller;

import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsList200Response;
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
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.
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
            .accept("application/json");

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
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
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
        List<AdsAnalyticsTargetingType> targetingTypes = Arrays.asList();
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";
        ConversionReportAttributionType attributionTypes = ConversionReportAttributionType.fromValue("INDIVIDUAL");

        // when
        MetricsResponse result = controller.adTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes).block();

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
            .accept("application/json");
        request.getParameters()
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
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
     * This test is used to validate the implementation of adsAnalytics() method
     *
     * The method should: Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<AdsAnalyticsResponseInner> result = controller.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

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
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, AdsAnalyticsResponseInner.class));

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
        List<AdCreateRequest> adCreateRequest = Arrays.asList();

        // when
        AdArrayResponse result = controller.adsCreate(adAccountId, adCreateRequest).block();

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
        List<AdCreateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdArrayResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsGet() method
     *
     * The method should: Get ad
     *
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsGetMethodTest() {
        // given
        String adAccountId = "example";
        String adId = "example";

        // when
        AdResponse result = controller.adsGet(adAccountId, adId).block();

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
            put("ad_account_id", "example");
            put("ad_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsList() method
     *
     * The method should: List ads
     *
     * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsListMethodTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")String> adIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        AdsList200Response result = controller.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark).block();

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
            .accept("application/json");
        request.getParameters()
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList("example")) // The query format should be multi
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example"); // The query parameter format should be 

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
        List<AdUpdateRequest> adUpdateRequest = Arrays.asList();

        // when
        AdArrayResponse result = controller.adsUpdate(adAccountId, adUpdateRequest).block();

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
        List<AdUpdateRequest> body = Arrays.asList();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdArrayResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

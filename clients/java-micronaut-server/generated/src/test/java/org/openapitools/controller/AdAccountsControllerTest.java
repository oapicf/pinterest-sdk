package org.openapitools.controller;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.Paginated;
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
    @Client("${context-path}")
    HttpClient client;

    @Inject
    AdAccountsController controller;

    /**
     * This test is used to validate the implementation of adAccountAnalytics() method
     *
     * The method should: Get ad account analytics
     *
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<Map<String, Object>> result = controller.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

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
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Map.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adAccountsList() method
     *
     * The method should: List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adAccountsListMethodTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        Boolean includeSharedAccounts = true;

        // when
        Paginated result = controller.adAccountsList(bookmark, pageSize, includeSharedAccounts).block();

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
            .accept("application/json");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("include_shared_accounts", String.valueOf(true)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsAnalytics() method
     *
     * The method should: Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<String> adGroupIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<Map<String, Object>> result = controller.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

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
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Map.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adGroupsList() method
     *
     * The method should: List ad groups
     *
     * Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adGroupsListMethodTest() {
        // given
        String adAccountId = "example";
        List<String> campaignIds = Arrays.asList("example");
        List<String> adGroupIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";
        Boolean translateInterestsToNames = false;

        // when
        Paginated result = controller.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames).block();

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
            .accept("application/json");
        request.getParameters()
            .add("campaign_ids", Arrays.asList("example")) // The query format should be multi
            .add("ad_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("entity_statuses", Arrays.asList("example")) // The query format should be multi
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", "ASCENDING") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("translate_interests_to_names", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsAnalytics() method
     *
     * The method should: Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
        List<String> adIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<Map<String, Object>> result = controller.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

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
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Map.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsList() method
     *
     * The method should: List ads
     *
     * Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsListMethodTest() {
        // given
        String adAccountId = "example";
        List<String> campaignIds = Arrays.asList("example");
        List<String> adGroupIds = Arrays.asList("example");
        List<String> adIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        Paginated result = controller.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark).block();

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
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsCreateReport() method
     *
     * The method should: Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void analyticsCreateReportMethodTest() {
        // given
        String adAccountId = "example";
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest();

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
        AdsAnalyticsCreateAsyncRequest body = new AdsAnalyticsCreateAsyncRequest();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/reports").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .contentType("application/json")
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsAnalyticsCreateAsyncResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of analyticsGetReport() method
     *
     * The method should: Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
            .accept("application/json");
        request.getParameters()
            .add("token", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsAnalyticsGetAsyncResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of campaignsAnalytics() method
     *
     * The method should: Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
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
        List<String> campaignIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<Map<String, Object>> result = controller.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

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
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Map.class));

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
        List<String> campaignIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        Paginated result = controller.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark).block();

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
        HttpResponse<?> response = client.toBlocking().exchange(request, Paginated.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of productGroupsAnalytics() method
     *
     * The method should: Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupsAnalyticsMethodTest() {
        // given
        String adAccountId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<String> productGroupIds = Arrays.asList("example");
        List<String> columns = Arrays.asList("example");
        Granularity granularity = Granularity.fromValue("DAY");
        Integer clickWindowDays = 30;
        Integer engagementWindowDays = 30;
        Integer viewWindowDays = 1;
        String conversionReportTime = "TIME_OF_AD_ACTION";

        // when
        List<Map<String, Object>> result = controller.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/product_groups/analytics' to the features of productGroupsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void productGroupsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/product_groups/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("product_group_ids", Arrays.asList("example")) // The query format should be multi
            .add("columns", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("granularity", String.valueOf(Granularity.fromValue("DAY"))) // The query parameter format should be 
            .add("click_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("engagement_window_days", String.valueOf(30)) // The query parameter format should be 
            .add("view_window_days", String.valueOf(1)) // The query parameter format should be 
            .add("conversion_report_time", "TIME_OF_AD_ACTION"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Map.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

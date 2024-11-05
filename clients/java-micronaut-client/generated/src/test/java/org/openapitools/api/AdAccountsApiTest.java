package org.openapitools.api;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreateRequest;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.CreateMMMReportRequest;
import org.openapitools.model.CreateMMMReportResponse;
import org.openapitools.model.Error;
import org.openapitools.model.GetMMMReportResponse;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.TemplatesList200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AdAccountsApi
 */
@MicronautTest
public class AdAccountsApiTest {

    @Inject
    AdAccountsApi api;

    
    /**
     * Get ad account analytics
     *
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountAnalyticsTest() {
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
        List<AdAccountAnalyticsResponseInner> body = api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();

        // then
        // TODO implement the adAccountAnalyticsTest()
    }

    
    /**
     * Get targeting analytics for an ad account
     *
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountTargetingAnalyticsGetTest() {
        // given
        String adAccountId = "example";
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
        MetricsResponse body = api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes).block();

        // then
        // TODO implement the adAccountTargetingAnalyticsGetTest()
    }

    
    /**
     * Create ad account
     *
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. &lt;p/&gt; You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/create-an-advertiser-account\&quot;&gt;Create an advertiser account&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsCreateTest() {
        // given
        AdAccountCreateRequest adAccountCreateRequest = new AdAccountCreateRequest();

        // when
        AdAccount body = api.adAccountsCreate(adAccountCreateRequest).block();

        // then
        // TODO implement the adAccountsCreateTest()
    }

    
    /**
     * Get ad account
     *
     * Get an ad account
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsGetTest() {
        // given
        String adAccountId = "example";

        // when
        AdAccount body = api.adAccountsGet(adAccountId).block();

        // then
        // TODO implement the adAccountsGetTest()
    }

    
    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;
        Boolean includeSharedAccounts = true;

        // when
        AdAccountsList200Response body = api.adAccountsList(bookmark, pageSize, includeSharedAccounts).block();

        // then
        // TODO implement the adAccountsListTest()
    }

    
    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     *
     * This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateMmmReportTest() {
        // given
        String adAccountId = "example";
        CreateMMMReportRequest createMMMReportRequest = new CreateMMMReportRequest("example", "2020-12-20", "2020-12-20", "example", "example", Arrays.asList(), Arrays.asList());

        // when
        CreateMMMReportResponse body = api.analyticsCreateMmmReport(adAccountId, createMMMReportRequest).block();

        // then
        // TODO implement the analyticsCreateMmmReportTest()
    }

    
    /**
     * Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateReportTest() {
        // given
        String adAccountId = "example";
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest();

        // when
        AdsAnalyticsCreateAsyncResponse body = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest).block();

        // then
        // TODO implement the analyticsCreateReportTest()
    }

    
    /**
     * Create async request for an analytics report using a template
     *
     * This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateTemplateReportTest() {
        // given
        String adAccountId = "example";
        String templateId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        Granularity granularity = Granularity.fromValue("DAY");

        // when
        AdsAnalyticsCreateAsyncResponse body = api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity).block();

        // then
        // TODO implement the analyticsCreateTemplateReportTest()
    }

    
    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     *
     * Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsGetMmmReportTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        GetMMMReportResponse body = api.analyticsGetMmmReport(adAccountId, token).block();

        // then
        // TODO implement the analyticsGetMmmReportTest()
    }

    
    /**
     * Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsGetReportTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        AdsAnalyticsGetAsyncResponse body = api.analyticsGetReport(adAccountId, token).block();

        // then
        // TODO implement the analyticsGetReportTest()
    }

    
    /**
     * Delete ads data for ad account in API Sandbox
     *
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     */
    @Test
    @Disabled("Not Implemented")
    public void sandboxDeleteTest() {
        // given
        String adAccountId = "example";

        // when
        String body = api.sandboxDelete(adAccountId).block();

        // then
        // TODO implement the sandboxDeleteTest()
    }

    
    /**
     * List templates
     *
     * Gets all Templates associated with an ad account ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void templatesListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        TemplatesList200Response body = api.templatesList(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the templatesListTest()
    }

    
}

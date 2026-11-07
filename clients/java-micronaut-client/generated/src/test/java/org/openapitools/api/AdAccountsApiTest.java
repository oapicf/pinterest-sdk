package org.openapitools.api;

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
     *   Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountAnalyticsTest() {
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
        List<AdAccountAnalyticsItems> body = api.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone).block();

        // then
        // TODO implement the adAccountAnalyticsTest()
    }

    
    /**
     * Get targeting analytics for an ad account
     *
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountTargetingAnalyticsGetTest() {
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
        MetricsResponse body = api.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone).block();

        // then
        // TODO implement the adAccountTargetingAnalyticsGetTest()
    }

    
    /**
     * Create ad account
     *
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsCreateTest() {
        // given
        AdAccountCreate adAccountCreate = new AdAccountCreate();

        // when
        AdAccount body = api.adAccountsCreate(adAccountCreate).block();

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
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     */
    @Test
    @Disabled("Not Implemented")
    public void adAccountsListTest() {
        // given
        Boolean includeSharedAccounts = true;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdAccountsList200Response body = api.adAccountsList(includeSharedAccounts, bookmark, pageSize).block();

        // then
        // TODO implement the adAccountsListTest()
    }

    
    /**
     * Create a request for a brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateConversionProductReportTest() {
        // given
        String adAccountId = "example";
        ConversionProductReportCreate conversionProductReportCreate = new ConversionProductReportCreate(Arrays.asList(), "2024-04-23", org.openapitools.model.ConversionProductReportGranularity.fromValue("TOTAL"), org.openapitools.model.ConversionProductReportLevel.fromValue("ADVERTISER"), "example", "2024-04-17");

        // when
        ConversionProductReport body = api.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate).block();

        // then
        // TODO implement the analyticsCreateConversionProductReportTest()
    }

    
    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     *
     *     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateMmmReportTest() {
        // given
        String adAccountId = "example";
        MMMReportCreate mmMReportCreate = new MMMReportCreate(Arrays.asList(), "2020-12-20", org.openapitools.model.MMMReportGranularity.fromValue("DAY"), org.openapitools.model.MMMReportLevel.fromValue("CAMPAIGN_TARGETING"), "example", "2020-12-20", Arrays.asList());

        // when
        MMMReport body = api.analyticsCreateMmmReport(adAccountId, mmMReportCreate).block();

        // then
        // TODO implement the analyticsCreateMmmReportTest()
    }

    
    /**
     * Create async request for an account analytics report
     *
     *   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateReportTest() {
        // given
        String adAccountId = "example";
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest("example", org.openapitools.model.Granularity.fromValue("TOTAL"), "example");

        // when
        AdsAnalyticsCreateAsyncResponse body = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest).block();

        // then
        // TODO implement the analyticsCreateReportTest()
    }

    
    /**
     * Create async request for an analytics report using a template
     *
     *   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsCreateTemplateReportTest() {
        // given
        String adAccountId = "example";
        String templateId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        Granularity granularity = Granularity.fromValue("TOTAL");

        // when
        TemplateBasedReport body = api.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity).block();

        // then
        // TODO implement the analyticsCreateTemplateReportTest()
    }

    
    /**
     * Get advertiser brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsGetConversionProductReportTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        ConversionProductReport body = api.analyticsGetConversionProductReport(adAccountId, token).block();

        // then
        // TODO implement the analyticsGetConversionProductReportTest()
    }

    
    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     *
     *     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
     */
    @Test
    @Disabled("Not Implemented")
    public void analyticsGetMmmReportTest() {
        // given
        String adAccountId = "example";
        String token = "example";

        // when
        MMMReport body = api.analyticsGetMmmReport(adAccountId, token).block();

        // then
        // TODO implement the analyticsGetMmmReportTest()
    }

    
    /**
     * Get the account analytics report created by the async call
     *
     *   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
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
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");

        // when
        TemplatesList200Response body = api.templatesList(adAccountId, bookmark, pageSize, order).block();

        // then
        // TODO implement the templatesListTest()
    }

    
}

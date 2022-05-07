package org.openapitools.api;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import java.time.LocalDate;
import org.openapitools.model.Paginated;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
     * Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void adAccountAnalyticsTest() {
        String adAccountId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> columns = null;
        Granularity granularity = null;
        Integer clickWindowDays = null;
        Integer engagementWindowDays = null;
        Integer viewWindowDays = null;
        String conversionReportTime = null;
        // List<Map<String, Object>> response = api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();
        // Mono<List<Map<String, Object>>> asyncResponse = api.adAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
        // TODO: test validations
    }

    
    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
     */
    @Test
    public void adAccountsListTest() {
        String bookmark = null;
        Integer pageSize = null;
        Boolean includeSharedAccounts = null;
        // Paginated response = api.adAccountsList(bookmark, pageSize, includeSharedAccounts).block();
        // Mono<Paginated> asyncResponse = api.adAccountsList(bookmark, pageSize, includeSharedAccounts);
        // TODO: test validations
    }

    
    /**
     * Get ad group analytics
     *
     * Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void adGroupsAnalyticsTest() {
        String adAccountId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> adGroupIds = null;
        List<String> columns = null;
        Granularity granularity = null;
        Integer clickWindowDays = null;
        Integer engagementWindowDays = null;
        Integer viewWindowDays = null;
        String conversionReportTime = null;
        // List<Map<String, Object>> response = api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();
        // Mono<List<Map<String, Object>>> asyncResponse = api.adGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
        // TODO: test validations
    }

    
    /**
     * List ad groups
     *
     * Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void adGroupsListTest() {
        String adAccountId = null;
        List<String> campaignIds = null;
        List<String> adGroupIds = null;
        List<String> entityStatuses = null;
        Integer pageSize = null;
        String order = null;
        String bookmark = null;
        Boolean translateInterestsToNames = null;
        // Paginated response = api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames).block();
        // Mono<Paginated> asyncResponse = api.adGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames);
        // TODO: test validations
    }

    
    /**
     * Get ad analytics
     *
     * Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void adsAnalyticsTest() {
        String adAccountId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> adIds = null;
        List<String> columns = null;
        Granularity granularity = null;
        Integer clickWindowDays = null;
        Integer engagementWindowDays = null;
        Integer viewWindowDays = null;
        String conversionReportTime = null;
        // List<Map<String, Object>> response = api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();
        // Mono<List<Map<String, Object>>> asyncResponse = api.adsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
        // TODO: test validations
    }

    
    /**
     * List ads
     *
     * Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void adsListTest() {
        String adAccountId = null;
        List<String> campaignIds = null;
        List<String> adGroupIds = null;
        List<String> adIds = null;
        List<String> entityStatuses = null;
        Integer pageSize = null;
        String order = null;
        String bookmark = null;
        // Paginated response = api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark).block();
        // Mono<Paginated> asyncResponse = api.adsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);
        // TODO: test validations
    }

    
    /**
     * Create async request for an account analytics report
     *
     * This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void analyticsCreateReportTest() {
        String adAccountId = null;
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = null;
        // AdsAnalyticsCreateAsyncResponse response = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest).block();
        // Mono<AdsAnalyticsCreateAsyncResponse> asyncResponse = api.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest);
        // TODO: test validations
    }

    
    /**
     * Get the account analytics report created by the async call
     *
     * This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void analyticsGetReportTest() {
        String adAccountId = null;
        String token = null;
        // AdsAnalyticsGetAsyncResponse response = api.analyticsGetReport(adAccountId, token).block();
        // Mono<AdsAnalyticsGetAsyncResponse> asyncResponse = api.analyticsGetReport(adAccountId, token);
        // TODO: test validations
    }

    
    /**
     * Get campaign analytics
     *
     * Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void campaignsAnalyticsTest() {
        String adAccountId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> campaignIds = null;
        List<String> columns = null;
        Granularity granularity = null;
        Integer clickWindowDays = null;
        Integer engagementWindowDays = null;
        Integer viewWindowDays = null;
        String conversionReportTime = null;
        // List<Map<String, Object>> response = api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();
        // Mono<List<Map<String, Object>>> asyncResponse = api.campaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
        // TODO: test validations
    }

    
    /**
     * List campaigns
     *
     * Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void campaignsListTest() {
        String adAccountId = null;
        List<String> campaignIds = null;
        List<String> entityStatuses = null;
        Integer pageSize = null;
        String order = null;
        String bookmark = null;
        // Paginated response = api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark).block();
        // Mono<Paginated> asyncResponse = api.campaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark);
        // TODO: test validations
    }

    
    /**
     * Get product group analytics
     *
     * Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
     */
    @Test
    public void productGroupsAnalyticsTest() {
        String adAccountId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> productGroupIds = null;
        List<String> columns = null;
        Granularity granularity = null;
        Integer clickWindowDays = null;
        Integer engagementWindowDays = null;
        Integer viewWindowDays = null;
        String conversionReportTime = null;
        // List<Map<String, Object>> response = api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime).block();
        // Mono<List<Map<String, Object>>> asyncResponse = api.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
        // TODO: test validations
    }

    
}

using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAdAccountsApi
    {
        /// <summary>
        /// Get ad account analytics Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        List<Dictionary<string, Object>> AdAccountAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime);
        /// <summary>
        /// List ad accounts Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="includeSharedAccounts">Include shared ad accounts</param>
        /// <returns>Paginated</returns>
        Paginated AdAccountsList (string bookmark, int? pageSize, bool? includeSharedAccounts);
        /// <summary>
        /// Get ad group analytics Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        List<Dictionary<string, Object>> AdGroupsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> adGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime);
        /// <summary>
        /// List ad groups Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="translateInterestsToNames">Return interests as text names (if value is true) rather than topic IDs.</param>
        /// <returns>Paginated</returns>
        Paginated AdGroupsList (string adAccountId, List<string> campaignIds, List<string> adGroupIds, List<string> entityStatuses, int? pageSize, string order, string bookmark, bool? translateInterestsToNames);
        /// <summary>
        /// Get ad analytics Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="adIds">List of Ad Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        List<Dictionary<string, Object>> AdsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> adIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime);
        /// <summary>
        /// List ads Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="adIds">List of Ad Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <returns>Paginated</returns>
        Paginated AdsList (string adAccountId, List<string> campaignIds, List<string> adGroupIds, List<string> adIds, List<string> entityStatuses, int? pageSize, string order, string bookmark);
        /// <summary>
        /// Create async request for an account analytics report This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="adsAnalyticsCreateAsyncRequest"></param>
        /// <returns>AdsAnalyticsCreateAsyncResponse</returns>
        AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport (string adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest);
        /// <summary>
        /// Get the account analytics report created by the async call This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="token">Token returned from the post request creation call</param>
        /// <returns>AdsAnalyticsGetAsyncResponse</returns>
        AdsAnalyticsGetAsyncResponse AnalyticsGetReport (string adAccountId, string token);
        /// <summary>
        /// Get campaign analytics Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        List<Dictionary<string, Object>> CampaignsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> campaignIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime);
        /// <summary>
        /// List campaigns Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <returns>Paginated</returns>
        Paginated CampaignsList (string adAccountId, List<string> campaignIds, List<string> entityStatuses, int? pageSize, string order, string bookmark);
        /// <summary>
        /// Get product group analytics Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="productGroupIds">List of Product group Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        List<Dictionary<string, Object>> ProductGroupsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> productGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AdAccountsApi : IAdAccountsApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdAccountsApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public AdAccountsApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AdAccountsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AdAccountsApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        /// Get ad account analytics Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        public List<Dictionary<string, Object>> AdAccountAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AdAccountAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling AdAccountAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling AdAccountAnalytics");
            
            // verify the required parameter 'columns' is set
            if (columns == null) throw new ApiException(400, "Missing required parameter 'columns' when calling AdAccountAnalytics");
            
            // verify the required parameter 'granularity' is set
            if (granularity == null) throw new ApiException(400, "Missing required parameter 'granularity' when calling AdAccountAnalytics");
            

            var path = "/ad_accounts/{ad_account_id}/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
 if (granularity != null) queryParams.Add("granularity", ApiClient.ParameterToString(granularity)); // query parameter
 if (clickWindowDays != null) queryParams.Add("click_window_days", ApiClient.ParameterToString(clickWindowDays)); // query parameter
 if (engagementWindowDays != null) queryParams.Add("engagement_window_days", ApiClient.ParameterToString(engagementWindowDays)); // query parameter
 if (viewWindowDays != null) queryParams.Add("view_window_days", ApiClient.ParameterToString(viewWindowDays)); // query parameter
 if (conversionReportTime != null) queryParams.Add("conversion_report_time", ApiClient.ParameterToString(conversionReportTime)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdAccountAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdAccountAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (List<Dictionary<string, Object>>) ApiClient.Deserialize(response.Content, typeof(List<Dictionary<string, Object>>), response.Headers);
        }

        /// <summary>
        /// List ad accounts Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
        /// </summary>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="includeSharedAccounts">Include shared ad accounts</param>
        /// <returns>Paginated</returns>
        public Paginated AdAccountsList (string bookmark, int? pageSize, bool? includeSharedAccounts)
        {
            

            var path = "/ad_accounts";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
 if (includeSharedAccounts != null) queryParams.Add("include_shared_accounts", ApiClient.ParameterToString(includeSharedAccounts)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdAccountsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdAccountsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Get ad group analytics Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        public List<Dictionary<string, Object>> AdGroupsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> adGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AdGroupsAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling AdGroupsAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling AdGroupsAnalytics");
            
            // verify the required parameter 'adGroupIds' is set
            if (adGroupIds == null) throw new ApiException(400, "Missing required parameter 'adGroupIds' when calling AdGroupsAnalytics");
            
            // verify the required parameter 'columns' is set
            if (columns == null) throw new ApiException(400, "Missing required parameter 'columns' when calling AdGroupsAnalytics");
            
            // verify the required parameter 'granularity' is set
            if (granularity == null) throw new ApiException(400, "Missing required parameter 'granularity' when calling AdGroupsAnalytics");
            

            var path = "/ad_accounts/{ad_account_id}/ad_groups/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (adGroupIds != null) queryParams.Add("ad_group_ids", ApiClient.ParameterToString(adGroupIds)); // query parameter
 if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
 if (granularity != null) queryParams.Add("granularity", ApiClient.ParameterToString(granularity)); // query parameter
 if (clickWindowDays != null) queryParams.Add("click_window_days", ApiClient.ParameterToString(clickWindowDays)); // query parameter
 if (engagementWindowDays != null) queryParams.Add("engagement_window_days", ApiClient.ParameterToString(engagementWindowDays)); // query parameter
 if (viewWindowDays != null) queryParams.Add("view_window_days", ApiClient.ParameterToString(viewWindowDays)); // query parameter
 if (conversionReportTime != null) queryParams.Add("conversion_report_time", ApiClient.ParameterToString(conversionReportTime)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdGroupsAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdGroupsAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (List<Dictionary<string, Object>>) ApiClient.Deserialize(response.Content, typeof(List<Dictionary<string, Object>>), response.Headers);
        }

        /// <summary>
        /// List ad groups Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <param name="translateInterestsToNames">Return interests as text names (if value is true) rather than topic IDs.</param>
        /// <returns>Paginated</returns>
        public Paginated AdGroupsList (string adAccountId, List<string> campaignIds, List<string> adGroupIds, List<string> entityStatuses, int? pageSize, string order, string bookmark, bool? translateInterestsToNames)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AdGroupsList");
            

            var path = "/ad_accounts/{ad_account_id}/ad_groups";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (campaignIds != null) queryParams.Add("campaign_ids", ApiClient.ParameterToString(campaignIds)); // query parameter
 if (adGroupIds != null) queryParams.Add("ad_group_ids", ApiClient.ParameterToString(adGroupIds)); // query parameter
 if (entityStatuses != null) queryParams.Add("entity_statuses", ApiClient.ParameterToString(entityStatuses)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
 if (order != null) queryParams.Add("order", ApiClient.ParameterToString(order)); // query parameter
 if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
 if (translateInterestsToNames != null) queryParams.Add("translate_interests_to_names", ApiClient.ParameterToString(translateInterestsToNames)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdGroupsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdGroupsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Get ad analytics Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="adIds">List of Ad Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        public List<Dictionary<string, Object>> AdsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> adIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AdsAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling AdsAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling AdsAnalytics");
            
            // verify the required parameter 'adIds' is set
            if (adIds == null) throw new ApiException(400, "Missing required parameter 'adIds' when calling AdsAnalytics");
            
            // verify the required parameter 'columns' is set
            if (columns == null) throw new ApiException(400, "Missing required parameter 'columns' when calling AdsAnalytics");
            
            // verify the required parameter 'granularity' is set
            if (granularity == null) throw new ApiException(400, "Missing required parameter 'granularity' when calling AdsAnalytics");
            

            var path = "/ad_accounts/{ad_account_id}/ads/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (adIds != null) queryParams.Add("ad_ids", ApiClient.ParameterToString(adIds)); // query parameter
 if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
 if (granularity != null) queryParams.Add("granularity", ApiClient.ParameterToString(granularity)); // query parameter
 if (clickWindowDays != null) queryParams.Add("click_window_days", ApiClient.ParameterToString(clickWindowDays)); // query parameter
 if (engagementWindowDays != null) queryParams.Add("engagement_window_days", ApiClient.ParameterToString(engagementWindowDays)); // query parameter
 if (viewWindowDays != null) queryParams.Add("view_window_days", ApiClient.ParameterToString(viewWindowDays)); // query parameter
 if (conversionReportTime != null) queryParams.Add("conversion_report_time", ApiClient.ParameterToString(conversionReportTime)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdsAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdsAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (List<Dictionary<string, Object>>) ApiClient.Deserialize(response.Content, typeof(List<Dictionary<string, Object>>), response.Headers);
        }

        /// <summary>
        /// List ads Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="adGroupIds">List of Ad group Ids to use to filter the results.</param>
        /// <param name="adIds">List of Ad Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <returns>Paginated</returns>
        public Paginated AdsList (string adAccountId, List<string> campaignIds, List<string> adGroupIds, List<string> adIds, List<string> entityStatuses, int? pageSize, string order, string bookmark)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AdsList");
            

            var path = "/ad_accounts/{ad_account_id}/ads";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (campaignIds != null) queryParams.Add("campaign_ids", ApiClient.ParameterToString(campaignIds)); // query parameter
 if (adGroupIds != null) queryParams.Add("ad_group_ids", ApiClient.ParameterToString(adGroupIds)); // query parameter
 if (adIds != null) queryParams.Add("ad_ids", ApiClient.ParameterToString(adIds)); // query parameter
 if (entityStatuses != null) queryParams.Add("entity_statuses", ApiClient.ParameterToString(entityStatuses)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
 if (order != null) queryParams.Add("order", ApiClient.ParameterToString(order)); // query parameter
 if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AdsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AdsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Create async request for an account analytics report This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="adsAnalyticsCreateAsyncRequest"></param>
        /// <returns>AdsAnalyticsCreateAsyncResponse</returns>
        public AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport (string adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AnalyticsCreateReport");
            
            // verify the required parameter 'adsAnalyticsCreateAsyncRequest' is set
            if (adsAnalyticsCreateAsyncRequest == null) throw new ApiException(400, "Missing required parameter 'adsAnalyticsCreateAsyncRequest' when calling AnalyticsCreateReport");
            

            var path = "/ad_accounts/{ad_account_id}/reports";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                postBody = ApiClient.Serialize(adsAnalyticsCreateAsyncRequest); // http body (model) parameter

            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AnalyticsCreateReport: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AnalyticsCreateReport: " + response.ErrorMessage, response.ErrorMessage);

            return (AdsAnalyticsCreateAsyncResponse) ApiClient.Deserialize(response.Content, typeof(AdsAnalyticsCreateAsyncResponse), response.Headers);
        }

        /// <summary>
        /// Get the account analytics report created by the async call This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="token">Token returned from the post request creation call</param>
        /// <returns>AdsAnalyticsGetAsyncResponse</returns>
        public AdsAnalyticsGetAsyncResponse AnalyticsGetReport (string adAccountId, string token)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling AnalyticsGetReport");
            
            // verify the required parameter 'token' is set
            if (token == null) throw new ApiException(400, "Missing required parameter 'token' when calling AnalyticsGetReport");
            

            var path = "/ad_accounts/{ad_account_id}/reports";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (token != null) queryParams.Add("token", ApiClient.ParameterToString(token)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling AnalyticsGetReport: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling AnalyticsGetReport: " + response.ErrorMessage, response.ErrorMessage);

            return (AdsAnalyticsGetAsyncResponse) ApiClient.Deserialize(response.Content, typeof(AdsAnalyticsGetAsyncResponse), response.Headers);
        }

        /// <summary>
        /// Get campaign analytics Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        public List<Dictionary<string, Object>> CampaignsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> campaignIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling CampaignsAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling CampaignsAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling CampaignsAnalytics");
            
            // verify the required parameter 'campaignIds' is set
            if (campaignIds == null) throw new ApiException(400, "Missing required parameter 'campaignIds' when calling CampaignsAnalytics");
            
            // verify the required parameter 'columns' is set
            if (columns == null) throw new ApiException(400, "Missing required parameter 'columns' when calling CampaignsAnalytics");
            
            // verify the required parameter 'granularity' is set
            if (granularity == null) throw new ApiException(400, "Missing required parameter 'granularity' when calling CampaignsAnalytics");
            

            var path = "/ad_accounts/{ad_account_id}/campaigns/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (campaignIds != null) queryParams.Add("campaign_ids", ApiClient.ParameterToString(campaignIds)); // query parameter
 if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
 if (granularity != null) queryParams.Add("granularity", ApiClient.ParameterToString(granularity)); // query parameter
 if (clickWindowDays != null) queryParams.Add("click_window_days", ApiClient.ParameterToString(clickWindowDays)); // query parameter
 if (engagementWindowDays != null) queryParams.Add("engagement_window_days", ApiClient.ParameterToString(engagementWindowDays)); // query parameter
 if (viewWindowDays != null) queryParams.Add("view_window_days", ApiClient.ParameterToString(viewWindowDays)); // query parameter
 if (conversionReportTime != null) queryParams.Add("conversion_report_time", ApiClient.ParameterToString(conversionReportTime)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CampaignsAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CampaignsAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (List<Dictionary<string, Object>>) ApiClient.Deserialize(response.Content, typeof(List<Dictionary<string, Object>>), response.Headers);
        }

        /// <summary>
        /// List campaigns Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="campaignIds">List of Campaign Ids to use to filter the results.</param>
        /// <param name="entityStatuses">Entity status</param>
        /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.</param>
        /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</param>
        /// <param name="bookmark">Cursor used to fetch the next page of items</param>
        /// <returns>Paginated</returns>
        public Paginated CampaignsList (string adAccountId, List<string> campaignIds, List<string> entityStatuses, int? pageSize, string order, string bookmark)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling CampaignsList");
            

            var path = "/ad_accounts/{ad_account_id}/campaigns";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (campaignIds != null) queryParams.Add("campaign_ids", ApiClient.ParameterToString(campaignIds)); // query parameter
 if (entityStatuses != null) queryParams.Add("entity_statuses", ApiClient.ParameterToString(entityStatuses)); // query parameter
 if (pageSize != null) queryParams.Add("page_size", ApiClient.ParameterToString(pageSize)); // query parameter
 if (order != null) queryParams.Add("order", ApiClient.ParameterToString(order)); // query parameter
 if (bookmark != null) queryParams.Add("bookmark", ApiClient.ParameterToString(bookmark)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling CampaignsList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling CampaignsList: " + response.ErrorMessage, response.ErrorMessage);

            return (Paginated) ApiClient.Deserialize(response.Content, typeof(Paginated), response.Headers);
        }

        /// <summary>
        /// Get product group analytics Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
        /// </summary>
        /// <param name="adAccountId">Unique identifier of an ad account.</param>
        /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD</param>
        /// <param name="productGroupIds">List of Product group Ids to use to filter the results.</param>
        /// <param name="columns">Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
        /// <param name="granularity">Granularity</param>
        /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.</param>
        /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.</param>
        /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</param>
        /// <returns>List&lt;Dictionary&lt;string, Object&gt;&gt;</returns>
        public List<Dictionary<string, Object>> ProductGroupsAnalytics (string adAccountId, DateTime? startDate, DateTime? endDate, List<string> productGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays, int? engagementWindowDays, int? viewWindowDays, string conversionReportTime)
        {
            
            // verify the required parameter 'adAccountId' is set
            if (adAccountId == null) throw new ApiException(400, "Missing required parameter 'adAccountId' when calling ProductGroupsAnalytics");
            
            // verify the required parameter 'startDate' is set
            if (startDate == null) throw new ApiException(400, "Missing required parameter 'startDate' when calling ProductGroupsAnalytics");
            
            // verify the required parameter 'endDate' is set
            if (endDate == null) throw new ApiException(400, "Missing required parameter 'endDate' when calling ProductGroupsAnalytics");
            
            // verify the required parameter 'productGroupIds' is set
            if (productGroupIds == null) throw new ApiException(400, "Missing required parameter 'productGroupIds' when calling ProductGroupsAnalytics");
            
            // verify the required parameter 'columns' is set
            if (columns == null) throw new ApiException(400, "Missing required parameter 'columns' when calling ProductGroupsAnalytics");
            
            // verify the required parameter 'granularity' is set
            if (granularity == null) throw new ApiException(400, "Missing required parameter 'granularity' when calling ProductGroupsAnalytics");
            

            var path = "/ad_accounts/{ad_account_id}/product_groups/analytics";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "ad_account_id" + "}", ApiClient.ParameterToString(adAccountId));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (startDate != null) queryParams.Add("start_date", ApiClient.ParameterToString(startDate)); // query parameter
 if (endDate != null) queryParams.Add("end_date", ApiClient.ParameterToString(endDate)); // query parameter
 if (productGroupIds != null) queryParams.Add("product_group_ids", ApiClient.ParameterToString(productGroupIds)); // query parameter
 if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
 if (granularity != null) queryParams.Add("granularity", ApiClient.ParameterToString(granularity)); // query parameter
 if (clickWindowDays != null) queryParams.Add("click_window_days", ApiClient.ParameterToString(clickWindowDays)); // query parameter
 if (engagementWindowDays != null) queryParams.Add("engagement_window_days", ApiClient.ParameterToString(engagementWindowDays)); // query parameter
 if (viewWindowDays != null) queryParams.Add("view_window_days", ApiClient.ParameterToString(viewWindowDays)); // query parameter
 if (conversionReportTime != null) queryParams.Add("conversion_report_time", ApiClient.ParameterToString(conversionReportTime)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] { "pinterest_oauth2" };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling ProductGroupsAnalytics: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling ProductGroupsAnalytics: " + response.ErrorMessage, response.ErrorMessage);

            return (List<Dictionary<string, Object>>) ApiClient.Deserialize(response.Content, typeof(List<Dictionary<string, Object>>), response.Headers);
        }

    }
}

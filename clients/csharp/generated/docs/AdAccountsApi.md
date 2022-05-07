# Org.OpenAPITools.Api.AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountAnalytics**](AdAccountsApi.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**AdAccountsList**](AdAccountsApi.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
[**AdGroupsAnalytics**](AdAccountsApi.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsList**](AdAccountsApi.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdsAnalytics**](AdAccountsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsList**](AdAccountsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**AnalyticsCreateReport**](AdAccountsApi.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**AnalyticsGetReport**](AdAccountsApi.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**CampaignsAnalytics**](AdAccountsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsList**](AdAccountsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**ProductGroupsAnalytics**](AdAccountsApi.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## AdAccountAnalytics

> List&lt;Dictionary&lt;string, Object&gt;&gt; AdAccountAnalytics (string adAccountId, DateTime startDate, DateTime endDate, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string conversionReportTime = null)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdAccountAnalyticsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
            var columns = new List<string>(); // List<string> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = DAY;  // Granularity | Granularity
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get ad account analytics
                List<Dictionary<string, Object>> result = apiInstance.AdAccountAnalytics(adAccountId, startDate, endDate, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdAccountAnalytics: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **startDate** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**List&lt;string&gt;**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | **Granularity**| Granularity | 
 **clickWindowDays** | **int?**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int?**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int?**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**List<Dictionary<string, Object>>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdAccountsList

> Paginated AdAccountsList (string bookmark = null, int? pageSize = null, bool? includeSharedAccounts = null)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdAccountsListExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)
            var includeSharedAccounts = true;  // bool? | Include shared ad accounts (optional)  (default to true)

            try
            {
                // List ad accounts
                Paginated result = apiInstance.AdAccountsList(bookmark, pageSize, includeSharedAccounts);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdAccountsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **bool?**| Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsAnalytics

> List&lt;Dictionary&lt;string, Object&gt;&gt; AdGroupsAnalytics (string adAccountId, DateTime startDate, DateTime endDate, List<string> adGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string conversionReportTime = null)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdGroupsAnalyticsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
            var adGroupIds = new List<string>(); // List<string> | List of Ad group Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = DAY;  // Granularity | Granularity
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get ad group analytics
                List<Dictionary<string, Object>> result = apiInstance.AdGroupsAnalytics(adAccountId, startDate, endDate, adGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdGroupsAnalytics: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **startDate** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adGroupIds** | [**List&lt;string&gt;**](string.md)| List of Ad group Ids to use to filter the results. | 
 **columns** | [**List&lt;string&gt;**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | **Granularity**| Granularity | 
 **clickWindowDays** | **int?**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int?**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int?**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**List<Dictionary<string, Object>>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account group analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdGroupsList

> Paginated AdGroupsList (string adAccountId, List<string> campaignIds = null, List<string> adGroupIds = null, List<string> entityStatuses = null, int? pageSize = null, string order = null, string bookmark = null, bool? translateInterestsToNames = null)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdGroupsListExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results. (optional) 
            var adGroupIds = new List<string>(); // List<string> | List of Ad group Ids to use to filter the results. (optional) 
            var entityStatuses = new List<string>(); // List<string> | Entity status (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)
            var order = ASCENDING;  // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var translateInterestsToNames = false;  // bool? | Return interests as text names (if value is true) rather than topic IDs. (optional)  (default to false)

            try
            {
                // List ad groups
                Paginated result = apiInstance.AdGroupsList(adAccountId, campaignIds, adGroupIds, entityStatuses, pageSize, order, bookmark, translateInterestsToNames);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdGroupsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **campaignIds** | [**List&lt;string&gt;**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**List&lt;string&gt;**](string.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**List&lt;string&gt;**](string.md)| Entity status | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **translateInterestsToNames** | **bool?**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account group parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsAnalytics

> List&lt;Dictionary&lt;string, Object&gt;&gt; AdsAnalytics (string adAccountId, DateTime startDate, DateTime endDate, List<string> adIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string conversionReportTime = null)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdsAnalyticsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
            var adIds = new List<string>(); // List<string> | List of Ad Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = DAY;  // Granularity | Granularity
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get ad analytics
                List<Dictionary<string, Object>> result = apiInstance.AdsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdsAnalytics: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **startDate** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adIds** | [**List&lt;string&gt;**](string.md)| List of Ad Ids to use to filter the results. | 
 **columns** | [**List&lt;string&gt;**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | **Granularity**| Granularity | 
 **clickWindowDays** | **int?**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int?**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int?**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**List<Dictionary<string, Object>>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AdsList

> Paginated AdsList (string adAccountId, List<string> campaignIds = null, List<string> adGroupIds = null, List<string> adIds = null, List<string> entityStatuses = null, int? pageSize = null, string order = null, string bookmark = null)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdsListExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results. (optional) 
            var adGroupIds = new List<string>(); // List<string> | List of Ad group Ids to use to filter the results. (optional) 
            var adIds = new List<string>(); // List<string> | List of Ad Ids to use to filter the results. (optional) 
            var entityStatuses = new List<string>(); // List<string> | Entity status (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)
            var order = ASCENDING;  // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List ads
                Paginated result = apiInstance.AdsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AdsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **campaignIds** | [**List&lt;string&gt;**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**List&lt;string&gt;**](string.md)| List of Ad group Ids to use to filter the results. | [optional] 
 **adIds** | [**List&lt;string&gt;**](string.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**List&lt;string&gt;**](string.md)| Entity status | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsCreateReport

> AdsAnalyticsCreateAsyncResponse AnalyticsCreateReport (string adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AnalyticsCreateReportExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest(); // AdsAnalyticsCreateAsyncRequest | 

            try
            {
                // Create async request for an account analytics report
                AdsAnalyticsCreateAsyncResponse result = apiInstance.AnalyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AnalyticsCreateReport: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AnalyticsGetReport

> AdsAnalyticsGetAsyncResponse AnalyticsGetReport (string adAccountId, string token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AnalyticsGetReportExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var token = "token_example";  // string | Token returned from the post request creation call

            try
            {
                // Get the account analytics report created by the async call
                AdsAnalyticsGetAsyncResponse result = apiInstance.AnalyticsGetReport(adAccountId, token);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.AnalyticsGetReport: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **token** | **string**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsAnalytics

> List&lt;Dictionary&lt;string, Object&gt;&gt; CampaignsAnalytics (string adAccountId, DateTime startDate, DateTime endDate, List<string> campaignIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string conversionReportTime = null)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsAnalyticsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = DAY;  // Granularity | Granularity
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get campaign analytics
                List<Dictionary<string, Object>> result = apiInstance.CampaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.CampaignsAnalytics: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **startDate** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaignIds** | [**List&lt;string&gt;**](string.md)| List of Campaign Ids to use to filter the results. | 
 **columns** | [**List&lt;string&gt;**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | **Granularity**| Granularity | 
 **clickWindowDays** | **int?**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int?**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int?**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**List<Dictionary<string, Object>>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CampaignsList

> Paginated CampaignsList (string adAccountId, List<string> campaignIds = null, List<string> entityStatuses = null, int? pageSize = null, string order = null, string bookmark = null)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsListExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results. (optional) 
            var entityStatuses = new List<string>(); // List<string> | Entity status (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)
            var order = ASCENDING;  // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List campaigns
                Paginated result = apiInstance.CampaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.CampaignsList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **campaignIds** | [**List&lt;string&gt;**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**List&lt;string&gt;**](string.md)| Entity status | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account campaign parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupsAnalytics

> List&lt;Dictionary&lt;string, Object&gt;&gt; ProductGroupsAnalytics (string adAccountId, DateTime startDate, DateTime endDate, List<string> productGroupIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string conversionReportTime = null)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ProductGroupsAnalyticsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdAccountsApi(Configuration.Default);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
            var productGroupIds = new List<string>(); // List<string> | List of Product group Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = DAY;  // Granularity | Granularity
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get product group analytics
                List<Dictionary<string, Object>> result = apiInstance.ProductGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdAccountsApi.ProductGroupsAnalytics: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | 
 **startDate** | **DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD | 
 **productGroupIds** | [**List&lt;string&gt;**](string.md)| List of Product group Ids to use to filter the results. | 
 **columns** | [**List&lt;string&gt;**](string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | **Granularity**| Granularity | 
 **clickWindowDays** | **int?**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int?**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int?**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

**List<Dictionary<string, Object>>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


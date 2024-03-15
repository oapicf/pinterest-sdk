# Org.OpenAPITools.Api.CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CampaignTargetingAnalyticsGet**](CampaignsApi.md#campaigntargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**CampaignsAnalytics**](CampaignsApi.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**CampaignsCreate**](CampaignsApi.md#campaignscreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**CampaignsGet**](CampaignsApi.md#campaignsget) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**CampaignsList**](CampaignsApi.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**CampaignsUpdate**](CampaignsApi.md#campaignsupdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |

<a id="campaigntargetinganalyticsget"></a>
# **CampaignTargetingAnalyticsGet**
> MetricsResponse CampaignTargetingAnalyticsGet (string adAccountId, List<string> campaignIds, DateOnly startDate, DateOnly endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string? conversionReportTime = null, ConversionReportAttributionType? attributionTypes = null)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignTargetingAnalyticsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results.
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var targetingTypes = new List<AdsAnalyticsTargetingType>(); // List<AdsAnalyticsTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
            var columns = new List<string>(); // List<string> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = new Granularity(); // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string? | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)
            var attributionTypes = new ConversionReportAttributionType?(); // ConversionReportAttributionType? | List of types of attribution for the conversion report (optional) 

            try
            {
                // Get targeting analytics for campaigns
                MetricsResponse result = apiInstance.CampaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignTargetingAnalyticsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignTargetingAnalyticsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get targeting analytics for campaigns
    ApiResponse<MetricsResponse> response = apiInstance.CampaignTargetingAnalyticsGetWithHttpInfo(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignTargetingAnalyticsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignIds** | [**List&lt;string&gt;**](string.md) | List of Campaign Ids to use to filter the results. |  |
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **targetingTypes** | [**List&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. |  |
| **columns** | [**List&lt;string&gt;**](string.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **clickWindowDays** | **int?** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagementWindowDays** | **int?** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **viewWindowDays** | **int?** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversionReportTime** | **string?** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] |
| **attributionTypes** | [**ConversionReportAttributionType?**](ConversionReportAttributionType?.md) | List of types of attribution for the conversion report | [optional]  |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignsanalytics"></a>
# **CampaignsAnalytics**
> List&lt;CampaignsAnalyticsResponseInner&gt; CampaignsAnalytics (string adAccountId, DateOnly startDate, DateOnly endDate, List<string> campaignIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string? conversionReportTime = null)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var campaignIds = new List<string>(); // List<string> | List of Campaign Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = new Granularity(); // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string? | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get campaign analytics
                List<CampaignsAnalyticsResponseInner> result = apiInstance.CampaignsAnalytics(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsAnalytics: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsAnalyticsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get campaign analytics
    ApiResponse<List<CampaignsAnalyticsResponseInner>> response = apiInstance.CampaignsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsAnalyticsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **campaignIds** | [**List&lt;string&gt;**](string.md) | List of Campaign Ids to use to filter the results. |  |
| **columns** | [**List&lt;string&gt;**](string.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **clickWindowDays** | **int?** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagementWindowDays** | **int?** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **viewWindowDays** | **int?** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversionReportTime** | **string?** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] |

### Return type

[**List&lt;CampaignsAnalyticsResponseInner&gt;**](CampaignsAnalyticsResponseInner.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignscreate"></a>
# **CampaignsCreate**
> CampaignCreateResponse CampaignsCreate (string adAccountId, List<CampaignCreateRequest> campaignCreateRequest)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignCreateRequest = new List<CampaignCreateRequest>(); // List<CampaignCreateRequest> | Array of campaigns.

            try
            {
                // Create campaigns
                CampaignCreateResponse result = apiInstance.CampaignsCreate(adAccountId, campaignCreateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create campaigns
    ApiResponse<CampaignCreateResponse> response = apiInstance.CampaignsCreateWithHttpInfo(adAccountId, campaignCreateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignCreateRequest** | [**List&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) | Array of campaigns. |  |

### Return type

[**CampaignCreateResponse**](CampaignCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignsget"></a>
# **CampaignsGet**
> CampaignResponse CampaignsGet (string adAccountId, string campaignId)

Get campaign

Get a specific campaign given the campaign ID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignId = "campaignId_example";  // string | Campaign ID, must be associated with the ad account ID provided in the path.

            try
            {
                // Get campaign
                CampaignResponse result = apiInstance.CampaignsGet(adAccountId, campaignId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get campaign
    ApiResponse<CampaignResponse> response = apiInstance.CampaignsGetWithHttpInfo(adAccountId, campaignId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignId** | **string** | Campaign ID, must be associated with the ad account ID provided in the path. |  |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignslist"></a>
# **CampaignsList**
> CampaignsList200Response CampaignsList (string adAccountId, List<string>? campaignIds = null, List<string>? entityStatuses = null, int? pageSize = null, string? order = null, string? bookmark = null)

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
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>?(); // List<string>? | List of Campaign Ids to use to filter the results. (optional) 
            var entityStatuses = new List<string>?(); // List<string>? | Entity status (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var order = ASCENDING;  // string? | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List campaigns
                CampaignsList200Response result = apiInstance.CampaignsList(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List campaigns
    ApiResponse<CampaignsList200Response> response = apiInstance.CampaignsListWithHttpInfo(adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignIds** | [**List&lt;string&gt;?**](string.md) | List of Campaign Ids to use to filter the results. | [optional]  |
| **entityStatuses** | [**List&lt;string&gt;?**](string.md) | Entity status | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **string?** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignsupdate"></a>
# **CampaignsUpdate**
> CampaignUpdateResponse CampaignsUpdate (string adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest)

Update campaigns

Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - <p>The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CampaignsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignUpdateRequest = new List<CampaignUpdateRequest>(); // List<CampaignUpdateRequest> | Array of campaigns.

            try
            {
                // Update campaigns
                CampaignUpdateResponse result = apiInstance.CampaignsUpdate(adAccountId, campaignUpdateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update campaigns
    ApiResponse<CampaignUpdateResponse> response = apiInstance.CampaignsUpdateWithHttpInfo(adAccountId, campaignUpdateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignUpdateRequest** | [**List&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) | Array of campaigns. |  |

### Return type

[**CampaignUpdateResponse**](CampaignUpdateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


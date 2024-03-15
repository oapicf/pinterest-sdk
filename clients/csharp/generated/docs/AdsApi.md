# Org.OpenAPITools.Api.AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdPreviewsCreate**](AdsApi.md#adpreviewscreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**AdTargetingAnalyticsGet**](AdsApi.md#adtargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**AdsAnalytics**](AdsApi.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**AdsCreate**](AdsApi.md#adscreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**AdsGet**](AdsApi.md#adsget) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**AdsList**](AdsApi.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**AdsUpdate**](AdsApi.md#adsupdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |

<a id="adpreviewscreate"></a>
# **AdPreviewsCreate**
> AdPreviewURLResponse AdPreviewsCreate (string adAccountId, AdPreviewRequest adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdPreviewsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adPreviewRequest = new AdPreviewRequest(); // AdPreviewRequest | Create ad preview with pin or image.

            try
            {
                // Create ad preview with pin or image
                AdPreviewURLResponse result = apiInstance.AdPreviewsCreate(adAccountId, adPreviewRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdPreviewsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdPreviewsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create ad preview with pin or image
    ApiResponse<AdPreviewURLResponse> response = apiInstance.AdPreviewsCreateWithHttpInfo(adAccountId, adPreviewRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdPreviewsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md) | Create ad preview with pin or image. |  |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful ad preview creation. |  -  |
| **400** | Invalid Pin parameters response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="adtargetinganalyticsget"></a>
# **AdTargetingAnalyticsGet**
> MetricsResponse AdTargetingAnalyticsGet (string adAccountId, List<string> adIds, DateOnly startDate, DateOnly endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string? conversionReportTime = null, ConversionReportAttributionType? attributionTypes = null)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdTargetingAnalyticsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adIds = new List<string>(); // List<string> | List of Ad Ids to use to filter the results.
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
                // Get targeting analytics for ads
                MetricsResponse result = apiInstance.AdTargetingAnalyticsGet(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdTargetingAnalyticsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdTargetingAnalyticsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get targeting analytics for ads
    ApiResponse<MetricsResponse> response = apiInstance.AdTargetingAnalyticsGetWithHttpInfo(adAccountId, adIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdTargetingAnalyticsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **adIds** | [**List&lt;string&gt;**](string.md) | List of Ad Ids to use to filter the results. |  |
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

<a id="adsanalytics"></a>
# **AdsAnalytics**
> List&lt;AdsAnalyticsResponseInner&gt; AdsAnalytics (string adAccountId, DateOnly startDate, DateOnly endDate, List<string> adIds, List<string> columns, Granularity granularity, int? clickWindowDays = null, int? engagementWindowDays = null, int? viewWindowDays = null, string? conversionReportTime = null)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var adIds = new List<string>(); // List<string> | List of Ad Ids to use to filter the results.
            var columns = new List<string>(); // List<string> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
            var granularity = new Granularity(); // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
            var clickWindowDays = 1;  // int? | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var engagementWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)  (default to 30)
            var viewWindowDays = 0;  // int? | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)  (default to 1)
            var conversionReportTime = TIME_OF_AD_ACTION;  // string? | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)  (default to TIME_OF_AD_ACTION)

            try
            {
                // Get ad analytics
                List<AdsAnalyticsResponseInner> result = apiInstance.AdsAnalytics(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdsAnalytics: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdsAnalyticsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get ad analytics
    ApiResponse<List<AdsAnalyticsResponseInner>> response = apiInstance.AdsAnalyticsWithHttpInfo(adAccountId, startDate, endDate, adIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdsAnalyticsWithHttpInfo: " + e.Message);
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
| **adIds** | [**List&lt;string&gt;**](string.md) | List of Ad Ids to use to filter the results. |  |
| **columns** | [**List&lt;string&gt;**](string.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |  |
| **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **clickWindowDays** | **int?** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagementWindowDays** | **int?** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **viewWindowDays** | **int?** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversionReportTime** | **string?** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] |

### Return type

[**List&lt;AdsAnalyticsResponseInner&gt;**](AdsAnalyticsResponseInner.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="adscreate"></a>
# **AdsCreate**
> AdArrayResponse AdsCreate (string adAccountId, List<AdCreateRequest> adCreateRequest)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adCreateRequest = new List<AdCreateRequest>(); // List<AdCreateRequest> | List of ads to create, size limit [1, 30].

            try
            {
                // Create ads
                AdArrayResponse result = apiInstance.AdsCreate(adAccountId, adCreateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create ads
    ApiResponse<AdArrayResponse> response = apiInstance.AdsCreateWithHttpInfo(adAccountId, adCreateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **adCreateRequest** | [**List&lt;AdCreateRequest&gt;**](AdCreateRequest.md) | List of ads to create, size limit [1, 30]. |  |

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="adsget"></a>
# **AdsGet**
> AdResponse AdsGet (string adAccountId, string adId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adId = "adId_example";  // string | Unique identifier of an ad.

            try
            {
                // Get ad
                AdResponse result = apiInstance.AdsGet(adAccountId, adId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get ad
    ApiResponse<AdResponse> response = apiInstance.AdsGetWithHttpInfo(adAccountId, adId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **adId** | **string** | Unique identifier of an ad. |  |

### Return type

[**AdResponse**](AdResponse.md)

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

<a id="adslist"></a>
# **AdsList**
> AdsList200Response AdsList (string adAccountId, List<string>? campaignIds = null, List<string>? adGroupIds = null, List<string>? adIds = null, List<string>? entityStatuses = null, int? pageSize = null, string? order = null, string? bookmark = null)

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

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
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var campaignIds = new List<string>?(); // List<string>? | List of Campaign Ids to use to filter the results. (optional) 
            var adGroupIds = new List<string>?(); // List<string>? | List of Ad group Ids to use to filter the results. (optional) 
            var adIds = new List<string>?(); // List<string>? | List of Ad Ids to use to filter the results. (optional) 
            var entityStatuses = new List<string>?(); // List<string>? | Entity status (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var order = ASCENDING;  // string? | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List ads
                AdsList200Response result = apiInstance.AdsList(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List ads
    ApiResponse<AdsList200Response> response = apiInstance.AdsListWithHttpInfo(adAccountId, campaignIds, adGroupIds, adIds, entityStatuses, pageSize, order, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **campaignIds** | [**List&lt;string&gt;?**](string.md) | List of Campaign Ids to use to filter the results. | [optional]  |
| **adGroupIds** | [**List&lt;string&gt;?**](string.md) | List of Ad group Ids to use to filter the results. | [optional]  |
| **adIds** | [**List&lt;string&gt;?**](string.md) | List of Ad Ids to use to filter the results. | [optional]  |
| **entityStatuses** | [**List&lt;string&gt;?**](string.md) | Entity status | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **string?** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**AdsList200Response**](AdsList200Response.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="adsupdate"></a>
# **AdsUpdate**
> AdArrayResponse AdsUpdate (string adAccountId, List<AdUpdateRequest> adUpdateRequest)

Update ads

Update multiple existing ads

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var adUpdateRequest = new List<AdUpdateRequest>(); // List<AdUpdateRequest> | List of ads to update, size limit [1, 30]

            try
            {
                // Update ads
                AdArrayResponse result = apiInstance.AdsUpdate(adAccountId, adUpdateRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdsApi.AdsUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdsUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update ads
    ApiResponse<AdArrayResponse> response = apiInstance.AdsUpdateWithHttpInfo(adAccountId, adUpdateRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdsApi.AdsUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **adUpdateRequest** | [**List&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) | List of ads to update, size limit [1, 30] |  |

### Return type

[**AdArrayResponse**](AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


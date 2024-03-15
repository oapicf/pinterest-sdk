# Org.OpenAPITools.Api.PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PinsAnalytics**](PinsApi.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics |
| [**PinsCreate**](PinsApi.md#pinscreate) | **POST** /pins | Create Pin |
| [**PinsDelete**](PinsApi.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin |
| [**PinsGet**](PinsApi.md#pinsget) | **GET** /pins/{pin_id} | Get Pin |
| [**PinsList**](PinsApi.md#pinslist) | **GET** /pins | List Pins |
| [**PinsSave**](PinsApi.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin |
| [**PinsUpdate**](PinsApi.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin |

<a id="pinsanalytics"></a>
# **PinsAnalytics**
> Dictionary&lt;string, PinAnalyticsMetricsResponse&gt; PinsAnalytics (string pinId, DateOnly startDate, DateOnly endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, string? appTypes = null, string? splitField = null, string? adAccountId = null)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsAnalyticsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var startDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
            var endDate = DateOnly.Parse("2013-10-20");  // DateOnly | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
            var metricTypes = new List<PinsAnalyticsMetricTypesParameterInner>(); // List<PinsAnalyticsMetricTypesParameterInner> | Pin metric types to get data for, default is all.
            var appTypes = "ALL";  // string? | Apps or devices to get data for, default is all. (optional)  (default to ALL)
            var splitField = "NO_SPLIT";  // string? | How to split the data into groups. Not including this param means data won't be split. (optional)  (default to NO_SPLIT)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get Pin analytics
                Dictionary<string, PinAnalyticsMetricsResponse> result = apiInstance.PinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsAnalytics: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsAnalyticsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Pin analytics
    ApiResponse<Dictionary<string, PinAnalyticsMetricsResponse>> response = apiInstance.PinsAnalyticsWithHttpInfo(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsAnalyticsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinId** | **string** | Unique identifier of a Pin. |  |
| **startDate** | **DateOnly** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |  |
| **endDate** | **DateOnly** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |  |
| **metricTypes** | [**List&lt;PinsAnalyticsMetricTypesParameterInner&gt;**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for, default is all. |  |
| **appTypes** | **string?** | Apps or devices to get data for, default is all. | [optional] [default to ALL] |
| **splitField** | **string?** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Dictionary&lt;string, PinAnalyticsMetricsResponse&gt;**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid pins analytics parameters. |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinscreate"></a>
# **PinsCreate**
> Pin PinsCreate (PinCreate pinCreate, string? adAccountId = null)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinCreate = new PinCreate(); // PinCreate | Create a new Pin.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Create Pin
                Pin result = apiInstance.PinsCreate(pinCreate, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create Pin
    ApiResponse<Pin> response = apiInstance.PinsCreateWithHttpInfo(pinCreate, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinCreate** | [**PinCreate**](PinCreate.md) | Create a new Pin. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful pin creation. |  -  |
| **400** | Invalid Pin parameters response |  -  |
| **403** | The Pin&#39;s image is too small, too large or is broken |  -  |
| **404** | Board or section not found |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinsdelete"></a>
# **PinsDelete**
> void PinsDelete (string pinId, string? adAccountId = null)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Delete Pin
                apiInstance.PinsDelete(pinId, adAccountId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Pin
    apiInstance.PinsDeleteWithHttpInfo(pinId, adAccountId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinId** | **string** | Unique identifier of a Pin. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted Pin |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinsget"></a>
# **PinsGet**
> Pin PinsGet (string pinId, bool? pinMetrics = null, string? adAccountId = null)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var pinMetrics = false;  // bool? | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)  (default to false)
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get Pin
                Pin result = apiInstance.PinsGet(pinId, pinMetrics, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Pin
    ApiResponse<Pin> response = apiInstance.PinsGetWithHttpInfo(pinId, pinMetrics, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinId** | **string** | Unique identifier of a Pin. |  |
| **pinMetrics** | **bool?** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access board or Pin. |  -  |
| **404** | Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinslist"></a>
# **PinsList**
> PinsList200Response PinsList (string? bookmark = null, int? pageSize = null, string? pinFilter = null, bool? includeProtectedPins = null, string? pinType = null, List<string>? creativeTypes = null, string? adAccountId = null, bool? pinMetrics = null)

List Pins

Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var pinFilter = "exclude_native";  // string? | Pin filter. (optional) 
            var includeProtectedPins = false;  // bool? | Specify if return pins from protected boards (optional)  (default to false)
            var pinType = "PRIVATE";  // string? | The type of pins to return, currently only enabled for private pins (optional) 
            var creativeTypes = new List<string>?(); // List<string>? | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional) 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 
            var pinMetrics = false;  // bool? | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional)  (default to false)

            try
            {
                // List Pins
                PinsList200Response result = apiInstance.PinsList(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List Pins
    ApiResponse<PinsList200Response> response = apiInstance.PinsListWithHttpInfo(bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **pinFilter** | **string?** | Pin filter. | [optional]  |
| **includeProtectedPins** | **bool?** | Specify if return pins from protected boards | [optional] [default to false] |
| **pinType** | **string?** | The type of pins to return, currently only enabled for private pins | [optional]  |
| **creativeTypes** | [**List&lt;string&gt;?**](string.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |
| **pinMetrics** | **bool?** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pin filter value |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinssave"></a>
# **PinsSave**
> Pin PinsSave (string pinId, PinsSaveRequest pinsSaveRequest, string? adAccountId = null)

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsSaveExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var pinsSaveRequest = new PinsSaveRequest(); // PinsSaveRequest | Request object used to save an existing pin
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Save Pin
                Pin result = apiInstance.PinsSave(pinId, pinsSaveRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsSave: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsSaveWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Save Pin
    ApiResponse<Pin> response = apiInstance.PinsSaveWithHttpInfo(pinId, pinsSaveRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsSaveWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinId** | **string** | Unique identifier of a Pin. |  |
| **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md) | Request object used to save an existing pin |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully saved pin. |  -  |
| **403** | Not authorized to access Board or Pin. |  -  |
| **404** | Board or Pin not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pinsupdate"></a>
# **PinsUpdate**
> Pin PinsUpdate (string pinId, PinUpdate pinUpdate, string? adAccountId = null)

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PinsUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new PinsApi(config);
            var pinId = "pinId_example";  // string | Unique identifier of a Pin.
            var pinUpdate = new PinUpdate(); // PinUpdate | 
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Update Pin
                Pin result = apiInstance.PinsUpdate(pinId, pinUpdate, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PinsApi.PinsUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PinsUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Pin
    ApiResponse<Pin> response = apiInstance.PinsUpdateWithHttpInfo(pinId, pinUpdate, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PinsApi.PinsUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **pinId** | **string** | Unique identifier of a Pin. |  |
| **pinUpdate** | [**PinUpdate**](PinUpdate.md) |  |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to update Pin. |  -  |
| **404** | Pin not found. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


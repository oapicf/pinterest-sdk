# Org.OpenAPITools.Api.TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TargetingTemplateCreate**](TargetingTemplateApi.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**TargetingTemplateList**](TargetingTemplateApi.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**TargetingTemplateUpdate**](TargetingTemplateApi.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |

<a id="targetingtemplatecreate"></a>
# **TargetingTemplateCreate**
> TargetingTemplateGetResponseData TargetingTemplateCreate (string adAccountId, TargetingTemplateCreate targetingTemplateCreate)

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TargetingTemplateCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TargetingTemplateApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var targetingTemplateCreate = new TargetingTemplateCreate(); // TargetingTemplateCreate | targeting template creation entity

            try
            {
                // Create targeting templates
                TargetingTemplateGetResponseData result = apiInstance.TargetingTemplateCreate(adAccountId, targetingTemplateCreate);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateCreate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TargetingTemplateCreateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create targeting templates
    ApiResponse<TargetingTemplateGetResponseData> response = apiInstance.TargetingTemplateCreateWithHttpInfo(adAccountId, targetingTemplateCreate);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateCreateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) | targeting template creation entity |  |

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="targetingtemplatelist"></a>
# **TargetingTemplateList**
> TargetingTemplateList200Response TargetingTemplateList (string adAccountId, string? order = null, bool? includeSizing = null, string? searchQuery = null, int? pageSize = null, string? bookmark = null)

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TargetingTemplateListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TargetingTemplateApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var order = ASCENDING;  // string? | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) 
            var includeSizing = false;  // bool? | Include audience sizing in result or not (optional)  (default to false)
            var searchQuery = gaming;  // string? | Search keyword for targeting templates (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // List targeting templates
                TargetingTemplateList200Response result = apiInstance.TargetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TargetingTemplateListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List targeting templates
    ApiResponse<TargetingTemplateList200Response> response = apiInstance.TargetingTemplateListWithHttpInfo(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **order** | **string?** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **includeSizing** | **bool?** | Include audience sizing in result or not | [optional] [default to false] |
| **searchQuery** | **string?** | Search keyword for targeting templates | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="targetingtemplateupdate"></a>
# **TargetingTemplateUpdate**
> void TargetingTemplateUpdate (string adAccountId, TargetingTemplateUpdateRequest targetingTemplateUpdateRequest)

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class TargetingTemplateUpdateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TargetingTemplateApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var targetingTemplateUpdateRequest = new TargetingTemplateUpdateRequest(); // TargetingTemplateUpdateRequest | Operation type and targeting template ID

            try
            {
                // Update targeting templates
                apiInstance.TargetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateUpdate: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the TargetingTemplateUpdateWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update targeting templates
    apiInstance.TargetingTemplateUpdateWithHttpInfo(adAccountId, targetingTemplateUpdateRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TargetingTemplateApi.TargetingTemplateUpdateWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID |  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


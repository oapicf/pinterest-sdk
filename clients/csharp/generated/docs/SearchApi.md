# Org.OpenAPITools.Api.SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SearchPartnerPins**](SearchApi.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**SearchUserBoardsGet**](SearchApi.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards |
| [**SearchUserPinsList**](SearchApi.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins |

<a id="searchpartnerpins"></a>
# **SearchPartnerPins**
> SearchPartnerPins200Response SearchPartnerPins (string term, string countryCode, string? bookmark = null, string? locale = null, int? limit = null)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SearchPartnerPinsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SearchApi(config);
            var term = "term_example";  // string | Search term to look up pins.
            var countryCode = US;  // string | Two letter country code (ISO 3166-1 alpha-2)
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var locale = "locale_example";  // string? | Search locale. (optional) 
            var limit = 4;  // int? | Max search result size (optional)  (default to 10)

            try
            {
                // Search pins by a given search term
                SearchPartnerPins200Response result = apiInstance.SearchPartnerPins(term, countryCode, bookmark, locale, limit);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SearchApi.SearchPartnerPins: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchPartnerPinsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search pins by a given search term
    ApiResponse<SearchPartnerPins200Response> response = apiInstance.SearchPartnerPinsWithHttpInfo(term, countryCode, bookmark, locale, limit);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SearchApi.SearchPartnerPinsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **term** | **string** | Search term to look up pins. |  |
| **countryCode** | **string** | Two letter country code (ISO 3166-1 alpha-2) |  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **locale** | **string?** | Search locale. | [optional]  |
| **limit** | **int?** | Max search result size | [optional] [default to 10] |

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pins |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchuserboardsget"></a>
# **SearchUserBoardsGet**
> SearchUserBoardsGet200Response SearchUserBoardsGet (string? adAccountId = null, string? bookmark = null, int? pageSize = null, string? query = null)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SearchUserBoardsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SearchApi(config);
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional)  (default to 25)
            var query = "query_example";  // string? | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional) 

            try
            {
                // Search user's boards
                SearchUserBoardsGet200Response result = apiInstance.SearchUserBoardsGet(adAccountId, bookmark, pageSize, query);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SearchApi.SearchUserBoardsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchUserBoardsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search user's boards
    ApiResponse<SearchUserBoardsGet200Response> response = apiInstance.SearchUserBoardsGetWithHttpInfo(adAccountId, bookmark, pageSize, query);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SearchApi.SearchUserBoardsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int?** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **query** | **string?** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]  |

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="searchuserpinslist"></a>
# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList (string query, string? adAccountId = null, string? bookmark = null)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SearchUserPinsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new SearchApi(config);
            var query = Plants;  // string | Search query. Can contain pin description keywords or comma-separated pin IDs.
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 
            var bookmark = "bookmark_example";  // string? | Cursor used to fetch the next page of items (optional) 

            try
            {
                // Search user's Pins
                PinsList200Response result = apiInstance.SearchUserPinsList(query, adAccountId, bookmark);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SearchApi.SearchUserPinsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the SearchUserPinsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Search user's Pins
    ApiResponse<PinsList200Response> response = apiInstance.SearchUserPinsListWithHttpInfo(query, adAccountId, bookmark);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling SearchApi.SearchUserPinsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |
| **bookmark** | **string?** | Cursor used to fetch the next page of items | [optional]  |

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
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


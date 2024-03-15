# Org.OpenAPITools.Api.ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#adaccountscatalogsproductgroupslist) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |

<a id="adaccountscatalogsproductgroupslist"></a>
# **AdAccountsCatalogsProductGroupsList**
> AdAccountsCatalogsProductGroupsList200Response AdAccountsCatalogsProductGroupsList (string adAccountId, string? feedProfileId = null)

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdAccountsCatalogsProductGroupsListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ProductGroupsApi(config);
            var adAccountId = "adAccountId_example";  // string | Unique identifier of an ad account.
            var feedProfileId = "feedProfileId_example";  // string? | The feed profile id whose catalog product groups we want to return. (optional) 

            try
            {
                // Get catalog product groups
                AdAccountsCatalogsProductGroupsList200Response result = apiInstance.AdAccountsCatalogsProductGroupsList(adAccountId, feedProfileId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProductGroupsApi.AdAccountsCatalogsProductGroupsList: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdAccountsCatalogsProductGroupsListWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get catalog product groups
    ApiResponse<AdAccountsCatalogsProductGroupsList200Response> response = apiInstance.AdAccountsCatalogsProductGroupsListWithHttpInfo(adAccountId, feedProfileId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ProductGroupsApi.AdAccountsCatalogsProductGroupsListWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **feedProfileId** | **string?** | The feed profile id whose catalog product groups we want to return. | [optional]  |

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

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
| **401** | Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest. |  -  |
| **404** | Merchant data not found. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


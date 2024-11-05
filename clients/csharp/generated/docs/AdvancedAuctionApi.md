# Org.OpenAPITools.Api.AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdvancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedauctionitemsgetpost) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**AdvancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedauctionitemssubmitpost) | **POST** /advanced_auction/items/submit | Operate on item level bid options |

<a id="advancedauctionitemsgetpost"></a>
# **AdvancedAuctionItemsGetPost**
> AdvancedAuctionItems AdvancedAuctionItemsGetPost (AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, string? adAccountId = null)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdvancedAuctionItemsGetPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdvancedAuctionApi(config);
            var advancedAuctionItemsGetRequest = new AdvancedAuctionItemsGetRequest(); // AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Get item bid options (POST)
                AdvancedAuctionItems result = apiInstance.AdvancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdvancedAuctionApi.AdvancedAuctionItemsGetPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdvancedAuctionItemsGetPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get item bid options (POST)
    ApiResponse<AdvancedAuctionItems> response = apiInstance.AdvancedAuctionItemsGetPostWithHttpInfo(advancedAuctionItemsGetRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdvancedAuctionApi.AdvancedAuctionItemsGetPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md) | Request object used to get bid options values for a batch of retail catalog items |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response. |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Not authenticated to get item bid options |  -  |
| **403** | Not authorized to get item bid options |  -  |
| **500** | Internal error |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="advancedauctionitemssubmitpost"></a>
# **AdvancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems AdvancedAuctionItemsSubmitPost (AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, string? adAccountId = null)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdvancedAuctionItemsSubmitPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new AdvancedAuctionApi(config);
            var advancedAuctionItemsSubmitRequest = new AdvancedAuctionItemsSubmitRequest(); // AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
            var adAccountId = "adAccountId_example";  // string? | Unique identifier of an ad account. (optional) 

            try
            {
                // Operate on item level bid options
                AdvancedAuctionProcessedItems result = apiInstance.AdvancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AdvancedAuctionApi.AdvancedAuctionItemsSubmitPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AdvancedAuctionItemsSubmitPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Operate on item level bid options
    ApiResponse<AdvancedAuctionProcessedItems> response = apiInstance.AdvancedAuctionItemsSubmitPostWithHttpInfo(advancedAuctionItemsSubmitRequest, adAccountId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling AdvancedAuctionApi.AdvancedAuctionItemsSubmitPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md) | Request object used to upsert or delete bid options for a batch of retail catalog items |  |
| **adAccountId** | **string?** | Unique identifier of an ad account. | [optional]  |

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the results of the item bid options operations |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Not authenticated to post item bid options |  -  |
| **403** | Not authorized to post item bid options |  -  |
| **500** | Internal error |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


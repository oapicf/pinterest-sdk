# .AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **advancedAuctionItemsGetPost**
> AdvancedAuctionItems advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example


```typescript
import { createConfiguration, AdvancedAuctionApi } from '';
import type { AdvancedAuctionApiAdvancedAuctionItemsGetPostRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdvancedAuctionApi(configuration);

const request: AdvancedAuctionApiAdvancedAuctionItemsGetPostRequest = {
    // Request object used to get bid options values for a batch of retail catalog items
  advancedAuctionItemsGetRequest: {
    catalogId: "2680059592705",
    items: [
      null,
    ],
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.advancedAuctionItemsGetPost(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | **AdvancedAuctionItemsGetRequest**| Request object used to get bid options values for a batch of retail catalog items |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**AdvancedAuctionItems**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the bid option values for the requested retail catalog items. Items that don\&#39;t exist or do not have bid options set won\&#39;t be present in the response. |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Not authenticated to get item bid options |  -  |
**403** | Not authorized to get item bid options |  -  |
**500** | Internal error |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **advancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest)

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example


```typescript
import { createConfiguration, AdvancedAuctionApi } from '';
import type { AdvancedAuctionApiAdvancedAuctionItemsSubmitPostRequest } from '';

const configuration = createConfiguration();
const apiInstance = new AdvancedAuctionApi(configuration);

const request: AdvancedAuctionApiAdvancedAuctionItemsSubmitPostRequest = {
    // Request object used to upsert or delete bid options for a batch of retail catalog items
  advancedAuctionItemsSubmitRequest: {
    catalogId: "2680059592705",
    items: [
      null,
    ],
  },
    // Unique identifier of an ad account. (optional)
  adAccountId: "4",
};

const data = await apiInstance.advancedAuctionItemsSubmitPost(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | **AdvancedAuctionItemsSubmitRequest**| Request object used to upsert or delete bid options for a batch of retail catalog items |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | (optional) defaults to undefined


### Return type

**AdvancedAuctionProcessedItems**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the results of the item bid options operations |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Not authenticated to post item bid options |  -  |
**403** | Not authorized to post item bid options |  -  |
**500** | Internal error |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)



# AdvancedAuctionAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancedAuctionAPI_advancedAuctionItemsGetPost**](AdvancedAuctionAPI.md#AdvancedAuctionAPI_advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**AdvancedAuctionAPI_advancedAuctionItemsSubmitPost**](AdvancedAuctionAPI.md#AdvancedAuctionAPI_advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **AdvancedAuctionAPI_advancedAuctionItemsGetPost**
```c
// Get item bid options (POST)
//
// Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
//
advanced_auction_items_t* AdvancedAuctionAPI_advancedAuctionItemsGetPost(apiClient_t *apiClient, advanced_auction_items_get_request_t *advanced_auction_items_get_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**advanced_auction_items_get_request** | **[advanced_auction_items_get_request_t](advanced_auction_items_get_request.md) \*** | Request object used to get bid options values for a batch of retail catalog items | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[advanced_auction_items_t](advanced_auction_items.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AdvancedAuctionAPI_advancedAuctionItemsSubmitPost**
```c
// Operate on item level bid options
//
// This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.
//
advanced_auction_processed_items_t* AdvancedAuctionAPI_advancedAuctionItemsSubmitPost(apiClient_t *apiClient, advanced_auction_items_submit_request_t *advanced_auction_items_submit_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**advanced_auction_items_submit_request** | **[advanced_auction_items_submit_request_t](advanced_auction_items_submit_request.md) \*** | Request object used to upsert or delete bid options for a batch of retail catalog items | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[advanced_auction_processed_items_t](advanced_auction_processed_items.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


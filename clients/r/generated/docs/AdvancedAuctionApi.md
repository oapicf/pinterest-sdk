# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancedAuctionItemsGetPost**](AdvancedAuctionApi.md#AdvancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**AdvancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#AdvancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **AdvancedAuctionItemsGetPost**
> AdvancedAuctionItems AdvancedAuctionItemsGetPost(advanced_auction_items_get_request, ad_account_id = var.ad_account_id)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```R
library(openapi)

# Get item bid options (POST)
#
# prepare function argument(s)
var_advanced_auction_items_get_request <- AdvancedAuctionItemsGetRequest$new("catalog_id_example", c(AdvancedAuctionItemsGetRecord$new("item_id_example", Country$new(), Language$new()))) # AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- AdvancedAuctionApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvancedAuctionItemsGetPost(var_advanced_auction_items_get_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$AdvancedAuctionItemsGetPost(var_advanced_auction_items_get_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_auction_items_get_request** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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

# **AdvancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems AdvancedAuctionItemsSubmitPost(advanced_auction_items_submit_request, ad_account_id = var.ad_account_id)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```R
library(openapi)

# Operate on item level bid options
#
# prepare function argument(s)
var_advanced_auction_items_submit_request <- AdvancedAuctionItemsSubmitRequest$new("catalog_id_example", c(AdvancedAuctionItemsSubmitRecord$new(AdvancedAuctionOperation$new(), "item_id_example", Country$new(), Language$new(), AdvancedAuctionBidOptions$new(123, AppTypeMultipliers$new(TargetingSpecAppType$new()), PlacementMultipliers$new("SEARCH")), c(UpdateMaskBidOptionField$new())))) # AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- AdvancedAuctionApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdvancedAuctionItemsSubmitPost(var_advanced_auction_items_submit_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$AdvancedAuctionItemsSubmitPost(var_advanced_auction_items_submit_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advanced_auction_items_submit_request** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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


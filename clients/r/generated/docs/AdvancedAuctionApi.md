# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdvancedAuctionItemsGetPost**](AdvancedAuctionApi.md#AdvancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**AdvancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#AdvancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **AdvancedAuctionItemsGetPost**
> AdvancedAuctionItems AdvancedAuctionItemsGetPost(advanced_auction_items_get_request, ad_account_id = var.ad_account_id)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```R
library(openapi)

# Get item bid options (POST)
#
# prepare function argument(s)
var_advanced_auction_items_get_request <- AdvancedAuctionItemsGetRequest$new("catalog_id_example", c(AdvancedAuctionKey$new(Country$new(), "item_id_example", Language$new()))) # AdvancedAuctionItemsGetRequest | 
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
 **advanced_auction_items_get_request** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)|  | 
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **500** | The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdvancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems AdvancedAuctionItemsSubmitPost(advanced_auction_items_submit_request, ad_account_id = var.ad_account_id)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```R
library(openapi)

# Operate on item level bid options
#
# prepare function argument(s)
var_advanced_auction_items_submit_request <- AdvancedAuctionItemsSubmitRequest$new("catalog_id_example", c(AdvancedAuctionItemsSubmitRecord$new(AdvancedAuctionBidOptions$new(AppTypeMultipliers$new(TargetingSpecAppType$new()), 123, PlacementMultipliers$new(PlacementType$new())), Country$new(), "item_id_example", Language$new(), "DELETE", c(UpdateMaskBidOptionField$new()), c(AdvancedAuctionOperationError$new(123, "message_example"))))) # AdvancedAuctionItemsSubmitRequest | 
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
 **advanced_auction_items_submit_request** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)|  | 
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
| **200** | The request has succeeded. |  -  |
| **206** | Successful |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **500** | The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |
| **0** | An unexpected error response. |  -  |


# AdvancedAuctionApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options



## advancedAuctionItemsGetPost

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.

The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: 'Owner', 'Admin'.

This endpoint is not available to all users.

### Example

```bash
 advancedAuctionItemsGetPost  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md) | Request object used to get bid options values for a batch of retail catalog items |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## advancedAuctionItemsSubmitPost

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type 'CATALOG_SALES' and ad groups using bid_strategy_type 'MAX_BID'.

The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: 'Owner', 'Admin'.

This endpoint is not available to all users.

### Example

```bash
 advancedAuctionItemsSubmitPost  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md) | Request object used to upsert or delete bid options for a batch of retail catalog items |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


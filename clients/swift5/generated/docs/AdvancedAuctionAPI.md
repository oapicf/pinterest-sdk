# AdvancedAuctionAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](AdvancedAuctionAPI.md#advancedauctionitemsgetpost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](AdvancedAuctionAPI.md#advancedauctionitemssubmitpost) | **POST** /advanced_auction/items/submit | Operate on item level bid options


# **advancedAuctionItemsGetPost**
```swift
    open class func advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: String? = nil, completion: @escaping (_ data: AdvancedAuctionItems?, _ error: Error?) -> Void)
```

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let advancedAuctionItemsGetRequest = AdvancedAuctionItemsGetRequest(catalogId: "catalogId_example", items: [AdvancedAuctionItemsGetRecord(itemId: "itemId_example", country: Country(), language: Language())]) // AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get item bid options (POST)
AdvancedAuctionAPI.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest: advancedAuctionItemsGetRequest, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md) | Request object used to get bid options values for a batch of retail catalog items | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advancedAuctionItemsSubmitPost**
```swift
    open class func advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: String? = nil, completion: @escaping (_ data: AdvancedAuctionProcessedItems?, _ error: Error?) -> Void)
```

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let advancedAuctionItemsSubmitRequest = AdvancedAuctionItemsSubmitRequest(catalogId: "catalogId_example", items: [AdvancedAuctionItemsSubmitRecord(operation: AdvancedAuctionOperation(), itemId: "itemId_example", country: Country(), language: Language(), bidOptions: AdvancedAuctionBidOptions(bidInMicroCurrency: 123, appTypeMultipliers: AppTypeMultipliers(APP_TYPE: TargetingSpecAppType()), placementMultipliers: PlacementMultipliers(PLACEMENT: "PLACEMENT_example")), updateMask: [UpdateMaskBidOptionField()])]) // AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Operate on item level bid options
AdvancedAuctionAPI.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest: advancedAuctionItemsSubmitRequest, adAccountId: adAccountId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md) | Request object used to upsert or delete bid options for a batch of retail catalog items | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


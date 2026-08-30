# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**advancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options |


<a id="advancedAuctionItemsGetPost"></a>
# **advancedAuctionItemsGetPost**
> AdvancedAuctionItems advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdvancedAuctionApi()
val advancedAuctionItemsGetRequest : AdvancedAuctionItemsGetRequest =  // AdvancedAuctionItemsGetRequest | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdvancedAuctionItems = apiInstance.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdvancedAuctionApi#advancedAuctionItemsGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdvancedAuctionApi#advancedAuctionItemsGetPost")
    e.printStackTrace()
}
```

### Parameters
| **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="advancedAuctionItemsSubmitPost"></a>
# **advancedAuctionItemsSubmitPost**
> AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AdvancedAuctionApi()
val advancedAuctionItemsSubmitRequest : AdvancedAuctionItemsSubmitRequest =  // AdvancedAuctionItemsSubmitRequest | 
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdvancedAuctionProcessedItems = apiInstance.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AdvancedAuctionApi#advancedAuctionItemsSubmitPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AdvancedAuctionApi#advancedAuctionItemsSubmitPost")
    e.printStackTrace()
}
```

### Parameters
| **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | [optional] |

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


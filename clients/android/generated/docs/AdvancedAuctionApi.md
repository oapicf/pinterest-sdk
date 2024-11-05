# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST)
[**advancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options



## advancedAuctionItemsGetPost

> AdvancedAuctionItems advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdvancedAuctionApi;

AdvancedAuctionApi apiInstance = new AdvancedAuctionApi();
AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = new AdvancedAuctionItemsGetRequest(); // AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AdvancedAuctionItems result = apiInstance.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedAuctionApi#advancedAuctionItemsGetPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## advancedAuctionItemsSubmitPost

> AdvancedAuctionProcessedItems advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdvancedAuctionApi;

AdvancedAuctionApi apiInstance = new AdvancedAuctionApi();
AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new AdvancedAuctionItemsSubmitRequest(); // AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    AdvancedAuctionProcessedItems result = apiInstance.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedAuctionApi#advancedAuctionItemsSubmitPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


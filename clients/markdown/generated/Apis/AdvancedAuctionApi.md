# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advancedAuctionItemsGet/post**](AdvancedAuctionApi.md#advancedAuctionItemsGet/post) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**advancedAuctionItemsSubmit/post**](AdvancedAuctionApi.md#advancedAuctionItemsSubmit/post) | **POST** /advanced_auction/items/submit | Operate on item level bid options |


<a name="advancedAuctionItemsGet/post"></a>
# **advancedAuctionItemsGet/post**
> AdvancedAuctionItems advancedAuctionItemsGet/post(AdvancedAuctionItemsGetRequest, ad\_account\_id)

Get item bid options (POST)

    Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/shopping-overview/#Update%20items%20in%20batch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **AdvancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](../Models/AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**AdvancedAuctionItems**](../Models/AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="advancedAuctionItemsSubmit/post"></a>
# **advancedAuctionItemsSubmit/post**
> AdvancedAuctionProcessedItems advancedAuctionItemsSubmit/post(AdvancedAuctionItemsSubmitRequest, ad\_account\_id)

Operate on item level bid options

    This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/api-features/modify-items-in-batch/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt; By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **AdvancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](../Models/AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items | |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [optional] [default to null] |

### Return type

[**AdvancedAuctionProcessedItems**](../Models/AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


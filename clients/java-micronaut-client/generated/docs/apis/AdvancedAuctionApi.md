# AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advancedAuctionItemsGetPost**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**advancedAuctionItemsSubmitPost**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options |


## Creating AdvancedAuctionApi

To initiate an instance of `AdvancedAuctionApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AdvancedAuctionApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AdvancedAuctionApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AdvancedAuctionApi advancedAuctionApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="advancedAuctionItemsGetPost"></a>
# **advancedAuctionItemsGetPost**
```java
Mono<AdvancedAuctionItems> AdvancedAuctionApi.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequestadAccountId)
```

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **advancedAuctionItemsGetRequest** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md)|  | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`, `catalogs:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="advancedAuctionItemsSubmitPost"></a>
# **advancedAuctionItemsSubmitPost**
```java
Mono<AdvancedAuctionProcessedItems> AdvancedAuctionApi.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequestadAccountId)
```

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type &#x60;CATALOG_SALES&#x60; and ad groups using bid_strategy_type &#x60;MAX_BID&#x60;.  The catalog must be owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: &#x60;Owner&#x60;, &#x60;Admin&#x60;.  This endpoint is not available to all users.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **advancedAuctionItemsSubmitRequest** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md)|  | |
| **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter] |


### Return type
[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`, `catalogs:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`


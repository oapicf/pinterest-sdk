# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription



## adAccountsSubscriptionsDelById

> adAccountsSubscriptionsDelById(adAccountId, subscriptionId)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String subscriptionId = null; // String | Unique identifier of a subscription.
try {
    apiInstance.adAccountsSubscriptionsDelById(adAccountId, subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadAdsApi#adAccountsSubscriptionsDelById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **subscriptionId** | **String**| Unique identifier of a subscription. | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsSubscriptionsGetById

> LeadSubscription adAccountsSubscriptionsGetById(adAccountId, subscriptionId)

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String subscriptionId = null; // String | Unique identifier of a subscription.
try {
    LeadSubscription result = apiInstance.adAccountsSubscriptionsGetById(adAccountId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadAdsApi#adAccountsSubscriptionsGetById");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **subscriptionId** | **String**| Unique identifier of a subscription. | [default to null]

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsSubscriptionsGetList

> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)

Get lead ads subscriptions

Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    AdAccountsSubscriptionsGetList200Response result = apiInstance.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadAdsApi#adAccountsSubscriptionsGetList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsSubscriptionsPost

> LeadSubscription adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate = new LeadSubscriptionPostParamsCreate(); // LeadSubscriptionPostParamsCreate | 
try {
    LeadSubscription result = apiInstance.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadAdsApi#adAccountsSubscriptionsPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **leadSubscriptionPostParamsCreate** | [**LeadSubscriptionPostParamsCreate**](LeadSubscriptionPostParamsCreate.md)|  |

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


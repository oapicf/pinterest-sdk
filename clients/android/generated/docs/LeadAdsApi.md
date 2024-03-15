# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription



## adAccountsSubscriptionsDelById

> adAccountsSubscriptionsDelById(adAccountId, subscriptionId)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

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

> AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById(adAccountId, subscriptionId)

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String subscriptionId = null; // String | Unique identifier of a subscription.
try {
    AdAccountGetSubscriptionResponse result = apiInstance.adAccountsSubscriptionsGetById(adAccountId, subscriptionId);
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

[**AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsSubscriptionsGetList

> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark)

Get lead ads subscriptions

Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String bookmark = null; // String | Cursor used to fetch the next page of items
try {
    AdAccountsSubscriptionsGetList200Response result = apiInstance.adAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark);
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
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsSubscriptionsPost

> AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest)

Create lead ads subscription

Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```java
// Import classes:
//import org.openapitools.client.api.LeadAdsApi;

LeadAdsApi apiInstance = new LeadAdsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest = new AdAccountCreateSubscriptionRequest(); // AdAccountCreateSubscriptionRequest | Subscription to create.
try {
    AdAccountCreateSubscriptionResponse result = apiInstance.adAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest);
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
 **adAccountCreateSubscriptionRequest** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md)| Subscription to create. |

### Return type

[**AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


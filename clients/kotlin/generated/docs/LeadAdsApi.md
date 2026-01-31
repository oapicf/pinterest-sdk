# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription |
| [**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID |
| [**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions |
| [**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription |


<a id="adAccountsSubscriptionsDelById"></a>
# **adAccountsSubscriptionsDelById**
> adAccountsSubscriptionsDelById(adAccountId, subscriptionId)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadAdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Unique identifier of a subscription.
try {
    apiInstance.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)
} catch (e: ClientException) {
    println("4xx response calling LeadAdsApi#adAccountsSubscriptionsDelById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadAdsApi#adAccountsSubscriptionsDelById")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionId** | **kotlin.String**| Unique identifier of a subscription. | |

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adAccountsSubscriptionsGetById"></a>
# **adAccountsSubscriptionsGetById**
> LeadSubscription adAccountsSubscriptionsGetById(adAccountId, subscriptionId)

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadAdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val subscriptionId : kotlin.String = subscriptionId_example // kotlin.String | Unique identifier of a subscription.
try {
    val result : LeadSubscription = apiInstance.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadAdsApi#adAccountsSubscriptionsGetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadAdsApi#adAccountsSubscriptionsGetById")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionId** | **kotlin.String**| Unique identifier of a subscription. | |

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""
Configure client_credentials:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adAccountsSubscriptionsGetList"></a>
# **adAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)

Get lead ads subscriptions

Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadAdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : AdAccountsSubscriptionsGetList200Response = apiInstance.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadAdsApi#adAccountsSubscriptionsGetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadAdsApi#adAccountsSubscriptionsGetList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="adAccountsSubscriptionsPost"></a>
# **adAccountsSubscriptionsPost**
> LeadSubscription adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeadAdsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val leadSubscriptionPostParamsCreate : LeadSubscriptionPostParamsCreate =  // LeadSubscriptionPostParamsCreate | 
try {
    val result : LeadSubscription = apiInstance.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeadAdsApi#adAccountsSubscriptionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeadAdsApi#adAccountsSubscriptionsPost")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leadSubscriptionPostParamsCreate** | [**LeadSubscriptionPostParamsCreate**](LeadSubscriptionPostParamsCreate.md)|  | |

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


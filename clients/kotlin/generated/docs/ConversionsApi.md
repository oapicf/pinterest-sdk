# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |


<a id="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
> AdvertiserDefinedEventsResponse advertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdvertiserDefinedEventsResponse = apiInstance.advertiserDefinedEventsGet(adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionsApi#advertiserDefinedEventsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionsApi#advertiserDefinedEventsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |

### Return type

[**AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""
Configure client_credentials:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


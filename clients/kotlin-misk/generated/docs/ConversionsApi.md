# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](ConversionsApi.md#advertiserDefinedEventsCreate) | **Post** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](ConversionsApi.md#advertiserDefinedEventsDelete) | **Delete** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](ConversionsApi.md#advertiserDefinedEventsUpdate) | **Patch** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


<a name="advertiserDefinedEventsCreate"></a>
# **advertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val advertiserDefinedEventsCreateRequest : AdvertiserDefinedEventsCreateRequest =  // AdvertiserDefinedEventsCreateRequest | 
try {
    val result : AdvertiserDefinedEventsCreate200Response = apiInstance.advertiserDefinedEventsCreate(adAccountId, advertiserDefinedEventsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionsApi#advertiserDefinedEventsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionsApi#advertiserDefinedEventsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="advertiserDefinedEventsDelete"></a>
# **advertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(adAccountId, eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val eventNames : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of event names to delete
try {
    val result : AdvertiserDefinedEventsCreate200Response = apiInstance.advertiserDefinedEventsDelete(adAccountId, eventNames)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionsApi#advertiserDefinedEventsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionsApi#advertiserDefinedEventsDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **eventNames** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of event names to delete |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : AdvertiserDefinedEventsGet200Response = apiInstance.advertiserDefinedEventsGet(adAccountId)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="advertiserDefinedEventsUpdate"></a>
# **advertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val advertiserDefinedEventsCreateRequest : AdvertiserDefinedEventsCreateRequest =  // AdvertiserDefinedEventsCreateRequest | 
try {
    val result : AdvertiserDefinedEventsCreate200Response = apiInstance.advertiserDefinedEventsUpdate(adAccountId, advertiserDefinedEventsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionsApi#advertiserDefinedEventsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionsApi#advertiserDefinedEventsUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON


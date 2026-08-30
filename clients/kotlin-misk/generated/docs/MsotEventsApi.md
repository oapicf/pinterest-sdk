# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsApi.md#msotEventsCreate) | **Post** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


<a name="msotEventsCreate"></a>
# **msotEventsCreate**
> msotEventsCreate(adAccountId, conversionMSOTEventsCreate)

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MsotEventsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionMSOTEventsCreate : ConversionMSOTEventsCreate =  // ConversionMSOTEventsCreate | 
try {
    apiInstance.msotEventsCreate(adAccountId, conversionMSOTEventsCreate)
} catch (e: ClientException) {
    println("4xx response calling MsotEventsApi#msotEventsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MsotEventsApi#msotEventsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON


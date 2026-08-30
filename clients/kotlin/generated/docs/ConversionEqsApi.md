# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |


<a id="conversionEqsList"></a>
# **conversionEqsList**
> kotlin.collections.List&lt;EventQualityScore&gt; conversionEqsList(adAccountId, lookbackPeriod, sourcePlatform, ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ConversionEqsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val lookbackPeriod : LookbackPeriodOptions =  // LookbackPeriodOptions | Lookback window (number of days).
val sourcePlatform : SourcePlatformOptions =  // SourcePlatformOptions | Source platform of event.
val ingestionSource : IngestionSourceOptions =  // IngestionSourceOptions | Ingestion source of event.
try {
    val result : kotlin.collections.List<EventQualityScore> = apiInstance.conversionEqsList(adAccountId, lookbackPeriod, sourcePlatform, ingestionSource)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionEqsApi#conversionEqsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionEqsApi#conversionEqsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | [enum: 1d, 14d] |
| **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional] [enum: WEB, MOBILE, MOBILE_ANDROID, MOBILE_IOS, OFFLINE, PINTEREST_WEB, PINTEREST_ANDROID, PINTEREST_IOS, POINT_OF_SALE] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional] [enum: TAG, MMP, FILE_UPLOAD, CONVERSIONS_API, NATIVE] |

### Return type

[**kotlin.collections.List&lt;EventQualityScore&gt;**](EventQualityScore.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


<a id="termsOfServiceGet"></a>
# **termsOfServiceGet**
> TermsOfService termsOfServiceGet(adAccountId, includeHtml, tosType)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TermsOfServiceApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val includeHtml : kotlin.Boolean = true // kotlin.Boolean | Return HTML in TOS text.
val tosType : kotlin.String = tosType_example // kotlin.String | Request type.
try {
    val result : TermsOfService = apiInstance.termsOfServiceGet(adAccountId, includeHtml, tosType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TermsOfServiceApi#termsOfServiceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TermsOfServiceApi#termsOfServiceGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **includeHtml** | **kotlin.Boolean**| Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **kotlin.String**| Request type. | [optional]

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


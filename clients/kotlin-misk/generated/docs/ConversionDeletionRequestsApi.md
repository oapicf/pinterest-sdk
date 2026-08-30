# ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](ConversionDeletionRequestsApi.md#conversionDeletionRequestCreate) | **Post** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](ConversionDeletionRequestsApi.md#conversionDeletionRequestDelete) | **Delete** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](ConversionDeletionRequestsApi.md#conversionDeletionRequestGet) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](ConversionDeletionRequestsApi.md#conversionDeletionRequestList) | **Get** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


<a name="conversionDeletionRequestCreate"></a>
# **conversionDeletionRequestCreate**
> ConversionDeletionRequest conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionDeletionRequestsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val conversionDeletionRequestCreate : ConversionDeletionRequestCreate =  // ConversionDeletionRequestCreate | 
try {
    val result : ConversionDeletionRequest = apiInstance.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md)|  |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="conversionDeletionRequestDelete"></a>
# **conversionDeletionRequestDelete**
> ConversionDeletionRequest conversionDeletionRequestDelete(requestId, adAccountId)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionDeletionRequestsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | Unique identifier of the conversion deletion request
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : ConversionDeletionRequest = apiInstance.conversionDeletionRequestDelete(requestId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**| Unique identifier of the conversion deletion request |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="conversionDeletionRequestGet"></a>
# **conversionDeletionRequestGet**
> ConversionDeletionRequest conversionDeletionRequestGet(requestId, adAccountId)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionDeletionRequestsApi()
val requestId : kotlin.String = requestId_example // kotlin.String | Unique identifier of the conversion deletion request
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
try {
    val result : ConversionDeletionRequest = apiInstance.conversionDeletionRequestGet(requestId, adAccountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **kotlin.String**| Unique identifier of the conversion deletion request |
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="conversionDeletionRequestList"></a>
# **conversionDeletionRequestList**
> ConversionDeletionRequestList200Response conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ConversionDeletionRequestsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    val result : ConversionDeletionRequestList200Response = apiInstance.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ConversionDeletionRequestsApi#conversionDeletionRequestList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON


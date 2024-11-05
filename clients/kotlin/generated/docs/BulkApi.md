# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |


<a id="bulkDownloadCreate"></a>
# **bulkDownloadCreate**
> BulkDownloadResponse bulkDownloadCreate(adAccountId, bulkDownloadRequest)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bulkDownloadRequest : BulkDownloadRequest =  // BulkDownloadRequest | Parameters to get ad entities in bulk
try {
    val result : BulkDownloadResponse = apiInstance.bulkDownloadCreate(adAccountId, bulkDownloadRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkApi#bulkDownloadCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkApi#bulkDownloadCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md)| Parameters to get ad entities in bulk | |

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="bulkRequestGet"></a>
# **bulkRequestGet**
> BulkUpsertStatusResponse bulkRequestGet(adAccountId, bulkRequestId, includeDetails)

Download advertiser entities in bulk

Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bulkRequestId : kotlin.String = bulkRequestId_example // kotlin.String | Unique identifier of a bulk upsert request.
val includeDetails : kotlin.Boolean = true // kotlin.Boolean | if set to True then attach the errors/details to all the requests
try {
    val result : BulkUpsertStatusResponse = apiInstance.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkApi#bulkRequestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkApi#bulkRequestGet")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **bulkRequestId** | **kotlin.String**| Unique identifier of a bulk upsert request. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDetails** | **kotlin.Boolean**| if set to True then attach the errors/details to all the requests | [optional] [default to false] |

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="bulkUpsertCreate"></a>
# **bulkUpsertCreate**
> BulkUpsertResponse bulkUpsertCreate(adAccountId, bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BulkApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bulkUpsertRequest : BulkUpsertRequest =  // BulkUpsertRequest | Parameters to get create/update ad entities in bulk
try {
    val result : BulkUpsertResponse = apiInstance.bulkUpsertCreate(adAccountId, bulkUpsertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BulkApi#bulkUpsertCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BulkApi#bulkUpsertCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **Get** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **Post** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


<a name="bulkDownloadCreate"></a>
# **bulkDownloadCreate**
> BulkDownload bulkDownloadCreate(adAccountId, bulkDownloadCreate)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BulkApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bulkDownloadCreate : BulkDownloadCreate =  // BulkDownloadCreate | 
try {
    val result : BulkDownload = apiInstance.bulkDownloadCreate(adAccountId, bulkDownloadCreate)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bulkDownloadCreate** | [**BulkDownloadCreate**](BulkDownloadCreate.md)|  |

### Return type

[**BulkDownload**](BulkDownload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="bulkRequestGet"></a>
# **bulkRequestGet**
> BulkJobData bulkRequestGet(adAccountId, bulkRequestId, includeDetails)

Download advertiser entities in bulk

Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = BulkApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bulkRequestId : kotlin.String = bulkRequestId_example // kotlin.String | Bulk request ID that is from one of the entities bulk endpoints
val includeDetails : kotlin.Boolean = true // kotlin.Boolean | If set to True then attach the errors/details to all the requests
try {
    val result : BulkJobData = apiInstance.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bulkRequestId** | **kotlin.String**| Bulk request ID that is from one of the entities bulk endpoints |
 **includeDetails** | **kotlin.Boolean**| If set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkJobData**](BulkJobData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="bulkUpsertCreate"></a>
# **bulkUpsertCreate**
> BulkUpsertResponse bulkUpsertCreate(adAccountId, bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**| Unique identifier of an ad account. |
 **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON


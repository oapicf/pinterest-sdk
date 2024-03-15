# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk



## bulkDownloadCreate

> BulkDownloadResponse bulkDownloadCreate(adAccountId, bulkDownloadRequest)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BulkApi;

BulkApi apiInstance = new BulkApi();
String adAccountId = null; // String | Unique identifier of an ad account.
BulkDownloadRequest bulkDownloadRequest = new BulkDownloadRequest(); // BulkDownloadRequest | Parameters to get ad entities in bulk
try {
    BulkDownloadResponse result = apiInstance.bulkDownloadCreate(adAccountId, bulkDownloadRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#bulkDownloadCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md)| Parameters to get ad entities in bulk |

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## bulkRequestGet

> BulkUpsertStatusResponse bulkRequestGet(adAccountId, bulkRequestId, includeDetails)

Download advertiser entities in bulk

Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example

```java
// Import classes:
//import org.openapitools.client.api.BulkApi;

BulkApi apiInstance = new BulkApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bulkRequestId = null; // String | Unique identifier of a bulk upsert request.
Boolean includeDetails = false; // Boolean | if set to True then attach the errors/details to all the requests
try {
    BulkUpsertStatusResponse result = apiInstance.bulkRequestGet(adAccountId, bulkRequestId, includeDetails);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#bulkRequestGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bulkRequestId** | **String**| Unique identifier of a bulk upsert request. | [default to null]
 **includeDetails** | **Boolean**| if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## bulkUpsertCreate

> BulkUpsertResponse bulkUpsertCreate(adAccountId, bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BulkApi;

BulkApi apiInstance = new BulkApi();
String adAccountId = null; // String | Unique identifier of an ad account.
BulkUpsertRequest bulkUpsertRequest = new BulkUpsertRequest(); // BulkUpsertRequest | Parameters to get create/update ad entities in bulk
try {
    BulkUpsertResponse result = apiInstance.bulkUpsertCreate(adAccountId, bulkUpsertRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BulkApi#bulkUpsertCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


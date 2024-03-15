# BulkController

All URIs are relative to `"/v5"`

The controller class is defined in **[BulkController.java](../../src/main/java/org/openapitools/controller/BulkController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk

<a id="bulkDownloadCreate"></a>
# **bulkDownloadCreate**
```java
Mono<BulkDownloadResponse> BulkController.bulkDownloadCreate(adAccountIdbulkDownloadRequest)
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bulkDownloadRequest** | [**BulkDownloadRequest**](../../docs/models/BulkDownloadRequest.md) | Parameters to get ad entities in bulk |

### Return type
[**BulkDownloadResponse**](../../docs/models/BulkDownloadResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="bulkRequestGet"></a>
# **bulkRequestGet**
```java
Mono<BulkUpsertStatusResponse> BulkController.bulkRequestGet(adAccountIdbulkRequestIdincludeDetails)
```

Download advertiser entities in bulk

Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bulkRequestId** | `String` | Unique identifier of a bulk upsert request. |
**includeDetails** | `Boolean` | if set to True then attach the errors/details to all the requests | [optional parameter] [default to `false`]

### Return type
[**BulkUpsertStatusResponse**](../../docs/models/BulkUpsertStatusResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="bulkUpsertCreate"></a>
# **bulkUpsertCreate**
```java
Mono<BulkUpsertResponse> BulkController.bulkUpsertCreate(adAccountIdbulkUpsertRequest)
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bulkUpsertRequest** | [**BulkUpsertRequest**](../../docs/models/BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk |

### Return type
[**BulkUpsertResponse**](../../docs/models/BulkUpsertResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


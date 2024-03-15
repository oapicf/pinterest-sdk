# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkDownload/create**](BulkApi.md#bulkDownload/create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**bulkRequest/get**](BulkApi.md#bulkRequest/get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**bulkUpsert/create**](BulkApi.md#bulkUpsert/create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |


<a name="bulkDownload/create"></a>
# **bulkDownload/create**
> BulkDownloadResponse bulkDownload/create(ad\_account\_id, BulkDownloadRequest)

Get advertiser entities in bulk

    Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **BulkDownloadRequest** | [**BulkDownloadRequest**](../Models/BulkDownloadRequest.md)| Parameters to get ad entities in bulk | |

### Return type

[**BulkDownloadResponse**](../Models/BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="bulkRequest/get"></a>
# **bulkRequest/get**
> BulkUpsertStatusResponse bulkRequest/get(ad\_account\_id, bulk\_request\_id, include\_details)

Download advertiser entities in bulk

    Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bulk\_request\_id** | **String**| Unique identifier of a bulk upsert request. | [default to null] |
| **include\_details** | **Boolean**| if set to True then attach the errors/details to all the requests | [optional] [default to false] |

### Return type

[**BulkUpsertStatusResponse**](../Models/BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="bulkUpsert/create"></a>
# **bulkUpsert/create**
> BulkUpsertResponse bulkUpsert/create(ad\_account\_id, BulkUpsertRequest)

Create/update ad entities in bulk

    Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **BulkUpsertRequest** | [**BulkUpsertRequest**](../Models/BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | |

### Return type

[**BulkUpsertResponse**](../Models/BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


# BulkApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk



## bulkDownloadCreate

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads,
and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused,
only active entities will return data.

### Example

```bash
 bulkDownloadCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk |

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## bulkRequestGet

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the
new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example

```bash
 bulkRequestGet ad_account_id=value bulk_request_id=value  include_details=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bulkRequestId** | **string** | Unique identifier of a bulk upsert request. | [default to null]
 **includeDetails** | **boolean** | if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## bulkUpsertCreate

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords.
Note that this request will be processed asynchronously; the response will include a <code>request_id</code>
that can be used to obtain the status of the request.

### Example

```bash
 bulkUpsertCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk |

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


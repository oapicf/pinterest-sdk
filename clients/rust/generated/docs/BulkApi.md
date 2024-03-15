# \BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_download_slash_create**](BulkApi.md#bulk_download_slash_create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulk_request_slash_get**](BulkApi.md#bulk_request_slash_get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulk_upsert_slash_create**](BulkApi.md#bulk_upsert_slash_create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk



## bulk_download_slash_create

> models::BulkDownloadResponse bulk_download_slash_create(ad_account_id, bulk_download_request)
Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bulk_download_request** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk | [required] |

### Return type

[**models::BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## bulk_request_slash_get

> models::BulkUpsertStatusResponse bulk_request_slash_get(ad_account_id, bulk_request_id, include_details)
Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bulk_request_id** | **String** | Unique identifier of a bulk upsert request. | [required] |
**include_details** | Option<**bool**> | if set to True then attach the errors/details to all the requests |  |[default to false]

### Return type

[**models::BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## bulk_upsert_slash_create

> models::BulkUpsertResponse bulk_upsert_slash_create(ad_account_id, bulk_upsert_request)
Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bulk_upsert_request** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk | [required] |

### Return type

[**models::BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# BulkAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkAPI_bulkDownloadCreate**](BulkAPI.md#BulkAPI_bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkAPI_bulkRequestGet**](BulkAPI.md#BulkAPI_bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkAPI_bulkUpsertCreate**](BulkAPI.md#BulkAPI_bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **BulkAPI_bulkDownloadCreate**
```c
// Get advertiser entities in bulk
//
// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
//
bulk_download_response_t* BulkAPI_bulkDownloadCreate(apiClient_t *apiClient, char *ad_account_id, bulk_download_request_t *bulk_download_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bulk_download_request** | **[bulk_download_request_t](bulk_download_request.md) \*** | Parameters to get ad entities in bulk | 

### Return type

[bulk_download_response_t](bulk_download_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BulkAPI_bulkRequestGet**
```c
// Download advertiser entities in bulk
//
// Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
//
bulk_upsert_status_response_t* BulkAPI_bulkRequestGet(apiClient_t *apiClient, char *ad_account_id, char *bulk_request_id, int *include_details);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bulk_request_id** | **char \*** | Unique identifier of a bulk upsert request. | 
**include_details** | **int \*** | if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[bulk_upsert_status_response_t](bulk_upsert_status_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BulkAPI_bulkUpsertCreate**
```c
// Create/update ad entities in bulk
//
// Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
//
bulk_upsert_response_t* BulkAPI_bulkUpsertCreate(apiClient_t *apiClient, char *ad_account_id, bulk_upsert_request_t *bulk_upsert_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bulk_upsert_request** | **[bulk_upsert_request_t](bulk_upsert_request.md) \*** | Parameters to get create/update ad entities in bulk | 

### Return type

[bulk_upsert_response_t](bulk_upsert_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


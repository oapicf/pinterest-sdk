# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulk_download_create**](BulkApi.md#bulk_download_create) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulk_request_get**](BulkApi.md#bulk_request_get) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulk_upsert_create**](BulkApi.md#bulk_upsert_create) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulk_download_create**
> `bulk_download_create`(_api::`BulkApi`, `ad_account_id`::`String`, `bulk_download_create_param`::`BulkDownloadCreate`; _mediaType=nothing) -> `BulkDownload`, `OpenAPI.Clients.ApiResponse` <br/>
> `bulk_download_create`(_api::`BulkApi`, response_stream::`Channel`, `ad_account_id`::`String`, `bulk_download_create_param`::`BulkDownloadCreate`; _mediaType=nothing) -> `Channel`{ `BulkDownload` }, `OpenAPI.Clients.ApiResponse`

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BulkApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`bulk_download_create_param`** | [**`BulkDownloadCreate`**](BulkDownloadCreate.md) |  |

### Return type

[**`BulkDownload`**](BulkDownload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **bulk_request_get**
> `bulk_request_get`(_api::`BulkApi`, `ad_account_id`::`String`, `bulk_request_id`::`String`; `include_details`=nothing, _mediaType=nothing) -> `BulkJobData`, `OpenAPI.Clients.ApiResponse` <br/>
> `bulk_request_get`(_api::`BulkApi`, response_stream::`Channel`, `ad_account_id`::`String`, `bulk_request_id`::`String`; `include_details`=nothing, _mediaType=nothing) -> `Channel`{ `BulkJobData` }, `OpenAPI.Clients.ApiResponse`

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BulkApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`bulk_request_id`** | **`String`** | Bulk request ID that is from one of the entities bulk endpoints |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include_details`** | **`Bool`** | If set to True then attach the errors/details to all the requests | [default to false]

### Return type

[**`BulkJobData`**](BulkJobData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **bulk_upsert_create**
> `bulk_upsert_create`(_api::`BulkApi`, `ad_account_id`::`String`, `bulk_upsert_request`::`BulkUpsertRequest`; _mediaType=nothing) -> `BulkUpsertResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `bulk_upsert_create`(_api::`BulkApi`, response_stream::`Channel`, `ad_account_id`::`String`, `bulk_upsert_request`::`BulkUpsertRequest`; _mediaType=nothing) -> `Channel`{ `BulkUpsertResponse` }, `OpenAPI.Clients.ApiResponse`

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`BulkApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`bulk_upsert_request`** | [**`BulkUpsertRequest`**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk |

### Return type

[**`BulkUpsertResponse`**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


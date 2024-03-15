# BULK_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**bulk_download_create**](BULK_API.md#bulk_download_create) | **Post** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulk_request_get**](BULK_API.md#bulk_request_get) | **Get** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulk_upsert_create**](BULK_API.md#bulk_upsert_create) | **Post** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulk_download_create**
> bulk_download_create (ad_account_id: STRING_32 ; bulk_download_request: BULK_DOWNLOAD_REQUEST ): detachable BULK_DOWNLOAD_RESPONSE


Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bulk_download_request** | [**BULK_DOWNLOAD_REQUEST**](BULK_DOWNLOAD_REQUEST.md)| Parameters to get ad entities in bulk | 

### Return type

[**BULK_DOWNLOAD_RESPONSE**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulk_request_get**
> bulk_request_get (ad_account_id: STRING_32 ; bulk_request_id: STRING_32 ; include_details:  detachable BOOLEAN ): detachable BULK_UPSERT_STATUS_RESPONSE


Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bulk_request_id** | **STRING_32**| Unique identifier of a bulk upsert request. | [default to null]
 **include_details** | **BOOLEAN**| if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BULK_UPSERT_STATUS_RESPONSE**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulk_upsert_create**
> bulk_upsert_create (ad_account_id: STRING_32 ; bulk_upsert_request: BULK_UPSERT_REQUEST ): detachable BULK_UPSERT_RESPONSE


Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bulk_upsert_request** | [**BULK_UPSERT_REQUEST**](BULK_UPSERT_REQUEST.md)| Parameters to get create/update ad entities in bulk | 

### Return type

[**BULK_UPSERT_RESPONSE**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


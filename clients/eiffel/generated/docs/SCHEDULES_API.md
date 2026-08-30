# SCHEDULES_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**schedules_create**](SCHEDULES_API.md#schedules_create) | **Post** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedules_list**](SCHEDULES_API.md#schedules_list) | **Get** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedules_update**](SCHEDULES_API.md#schedules_update) | **Patch** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedules_create**
> schedules_create (ad_account_id: STRING_32 ; schedule_create: LIST [SCHEDULE_CREATE] ): detachable LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]


Create schedules

Batch create schedules


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **schedule_create** | [**LIST [SCHEDULE_CREATE]**](ScheduleCreate.md)|  | 

### Return type

[**LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules_list**
> schedules_list (ad_account_id: STRING_32 ; entity_ids: LIST [STRING_32] ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; schedule_statuses:  detachable LIST [SCHEDULE_STATUS] ; schedule_type:  detachable SCHEDULE_TYPE ): detachable SCHEDULES_LIST_200_RESPONSE


Get Schedules

Get schedules for a specific advertiser


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **entity_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **schedule_statuses** | [**LIST [SCHEDULE_STATUS]**](SCHEDULE_STATUS.md)| Filter schedules by status (one or more) | [optional] [default to null]
 **schedule_type** | [**SCHEDULE_TYPE**](.md)| Filter schedules by a type | [optional] [default to null]

### Return type

[**SCHEDULES_LIST_200_RESPONSE**](schedules_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules_update**
> schedules_update (ad_account_id: STRING_32 ; schedule_batch_update: LIST [SCHEDULE_BATCH_UPDATE] ): detachable LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]


Update schedules

Update one or more schedules


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **schedule_batch_update** | [**LIST [SCHEDULE_BATCH_UPDATE]**](ScheduleBatchUpdate.md)|  | 

### Return type

[**LIST [SCHEDULES_CREATE_200_RESPONSE_INNER]**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


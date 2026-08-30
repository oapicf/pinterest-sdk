# SchedulesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulesAPI_schedulesCreate**](SchedulesAPI.md#SchedulesAPI_schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**SchedulesAPI_schedulesList**](SchedulesAPI.md#SchedulesAPI_schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**SchedulesAPI_schedulesUpdate**](SchedulesAPI.md#SchedulesAPI_schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **SchedulesAPI_schedulesCreate**
```c
// Create schedules
//
// Batch create schedules
//
list_t* SchedulesAPI_schedulesCreate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**schedule_create** | **[list_t](schedule_create.md) \*** |  | 

### Return type

[list_t](schedules_create_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulesAPI_schedulesList**
```c
// Get Schedules
//
// Get schedules for a specific advertiser
//
schedules_list_200_response_t* SchedulesAPI_schedulesList(apiClient_t *apiClient, char *ad_account_id, list_t *entity_ids, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *schedule_statuses, schedule_type_e schedule_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**entity_ids** | **[list_t](char.md) \*** | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**schedule_statuses** | **[list_t](schedule_status.md) \*** | Filter schedules by status (one or more) | [optional] 
**schedule_type** | **schedule_type_e** | Filter schedules by a type | [optional] 

### Return type

[schedules_list_200_response_t](schedules_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SchedulesAPI_schedulesUpdate**
```c
// Update schedules
//
// Update one or more schedules
//
list_t* SchedulesAPI_schedulesUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_batch_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**schedule_batch_update** | **[list_t](schedule_batch_update.md) \*** |  | 

### Return type

[list_t](schedules_create_200_response_inner.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


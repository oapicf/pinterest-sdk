# schedules_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**schedules/create**](schedules_api.md#schedules/create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
**schedules/list**](schedules_api.md#schedules/list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
**schedules/update**](schedules_api.md#schedules/update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedules/create**
> Vec<models::SchedulesCreate200ResponseInner> schedules/create(ctx, ad_account_id, schedule_create)
Create schedules

Batch create schedules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **schedule_create** | [**ScheduleCreate**](ScheduleCreate.md)|  | 

### Return type

[**Vec<models::SchedulesCreate200ResponseInner>**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules/list**
> models::SchedulesList200Response schedules/list(ctx, ad_account_id, entity_ids, optional)
Get Schedules

Get schedules for a specific advertiser

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **entity_ids** | [**String**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**|  | 
 **entity_ids** | [**String**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **schedule_statuses** | [**models::ScheduleStatus**](models::ScheduleStatus.md)| Filter schedules by status (one or more) | 
 **schedule_type** | [****](.md)| Filter schedules by a type | 

### Return type

[**models::SchedulesList200Response**](schedules_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules/update**
> Vec<models::SchedulesCreate200ResponseInner> schedules/update(ctx, ad_account_id, schedule_batch_update)
Update schedules

Update one or more schedules

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **schedule_batch_update** | [**ScheduleBatchUpdate**](ScheduleBatchUpdate.md)|  | 

### Return type

[**Vec<models::SchedulesCreate200ResponseInner>**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


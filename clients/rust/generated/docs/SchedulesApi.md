# \SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedules_slash_create**](SchedulesApi.md#schedules_slash_create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedules_slash_list**](SchedulesApi.md#schedules_slash_list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedules_slash_update**](SchedulesApi.md#schedules_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules



## schedules_slash_create

> Vec<models::SchedulesCreate200ResponseInner> schedules_slash_create(ad_account_id, schedule_create)
Create schedules

Batch create schedules

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** |  | [required] |
**schedule_create** | [**Vec<models::ScheduleCreate>**](ScheduleCreate.md) |  | [required] |

### Return type

[**Vec<models::SchedulesCreate200ResponseInner>**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedules_slash_list

> models::SchedulesList200Response schedules_slash_list(ad_account_id, entity_ids, bookmark, page_size, order, schedule_statuses, schedule_type)
Get Schedules

Get schedules for a specific advertiser

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** |  | [required] |
**entity_ids** | [**Vec<String>**](String.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**schedule_statuses** | Option<[**Vec<models::ScheduleStatus>**](Models__ScheduleStatus.md)> | Filter schedules by status (one or more) |  |
**schedule_type** | Option<[**ScheduleType**](ScheduleType.md)> | Filter schedules by a type |  |

### Return type

[**models::SchedulesList200Response**](schedules_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedules_slash_update

> Vec<models::SchedulesCreate200ResponseInner> schedules_slash_update(ad_account_id, schedule_batch_update)
Update schedules

Update one or more schedules

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** |  | [required] |
**schedule_batch_update** | [**Vec<models::ScheduleBatchUpdate>**](ScheduleBatchUpdate.md) |  | [required] |

### Return type

[**Vec<models::SchedulesCreate200ResponseInner>**](schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


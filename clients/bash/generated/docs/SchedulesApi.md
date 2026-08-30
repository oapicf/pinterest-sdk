# SchedulesApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules



## schedulesCreate

Create schedules

Batch create schedules

### Example

```bash
 schedulesCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **scheduleCreate** | [**array[ScheduleCreate]**](ScheduleCreate.md) |  |

### Return type

[**array[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulesList

Get Schedules

Get schedules for a specific advertiser

### Example

```bash
 schedulesList ad_account_id=value  Specify as:  entity_ids=value1 entity_ids=value2 entity_ids=...  bookmark=value  page_size=value  order=value  Specify as:  schedule_statuses=value1 schedule_statuses=value2 schedule_statuses=...  schedule_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **entityIds** | [**array[string]**](string.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **scheduleStatuses** | [**array[ScheduleStatus]**](ScheduleStatus.md) | Filter schedules by status (one or more) | [optional] [default to null]
 **scheduleType** | [**ScheduleType**](.md) | Filter schedules by a type | [optional] [default to null]

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## schedulesUpdate

Update schedules

Update one or more schedules

### Example

```bash
 schedulesUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **scheduleBatchUpdate** | [**array[ScheduleBatchUpdate]**](ScheduleBatchUpdate.md) |  |

### Return type

[**array[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


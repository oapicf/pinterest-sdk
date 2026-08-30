# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |



## schedulesCreate

> List&lt;SchedulesCreate200ResponseInner&gt; schedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**|  | |
| **scheduleCreate** | [**List&lt;ScheduleCreate&gt;**](ScheduleCreate.md)|  | |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## schedulesList

> SchedulesList200Response schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

Get Schedules

Get schedules for a specific advertiser

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**|  | |
| **entityIds** | [**List&lt;String&gt;**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] |
| **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] [enum: CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS] |

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## schedulesUpdate

> List&lt;SchedulesCreate200ResponseInner&gt; schedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**|  | |
| **scheduleBatchUpdate** | [**List&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md)|  | |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


# Org.OpenAPITools.Api.SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**SchedulesCreate**](SchedulesApi.md#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**SchedulesList**](SchedulesApi.md#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**SchedulesUpdate**](SchedulesApi.md#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |

<a id="schedulescreate"></a>
# **SchedulesCreate**
> List&lt;SchedulesCreate200ResponseInner&gt; SchedulesCreate (string adAccountId, List<ScheduleCreate> scheduleCreate)

Create schedules

Batch create schedules


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** |  |  |
| **scheduleCreate** | [**List&lt;ScheduleCreate&gt;**](ScheduleCreate.md) |  |  |

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
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="scheduleslist"></a>
# **SchedulesList**
> SchedulesList200Response SchedulesList (string adAccountId, List<string> entityIds, string bookmark = null, int pageSize = null, PinterestLibPaginationOrder order = null, List<ScheduleStatus> scheduleStatuses = null, ScheduleType scheduleType = null)

Get Schedules

Get schedules for a specific advertiser


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** |  |  |
| **entityIds** | [**List&lt;string&gt;**](string.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]  |
| **scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](ScheduleStatus.md) | Filter schedules by status (one or more) | [optional]  |
| **scheduleType** | **ScheduleType** | Filter schedules by a type | [optional]  |

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
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="schedulesupdate"></a>
# **SchedulesUpdate**
> List&lt;SchedulesCreate200ResponseInner&gt; SchedulesUpdate (string adAccountId, List<ScheduleBatchUpdate> scheduleBatchUpdate)

Update schedules

Update one or more schedules


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** |  |  |
| **scheduleBatchUpdate** | [**List&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md) |  |  |

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
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


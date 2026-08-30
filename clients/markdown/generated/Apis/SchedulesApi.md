# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schedules/create**](SchedulesApi.md#schedules/create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedules/list**](SchedulesApi.md#schedules/list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedules/update**](SchedulesApi.md#schedules/update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |


<a name="schedules/create"></a>
# **schedules/create**
> List schedules/create(ad\_account\_id, ScheduleCreate)

Create schedules

    Batch create schedules

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **ScheduleCreate** | [**List**](../Models/ScheduleCreate.md)|  | |

### Return type

[**List**](../Models/schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="schedules/list"></a>
# **schedules/list**
> schedules_list_200_response schedules/list(ad\_account\_id, entity\_ids, bookmark, page\_size, order, schedule\_statuses, schedule\_type)

Get Schedules

    Get schedules for a specific advertiser

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **entity\_ids** | [**List**](../Models/String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **schedule\_statuses** | [**List**](../Models/ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] [default to null] |
| **schedule\_type** | [**ScheduleType**](../Models/.md)| Filter schedules by a type | [optional] [default to null] [enum: CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS] |

### Return type

[**schedules_list_200_response**](../Models/schedules_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="schedules/update"></a>
# **schedules/update**
> List schedules/update(ad\_account\_id, ScheduleBatchUpdate)

Update schedules

    Update one or more schedules

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **ScheduleBatchUpdate** | [**List**](../Models/ScheduleBatchUpdate.md)|  | |

### Return type

[**List**](../Models/schedules_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


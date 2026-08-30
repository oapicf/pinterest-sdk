# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**schedulesCreate**](#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules|
|[**schedulesList**](#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules|
|[**schedulesUpdate**](#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules|

# **schedulesCreate**
> Array<SchedulesCreate200ResponseInner> schedulesCreate(scheduleCreate)

Batch create schedules

### Example

```typescript
import {
    SchedulesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SchedulesApi(configuration);

let adAccountId: string; // (default to undefined)
let scheduleCreate: Array<ScheduleCreate>; //

const { status, data } = await apiInstance.schedulesCreate(
    adAccountId,
    scheduleCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **scheduleCreate** | **Array<ScheduleCreate>**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|


### Return type

**Array<SchedulesCreate200ResponseInner>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesList**
> SchedulesList200Response schedulesList()

Get schedules for a specific advertiser

### Example

```typescript
import {
    SchedulesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SchedulesApi(configuration);

let adAccountId: string; // (default to undefined)
let entityIds: Array<string>; //List of Entity IDs, must be associated with the Ad Accound ID provided in the path. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order: PinterestLibPaginationOrder; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let scheduleStatuses: Array<ScheduleStatus>; //Filter schedules by status (one or more) (optional) (default to undefined)
let scheduleType: ScheduleType; //Filter schedules by a type (optional) (default to undefined)

const { status, data } = await apiInstance.schedulesList(
    adAccountId,
    entityIds,
    bookmark,
    pageSize,
    order,
    scheduleStatuses,
    scheduleType
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|
| **entityIds** | **Array&lt;string&gt;** | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|
| **order** | **PinterestLibPaginationOrder** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **scheduleStatuses** | **Array&lt;ScheduleStatus&gt;** | Filter schedules by status (one or more) | (optional) defaults to undefined|
| **scheduleType** | **ScheduleType** | Filter schedules by a type | (optional) defaults to undefined|


### Return type

**SchedulesList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesUpdate**
> Array<SchedulesCreate200ResponseInner> schedulesUpdate(scheduleBatchUpdate)

Update one or more schedules

### Example

```typescript
import {
    SchedulesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new SchedulesApi(configuration);

let adAccountId: string; // (default to undefined)
let scheduleBatchUpdate: Array<ScheduleBatchUpdate>; //

const { status, data } = await apiInstance.schedulesUpdate(
    adAccountId,
    scheduleBatchUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **scheduleBatchUpdate** | **Array<ScheduleBatchUpdate>**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|


### Return type

**Array<SchedulesCreate200ResponseInner>**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


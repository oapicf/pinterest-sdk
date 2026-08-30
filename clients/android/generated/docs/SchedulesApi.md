# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules



## schedulesCreate

> List&lt;SchedulesCreate200ResponseInner&gt; schedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules

### Example

```java
// Import classes:
//import org.openapitools.client.api.SchedulesApi;

SchedulesApi apiInstance = new SchedulesApi();
String adAccountId = null; // String | 
List<ScheduleCreate> scheduleCreate = Arrays.asList(new ScheduleCreate()); // List<ScheduleCreate> | 
try {
    List<SchedulesCreate200ResponseInner> result = apiInstance.schedulesCreate(adAccountId, scheduleCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulesApi#schedulesCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **scheduleCreate** | [**List&lt;ScheduleCreate&gt;**](ScheduleCreate.md)|  |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## schedulesList

> SchedulesList200Response schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

Get Schedules

Get schedules for a specific advertiser

### Example

```java
// Import classes:
//import org.openapitools.client.api.SchedulesApi;

SchedulesApi apiInstance = new SchedulesApi();
String adAccountId = null; // String | 
List<String> entityIds = null; // List<String> | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
List<ScheduleStatus> scheduleStatuses = null; // List<ScheduleStatus> | Filter schedules by status (one or more)
ScheduleType scheduleType = null; // ScheduleType | Filter schedules by a type
try {
    SchedulesList200Response result = apiInstance.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulesApi#schedulesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **entityIds** | [**List&lt;String&gt;**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]
 **scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] [default to null]
 **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] [default to null] [enum: CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS]

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## schedulesUpdate

> List&lt;SchedulesCreate200ResponseInner&gt; schedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Example

```java
// Import classes:
//import org.openapitools.client.api.SchedulesApi;

SchedulesApi apiInstance = new SchedulesApi();
String adAccountId = null; // String | 
List<ScheduleBatchUpdate> scheduleBatchUpdate = Arrays.asList(new ScheduleBatchUpdate()); // List<ScheduleBatchUpdate> | 
try {
    List<SchedulesCreate200ResponseInner> result = apiInstance.schedulesUpdate(adAccountId, scheduleBatchUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulesApi#schedulesUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **scheduleBatchUpdate** | [**List&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md)|  |

### Return type

[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


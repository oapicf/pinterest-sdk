# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **Post** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesApi.md#schedulesList) | **Get** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **Patch** /ad_accounts/{ad_account_id}/schedules | Update schedules


<a name="schedulesCreate"></a>
# **schedulesCreate**
> kotlin.collections.List&lt;SchedulesCreate200ResponseInner&gt; schedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SchedulesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val scheduleCreate : kotlin.collections.List<ScheduleCreate> =  // kotlin.collections.List<ScheduleCreate> | 
try {
    val result : kotlin.collections.List<SchedulesCreate200ResponseInner> = apiInstance.schedulesCreate(adAccountId, scheduleCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#schedulesCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#schedulesCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**|  |
 **scheduleCreate** | [**kotlin.collections.List&lt;ScheduleCreate&gt;**](ScheduleCreate.md)|  |

### Return type

[**kotlin.collections.List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="schedulesList"></a>
# **schedulesList**
> SchedulesList200Response schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)

Get Schedules

Get schedules for a specific advertiser

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SchedulesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val entityIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val scheduleStatuses : kotlin.collections.List<ScheduleStatus> =  // kotlin.collections.List<ScheduleStatus> | Filter schedules by status (one or more)
val scheduleType : ScheduleType =  // ScheduleType | Filter schedules by a type
try {
    val result : SchedulesList200Response = apiInstance.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#schedulesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#schedulesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**|  |
 **entityIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING]
 **scheduleStatuses** | [**kotlin.collections.List&lt;ScheduleStatus&gt;**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional]
 **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] [enum: CAMPAIGN_BUDGET_CHANGE, CAMPAIGN_BID_MULTIPLIERS]

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="schedulesUpdate"></a>
# **schedulesUpdate**
> kotlin.collections.List&lt;SchedulesCreate200ResponseInner&gt; schedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = SchedulesApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val scheduleBatchUpdate : kotlin.collections.List<ScheduleBatchUpdate> =  // kotlin.collections.List<ScheduleBatchUpdate> | 
try {
    val result : kotlin.collections.List<SchedulesCreate200ResponseInner> = apiInstance.schedulesUpdate(adAccountId, scheduleBatchUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#schedulesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#schedulesUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **kotlin.String**|  |
 **scheduleBatchUpdate** | [**kotlin.collections.List&lt;ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md)|  |

### Return type

[**kotlin.collections.List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON


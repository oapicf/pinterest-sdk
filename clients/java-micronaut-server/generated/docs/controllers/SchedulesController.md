# SchedulesController

All URIs are relative to `"/v5"`

The controller class is defined in **[SchedulesController.java](../../src/main/java/org/openapitools/controller/SchedulesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules

<a id="schedulesCreate"></a>
# **schedulesCreate**
```java
Mono<List<SchedulesCreate200ResponseInner>> SchedulesController.schedulesCreate(adAccountIdscheduleCreate)
```

Create schedules

Batch create schedules

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**scheduleCreate** | [**List&lt;@Valid ScheduleCreate&gt;**](../../docs/models/ScheduleCreate.md) |  |

### Return type
[**List&lt;SchedulesCreate200ResponseInner&gt;**](../../docs/models/SchedulesCreate200ResponseInner.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="schedulesList"></a>
# **schedulesList**
```java
Mono<SchedulesList200Response> SchedulesController.schedulesList(adAccountIdentityIdsbookmarkpageSizeorderscheduleStatusesscheduleType)
```

Get Schedules

Get schedules for a specific advertiser

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**entityIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](../../docs/models/String.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](../../docs/models/ScheduleStatus.md) | Filter schedules by status (one or more) | [optional parameter]
**scheduleType** | [**ScheduleType**](../../docs/models/.md) | Filter schedules by a type | [optional parameter] [enum: `CAMPAIGN_BUDGET_CHANGE`, `CAMPAIGN_BID_MULTIPLIERS`]

### Return type
[**SchedulesList200Response**](../../docs/models/SchedulesList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="schedulesUpdate"></a>
# **schedulesUpdate**
```java
Mono<List<SchedulesCreate200ResponseInner>> SchedulesController.schedulesUpdate(adAccountIdscheduleBatchUpdate)
```

Update schedules

Update one or more schedules

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` |  |
**scheduleBatchUpdate** | [**List&lt;@Valid ScheduleBatchUpdate&gt;**](../../docs/models/ScheduleBatchUpdate.md) |  |

### Return type
[**List&lt;SchedulesCreate200ResponseInner&gt;**](../../docs/models/SchedulesCreate200ResponseInner.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


# SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |


## Creating SchedulesApi

To initiate an instance of `SchedulesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.SchedulesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(SchedulesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    SchedulesApi schedulesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="schedulesCreate"></a>
# **schedulesCreate**
```java
Mono<List<SchedulesCreate200ResponseInner>> SchedulesApi.schedulesCreate(adAccountIdscheduleCreate)
```

Create schedules

Batch create schedules

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **scheduleCreate** | [**List&lt;@Valid ScheduleCreate&gt;**](ScheduleCreate.md)|  | |


### Return type
[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="schedulesList"></a>
# **schedulesList**
```java
Mono<SchedulesList200Response> SchedulesApi.schedulesList(adAccountIdentityIdsbookmarkpageSizeorderscheduleStatusesscheduleType)
```

Get Schedules

Get schedules for a specific advertiser

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **entityIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **scheduleStatuses** | [**List&lt;ScheduleStatus&gt;**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional parameter] |
| **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional parameter] [enum: `CAMPAIGN_BUDGET_CHANGE`, `CAMPAIGN_BID_MULTIPLIERS`] |


### Return type
[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="schedulesUpdate"></a>
# **schedulesUpdate**
```java
Mono<List<SchedulesCreate200ResponseInner>> SchedulesApi.schedulesUpdate(adAccountIdscheduleBatchUpdate)
```

Update schedules

Update one or more schedules

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`|  | |
| **scheduleBatchUpdate** | [**List&lt;@Valid ScheduleBatchUpdate&gt;**](ScheduleBatchUpdate.md)|  | |


### Return type
[**List&lt;SchedulesCreate200ResponseInner&gt;**](SchedulesCreate200ResponseInner.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`


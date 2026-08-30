# \SchedulesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SchedulesCreate**](SchedulesAPI.md#SchedulesCreate) | **Post** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**SchedulesList**](SchedulesAPI.md#SchedulesList) | **Get** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**SchedulesUpdate**](SchedulesAPI.md#SchedulesUpdate) | **Patch** /ad_accounts/{ad_account_id}/schedules | Update schedules



## SchedulesCreate

> []SchedulesCreate200ResponseInner SchedulesCreate(ctx, adAccountId).ScheduleCreate(scheduleCreate).Execute()

Create schedules



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | 
	scheduleCreate := []openapiclient.ScheduleCreate{*openapiclient.NewScheduleCreate("EntityId_example")} // []ScheduleCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulesAPI.SchedulesCreate(context.Background(), adAccountId).ScheduleCreate(scheduleCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulesAPI.SchedulesCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulesCreate`: []SchedulesCreate200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `SchedulesAPI.SchedulesCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulesCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **scheduleCreate** | [**[]ScheduleCreate**](ScheduleCreate.md) |  | 

### Return type

[**[]SchedulesCreate200ResponseInner**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulesList

> SchedulesList200Response SchedulesList(ctx, adAccountId).EntityIds(entityIds).Bookmark(bookmark).PageSize(pageSize).Order(order).ScheduleStatuses(scheduleStatuses).ScheduleType(scheduleType).Execute()

Get Schedules



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | 
	entityIds := []string{"Inner_example"} // []string | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	scheduleStatuses := []openapiclient.ScheduleStatus{openapiclient.ScheduleStatus("DRAFT")} // []ScheduleStatus | Filter schedules by status (one or more) (optional)
	scheduleType := openapiclient.ScheduleType("CAMPAIGN_BUDGET_CHANGE") // ScheduleType | Filter schedules by a type (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulesAPI.SchedulesList(context.Background(), adAccountId).EntityIds(entityIds).Bookmark(bookmark).PageSize(pageSize).Order(order).ScheduleStatuses(scheduleStatuses).ScheduleType(scheduleType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulesAPI.SchedulesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulesList`: SchedulesList200Response
	fmt.Fprintf(os.Stdout, "Response from `SchedulesAPI.SchedulesList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **entityIds** | **[]string** | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **scheduleStatuses** | [**[]ScheduleStatus**](ScheduleStatus.md) | Filter schedules by status (one or more) | 
 **scheduleType** | [**ScheduleType**](ScheduleType.md) | Filter schedules by a type | 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SchedulesUpdate

> []SchedulesCreate200ResponseInner SchedulesUpdate(ctx, adAccountId).ScheduleBatchUpdate(scheduleBatchUpdate).Execute()

Update schedules



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	adAccountId := "adAccountId_example" // string | 
	scheduleBatchUpdate := []openapiclient.ScheduleBatchUpdate{*openapiclient.NewScheduleBatchUpdate("Id_example", "ScheduleId_example")} // []ScheduleBatchUpdate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SchedulesAPI.SchedulesUpdate(context.Background(), adAccountId).ScheduleBatchUpdate(scheduleBatchUpdate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SchedulesAPI.SchedulesUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SchedulesUpdate`: []SchedulesCreate200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `SchedulesAPI.SchedulesUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSchedulesUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **scheduleBatchUpdate** | [**[]ScheduleBatchUpdate**](ScheduleBatchUpdate.md) |  | 

### Return type

[**[]SchedulesCreate200ResponseInner**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


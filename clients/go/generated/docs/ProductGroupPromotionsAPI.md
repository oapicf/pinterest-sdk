# \ProductGroupPromotionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductGroupPromotionsCreate**](ProductGroupPromotionsAPI.md#ProductGroupPromotionsCreate) | **Post** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**ProductGroupPromotionsGet**](ProductGroupPromotionsAPI.md#ProductGroupPromotionsGet) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**ProductGroupPromotionsList**](ProductGroupPromotionsAPI.md#ProductGroupPromotionsList) | **Get** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**ProductGroupPromotionsUpdate**](ProductGroupPromotionsAPI.md#ProductGroupPromotionsUpdate) | **Patch** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**ProductGroupsAnalytics**](ProductGroupPromotionsAPI.md#ProductGroupsAnalytics) | **Get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics



## ProductGroupPromotionsCreate

> ProductGroupPromotions ProductGroupPromotionsCreate(ctx, adAccountId).ProductGroupPromotionsCreate(productGroupPromotionsCreate).Execute()

Create product group promotions



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	productGroupPromotionsCreate := *openapiclient.NewProductGroupPromotionsCreate("2680059592705", []openapiclient.ProductGroupPromotion{*openapiclient.NewProductGroupPromotion()}) // ProductGroupPromotionsCreate | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsCreate(context.Background(), adAccountId).ProductGroupPromotionsCreate(productGroupPromotionsCreate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsCreate`: ProductGroupPromotions
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupPromotionsAPI.ProductGroupPromotionsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupPromotionsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **productGroupPromotionsCreate** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md) |  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupPromotionsGet

> ProductGroupPromotion ProductGroupPromotionsGet(ctx, adAccountId, productGroupPromotionId).Execute()

Get a product group promotion by id



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	productGroupPromotionId := "productGroupPromotionId_example" // string | Unique identifier of a product group promotion

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsGet(context.Background(), adAccountId, productGroupPromotionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsGet`: ProductGroupPromotion
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupPromotionsAPI.ProductGroupPromotionsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 
**productGroupPromotionId** | **string** | Unique identifier of a product group promotion | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupPromotionsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupPromotionsList

> ProductGroupPromotionsList200Response ProductGroupPromotionsList(ctx, adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).ProductGroupPromotionIds(productGroupPromotionIds).EntityStatuses(entityStatuses).AdGroupId(adGroupId).Execute()

Get product group promotions



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
	order := openapiclient.Pinterest.Lib.PaginationOrder("ASCENDING") // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	productGroupPromotionIds := []string{"Inner_example"} // []string | List of Product group promotion Ids. (optional)
	entityStatuses := []openapiclient.EntityStatus{openapiclient.EntityStatus("ACTIVE")} // []EntityStatus | Entity status (optional) (default to {"ACTIVE", "PAUSED"})
	adGroupId := "adGroupId_example" // string | Ad group Id. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsList(context.Background(), adAccountId).Bookmark(bookmark).PageSize(pageSize).Order(order).ProductGroupPromotionIds(productGroupPromotionIds).EntityStatuses(entityStatuses).AdGroupId(adGroupId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsList`: ProductGroupPromotionsList200Response
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupPromotionsAPI.ProductGroupPromotionsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupPromotionsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **productGroupPromotionIds** | **[]string** | List of Product group promotion Ids. | 
 **entityStatuses** | [**[]EntityStatus**](EntityStatus.md) | Entity status | [default to {&quot;ACTIVE&quot;, &quot;PAUSED&quot;}]
 **adGroupId** | **string** | Ad group Id. | 

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupPromotionsUpdate

> ProductGroupPromotions ProductGroupPromotionsUpdate(ctx, adAccountId).ProductGroupPromotionsUpdateWithRequiredBody(productGroupPromotionsUpdateWithRequiredBody).Execute()

Update product group promotions



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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	productGroupPromotionsUpdateWithRequiredBody := *openapiclient.NewProductGroupPromotionsUpdateWithRequiredBody("2680059592705", []openapiclient.ProductGroupPromotion{*openapiclient.NewProductGroupPromotion()}) // ProductGroupPromotionsUpdateWithRequiredBody | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsUpdate(context.Background(), adAccountId).ProductGroupPromotionsUpdateWithRequiredBody(productGroupPromotionsUpdateWithRequiredBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsUpdate`: ProductGroupPromotions
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupPromotionsAPI.ProductGroupPromotionsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupPromotionsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **productGroupPromotionsUpdateWithRequiredBody** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md) |  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupsAnalytics

> []ProductGroupAnalyticsItems ProductGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).ReportingTimezone(reportingTimezone).Execute()

Get product group analytics



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/oapicf/pinterest-sdk"
)

func main() {
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	productGroupIds := []string{"Inner_example"} // []string | List of Product group Ids to use to filter the results.
	columns := []openapiclient.ReportingColumnSync{openapiclient.ReportingColumnSync("SPEND_IN_MICRO_DOLLAR")} // []ReportingColumnSync | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
	granularity := openapiclient.Granularity("TOTAL") // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	clickWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
	viewWindowDays := float32(8.14) // float32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "conversionReportTime_example" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
	reportingTimezone := openapiclient.ReportingTimeZone("PINTEREST_TIME_ZONE") // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).ReportingTimezone(reportingTimezone).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupsAnalytics`: []ProductGroupAnalyticsItems
	fmt.Fprintf(os.Stdout, "Response from `ProductGroupPromotionsAPI.ProductGroupsAnalytics`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**adAccountId** | **string** | Unique identifier of an ad account. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProductGroupsAnalyticsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **productGroupIds** | **[]string** | List of Product group Ids to use to filter the results. | 
 **columns** | [**[]ReportingColumnSync**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 

 **clickWindowDays** | **float32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **float32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **viewWindowDays** | **float32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | 

### Return type

[**[]ProductGroupAnalyticsItems**](ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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

> ProductGroupPromotionResponse ProductGroupPromotionsCreate(ctx, adAccountId).ProductGroupPromotionCreateRequest(productGroupPromotionCreateRequest).Execute()

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
	productGroupPromotionCreateRequest := *openapiclient.NewProductGroupPromotionCreateRequest("2680059592705", []openapiclient.ProductGroupPromotionCreateRequestElement{*openapiclient.NewProductGroupPromotionCreateRequestElement()}) // ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsCreate(context.Background(), adAccountId).ProductGroupPromotionCreateRequest(productGroupPromotionCreateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsCreate`: ProductGroupPromotionResponse
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

 **productGroupPromotionCreateRequest** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupPromotionsGet

> ProductGroupPromotionResponse ProductGroupPromotionsGet(ctx, adAccountId, productGroupPromotionId).Execute()

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
	// response from `ProductGroupPromotionsGet`: ProductGroupPromotionResponse
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

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupPromotionsList

> ProductGroupPromotionsList200Response ProductGroupPromotionsList(ctx, adAccountId).ProductGroupPromotionIds(productGroupPromotionIds).EntityStatuses(entityStatuses).AdGroupId(adGroupId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()

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
	productGroupPromotionIds := []string{"Inner_example"} // []string | List of Product group promotion Ids. (optional)
	entityStatuses := []string{"ACTIVE"} // []string | Entity status (optional) (default to ["ACTIVE","PAUSED"])
	adGroupId := "123123123" // string | Ad group Id. (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	order := "ASCENDING" // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsList(context.Background(), adAccountId).ProductGroupPromotionIds(productGroupPromotionIds).EntityStatuses(entityStatuses).AdGroupId(adGroupId).PageSize(pageSize).Order(order).Bookmark(bookmark).Execute()
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

 **productGroupPromotionIds** | **[]string** | List of Product group promotion Ids. | 
 **entityStatuses** | **[]string** | Entity status | [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **adGroupId** | **string** | Ad group Id. | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

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

> ProductGroupPromotionResponse ProductGroupPromotionsUpdate(ctx, adAccountId).ProductGroupPromotionUpdateRequest(productGroupPromotionUpdateRequest).Execute()

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
	productGroupPromotionUpdateRequest := *openapiclient.NewProductGroupPromotionUpdateRequest("2680059592705", []openapiclient.ProductGroupPromotion{*openapiclient.NewProductGroupPromotion()}) // ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupPromotionsUpdate(context.Background(), adAccountId).ProductGroupPromotionUpdateRequest(productGroupPromotionUpdateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupPromotionsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupPromotionsUpdate`: ProductGroupPromotionResponse
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

 **productGroupPromotionUpdateRequest** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md) | Parameters to update Product group promotions | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductGroupsAnalytics

> []ProductGroupAnalyticsResponseInner ProductGroupsAnalytics(ctx, adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account.
	startDate := time.Now() // string | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
	endDate := time.Now() // string | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
	productGroupIds := []string{"Inner_example"} // []string | List of Product group Ids to use to filter the results.
	columns := []string{"TOTAL_CONVERSIONS"} // []string | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
	granularity := openapiclient.Granularity("TOTAL") // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	clickWindowDays := int32(1) // int32 | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	engagementWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
	viewWindowDays := int32(56) // int32 | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
	conversionReportTime := "TIME_OF_AD_ACTION" // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ProductGroupPromotionsAPI.ProductGroupsAnalytics(context.Background(), adAccountId).StartDate(startDate).EndDate(endDate).ProductGroupIds(productGroupIds).Columns(columns).Granularity(granularity).ClickWindowDays(clickWindowDays).EngagementWindowDays(engagementWindowDays).ViewWindowDays(viewWindowDays).ConversionReportTime(conversionReportTime).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ProductGroupPromotionsAPI.ProductGroupsAnalytics``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductGroupsAnalytics`: []ProductGroupAnalyticsResponseInner
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
 **columns** | **[]string** | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **int32** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **engagementWindowDays** | **int32** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **viewWindowDays** | **int32** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**[]ProductGroupAnalyticsResponseInner**](ProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


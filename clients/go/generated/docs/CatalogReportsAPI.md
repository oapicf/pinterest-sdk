# \CatalogReportsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsCreate**](CatalogReportsAPI.md#ReportsCreate) | **Post** /catalogs/reports | Build catalogs report
[**ReportsGet**](CatalogReportsAPI.md#ReportsGet) | **Get** /catalogs/reports | Get catalogs report
[**ReportsStats**](CatalogReportsAPI.md#ReportsStats) | **Get** /catalogs/reports/stats | List report stats



## ReportsCreate

> CatalogsCreateReportResponse ReportsCreate(ctx).CatalogsReportParameters(catalogsReportParameters).AdAccountId(adAccountId).Execute()

Build catalogs report



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
	catalogsReportParameters := openapiclient.CatalogsReportParameters{CatalogsHotelReportParameters: openapiclient.NewCatalogsHotelReportParameters("CatalogType_example", openapiclient.CatalogsHotelReportParametersReport{CatalogsReportDistributionIssueFilter: openapiclient.NewCatalogsReportDistributionIssueFilter("ReportType_example")})} // CatalogsReportParameters | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogReportsAPI.ReportsCreate(context.Background()).CatalogsReportParameters(catalogsReportParameters).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogReportsAPI.ReportsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsCreate`: CatalogsCreateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `CatalogReportsAPI.ReportsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsGet

> CatalogsReport ReportsGet(ctx).Token(token).AdAccountId(adAccountId).Execute()

Get catalogs report



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
	token := "token_example" // string | Token returned from the post request creation call
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogReportsAPI.ReportsGet(context.Background()).Token(token).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogReportsAPI.ReportsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsGet`: CatalogsReport
	fmt.Fprintf(os.Stdout, "Response from `CatalogReportsAPI.ReportsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Token returned from the post request creation call | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReportsStats

> ReportsStats200Response ReportsStats(ctx).Parameters(parameters).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

List report stats



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
	parameters := map[string][]openapiclient.CatalogsReportStatsParameters{ ... } // CatalogsReportStatsParameters | Contains the parameters for report identification.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogReportsAPI.ReportsStats(context.Background()).Parameters(parameters).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogReportsAPI.ReportsStats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsStats`: ReportsStats200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogReportsAPI.ReportsStats`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportStatsParameters**](CatalogsReportStatsParameters.md) | Contains the parameters for report identification. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**ReportsStats200Response**](ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


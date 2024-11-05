# \CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsCreate**](CatalogsAPI.md#CatalogsCreate) | **Post** /catalogs | Create catalog
[**CatalogsList**](CatalogsAPI.md#CatalogsList) | **Get** /catalogs | List catalogs
[**CatalogsProductGroupPinsList**](CatalogsAPI.md#CatalogsProductGroupPinsList) | **Get** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogsProductGroupsCreate**](CatalogsAPI.md#CatalogsProductGroupsCreate) | **Post** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsCreateMany**](CatalogsAPI.md#CatalogsProductGroupsCreateMany) | **Post** /catalogs/product_groups/multiple | Create product groups
[**CatalogsProductGroupsDelete**](CatalogsAPI.md#CatalogsProductGroupsDelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsDeleteMany**](CatalogsAPI.md#CatalogsProductGroupsDeleteMany) | **Delete** /catalogs/product_groups/multiple | Delete product groups
[**CatalogsProductGroupsGet**](CatalogsAPI.md#CatalogsProductGroupsGet) | **Get** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](CatalogsAPI.md#CatalogsProductGroupsList) | **Get** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](CatalogsAPI.md#CatalogsProductGroupsProductCountsGet) | **Get** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogsProductGroupsUpdate**](CatalogsAPI.md#CatalogsProductGroupsUpdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update single product group
[**FeedProcessingResultsList**](CatalogsAPI.md#FeedProcessingResultsList) | **Get** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**FeedsCreate**](CatalogsAPI.md#FeedsCreate) | **Post** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsAPI.md#FeedsDelete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsAPI.md#FeedsGet) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**FeedsIngest**](CatalogsAPI.md#FeedsIngest) | **Post** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**FeedsList**](CatalogsAPI.md#FeedsList) | **Get** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsAPI.md#FeedsUpdate) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsAPI.md#ItemsBatchGet) | **Get** /catalogs/items/batch/{batch_id} | Get item batch status
[**ItemsBatchPost**](CatalogsAPI.md#ItemsBatchPost) | **Post** /catalogs/items/batch | Operate on item batch
[**ItemsGet**](CatalogsAPI.md#ItemsGet) | **Get** /catalogs/items | Get catalogs items
[**ItemsIssuesList**](CatalogsAPI.md#ItemsIssuesList) | **Get** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
[**ItemsPost**](CatalogsAPI.md#ItemsPost) | **Post** /catalogs/items | Get catalogs items (POST)
[**ProductsByProductGroupFilterList**](CatalogsAPI.md#ProductsByProductGroupFilterList) | **Post** /catalogs/products/get_by_product_group_filters | List products by filter
[**ReportsCreate**](CatalogsAPI.md#ReportsCreate) | **Post** /catalogs/reports | Build catalogs report
[**ReportsGet**](CatalogsAPI.md#ReportsGet) | **Get** /catalogs/reports | Get catalogs report
[**ReportsStats**](CatalogsAPI.md#ReportsStats) | **Get** /catalogs/reports/stats | List report stats



## CatalogsCreate

> Catalog CatalogsCreate(ctx).CatalogsCreateRequest(catalogsCreateRequest).AdAccountId(adAccountId).Execute()

Create catalog



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
	catalogsCreateRequest := *openapiclient.NewCatalogsCreateRequest("CatalogType_example", "Name_example") // CatalogsCreateRequest | Request object used to created a feed.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsCreate(context.Background()).CatalogsCreateRequest(catalogsCreateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsCreate`: Catalog
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsCreateRequest** | [**CatalogsCreateRequest**](CatalogsCreateRequest.md) | Request object used to created a feed. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsList

> CatalogsList200Response CatalogsList(ctx).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()

List catalogs



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsList`: CatalogsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupPinsList

> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(ctx, productGroupId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List products by product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupPinsList(context.Background(), productGroupId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupPinsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupPinsList`: CatalogsProductGroupPinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupPinsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupPinsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsCreate

> CatalogsVerticalProductGroup CatalogsProductGroupsCreate(ctx).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()

Create product group



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
	multipleProductGroupsInner := openapiclient.multiple_product_groups_inner{CatalogsProductGroupCreateRequest: openapiclient.NewCatalogsProductGroupCreateRequest("Name_example", *openapiclient.NewCatalogsProductGroupFiltersRequest([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}), "2680059592705")} // MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsCreate(context.Background()).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsCreate`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create a single catalogs product groups. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsCreateMany

> []string CatalogsProductGroupsCreateMany(ctx).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()

Create product groups



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
	multipleProductGroupsInner := []openapiclient.MultipleProductGroupsInner{openapiclient.multiple_product_groups_inner{CatalogsProductGroupCreateRequest: openapiclient.NewCatalogsProductGroupCreateRequest("Name_example", *openapiclient.NewCatalogsProductGroupFiltersRequest([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}), "2680059592705")}} // []MultipleProductGroupsInner | Request object used to create one or more catalogs product groups.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsCreateMany(context.Background()).MultipleProductGroupsInner(multipleProductGroupsInner).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsCreateMany``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsCreateMany`: []string
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsCreateMany`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsCreateManyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**[]MultipleProductGroupsInner**](MultipleProductGroupsInner.md) | Request object used to create one or more catalogs product groups. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

**[]string**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDelete

> CatalogsProductGroupsDelete(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Delete product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CatalogsAPI.CatalogsProductGroupsDelete(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDeleteMany

> CatalogsProductGroupsDeleteMany(ctx).Id(id).AdAccountId(adAccountId).Execute()

Delete product groups



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
	id := []int32{int32(123)} // []int32 | Comma-separated list of product group ids
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CatalogsAPI.CatalogsProductGroupsDeleteMany(context.Background()).Id(id).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsDeleteMany``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsDeleteManyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **[]int32** | Comma-separated list of product group ids | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsGet

> CatalogsVerticalProductGroup CatalogsProductGroupsGet(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Get product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsGet(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsGet`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsList

> CatalogsProductGroupsList200Response CatalogsProductGroupsList(ctx).Id(id).FeedId(feedId).CatalogId(catalogId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()

List product groups



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
	id := []int32{int32(123)} // []int32 | Comma-separated list of product group ids (optional)
	feedId := "feedId_example" // string | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
	catalogId := "catalogId_example" // string | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsList(context.Background()).Id(id).FeedId(feedId).CatalogId(catalogId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsList`: CatalogsProductGroupsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **[]int32** | Comma-separated list of product group ids | 
 **feedId** | **string** | Filter entities for a given feed_id. If not given, all feeds are considered. | 
 **catalogId** | **string** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsProductCountsGet

> CatalogsProductGroupProductCountsVertical CatalogsProductGroupsProductCountsGet(ctx, productGroupId).AdAccountId(adAccountId).Execute()

Get product counts



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsProductCountsGet(context.Background(), productGroupId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsProductCountsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsProductCountsGet`: CatalogsProductGroupProductCountsVertical
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsProductCountsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsProductCountsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsUpdate

> CatalogsVerticalProductGroup CatalogsProductGroupsUpdate(ctx, productGroupId).CatalogsProductGroupsUpdateRequest(catalogsProductGroupsUpdateRequest).AdAccountId(adAccountId).Execute()

Update single product group



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
	productGroupId := "productGroupId_example" // string | Unique identifier of a product group
	catalogsProductGroupsUpdateRequest := openapiclient.catalogs_product_groups_update_request{CatalogsProductGroupUpdateRequest: openapiclient.NewCatalogsProductGroupUpdateRequest()} // CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsProductGroupsUpdate(context.Background(), productGroupId).CatalogsProductGroupsUpdateRequest(catalogsProductGroupsUpdateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsProductGroupsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsProductGroupsUpdate`: CatalogsVerticalProductGroup
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsProductGroupsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string** | Unique identifier of a product group | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **catalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md) | Request object used to Update a catalogs product group. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedProcessingResultsList

> FeedProcessingResultsList200Response FeedProcessingResultsList(ctx, feedId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()

List feed processing results



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
	feedId := "feedId_example" // string | Unique identifier of a feed
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedProcessingResultsList(context.Background(), feedId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedProcessingResultsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedProcessingResultsList`: FeedProcessingResultsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedProcessingResultsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string** | Unique identifier of a feed | 

### Other Parameters

Other parameters are passed through a pointer to a apiFeedProcessingResultsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsCreate

> CatalogsFeed FeedsCreate(ctx).FeedsCreateRequest(feedsCreateRequest).AdAccountId(adAccountId).Execute()

Create feed



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
	feedsCreateRequest := openapiclient.feeds_create_request{CatalogsFeedsCreateRequest: openapiclient.NewCatalogsFeedsCreateRequest("Name_example", openapiclient.CatalogsFormat("TSV"), "Location_example")} // FeedsCreateRequest | Request object used to created a feed.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedsCreate(context.Background()).FeedsCreateRequest(feedsCreateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsCreate`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeedsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md) | Request object used to created a feed. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsDelete

> FeedsDelete(ctx, feedId).AdAccountId(adAccountId).Execute()

Delete feed



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
	feedId := "feedId_example" // string | Unique identifier of a feed
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.CatalogsAPI.FeedsDelete(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string** | Unique identifier of a feed | 

### Other Parameters

Other parameters are passed through a pointer to a apiFeedsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsGet

> CatalogsFeed FeedsGet(ctx, feedId).AdAccountId(adAccountId).Execute()

Get feed



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
	feedId := "feedId_example" // string | Unique identifier of a feed
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedsGet(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsGet`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string** | Unique identifier of a feed | 

### Other Parameters

Other parameters are passed through a pointer to a apiFeedsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsIngest

> CatalogsFeedIngestion FeedsIngest(ctx, feedId).AdAccountId(adAccountId).Execute()

Ingest feed items



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
	feedId := "feedId_example" // string | Unique identifier of a feed
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedsIngest(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsIngest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsIngest`: CatalogsFeedIngestion
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedsIngest`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string** | Unique identifier of a feed | 

### Other Parameters

Other parameters are passed through a pointer to a apiFeedsIngestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsList

> FeedsList200Response FeedsList(ctx).Bookmark(bookmark).PageSize(pageSize).CatalogId(catalogId).AdAccountId(adAccountId).Execute()

List feeds



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
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	catalogId := "catalogId_example" // string | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).CatalogId(catalogId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsList`: FeedsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeedsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **catalogId** | **string** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsUpdate

> CatalogsFeed FeedsUpdate(ctx, feedId).FeedsUpdateRequest(feedsUpdateRequest).AdAccountId(adAccountId).Execute()

Update feed



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
	feedId := "feedId_example" // string | Unique identifier of a feed
	feedsUpdateRequest := openapiclient.feeds_update_request{CatalogsFeedsUpdateRequest: openapiclient.NewCatalogsFeedsUpdateRequest()} // FeedsUpdateRequest | Request object used to update a feed.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.FeedsUpdate(context.Background(), feedId).FeedsUpdateRequest(feedsUpdateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.FeedsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsUpdate`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.FeedsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string** | Unique identifier of a feed | 

### Other Parameters

Other parameters are passed through a pointer to a apiFeedsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **feedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md) | Request object used to update a feed. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchGet

> CatalogsItemsBatch ItemsBatchGet(ctx, batchId).AdAccountId(adAccountId).Execute()

Get item batch status



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
	batchId := "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" // string | Id of a catalogs items batch to fetch
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ItemsBatchGet(context.Background(), batchId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ItemsBatchGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsBatchGet`: CatalogsItemsBatch
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ItemsBatchGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string** | Id of a catalogs items batch to fetch | 

### Other Parameters

Other parameters are passed through a pointer to a apiItemsBatchGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchPost

> CatalogsItemsBatch ItemsBatchPost(ctx).ItemsBatchPostRequest(itemsBatchPostRequest).AdAccountId(adAccountId).Execute()

Operate on item batch



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
	itemsBatchPostRequest := openapiclient.items_batch_post_request{CatalogsItemsBatchRequest: openapiclient.CatalogsItemsBatchRequest{CatalogsItemsCreateBatchRequest: openapiclient.NewCatalogsItemsCreateBatchRequest(openapiclient.Country("AD"), *openapiclient.NewCatalogsItemsRequestLanguage(), openapiclient.BatchOperation("UPDATE"), []openapiclient.ItemCreateBatchRecord{*openapiclient.NewItemCreateBatchRecord()})}} // ItemsBatchPostRequest | Request object used to create catalogs items in a batch
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ItemsBatchPost(context.Background()).ItemsBatchPostRequest(itemsBatchPostRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ItemsBatchPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsBatchPost`: CatalogsItemsBatch
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ItemsBatchPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsBatchPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md) | Request object used to create catalogs items in a batch | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsGet

> CatalogsItems ItemsGet(ctx).Country(country).Language(language).AdAccountId(adAccountId).ItemIds(itemIds).Filters(filters).Execute()

Get catalogs items



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
	country := "US" // string | Country for the Catalogs Items
	language := "EN" // string | Language for the Catalogs Items
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	itemIds := []string{"Inner_example"} // []string | This parameter is deprecated. Use filters instead. (optional)
	filters := openapiclient.CatalogsItemsFilters{CatalogsCreativeAssetsItemsFilter: openapiclient.NewCatalogsCreativeAssetsItemsFilter("CatalogType_example", []string{"CreativeAssetsIds_example"})} // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ItemsGet(context.Background()).Country(country).Language(language).AdAccountId(adAccountId).ItemIds(itemIds).Filters(filters).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ItemsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsGet`: CatalogsItems
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ItemsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string** | Country for the Catalogs Items | 
 **language** | **string** | Language for the Catalogs Items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **itemIds** | **[]string** | This parameter is deprecated. Use filters instead. | 
 **filters** | [**CatalogsItemsFilters**](CatalogsItemsFilters.md) | Identifies items to be retrieved. This is a required parameter. | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsIssuesList

> ItemsIssuesList200Response ItemsIssuesList(ctx, processingResultId).Bookmark(bookmark).PageSize(pageSize).ItemNumbers(itemNumbers).ItemValidationIssue(itemValidationIssue).AdAccountId(adAccountId).Execute()

List item issues



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
	processingResultId := "5224831246441439241" // string | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	itemNumbers := []int32{int32(123)} // []int32 | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
	itemValidationIssue := openapiclient.CatalogsItemValidationIssue("AD_LINK_FORMAT_WARNING") // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ItemsIssuesList(context.Background(), processingResultId).Bookmark(bookmark).PageSize(pageSize).ItemNumbers(itemNumbers).ItemValidationIssue(itemValidationIssue).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ItemsIssuesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsIssuesList`: ItemsIssuesList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ItemsIssuesList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**processingResultId** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 

### Other Parameters

Other parameters are passed through a pointer to a apiItemsIssuesListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **itemNumbers** | **[]int32** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | 
 **itemValidationIssue** | [**CatalogsItemValidationIssue**](CatalogsItemValidationIssue.md) | Filter item validation issues that have a given type of item validation issue. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsPost

> CatalogsItems ItemsPost(ctx).CatalogsItemsRequest(catalogsItemsRequest).AdAccountId(adAccountId).Execute()

Get catalogs items (POST)



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
	catalogsItemsRequest := *openapiclient.NewCatalogsItemsRequest(openapiclient.Country("AD"), *openapiclient.NewCatalogsItemsRequestLanguage(), openapiclient.CatalogsItemsPostFilters{CatalogsCreativeAssetsItemsPostFilter: openapiclient.NewCatalogsCreativeAssetsItemsPostFilter("CatalogType_example", []string{"CreativeAssetsIds_example"})}) // CatalogsItemsRequest | Request object used to get catalogs items
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ItemsPost(context.Background()).CatalogsItemsRequest(catalogsItemsRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ItemsPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsPost`: CatalogsItems
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ItemsPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md) | Request object used to get catalogs items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductsByProductGroupFilterList

> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(ctx).CatalogsListProductsByFilterRequest(catalogsListProductsByFilterRequest).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List products by filter



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
	catalogsListProductsByFilterRequest := openapiclient.CatalogsListProductsByFilterRequest{CatalogsListProductsByFeedBasedFilter: openapiclient.NewCatalogsListProductsByFeedBasedFilter("2680059592705", *openapiclient.NewCatalogsProductGroupFilters([]openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}, []openapiclient.CatalogsProductGroupFilterKeys{*openapiclient.NewCatalogsProductGroupFilterKeys(*openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupPricingCriteria(float32(123)), *openapiclient.NewCatalogsProductGroupCurrencyCriteria(openapiclient.NonNullableCatalogsCurrency("AED")), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}), *openapiclient.NewCatalogsProductGroupMultipleGenderCriteria([]openapiclient.Gender{openapiclient.Gender("FEMALE")}), *openapiclient.NewCatalogsProductGroupMultipleMediaTypesCriteria([]openapiclient.MediaType{openapiclient.MediaType("IMAGE")}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringListCriteria([][]string{[]string{"Values_example"}}), *openapiclient.NewCatalogsProductGroupMultipleStringCriteria([]string{"Values_example"}))}))} // CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ProductsByProductGroupFilterList(context.Background()).CatalogsListProductsByFilterRequest(catalogsListProductsByFilterRequest).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ProductsByProductGroupFilterList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProductsByProductGroupFilterList`: CatalogsProductGroupPinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ProductsByProductGroupFilterList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiProductsByProductGroupFilterListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md) | Object holding a group of filters for a catalog product group | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	catalogsReportParameters := openapiclient.CatalogsReportParameters{CatalogsHotelReportParameters: openapiclient.NewCatalogsHotelReportParameters("CatalogType_example", openapiclient.CatalogsHotelReportParameters_report{CatalogsReportDistributionIssueFilter: openapiclient.NewCatalogsReportDistributionIssueFilter("ReportType_example")})} // CatalogsReportParameters | Request object to asynchronously create a report.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ReportsCreate(context.Background()).CatalogsReportParameters(catalogsReportParameters).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ReportsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsCreate`: CatalogsCreateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ReportsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) | Request object to asynchronously create a report. | 
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
	token := "token_example" // string | Token returned from async build report call
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ReportsGet(context.Background()).Token(token).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ReportsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsGet`: CatalogsReport
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ReportsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string** | Token returned from async build report call | 
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

> ReportsStats200Response ReportsStats(ctx).Parameters(parameters).AdAccountId(adAccountId).PageSize(pageSize).Bookmark(bookmark).Execute()

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
	parameters := openapiclient.CatalogsReportParameters{CatalogsHotelReportParameters: openapiclient.NewCatalogsHotelReportParameters("CatalogType_example", openapiclient.CatalogsHotelReportParameters_report{CatalogsReportDistributionIssueFilter: openapiclient.NewCatalogsReportDistributionIssueFilter("ReportType_example")})} // CatalogsReportParameters | Contains the parameters for report identification.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.ReportsStats(context.Background()).Parameters(parameters).AdAccountId(adAccountId).PageSize(pageSize).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.ReportsStats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReportsStats`: ReportsStats200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.ReportsStats`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiReportsStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md) | Contains the parameters for report identification. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

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


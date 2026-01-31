# \CatalogFeedsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FeedProcessingResultsList**](CatalogFeedsAPI.md#FeedProcessingResultsList) | **Get** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**FeedsCreate**](CatalogFeedsAPI.md#FeedsCreate) | **Post** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogFeedsAPI.md#FeedsDelete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogFeedsAPI.md#FeedsGet) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**FeedsIngest**](CatalogFeedsAPI.md#FeedsIngest) | **Post** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**FeedsList**](CatalogFeedsAPI.md#FeedsList) | **Get** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogFeedsAPI.md#FeedsUpdate) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**ItemsIssuesList**](CatalogFeedsAPI.md#ItemsIssuesList) | **Get** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues



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
	resp, r, err := apiClient.CatalogFeedsAPI.FeedProcessingResultsList(context.Background(), feedId).Bookmark(bookmark).PageSize(pageSize).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedProcessingResultsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedProcessingResultsList`: FeedProcessingResultsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedProcessingResultsList`: %v\n", resp)
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
	feedsCreateRequest := openapiclient.feeds_create_request{CatalogsFeedsCreateRequest: openapiclient.NewCatalogsFeedsCreateRequest(openapiclient.CatalogsFormat("TSV"), "Location_example", "Name_example")} // FeedsCreateRequest | Request object used to created a feed.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogFeedsAPI.FeedsCreate(context.Background()).FeedsCreateRequest(feedsCreateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsCreate`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedsCreate`: %v\n", resp)
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
	r, err := apiClient.CatalogFeedsAPI.FeedsDelete(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsDelete``: %v\n", err)
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
	resp, r, err := apiClient.CatalogFeedsAPI.FeedsGet(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsGet`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedsGet`: %v\n", resp)
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
	resp, r, err := apiClient.CatalogFeedsAPI.FeedsIngest(context.Background(), feedId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsIngest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsIngest`: CatalogsFeedIngestion
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedsIngest`: %v\n", resp)
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
	resp, r, err := apiClient.CatalogFeedsAPI.FeedsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).CatalogId(catalogId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsList`: FeedsList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedsList`: %v\n", resp)
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
	resp, r, err := apiClient.CatalogFeedsAPI.FeedsUpdate(context.Background(), feedId).FeedsUpdateRequest(feedsUpdateRequest).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.FeedsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FeedsUpdate`: CatalogsFeed
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.FeedsUpdate`: %v\n", resp)
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
	itemValidationIssue := openapiclient.CatalogsItemValidationIssue("AD_IMAGE_0_LINK_LENGTH_TOO_LONG") // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogFeedsAPI.ItemsIssuesList(context.Background(), processingResultId).Bookmark(bookmark).PageSize(pageSize).ItemNumbers(itemNumbers).ItemValidationIssue(itemValidationIssue).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogFeedsAPI.ItemsIssuesList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ItemsIssuesList`: ItemsIssuesList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogFeedsAPI.ItemsIssuesList`: %v\n", resp)
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


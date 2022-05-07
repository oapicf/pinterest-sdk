# \CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupsCreate**](CatalogsApi.md#CatalogsProductGroupsCreate) | **Post** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsDelete**](CatalogsApi.md#CatalogsProductGroupsDelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsList**](CatalogsApi.md#CatalogsProductGroupsList) | **Get** /catalogs/product_groups | Get product groups list
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#CatalogsProductGroupsUpdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update product group
[**FeedProcessingResultsList**](CatalogsApi.md#FeedProcessingResultsList) | **Get** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**FeedsCreate**](CatalogsApi.md#FeedsCreate) | **Post** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#FeedsDelete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#FeedsGet) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**FeedsList**](CatalogsApi.md#FeedsList) | **Get** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#FeedsUpdate) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#ItemsBatchGet) | **Get** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**ItemsBatchPost**](CatalogsApi.md#ItemsBatchPost) | **Post** /catalogs/items/batch | Perform an operation on an item batch
[**ItemsGet**](CatalogsApi.md#ItemsGet) | **Get** /catalogs/items | Get catalogs items



## CatalogsProductGroupsCreate

> interface{} CatalogsProductGroupsCreate(ctx).CatalogsProductGroupCreateRequest(catalogsProductGroupCreateRequest).Execute()

Create product group



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    catalogsProductGroupCreateRequest := *openapiclient.NewCatalogsProductGroupCreateRequest("2680059592705", "Name_example", *openapiclient.NewCatalogsProductGroupFilters()) // CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.CatalogsProductGroupsCreate(context.Background()).CatalogsProductGroupCreateRequest(catalogsProductGroupCreateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.CatalogsProductGroupsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CatalogsProductGroupsCreate`: interface{}
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.CatalogsProductGroupsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md) | Request object used to created a catalogs product group. | 

### Return type

**interface{}**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDelete

> CatalogsProductGroupsDelete(ctx, productGroupId).Execute()

Delete product group



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    productGroupId := "productGroupId_example" // string | Unique identifier of a product group

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.CatalogsProductGroupsDelete(context.Background(), productGroupId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.CatalogsProductGroupsDelete``: %v\n", err)
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


## CatalogsProductGroupsList

> Paginated CatalogsProductGroupsList(ctx).FeedId(feedId).Bookmark(bookmark).PageSize(pageSize).Execute()

Get product groups list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    feedId := "feedId_example" // string | Unique identifier of a feed
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.CatalogsProductGroupsList(context.Background()).FeedId(feedId).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.CatalogsProductGroupsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CatalogsProductGroupsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.CatalogsProductGroupsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsProductGroupsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsUpdate

> CatalogsProductGroup CatalogsProductGroupsUpdate(ctx, productGroupId).CatalogsProductGroupUpdateRequest(catalogsProductGroupUpdateRequest).Execute()

Update product group



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    productGroupId := "productGroupId_example" // string | Unique identifier of a product group
    catalogsProductGroupUpdateRequest := *openapiclient.NewCatalogsProductGroupUpdateRequest("2680059592705", "Name_example", *openapiclient.NewCatalogsProductGroupFilters()) // CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.CatalogsProductGroupsUpdate(context.Background(), productGroupId).CatalogsProductGroupUpdateRequest(catalogsProductGroupUpdateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.CatalogsProductGroupsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CatalogsProductGroupsUpdate`: CatalogsProductGroup
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.CatalogsProductGroupsUpdate`: %v\n", resp)
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

 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md) | Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedProcessingResultsList

> Paginated FeedProcessingResultsList(ctx, feedId).Bookmark(bookmark).PageSize(pageSize).Execute()

List processing results for a given feed



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    feedId := "feedId_example" // string | Unique identifier of a feed
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedProcessingResultsList(context.Background(), feedId).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedProcessingResultsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FeedProcessingResultsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.FeedProcessingResultsList`: %v\n", resp)
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
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsCreate

> CatalogsFeed FeedsCreate(ctx).CatalogsFeedsCreateRequest(catalogsFeedsCreateRequest).Execute()

Create feed



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    catalogsFeedsCreateRequest := *openapiclient.NewCatalogsFeedsCreateRequest("Name_example", openapiclient.CatalogsFormat("TSV"), "Location_example") // CatalogsFeedsCreateRequest | Request object used to created a feed.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedsCreate(context.Background()).CatalogsFeedsCreateRequest(catalogsFeedsCreateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FeedsCreate`: CatalogsFeed
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.FeedsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeedsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md) | Request object used to created a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsDelete

> FeedsDelete(ctx, feedId).Execute()

Delete feed



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    feedId := "feedId_example" // string | Unique identifier of a feed

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedsDelete(context.Background(), feedId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedsDelete``: %v\n", err)
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


## FeedsGet

> CatalogsFeed FeedsGet(ctx, feedId).Execute()

Get feed



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    feedId := "feedId_example" // string | Unique identifier of a feed

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedsGet(context.Background(), feedId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FeedsGet`: CatalogsFeed
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.FeedsGet`: %v\n", resp)
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


### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsList

> Paginated FeedsList(ctx).Bookmark(bookmark).PageSize(pageSize).Execute()

List feeds



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FeedsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.FeedsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFeedsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsUpdate

> CatalogsFeed FeedsUpdate(ctx, feedId).CatalogsFeedsUpdateRequest(catalogsFeedsUpdateRequest).Execute()

Update feed



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    feedId := "feedId_example" // string | Unique identifier of a feed
    catalogsFeedsUpdateRequest := *openapiclient.NewCatalogsFeedsUpdateRequest() // CatalogsFeedsUpdateRequest | Request object used to update a feed.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.FeedsUpdate(context.Background(), feedId).CatalogsFeedsUpdateRequest(catalogsFeedsUpdateRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.FeedsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FeedsUpdate`: CatalogsFeed
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.FeedsUpdate`: %v\n", resp)
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

 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md) | Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchGet

> CatalogsItemsBatch ItemsBatchGet(ctx, batchId).Execute()

Get catalogs items batch



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    batchId := "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" // string | Id of a catalogs items batch to fetch

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.ItemsBatchGet(context.Background(), batchId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.ItemsBatchGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ItemsBatchGet`: CatalogsItemsBatch
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.ItemsBatchGet`: %v\n", resp)
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


### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchPost

> CatalogsItemsBatch ItemsBatchPost(ctx).CatalogsItemsBatchRequest(catalogsItemsBatchRequest).Execute()

Perform an operation on an item batch



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    catalogsItemsBatchRequest := *openapiclient.NewCatalogsItemsBatchRequest() // CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.ItemsBatchPost(context.Background()).CatalogsItemsBatchRequest(catalogsItemsBatchRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.ItemsBatchPost``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ItemsBatchPost`: CatalogsItemsBatch
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.ItemsBatchPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsBatchPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md) | Request object used to create catalogs items in a batch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsGet

> CatalogsItems ItemsGet(ctx).Country(country).ItemIds(itemIds).Language(language).Execute()

Get catalogs items



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    country := "US" // string | Country for the Catalogs Items
    itemIds := []string{"Inner_example"} // []string | Catalos Item ids
    language := "EN" // string | Language for the Catalogs Items

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.CatalogsApi.ItemsGet(context.Background()).Country(country).ItemIds(itemIds).Language(language).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `CatalogsApi.ItemsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ItemsGet`: CatalogsItems
    fmt.Fprintf(os.Stdout, "Response from `CatalogsApi.ItemsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiItemsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string** | Country for the Catalogs Items | 
 **itemIds** | **[]string** | Catalos Item ids | 
 **language** | **string** | Language for the Catalogs Items | 

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


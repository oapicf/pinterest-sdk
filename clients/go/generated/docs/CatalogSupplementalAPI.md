# \CatalogSupplementalAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalAPI.md#CatalogsLocalInventoryItemsBatchOperate) | **Post** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**CatalogsLocalInventoryItemsPost**](CatalogSupplementalAPI.md#CatalogsLocalInventoryItemsPost) | **Post** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**CatalogsLocalStoresCreate**](CatalogSupplementalAPI.md#CatalogsLocalStoresCreate) | **Post** /catalogs/{catalog_id}/local_stores | Create local stores
[**CatalogsLocalStoresDelete**](CatalogSupplementalAPI.md#CatalogsLocalStoresDelete) | **Delete** /catalogs/{catalog_id}/local_stores | Delete local stores
[**CatalogsLocalStoresList**](CatalogSupplementalAPI.md#CatalogsLocalStoresList) | **Get** /catalogs/{catalog_id}/local_stores | List local stores
[**CatalogsLocalStoresUpdate**](CatalogSupplementalAPI.md#CatalogsLocalStoresUpdate) | **Patch** /catalogs/{catalog_id}/local_stores | Update local stores
[**CatalogsSupplementalItemsBatchGet**](CatalogSupplementalAPI.md#CatalogsSupplementalItemsBatchGet) | **Get** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status



## CatalogsLocalInventoryItemsBatchOperate

> SupplementalItemsBatchResponse CatalogsLocalInventoryItemsBatchOperate(ctx, catalogId).LocalInventoryItemsBatchCreate(localInventoryItemsBatchCreate).AdAccountId(adAccountId).Execute()

Operate on local inventory item batch



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	localInventoryItemsBatchCreate := *openapiclient.NewLocalInventoryItemsBatchCreate([]openapiclient.LocalInventoryOperation{openapiclient.LocalInventoryOperation{LocalInventoryCreateOperation: openapiclient.NewLocalInventoryCreateOperation(*openapiclient.NewRetailLocalInventoryItemAttributes(openapiclient.ItemAvailability("in stock"), "49.99 USD"), "item_id_1", "Operation_example", "store_1")}}) // LocalInventoryItemsBatchCreate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalInventoryItemsBatchOperate(context.Background(), catalogId).LocalInventoryItemsBatchCreate(localInventoryItemsBatchCreate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalInventoryItemsBatchOperate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalInventoryItemsBatchOperate`: SupplementalItemsBatchResponse
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalInventoryItemsBatchOperate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalInventoryItemsBatchOperateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **localInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsLocalInventoryItemsPost

> LocalInventoryItemsGet CatalogsLocalInventoryItemsPost(ctx, catalogId).LocalInventoryItemsGetCreate(localInventoryItemsGetCreate).AdAccountId(adAccountId).Execute()

Get local inventory items (POST)



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	localInventoryItemsGetCreate := *openapiclient.NewLocalInventoryItemsGetCreate([]openapiclient.ItemIdStoreCodePair{*openapiclient.NewItemIdStoreCodePair("item_id_1", "store_1")}) // LocalInventoryItemsGetCreate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalInventoryItemsPost(context.Background(), catalogId).LocalInventoryItemsGetCreate(localInventoryItemsGetCreate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalInventoryItemsPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalInventoryItemsPost`: LocalInventoryItemsGet
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalInventoryItemsPost`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalInventoryItemsPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **localInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsLocalStoresCreate

> []CatalogsLocalStoresCreate200ResponseInner CatalogsLocalStoresCreate(ctx, catalogId).LocalStoreCreate(localStoreCreate).AdAccountId(adAccountId).Execute()

Create local stores



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	localStoreCreate := []openapiclient.LocalStoreCreate{*openapiclient.NewLocalStoreCreate(openapiclient.Country("AD"), "Sunnyvale Store", "store_1")} // []LocalStoreCreate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalStoresCreate(context.Background(), catalogId).LocalStoreCreate(localStoreCreate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalStoresCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalStoresCreate`: []CatalogsLocalStoresCreate200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalStoresCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalStoresCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **localStoreCreate** | [**[]LocalStoreCreate**](LocalStoreCreate.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**[]CatalogsLocalStoresCreate200ResponseInner**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsLocalStoresDelete

> []CatalogsLocalStoresDelete200ResponseInner CatalogsLocalStoresDelete(ctx, catalogId).Ids(ids).AdAccountId(adAccountId).Execute()

Delete local stores



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	ids := []string{"Inner_example"} // []string | List of local store IDs to filter by.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalStoresDelete(context.Background(), catalogId).Ids(ids).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalStoresDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalStoresDelete`: []CatalogsLocalStoresDelete200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalStoresDelete`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalStoresDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ids** | **[]string** | List of local store IDs to filter by. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**[]CatalogsLocalStoresDelete200ResponseInner**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsLocalStoresList

> CatalogsLocalStoresList200Response CatalogsLocalStoresList(ctx, catalogId).Ids(ids).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

List local stores



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	ids := []string{"Inner_example"} // []string | List of local store IDs to filter by. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalStoresList(context.Background(), catalogId).Ids(ids).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalStoresList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalStoresList`: CatalogsLocalStoresList200Response
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalStoresList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalStoresListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ids** | **[]string** | List of local store IDs to filter by. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsLocalStoresUpdate

> []CatalogsLocalStoresCreate200ResponseInner CatalogsLocalStoresUpdate(ctx, catalogId).LocalStoreBatchUpdate(localStoreBatchUpdate).AdAccountId(adAccountId).Execute()

Update local stores



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	localStoreBatchUpdate := []openapiclient.LocalStoreBatchUpdate{*openapiclient.NewLocalStoreBatchUpdate("1234567890")} // []LocalStoreBatchUpdate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsLocalStoresUpdate(context.Background(), catalogId).LocalStoreBatchUpdate(localStoreBatchUpdate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsLocalStoresUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsLocalStoresUpdate`: []CatalogsLocalStoresCreate200ResponseInner
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsLocalStoresUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsLocalStoresUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **localStoreBatchUpdate** | [**[]LocalStoreBatchUpdate**](LocalStoreBatchUpdate.md) |  | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**[]CatalogsLocalStoresCreate200ResponseInner**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsSupplementalItemsBatchGet

> SupplementalItemsBatchResponse CatalogsSupplementalItemsBatchGet(ctx, catalogId, batchId).AdAccountId(adAccountId).Execute()

Get supplemental items batch status



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
	catalogId := "catalogId_example" // string | Unique identifier of a catalog.
	batchId := "batchId_example" // string | Unique identifier of an items batch operation.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogSupplementalAPI.CatalogsSupplementalItemsBatchGet(context.Background(), catalogId, batchId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogSupplementalAPI.CatalogsSupplementalItemsBatchGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsSupplementalItemsBatchGet`: SupplementalItemsBatchResponse
	fmt.Fprintf(os.Stdout, "Response from `CatalogSupplementalAPI.CatalogsSupplementalItemsBatchGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogId** | **string** | Unique identifier of a catalog. | 
**batchId** | **string** | Unique identifier of an items batch operation. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsSupplementalItemsBatchGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


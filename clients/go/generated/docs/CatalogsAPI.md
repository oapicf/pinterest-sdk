# \CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsAvailableFilterValues**](CatalogsAPI.md#CatalogsAvailableFilterValues) | **Get** /catalogs/available_filter_values | List available filter values
[**CatalogsCreate**](CatalogsAPI.md#CatalogsCreate) | **Post** /catalogs | Create catalog
[**CatalogsList**](CatalogsAPI.md#CatalogsList) | **Get** /catalogs | List catalogs



## CatalogsAvailableFilterValues

> CatalogsAvailableFilterValues CatalogsAvailableFilterValues(ctx).CatalogId(catalogId).FeedId(feedId).Country(country).Language(language).AdAccountId(adAccountId).Execute()

List available filter values



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
	catalogId := "catalogId_example" // string | Filter entities for a given catalog_id.
	feedId := "feedId_example" // string | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
	country := openapiclient.Country("AD") // Country | Country for the Catalogs Items (optional)
	language := openapiclient.CatalogsLocale("af-ZA") // CatalogsLocale | Language for the Catalogs Items (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsAvailableFilterValues(context.Background()).CatalogId(catalogId).FeedId(feedId).Country(country).Language(language).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CatalogsAPI.CatalogsAvailableFilterValues``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CatalogsAvailableFilterValues`: CatalogsAvailableFilterValues
	fmt.Fprintf(os.Stdout, "Response from `CatalogsAPI.CatalogsAvailableFilterValues`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCatalogsAvailableFilterValuesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string** | Filter entities for a given catalog_id. | 
 **feedId** | **string** | Filter entities for a given feed_id. If not given, all feeds are considered. | 
 **country** | [**Country**](Country.md) | Country for the Catalogs Items | 
 **language** | [**CatalogsLocale**](CatalogsLocale.md) | Language for the Catalogs Items | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsCreate

> Catalog CatalogsCreate(ctx).CatalogCreate(catalogCreate).AdAccountId(adAccountId).Execute()

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
	catalogCreate := *openapiclient.NewCatalogCreate(openapiclient.CatalogsType("RETAIL"), "Name_example") // CatalogCreate | 
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsCreate(context.Background()).CatalogCreate(catalogCreate).AdAccountId(adAccountId).Execute()
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
 **catalogCreate** | [**CatalogCreate**](CatalogCreate.md) |  | 
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

> CatalogsList200Response CatalogsList(ctx).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

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
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CatalogsAPI.CatalogsList(context.Background()).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
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
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

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


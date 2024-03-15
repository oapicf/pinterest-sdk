# \SearchAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchPartnerPins**](SearchAPI.md#SearchPartnerPins) | **Get** /search/partner/pins | Search pins by a given search term
[**SearchUserBoardsGet**](SearchAPI.md#SearchUserBoardsGet) | **Get** /search/boards | Search user&#39;s boards
[**SearchUserPinsList**](SearchAPI.md#SearchUserPinsList) | **Get** /search/pins | Search user&#39;s Pins



## SearchPartnerPins

> SearchPartnerPins200Response SearchPartnerPins(ctx).Term(term).CountryCode(countryCode).Bookmark(bookmark).Locale(locale).Limit(limit).Execute()

Search pins by a given search term



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
	term := "term_example" // string | Search term to look up pins.
	countryCode := "US" // string | Two letter country code (ISO 3166-1 alpha-2)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	locale := "locale_example" // string | Search locale. (optional)
	limit := int32(4) // int32 | Max search result size (optional) (default to 10)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SearchAPI.SearchPartnerPins(context.Background()).Term(term).CountryCode(countryCode).Bookmark(bookmark).Locale(locale).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SearchAPI.SearchPartnerPins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchPartnerPins`: SearchPartnerPins200Response
	fmt.Fprintf(os.Stdout, "Response from `SearchAPI.SearchPartnerPins`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchPartnerPinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string** | Search term to look up pins. | 
 **countryCode** | **string** | Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **locale** | **string** | Search locale. | 
 **limit** | **int32** | Max search result size | [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchUserBoardsGet

> SearchUserBoardsGet200Response SearchUserBoardsGet(ctx).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Query(query).Execute()

Search user's boards



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
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	query := "query_example" // string | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SearchAPI.SearchUserBoardsGet(context.Background()).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Query(query).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SearchAPI.SearchUserBoardsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchUserBoardsGet`: SearchUserBoardsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `SearchAPI.SearchUserBoardsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchUserBoardsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchUserPinsList

> PinsList200Response SearchUserPinsList(ctx).Query(query).AdAccountId(adAccountId).Bookmark(bookmark).Execute()

Search user's Pins



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
	query := "Plants" // string | Search query. Can contain pin description keywords or comma-separated pin IDs.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SearchAPI.SearchUserPinsList(context.Background()).Query(query).AdAccountId(adAccountId).Bookmark(bookmark).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SearchAPI.SearchUserPinsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchUserPinsList`: PinsList200Response
	fmt.Fprintf(os.Stdout, "Response from `SearchAPI.SearchUserPinsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchUserPinsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **string** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


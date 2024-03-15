# \BoardsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](BoardsAPI.md#BoardSectionsCreate) | **Post** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](BoardsAPI.md#BoardSectionsDelete) | **Delete** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](BoardsAPI.md#BoardSectionsList) | **Get** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](BoardsAPI.md#BoardSectionsListPins) | **Get** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](BoardsAPI.md#BoardSectionsUpdate) | **Patch** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](BoardsAPI.md#BoardsCreate) | **Post** /boards | Create board
[**BoardsDelete**](BoardsAPI.md#BoardsDelete) | **Delete** /boards/{board_id} | Delete board
[**BoardsGet**](BoardsAPI.md#BoardsGet) | **Get** /boards/{board_id} | Get board
[**BoardsList**](BoardsAPI.md#BoardsList) | **Get** /boards | List boards
[**BoardsListPins**](BoardsAPI.md#BoardsListPins) | **Get** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](BoardsAPI.md#BoardsUpdate) | **Patch** /boards/{board_id} | Update board



## BoardSectionsCreate

> BoardSection BoardSectionsCreate(ctx, boardId).BoardSection(boardSection).AdAccountId(adAccountId).Execute()

Create board section



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	boardSection := *openapiclient.NewBoardSection("Salads") // BoardSection | Create a board section.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardSectionsCreate(context.Background(), boardId).BoardSection(boardSection).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardSectionsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardSectionsCreate`: BoardSection
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardSectionsCreate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardSectionsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **boardSection** | [**BoardSection**](BoardSection.md) | Create a board section. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsDelete

> BoardSectionsDelete(ctx, boardId, sectionId).AdAccountId(adAccountId).Execute()

Delete board section



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	sectionId := "sectionId_example" // string | Unique identifier of a board section.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.BoardsAPI.BoardSectionsDelete(context.Background(), boardId, sectionId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardSectionsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 
**sectionId** | **string** | Unique identifier of a board section. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardSectionsDeleteRequest struct via the builder pattern


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


## BoardSectionsList

> BoardSectionsList200Response BoardSectionsList(ctx, boardId).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

List board sections



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardSectionsList(context.Background(), boardId).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardSectionsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardSectionsList`: BoardSectionsList200Response
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardSectionsList`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardSectionsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsListPins

> BoardsListPins200Response BoardSectionsListPins(ctx, boardId, sectionId).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()

List Pins on board section



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	sectionId := "sectionId_example" // string | Unique identifier of a board section.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardSectionsListPins(context.Background(), boardId, sectionId).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardSectionsListPins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardSectionsListPins`: BoardsListPins200Response
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardSectionsListPins`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 
**sectionId** | **string** | Unique identifier of a board section. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardSectionsListPinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardSectionsUpdate

> BoardSection BoardSectionsUpdate(ctx, boardId, sectionId).BoardSection(boardSection).AdAccountId(adAccountId).Execute()

Update board section



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	sectionId := "sectionId_example" // string | Unique identifier of a board section.
	boardSection := *openapiclient.NewBoardSection("Salads") // BoardSection | Update a board section.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardSectionsUpdate(context.Background(), boardId, sectionId).BoardSection(boardSection).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardSectionsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardSectionsUpdate`: BoardSection
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardSectionsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 
**sectionId** | **string** | Unique identifier of a board section. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardSectionsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **boardSection** | [**BoardSection**](BoardSection.md) | Update a board section. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsCreate

> Board BoardsCreate(ctx).Board(board).AdAccountId(adAccountId).Execute()

Create board



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
	board := *openapiclient.NewBoard("Summer Recipes") // Board | Create a board using a single board json object.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardsCreate(context.Background()).Board(board).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsCreate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsCreate`: Board
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBoardsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md) | Create a board using a single board json object. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsDelete

> BoardsDelete(ctx, boardId).AdAccountId(adAccountId).Execute()

Delete board



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.BoardsAPI.BoardsDelete(context.Background(), boardId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardsDeleteRequest struct via the builder pattern


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


## BoardsGet

> Board BoardsGet(ctx, boardId).AdAccountId(adAccountId).Execute()

Get board



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardsGet(context.Background(), boardId).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsGet`: Board
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardsGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsList

> BoardsList200Response BoardsList(ctx).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Privacy(privacy).Execute()

List boards



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
	privacy := "privacy_example" // string | Privacy setting for a board. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardsList(context.Background()).AdAccountId(adAccountId).Bookmark(bookmark).PageSize(pageSize).Privacy(privacy).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsList`: BoardsList200Response
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBoardsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **privacy** | **string** | Privacy setting for a board. | 

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsListPins

> BoardsListPins200Response BoardsListPins(ctx, boardId).Bookmark(bookmark).PageSize(pageSize).CreativeTypes(creativeTypes).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()

List Pins on board



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
	pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
	creativeTypes := []string{"REGULAR"} // []string | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)
	pinMetrics := true // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardsListPins(context.Background(), boardId).Bookmark(bookmark).PageSize(pageSize).CreativeTypes(creativeTypes).AdAccountId(adAccountId).PinMetrics(pinMetrics).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsListPins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsListPins`: BoardsListPins200Response
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardsListPins`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardsListPinsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **creativeTypes** | **[]string** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 
 **pinMetrics** | **bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BoardsUpdate

> Board BoardsUpdate(ctx, boardId).BoardUpdate(boardUpdate).AdAccountId(adAccountId).Execute()

Update board



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
	boardId := "boardId_example" // string | Unique identifier of a board.
	boardUpdate := *openapiclient.NewBoardUpdate() // BoardUpdate | Update a board.
	adAccountId := "adAccountId_example" // string | Unique identifier of an ad account. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BoardsAPI.BoardsUpdate(context.Background(), boardId).BoardUpdate(boardUpdate).AdAccountId(adAccountId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BoardsAPI.BoardsUpdate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `BoardsUpdate`: Board
	fmt.Fprintf(os.Stdout, "Response from `BoardsAPI.BoardsUpdate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**boardId** | **string** | Unique identifier of a board. | 

### Other Parameters

Other parameters are passed through a pointer to a apiBoardsUpdateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md) | Update a board. | 
 **adAccountId** | **string** | Unique identifier of an ad account. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


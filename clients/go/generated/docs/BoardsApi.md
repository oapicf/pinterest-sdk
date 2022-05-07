# \BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](BoardsApi.md#BoardSectionsCreate) | **Post** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](BoardsApi.md#BoardSectionsDelete) | **Delete** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](BoardsApi.md#BoardSectionsList) | **Get** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](BoardsApi.md#BoardSectionsListPins) | **Get** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](BoardsApi.md#BoardSectionsUpdate) | **Patch** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](BoardsApi.md#BoardsCreate) | **Post** /boards | Create board
[**BoardsDelete**](BoardsApi.md#BoardsDelete) | **Delete** /boards/{board_id} | Delete board
[**BoardsGet**](BoardsApi.md#BoardsGet) | **Get** /boards/{board_id} | Get board
[**BoardsList**](BoardsApi.md#BoardsList) | **Get** /boards | List boards
[**BoardsListPins**](BoardsApi.md#BoardsListPins) | **Get** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](BoardsApi.md#BoardsUpdate) | **Patch** /boards/{board_id} | Update board



## BoardSectionsCreate

> BoardSection BoardSectionsCreate(ctx, boardId).BoardSection(boardSection).Execute()

Create board section



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    boardSection := *openapiclient.NewBoardSection() // BoardSection | Create a board section.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardSectionsCreate(context.Background(), boardId).BoardSection(boardSection).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardSectionsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardSectionsCreate`: BoardSection
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardSectionsCreate`: %v\n", resp)
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

> BoardSectionsDelete(ctx, boardId, sectionId).Execute()

Delete board section



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    sectionId := "sectionId_example" // string | Unique identifier of a board section.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardSectionsDelete(context.Background(), boardId, sectionId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardSectionsDelete``: %v\n", err)
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

> Paginated BoardSectionsList(ctx, boardId).Bookmark(bookmark).PageSize(pageSize).Execute()

List board sections



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardSectionsList(context.Background(), boardId).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardSectionsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardSectionsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardSectionsList`: %v\n", resp)
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


## BoardSectionsListPins

> Paginated BoardSectionsListPins(ctx, boardId, sectionId).Bookmark(bookmark).PageSize(pageSize).Execute()

List Pins on board section



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    sectionId := "sectionId_example" // string | Unique identifier of a board section.
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardSectionsListPins(context.Background(), boardId, sectionId).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardSectionsListPins``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardSectionsListPins`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardSectionsListPins`: %v\n", resp)
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


## BoardSectionsUpdate

> BoardSection BoardSectionsUpdate(ctx, boardId, sectionId).BoardSection(boardSection).Execute()

Update board section



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    sectionId := "sectionId_example" // string | Unique identifier of a board section.
    boardSection := *openapiclient.NewBoardSection() // BoardSection | Update a board section.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardSectionsUpdate(context.Background(), boardId, sectionId).BoardSection(boardSection).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardSectionsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardSectionsUpdate`: BoardSection
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardSectionsUpdate`: %v\n", resp)
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

> Board BoardsCreate(ctx).Board(board).Execute()

Create board



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
    board := *openapiclient.NewBoard("Summer Recipes") // Board | Create a board using a single board json object.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsCreate(context.Background()).Board(board).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardsCreate`: Board
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardsCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBoardsCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md) | Create a board using a single board json object. | 

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

> BoardsDelete(ctx, boardId).Execute()

Delete board



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
    boardId := "boardId_example" // string | Unique identifier of a board.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsDelete(context.Background(), boardId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsDelete``: %v\n", err)
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

> Board BoardsGet(ctx, boardId).Execute()

Get board



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
    boardId := "boardId_example" // string | Unique identifier of a board.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsGet(context.Background(), boardId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardsGet`: Board
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardsGet`: %v\n", resp)
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

> Paginated BoardsList(ctx).Bookmark(bookmark).PageSize(pageSize).Privacy(privacy).Execute()

List boards



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
    privacy := "privacy_example" // string | Privacy setting for a board. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsList(context.Background()).Bookmark(bookmark).PageSize(pageSize).Privacy(privacy).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardsList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardsList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBoardsListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | 
 **pageSize** | **int32** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]
 **privacy** | **string** | Privacy setting for a board. | 

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


## BoardsListPins

> Paginated BoardsListPins(ctx, boardId).Bookmark(bookmark).PageSize(pageSize).Execute()

List Pins on board



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    bookmark := "bookmark_example" // string | Cursor used to fetch the next page of items (optional)
    pageSize := int32(56) // int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsListPins(context.Background(), boardId).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsListPins``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardsListPins`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardsListPins`: %v\n", resp)
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


## BoardsUpdate

> Board BoardsUpdate(ctx, boardId).BoardUpdate(boardUpdate).Execute()

Update board



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
    boardId := "boardId_example" // string | Unique identifier of a board.
    boardUpdate := *openapiclient.NewBoardUpdate() // BoardUpdate | Update a board.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BoardsApi.BoardsUpdate(context.Background(), boardId).BoardUpdate(boardUpdate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BoardsApi.BoardsUpdate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BoardsUpdate`: Board
    fmt.Fprintf(os.Stdout, "Response from `BoardsApi.BoardsUpdate`: %v\n", resp)
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


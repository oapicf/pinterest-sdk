# \MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaCreate**](MediaApi.md#MediaCreate) | **Post** /media | Register media upload
[**MediaGet**](MediaApi.md#MediaGet) | **Get** /media/{media_id} | Get media upload details
[**MediaList**](MediaApi.md#MediaList) | **Get** /media | List media uploads



## MediaCreate

> MediaUpload MediaCreate(ctx).MediaUploadRequest(mediaUploadRequest).Execute()

Register media upload



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
    mediaUploadRequest := *openapiclient.NewMediaUploadRequest(openapiclient.MediaUploadType("video")) // MediaUploadRequest | Create a media upload request

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MediaApi.MediaCreate(context.Background()).MediaUploadRequest(mediaUploadRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MediaApi.MediaCreate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MediaCreate`: MediaUpload
    fmt.Fprintf(os.Stdout, "Response from `MediaApi.MediaCreate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMediaCreateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadRequest** | [**MediaUploadRequest**](MediaUploadRequest.md) | Create a media upload request | 

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MediaGet

> MediaUploadDetails MediaGet(ctx, mediaId).Execute()

Get media upload details



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
    mediaId := "mediaId_example" // string | Media identifier

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.MediaApi.MediaGet(context.Background(), mediaId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MediaApi.MediaGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MediaGet`: MediaUploadDetails
    fmt.Fprintf(os.Stdout, "Response from `MediaApi.MediaGet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**mediaId** | **string** | Media identifier | 

### Other Parameters

Other parameters are passed through a pointer to a apiMediaGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## MediaList

> Paginated MediaList(ctx).Bookmark(bookmark).PageSize(pageSize).Execute()

List media uploads



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
    resp, r, err := apiClient.MediaApi.MediaList(context.Background()).Bookmark(bookmark).PageSize(pageSize).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `MediaApi.MediaList``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `MediaList`: Paginated
    fmt.Fprintf(os.Stdout, "Response from `MediaApi.MediaList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiMediaListRequest struct via the builder pattern


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


# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**media_create**](MediaApi.md#media_create) | **POST** /media | Register media upload
[**media_get**](MediaApi.md#media_get) | **GET** /media/{media_id} | Get media upload details
[**media_list**](MediaApi.md#media_list) | **GET** /media | List media uploads


# **media_create**
> `media_create`(_api::`MediaApi`, `media_upload_create`::`MediaUploadCreate`; _mediaType=nothing) -> `MediaUpload`, `OpenAPI.Clients.ApiResponse` <br/>
> `media_create`(_api::`MediaApi`, response_stream::`Channel`, `media_upload_create`::`MediaUploadCreate`; _mediaType=nothing) -> `Channel`{ `MediaUpload` }, `OpenAPI.Clients.ApiResponse`

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MediaApi`** | API context | 
**`media_upload_create`** | [**`MediaUploadCreate`**](MediaUploadCreate.md) |  |

### Return type

[**`MediaUpload`**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **media_get**
> `media_get`(_api::`MediaApi`, `media_id`::`String`; _mediaType=nothing) -> `Media`, `OpenAPI.Clients.ApiResponse` <br/>
> `media_get`(_api::`MediaApi`, response_stream::`Channel`, `media_id`::`String`; _mediaType=nothing) -> `Channel`{ `Media` }, `OpenAPI.Clients.ApiResponse`

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MediaApi`** | API context | 
**`media_id`** | **`String`** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |

### Return type

[**`Media`**](Media.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **media_list**
> `media_list`(_api::`MediaApi`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `MediaList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `media_list`(_api::`MediaApi`, response_stream::`Channel`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `MediaList200Response` }, `OpenAPI.Clients.ApiResponse`

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MediaApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`MediaList200Response`**](MediaList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


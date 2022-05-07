# \MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**media_create**](MediaApi.md#media_create) | **POST** /media | Register media upload
[**media_get**](MediaApi.md#media_get) | **GET** /media/{media_id} | Get media upload details
[**media_list**](MediaApi.md#media_list) | **GET** /media | List media uploads



## media_create

> crate::models::MediaUpload media_create(media_upload_request)
Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**media_upload_request** | [**MediaUploadRequest**](MediaUploadRequest.md) | Create a media upload request | [required] |

### Return type

[**crate::models::MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## media_get

> crate::models::MediaUploadDetails media_get(media_id)
Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**media_id** | **String** | Media identifier | [required] |

### Return type

[**crate::models::MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## media_list

> crate::models::Paginated media_list(bookmark, page_size)
List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


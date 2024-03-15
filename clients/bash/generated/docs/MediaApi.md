# MediaApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApi.md#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](MediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](MediaApi.md#mediaList) | **GET** /media | List media uploads



## mediaCreate

Register media upload

Register your intent to upload media

The response includes all of the information needed to upload the media
to Pinterest.

To upload the media, make an HTTP POST request (using <tt>curl</tt>, for
example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header
value. Send the media file's contents as the request's <tt>file</tt>
parameter and also include all of the parameters from
<tt>upload_parameters</tt>.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example

```bash
 mediaCreate
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mediaGet

Get media upload details

Get details for a registered media upload, including its current status.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example

```bash
 mediaGet media_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **string** | Media identifier | [default to null]

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## mediaList

List media uploads

List media uploads filtered by given parameters.

<strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example

```bash
 mediaList  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](MediaList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


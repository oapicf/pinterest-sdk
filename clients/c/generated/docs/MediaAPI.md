# MediaAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaAPI_mediaCreate**](MediaAPI.md#MediaAPI_mediaCreate) | **POST** /media | Register media upload
[**MediaAPI_mediaGet**](MediaAPI.md#MediaAPI_mediaGet) | **GET** /media/{media_id} | Get media upload details
[**MediaAPI_mediaList**](MediaAPI.md#MediaAPI_mediaList) | **GET** /media | List media uploads


# **MediaAPI_mediaCreate**
```c
// Register media upload
//
// Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_upload_t* MediaAPI_mediaCreate(apiClient_t *apiClient, media_upload_request_t *media_upload_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**media_upload_request** | **[media_upload_request_t](media_upload_request.md) \*** | Create a media upload request | 

### Return type

[media_upload_t](media_upload.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MediaAPI_mediaGet**
```c
// Get media upload details
//
// Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_upload_details_t* MediaAPI_mediaGet(apiClient_t *apiClient, char *media_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**media_id** | **char \*** | Media identifier | 

### Return type

[media_upload_details_t](media_upload_details.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **MediaAPI_mediaList**
```c
// List media uploads
//
// List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.
//
media_list_200_response_t* MediaAPI_mediaList(apiClient_t *apiClient, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[media_list_200_response_t](media_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


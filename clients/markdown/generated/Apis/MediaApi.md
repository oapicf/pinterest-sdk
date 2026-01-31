# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**media/create**](MediaApi.md#media/create) | **POST** /media | Register media upload |
| [**media/get**](MediaApi.md#media/get) | **GET** /media/{media_id} | Get media upload details |
| [**media/list**](MediaApi.md#media/list) | **GET** /media | List media uploads |


<a name="media/create"></a>
# **media/create**
> MediaUpload media/create(MediaUploadCreate)

Register media upload

    Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **MediaUploadCreate** | [**MediaUploadCreate**](../Models/MediaUploadCreate.md)|  | |

### Return type

[**MediaUpload**](../Models/MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="media/get"></a>
# **media/get**
> Media media/get(media\_id)

Get media upload details

    Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **media\_id** | **String**| Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [default to null] |

### Return type

[**Media**](../Models/Media.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="media/list"></a>
# **media/list**
> media_list_200_response media/list(bookmark, page\_size)

List media uploads

    List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**media_list_200_response**](../Models/media_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


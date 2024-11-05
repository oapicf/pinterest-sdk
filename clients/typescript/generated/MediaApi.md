# .MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApi.md#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](MediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](MediaApi.md#mediaList) | **GET** /media | List media uploads


# **mediaCreate**
> MediaUpload mediaCreate(mediaUploadRequest)

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file\'s contents as the request\'s <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.

### Example


```typescript
import { createConfiguration, MediaApi } from '';
import type { MediaApiMediaCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MediaApi(configuration);

const request: MediaApiMediaCreateRequest = {
    // Create a media upload request
  mediaUploadRequest: {
    mediaType: "mediaType_example",
  },
};

const data = await apiInstance.mediaCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadRequest** | **MediaUploadRequest**| Create a media upload request |


### Return type

**MediaUpload**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **mediaGet**
> MediaUploadDetails mediaGet()

Get details for a registered media upload, including its current status.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.

### Example


```typescript
import { createConfiguration, MediaApi } from '';
import type { MediaApiMediaGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MediaApi(configuration);

const request: MediaApiMediaGetRequest = {
    // Media identifier
  mediaId: "4",
};

const data = await apiInstance.mediaGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | [**string**] | Media identifier | defaults to undefined


### Return type

**MediaUploadDetails**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**404** | Media upload not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **mediaList**
> MediaList200Response mediaList()

List media uploads filtered by given parameters.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.

### Example


```typescript
import { createConfiguration, MediaApi } from '';
import type { MediaApiMediaListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MediaApi(configuration);

const request: MediaApiMediaListRequest = {
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.mediaList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**MediaList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)



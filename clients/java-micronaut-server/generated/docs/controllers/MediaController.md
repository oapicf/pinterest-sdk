# MediaController

All URIs are relative to `"/v5"`

The controller class is defined in **[MediaController.java](../../src/main/java/org/openapitools/controller/MediaController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](#mediaList) | **GET** /media | List media uploads

<a id="mediaCreate"></a>
# **mediaCreate**
```java
Mono<MediaUpload> MediaController.mediaCreate(mediaUploadCreate)
```

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**mediaUploadCreate** | [**MediaUploadCreate**](../../docs/models/MediaUploadCreate.md) |  |

### Return type
[**MediaUpload**](../../docs/models/MediaUpload.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="mediaGet"></a>
# **mediaGet**
```java
Mono<Media> MediaController.mediaGet(mediaId)
```

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**mediaId** | `String` | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |

### Return type
[**Media**](../../docs/models/Media.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="mediaList"></a>
# **mediaList**
```java
Mono<MediaList200Response> MediaController.mediaList(bookmarkpageSize)
```

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**MediaList200Response**](../../docs/models/MediaList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`


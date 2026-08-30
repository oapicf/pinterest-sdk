# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApi.md#mediaCreate) | **Post** /media | Register media upload
[**mediaGet**](MediaApi.md#mediaGet) | **Get** /media/{media_id} | Get media upload details
[**mediaList**](MediaApi.md#mediaList) | **Get** /media | List media uploads


<a name="mediaCreate"></a>
# **mediaCreate**
> MediaUpload mediaCreate(mediaUploadCreate)

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MediaApi()
val mediaUploadCreate : MediaUploadCreate =  // MediaUploadCreate | 
try {
    val result : MediaUpload = apiInstance.mediaCreate(mediaUploadCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MediaApi#mediaCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediaApi#mediaCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadCreate** | [**MediaUploadCreate**](MediaUploadCreate.md)|  |

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

<a name="mediaGet"></a>
# **mediaGet**
> Media mediaGet(mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MediaApi()
val mediaId : kotlin.String = mediaId_example // kotlin.String | Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
try {
    val result : Media = apiInstance.mediaGet(mediaId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MediaApi#mediaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediaApi#mediaGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **kotlin.String**| Unique identifier for this media upload. Used to track status and for attaching during Pin creation. |

### Return type

[**Media**](Media.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="mediaList"></a>
# **mediaList**
> MediaList200Response mediaList(bookmark, pageSize)

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = MediaApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    val result : MediaList200Response = apiInstance.mediaList(bookmark, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MediaApi#mediaList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MediaApi#mediaList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](MediaList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON


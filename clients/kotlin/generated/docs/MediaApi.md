# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApi.md#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](MediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](MediaApi.md#mediaList) | **GET** /media | List media uploads


<a id="mediaCreate"></a>
# **mediaCreate**
> MediaUpload mediaCreate(mediaUploadRequest)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MediaApi()
val mediaUploadRequest : MediaUploadRequest =  // MediaUploadRequest | Create a media upload request
try {
    val result : MediaUpload = apiInstance.mediaCreate(mediaUploadRequest)
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
 **mediaUploadRequest** | [**MediaUploadRequest**](MediaUploadRequest.md)| Create a media upload request |

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="mediaGet"></a>
# **mediaGet**
> MediaUploadDetails mediaGet(mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MediaApi()
val mediaId : kotlin.String = mediaId_example // kotlin.String | Media identifier
try {
    val result : MediaUploadDetails = apiInstance.mediaGet(mediaId)
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
 **mediaId** | **kotlin.String**| Media identifier |

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="mediaList"></a>
# **mediaList**
> MediaList200Response mediaList(bookmark, pageSize)

List media uploads

List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MediaApi()
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
 **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](MediaList200Response.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


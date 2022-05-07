# MediaController

All URIs are relative to `"/v5"`

The controller class is defined in **[MediaController.java](../../src/main/java/org/openapitools/controller/MediaController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](#mediaList) | **GET** /media | List media uploads

<a name="mediaCreate"></a>
# **mediaCreate**
```java
Mono<MediaUpload> MediaController.mediaCreate(mediaUploadRequest)
```

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**mediaUploadRequest** | [**MediaUploadRequest**](../../docs/models/MediaUploadRequest.md) | Create a media upload request |

### Return type
[**MediaUpload**](../../docs/models/MediaUpload.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a name="mediaGet"></a>
# **mediaGet**
```java
Mono<MediaUploadDetails> MediaController.mediaGet(mediaId)
```

Get media upload details

Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**mediaId** | `String` | Media identifier |

### Return type
[**MediaUploadDetails**](../../docs/models/MediaUploadDetails.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="mediaList"></a>
# **mediaList**
```java
Mono<Paginated> MediaController.mediaList(bookmarkpageSize)
```

List media uploads

List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**Paginated**](../../docs/models/Paginated.md)

### Authorization
* **pinterest_oauth2**, scopes: `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`


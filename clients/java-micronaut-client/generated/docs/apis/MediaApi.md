# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaCreate**](MediaApi.md#mediaCreate) | **POST** /media | Register media upload
[**mediaGet**](MediaApi.md#mediaGet) | **GET** /media/{media_id} | Get media upload details
[**mediaList**](MediaApi.md#mediaList) | **GET** /media | List media uploads


## Creating MediaApi

To initiate an instance of `MediaApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.MediaApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(MediaApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    MediaApi mediaApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="mediaCreate"></a>
# **mediaCreate**
```java
Mono<MediaUpload> MediaApi.mediaCreate(mediaUploadRequest)
```

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadRequest** | [**MediaUploadRequest**](MediaUploadRequest.md)| Create a media upload request |


### Return type
[**MediaUpload**](MediaUpload.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `pins:read`, `pins:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="mediaGet"></a>
# **mediaGet**
```java
Mono<MediaUploadDetails> MediaApi.mediaGet(mediaId)
```

Get media upload details

Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | `String`| Media identifier |


### Return type
[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="mediaList"></a>
# **mediaList**
```java
Mono<Paginated> MediaApi.mediaList(bookmarkpageSize)
```

List media uploads

List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`


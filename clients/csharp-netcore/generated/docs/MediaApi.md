# Org.OpenAPITools.Api.MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaCreate**](MediaApi.md#mediacreate) | **POST** /media | Register media upload
[**MediaGet**](MediaApi.md#mediaget) | **GET** /media/{media_id} | Get media upload details
[**MediaList**](MediaApi.md#medialist) | **GET** /media | List media uploads


<a name="mediacreate"></a>
# **MediaCreate**
> MediaUpload MediaCreate (MediaUploadRequest mediaUploadRequest)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MediaCreateExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MediaApi(config);
            var mediaUploadRequest = new MediaUploadRequest(); // MediaUploadRequest | Create a media upload request

            try
            {
                // Register media upload
                MediaUpload result = apiInstance.MediaCreate(mediaUploadRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MediaApi.MediaCreate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaUploadRequest** | [**MediaUploadRequest**](MediaUploadRequest.md)| Create a media upload request | 

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="mediaget"></a>
# **MediaGet**
> MediaUploadDetails MediaGet (string mediaId)

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MediaGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MediaApi(config);
            var mediaId = "mediaId_example";  // string | Media identifier

            try
            {
                // Get media upload details
                MediaUploadDetails result = apiInstance.MediaGet(mediaId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MediaApi.MediaGet: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **string**| Media identifier | 

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **404** | Media upload not found |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="medialist"></a>
# **MediaList**
> Paginated MediaList (string bookmark = null, int? pageSize = null)

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MediaListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.pinterest.com/v5";
            // Configure OAuth2 access token for authorization: pinterest_oauth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new MediaApi(config);
            var bookmark = "bookmark_example";  // string | Cursor used to fetch the next page of items (optional) 
            var pageSize = 25;  // int? | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional)  (default to 25)

            try
            {
                // List media uploads
                Paginated result = apiInstance.MediaList(bookmark, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling MediaApi.MediaList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **int?**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


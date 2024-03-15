# MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MediaCreate**](MediaApi.md#MediaCreate) | **POST** /media | Register media upload
[**MediaGet**](MediaApi.md#MediaGet) | **GET** /media/{media_id} | Get media upload details
[**MediaList**](MediaApi.md#MediaList) | **GET** /media | List media uploads


# **MediaCreate**
> MediaUpload MediaCreate(media_upload_request)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```R
library(openapi)

# Register media upload
#
# prepare function argument(s)
var_media_upload_request <- MediaUploadRequest$new(MediaUploadType$new()) # MediaUploadRequest | Create a media upload request

api_instance <- MediaApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MediaCreate(var_media_upload_requestdata_file = "result.txt")
result <- api_instance$MediaCreate(var_media_upload_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media_upload_request** | [**MediaUploadRequest**](MediaUploadRequest.md)| Create a media upload request | 

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

# **MediaGet**
> MediaUploadDetails MediaGet(media_id)

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```R
library(openapi)

# Get media upload details
#
# prepare function argument(s)
var_media_id <- "media_id_example" # character | Media identifier

api_instance <- MediaApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MediaGet(var_media_iddata_file = "result.txt")
result <- api_instance$MediaGet(var_media_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media_id** | **character**| Media identifier | 

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

# **MediaList**
> MediaList200Response MediaList(bookmark = var.bookmark, page_size = 25)

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```R
library(openapi)

# List media uploads
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- MediaApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MediaList(bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$MediaList(bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](media_list_200_response.md)

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


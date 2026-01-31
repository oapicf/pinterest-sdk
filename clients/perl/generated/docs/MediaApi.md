# WWW::OpenAPIClient::MediaApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MediaApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**media_create**](MediaApi.md#media_create) | **POST** /media | Register media upload
[**media_get**](MediaApi.md#media_get) | **GET** /media/{media_id} | Get media upload details
[**media_list**](MediaApi.md#media_list) | **GET** /media | List media uploads


# **media_create**
> MediaUpload media_create(media_upload_create => $media_upload_create)

Register media upload

Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $media_upload_create = WWW::OpenAPIClient::Object::MediaUploadCreate->new(); # MediaUploadCreate | 

eval {
    my $result = $api_instance->media_create(media_upload_create => $media_upload_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MediaApi->media_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media_upload_create** | [**MediaUploadCreate**](MediaUploadCreate.md)|  | 

### Return type

[**MediaUpload**](MediaUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **media_get**
> Media media_get(media_id => $media_id)

Get media upload details

Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $media_id = "media_id_example"; # string | Unique identifier for this media upload. Used to track status and for attaching during Pin creation.

eval {
    my $result = $api_instance->media_get(media_id => $media_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MediaApi->media_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media_id** | **string**| Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | 

### Return type

[**Media**](Media.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **media_list**
> MediaList200Response media_list(bookmark => $bookmark, page_size => $page_size)

List media uploads

List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->media_list(bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MediaApi->media_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](MediaList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


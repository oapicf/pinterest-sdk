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
> MediaUpload media_create(media_upload_request => $media_upload_request)

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $media_upload_request = WWW::OpenAPIClient::Object::MediaUploadRequest->new(); # MediaUploadRequest | Create a media upload request

eval {
    my $result = $api_instance->media_create(media_upload_request => $media_upload_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MediaApi->media_create: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **media_get**
> MediaUploadDetails media_get(media_id => $media_id)

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $media_id = "media_id_example"; # string | Media identifier

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
 **media_id** | **string**| Media identifier | 

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **media_list**
> Paginated media_list(bookmark => $bookmark, page_size => $page_size)

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MediaApi;
my $api_instance = WWW::OpenAPIClient::MediaApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

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
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


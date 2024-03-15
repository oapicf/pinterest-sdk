# WWW::OpenAPIClient::AudiencesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AudiencesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_create_custom**](AudiencesApi.md#audiences_create_custom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> Audience audiences_create(ad_account_id => $ad_account_id, audience_create_request => $audience_create_request)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $audience_create_request = WWW::OpenAPIClient::Object::AudienceCreateRequest->new(); # AudienceCreateRequest | List of ads to create, size limit [1, 30]

eval {
    my $result = $api_instance->audiences_create(ad_account_id => $ad_account_id, audience_create_request => $audience_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **audience_create_request** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_create_custom**
> Audience audiences_create_custom(ad_account_id => $ad_account_id, audience_create_custom_request => $audience_create_custom_request)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $audience_create_custom_request = WWW::OpenAPIClient::Object::AudienceCreateCustomRequest->new(); # AudienceCreateCustomRequest | Custom audience to create.

eval {
    my $result = $api_instance->audiences_create_custom(ad_account_id => $ad_account_id, audience_create_custom_request => $audience_create_custom_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_create_custom: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **audience_create_custom_request** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_get**
> Audience audiences_get(ad_account_id => $ad_account_id, audience_id => $audience_id)

Get audience

Get a specific audience given the audience ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $audience_id = "audience_id_example"; # string | Unique identifier of an audience

eval {
    my $result = $api_instance->audiences_get(ad_account_id => $ad_account_id, audience_id => $audience_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **audience_id** | **string**| Unique identifier of an audience | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_list**
> AudiencesList200Response audiences_list(ad_account_id => $ad_account_id, bookmark => $bookmark, order => $order, page_size => $page_size, ownership_type => $ownership_type)

List audiences

Get list of audiences for the ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ownership_type = OWNED; # string | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.

eval {
    my $result = $api_instance->audiences_list(ad_account_id => $ad_account_id, bookmark => $bookmark, order => $order, page_size => $page_size, ownership_type => $ownership_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownership_type** | **string**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to &#39;OWNED&#39;]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiences_update**
> Audience audiences_update(ad_account_id => $ad_account_id, audience_id => $audience_id, audience_update_request => $audience_update_request)

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudiencesApi;
my $api_instance = WWW::OpenAPIClient::AudiencesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $audience_id = "audience_id_example"; # string | Unique identifier of an audience
my $audience_update_request = WWW::OpenAPIClient::Object::AudienceUpdateRequest->new(); # AudienceUpdateRequest | The audience to be updated.

eval {
    my $result = $api_instance->audiences_update(ad_account_id => $ad_account_id, audience_id => $audience_id, audience_update_request => $audience_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudiencesApi->audiences_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **audience_id** | **string**| Unique identifier of an audience | 
 **audience_update_request** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional] 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


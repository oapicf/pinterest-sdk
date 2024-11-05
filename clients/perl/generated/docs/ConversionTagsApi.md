# WWW::OpenAPIClient::ConversionTagsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConversionTagsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_tags_create**](ConversionTagsApi.md#conversion_tags_create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversion_tags_get**](ConversionTagsApi.md#conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversion_tags_list**](ConversionTagsApi.md#conversion_tags_list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**ocpm_eligible_conversion_tags_get**](ConversionTagsApi.md#ocpm_eligible_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**page_visit_conversion_tags_get**](ConversionTagsApi.md#page_visit_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversion_tags_create**
> ConversionTagResponse conversion_tags_create(ad_account_id => $ad_account_id, conversion_tag_create => $conversion_tag_create)

Create conversion tag

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionTagsApi;
my $api_instance = WWW::OpenAPIClient::ConversionTagsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $conversion_tag_create = WWW::OpenAPIClient::Object::ConversionTagCreate->new(); # ConversionTagCreate | Conversion Tag to create

eval {
    my $result = $api_instance->conversion_tags_create(ad_account_id => $ad_account_id, conversion_tag_create => $conversion_tag_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionTagsApi->conversion_tags_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **conversion_tag_create** | [**ConversionTagCreate**](ConversionTagCreate.md)| Conversion Tag to create | 

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_get**
> ConversionTagResponse conversion_tags_get(ad_account_id => $ad_account_id, conversion_tag_id => $conversion_tag_id)

Get conversion tag

Get information about an existing conversion tag.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionTagsApi;
my $api_instance = WWW::OpenAPIClient::ConversionTagsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $conversion_tag_id = 2617998078212; # string | Id of the conversion tag.

eval {
    my $result = $api_instance->conversion_tags_get(ad_account_id => $ad_account_id, conversion_tag_id => $conversion_tag_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionTagsApi->conversion_tags_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **conversion_tag_id** | **string**| Id of the conversion tag. | 

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_list**
> ConversionTagListResponse conversion_tags_list(ad_account_id => $ad_account_id, filter_deleted => $filter_deleted)

Get conversion tags

List conversion tags associated with an ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionTagsApi;
my $api_instance = WWW::OpenAPIClient::ConversionTagsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $filter_deleted = true; # boolean | Filter out deleted tags.

eval {
    my $result = $api_instance->conversion_tags_list(ad_account_id => $ad_account_id, filter_deleted => $filter_deleted);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionTagsApi->conversion_tags_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **filter_deleted** | **boolean**| Filter out deleted tags. | [optional] [default to false]

### Return type

[**ConversionTagListResponse**](ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ocpm_eligible_conversion_tags_get**
> HASH[string,ARRAY[ConversionEventResponse]] ocpm_eligible_conversion_tags_get(ad_account_id => $ad_account_id)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionTagsApi;
my $api_instance = WWW::OpenAPIClient::ConversionTagsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->ocpm_eligible_conversion_tags_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionTagsApi->ocpm_eligible_conversion_tags_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

**HASH[string,ARRAY[ConversionEventResponse]]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **page_visit_conversion_tags_get**
> PageVisitConversionTagsGet200Response page_visit_conversion_tags_get(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConversionTagsApi;
my $api_instance = WWW::OpenAPIClient::ConversionTagsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->page_visit_conversion_tags_get(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConversionTagsApi->page_visit_conversion_tags_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


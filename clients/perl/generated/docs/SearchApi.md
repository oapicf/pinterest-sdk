# WWW::OpenAPIClient::SearchApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SearchApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](SearchApi.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term
[**search_user_boards_get**](SearchApi.md#search_user_boards_get) | **GET** /search/boards | Search user&#39;s boards
[**search_user_pins_list**](SearchApi.md#search_user_pins_list) | **GET** /search/pins | Search user&#39;s Pins


# **search_partner_pins**
> SearchPartnerPins200Response search_partner_pins(term => $term, country_code => $country_code, bookmark => $bookmark, locale => $locale, limit => $limit)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SearchApi;
my $api_instance = WWW::OpenAPIClient::SearchApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $term = "term_example"; # string | Search term to look up pins.
my $country_code = US; # string | Two letter country code (ISO 3166-1 alpha-2)
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $locale = "locale_example"; # string | Search locale.
my $limit = 4; # int | Max search result size

eval {
    my $result = $api_instance->search_partner_pins(term => $term, country_code => $country_code, bookmark => $bookmark, locale => $locale, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SearchApi->search_partner_pins: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string**| Search term to look up pins. | 
 **country_code** | **string**| Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **locale** | **string**| Search locale. | [optional] 
 **limit** | **int**| Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_boards_get**
> SearchUserBoardsGet200Response search_user_boards_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, query => $query)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SearchApi;
my $api_instance = WWW::OpenAPIClient::SearchApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $query = "query_example"; # string | Search query. Can contain pin description keywords or comma-separated pin IDs.

eval {
    my $result = $api_instance->search_user_boards_get(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, query => $query);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SearchApi->search_user_boards_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_user_pins_list**
> PinsList200Response search_user_pins_list(query => $query, ad_account_id => $ad_account_id, bookmark => $bookmark)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SearchApi;
my $api_instance = WWW::OpenAPIClient::SearchApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $query = Plants; # string | Search query. Can contain pin description keywords or comma-separated pin IDs.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->search_user_pins_list(query => $query, ad_account_id => $ad_account_id, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SearchApi->search_user_pins_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


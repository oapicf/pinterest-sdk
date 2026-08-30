# WWW::OpenAPIClient::CatalogsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CatalogsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_available_filter_values**](CatalogsApi.md#catalogs_available_filter_values) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogs_create**](CatalogsApi.md#catalogs_create) | **POST** /catalogs | Create catalog
[**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs


# **catalogs_available_filter_values**
> CatalogsAvailableFilterValues catalogs_available_filter_values(catalog_id => $catalog_id, feed_id => $feed_id, country => $country, language => $language, ad_account_id => $ad_account_id)

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Filter entities for a given catalog_id.
my $feed_id = "feed_id_example"; # string | Filter entities for a given feed_id. If not given, all feeds are considered.
my $country = new WWW::OpenAPIClient.Country(); # Country | Country for the Catalogs Items
my $language = new WWW::OpenAPIClient.CatalogsLocale(); # CatalogsLocale | Language for the Catalogs Items
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_available_filter_values(catalog_id => $catalog_id, feed_id => $feed_id, country => $country, language => $language, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_available_filter_values: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Filter entities for a given catalog_id. | 
 **feed_id** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **country** | [**Country**](.md)| Country for the Catalogs Items | [optional] 
 **language** | [**CatalogsLocale**](.md)| Language for the Catalogs Items | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_create**
> Catalog catalogs_create(catalog_create => $catalog_create, ad_account_id => $ad_account_id)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_create = WWW::OpenAPIClient::Object::CatalogCreate->new(); # CatalogCreate | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_create(catalog_create => $catalog_create, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_create** | [**CatalogCreate**](CatalogCreate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Catalog**](Catalog.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_list**
> CatalogsList200Response catalogs_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->catalogs_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


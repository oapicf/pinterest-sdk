# WWW::OpenAPIClient::CatalogsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CatalogsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs
[**catalogs_product_group_pins_list**](CatalogsApi.md#catalogs_product_group_pins_list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**catalogs_product_groups_create**](CatalogsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group
[**catalogs_product_groups_delete**](CatalogsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_get**](CatalogsApi.md#catalogs_product_groups_get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogs_product_groups_list**](CatalogsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | List product groups
[**catalogs_product_groups_product_counts_get**](CatalogsApi.md#catalogs_product_groups_product_counts_get) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**catalogs_product_groups_update**](CatalogsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feed_processing_results_list**](CatalogsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds_create**](CatalogsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed
[**feeds_delete**](CatalogsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CatalogsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feeds_list**](CatalogsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds
[**feeds_update**](CatalogsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**items_batch_get**](CatalogsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**items_batch_post**](CatalogsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Operate on item batch
[**items_get**](CatalogsApi.md#items_get) | **GET** /catalogs/items | Get catalogs items
[**items_issues_list**](CatalogsApi.md#items_issues_list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**products_by_product_group_filter_list**](CatalogsApi.md#products_by_product_group_filter_list) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


# **catalogs_list**
> CatalogsList200Response catalogs_list(bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_list(bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_group_pins_list**
> CatalogsProductGroupPinsList200Response catalogs_product_group_pins_list(product_group_id => $product_group_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_group_pins_list(product_group_id => $product_group_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_group_pins_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_create**
> CatalogsProductGroupsCreate201Response catalogs_product_groups_create(catalogs_product_groups_create_request => $catalogs_product_groups_create_request, ad_account_id => $ad_account_id)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalogs_product_groups_create_request = WWW::OpenAPIClient::Object::CatalogsProductGroupsCreateRequest->new(); # CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_groups_create(catalogs_product_groups_create_request => $catalogs_product_groups_create_request, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_request** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> catalogs_product_groups_delete(product_group_id => $product_group_id, ad_account_id => $ad_account_id)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    $api_instance->catalogs_product_groups_delete(product_group_id => $product_group_id, ad_account_id => $ad_account_id);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_get**
> CatalogsProductGroupsCreate201Response catalogs_product_groups_get(product_group_id => $product_group_id, ad_account_id => $ad_account_id)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_groups_get(product_group_id => $product_group_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> CatalogsProductGroupsList200Response catalogs_product_groups_list(feed_id => $feed_id, catalog_id => $catalog_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Filter entities for a given feed_id. If not given, all feeds are considered.
my $catalog_id = "catalog_id_example"; # string | Filter entities for a given catalog_id. If not given, all catalogs are considered.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_groups_list(feed_id => $feed_id, catalog_id => $catalog_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalog_id** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_product_counts_get**
> CatalogsProductGroupProductCounts catalogs_product_groups_product_counts_get(product_group_id => $product_group_id, ad_account_id => $ad_account_id)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_groups_product_counts_get(product_group_id => $product_group_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_product_counts_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_update**
> CatalogsProductGroupsCreate201Response catalogs_product_groups_update(product_group_id => $product_group_id, catalogs_product_groups_update_request => $catalogs_product_groups_update_request, ad_account_id => $ad_account_id)

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $catalogs_product_groups_update_request = WWW::OpenAPIClient::Object::CatalogsProductGroupsUpdateRequest->new(); # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_product_groups_update(product_group_id => $product_group_id, catalogs_product_groups_update_request => $catalogs_product_groups_update_request, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 
 **catalogs_product_groups_update_request** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feed_processing_results_list**
> FeedProcessingResultsList200Response feed_processing_results_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id)

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->feed_processing_results_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feed_processing_results_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> CatalogsFeed feeds_create(feeds_create_request => $feeds_create_request, ad_account_id => $ad_account_id)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feeds_create_request = WWW::OpenAPIClient::Object::FeedsCreateRequest->new(); # FeedsCreateRequest | Request object used to created a feed.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->feeds_create(feeds_create_request => $feeds_create_request, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeds_create_request** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> feeds_delete(feed_id => $feed_id, ad_account_id => $ad_account_id)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    $api_instance->feeds_delete(feed_id => $feed_id, ad_account_id => $ad_account_id);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> CatalogsFeed feeds_get(feed_id => $feed_id, ad_account_id => $ad_account_id)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->feeds_get(feed_id => $feed_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> FeedsList200Response feeds_list(bookmark => $bookmark, page_size => $page_size, catalog_id => $catalog_id, ad_account_id => $ad_account_id)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $catalog_id = "catalog_id_example"; # string | Filter entities for a given catalog_id. If not given, all catalogs are considered.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->feeds_list(bookmark => $bookmark, page_size => $page_size, catalog_id => $catalog_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalog_id** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> CatalogsFeed feeds_update(feed_id => $feed_id, feeds_update_request => $feeds_update_request, ad_account_id => $ad_account_id)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed
my $feeds_update_request = WWW::OpenAPIClient::Object::FeedsUpdateRequest->new(); # FeedsUpdateRequest | Request object used to update a feed.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->feeds_update(feed_id => $feed_id, feeds_update_request => $feeds_update_request, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 
 **feeds_update_request** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_get**
> CatalogsItemsBatch items_batch_get(batch_id => $batch_id, ad_account_id => $ad_account_id)

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $batch_id = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; # string | Id of a catalogs items batch to fetch
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->items_batch_get(batch_id => $batch_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->items_batch_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| Id of a catalogs items batch to fetch | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> CatalogsItemsBatch items_batch_post(items_batch_post_request => $items_batch_post_request, ad_account_id => $ad_account_id)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $items_batch_post_request = WWW::OpenAPIClient::Object::ItemsBatchPostRequest->new(); # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->items_batch_post(items_batch_post_request => $items_batch_post_request, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->items_batch_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **items_batch_post_request** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_get**
> CatalogsItems items_get(country => $country, language => $language, ad_account_id => $ad_account_id, item_ids => $item_ids, filters => $filters)

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $country = US; # string | Country for the Catalogs Items
my $language = EN; # string | Language for the Catalogs Items
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $item_ids = [["CR123"]]; # ARRAY[string] | This parameter is deprecated. Use filters instead.
my $filters = new WWW::OpenAPIClient.CatalogsItemsFilters(); # CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.

eval {
    my $result = $api_instance->items_get(country => $country, language => $language, ad_account_id => $ad_account_id, item_ids => $item_ids, filters => $filters);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->items_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string**| Country for the Catalogs Items | 
 **language** | **string**| Language for the Catalogs Items | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **item_ids** | [**ARRAY[string]**](string.md)| This parameter is deprecated. Use filters instead. | [optional] 
 **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_issues_list**
> ItemsIssuesList200Response items_issues_list(processing_result_id => $processing_result_id, bookmark => $bookmark, page_size => $page_size, item_numbers => $item_numbers, item_validation_issue => $item_validation_issue, ad_account_id => $ad_account_id)

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $processing_result_id = 5224831246441439241; # string | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $item_numbers = [[1,5]]; # ARRAY[int] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
my $item_validation_issue = TITLE_MISSING; # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->items_issues_list(processing_result_id => $processing_result_id, bookmark => $bookmark, page_size => $page_size, item_numbers => $item_numbers, item_validation_issue => $item_validation_issue, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->items_issues_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processing_result_id** | **string**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **item_numbers** | [**ARRAY[int]**](int.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **item_validation_issue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **products_by_product_group_filter_list**
> CatalogsProductGroupPinsList200Response products_by_product_group_filter_list(catalogs_list_products_by_filter_request => $catalogs_list_products_by_filter_request, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id)

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalogs_list_products_by_filter_request = WWW::OpenAPIClient::Object::CatalogsListProductsByFilterRequest->new(); # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->products_by_product_group_filter_list(catalogs_list_products_by_filter_request => $catalogs_list_products_by_filter_request, bookmark => $bookmark, page_size => $page_size, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->products_by_product_group_filter_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


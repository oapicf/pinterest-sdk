# WWW::OpenAPIClient::CatalogsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CatalogsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_groups_create**](CatalogsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group
[**catalogs_product_groups_delete**](CatalogsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_list**](CatalogsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | Get product groups list
[**catalogs_product_groups_update**](CatalogsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feed_processing_results_list**](CatalogsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds_create**](CatalogsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed
[**feeds_delete**](CatalogsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CatalogsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feeds_list**](CatalogsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds
[**feeds_update**](CatalogsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**items_batch_get**](CatalogsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**items_batch_post**](CatalogsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**items_get**](CatalogsApi.md#items_get) | **GET** /catalogs/items | Get catalogs items


# **catalogs_product_groups_create**
> object catalogs_product_groups_create(catalogs_product_group_create_request => $catalogs_product_group_create_request)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalogs_product_group_create_request = WWW::OpenAPIClient::Object::CatalogsProductGroupCreateRequest->new(); # CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

eval {
    my $result = $api_instance->catalogs_product_groups_create(catalogs_product_group_create_request => $catalogs_product_group_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_group_create_request** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. | 

### Return type

**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> catalogs_product_groups_delete(product_group_id => $product_group_id)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group

eval {
    $api_instance->catalogs_product_groups_delete(product_group_id => $product_group_id);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> Paginated catalogs_product_groups_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

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
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->catalogs_product_groups_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->catalogs_product_groups_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 
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

# **catalogs_product_groups_update**
> CatalogsProductGroup catalogs_product_groups_update(product_group_id => $product_group_id, catalogs_product_group_update_request => $catalogs_product_group_update_request)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $product_group_id = "product_group_id_example"; # string | Unique identifier of a product group
my $catalogs_product_group_update_request = WWW::OpenAPIClient::Object::CatalogsProductGroupUpdateRequest->new(); # CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

eval {
    my $result = $api_instance->catalogs_product_groups_update(product_group_id => $product_group_id, catalogs_product_group_update_request => $catalogs_product_group_update_request);
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
 **catalogs_product_group_update_request** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feed_processing_results_list**
> Paginated feed_processing_results_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

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
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->feed_processing_results_list(feed_id => $feed_id, bookmark => $bookmark, page_size => $page_size);
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
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> CatalogsFeed feeds_create(catalogs_feeds_create_request => $catalogs_feeds_create_request)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalogs_feeds_create_request = WWW::OpenAPIClient::Object::CatalogsFeedsCreateRequest->new(); # CatalogsFeedsCreateRequest | Request object used to created a feed.

eval {
    my $result = $api_instance->feeds_create(catalogs_feeds_create_request => $catalogs_feeds_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_feeds_create_request** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> feeds_delete(feed_id => $feed_id)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed

eval {
    $api_instance->feeds_delete(feed_id => $feed_id);
};
if ($@) {
    warn "Exception when calling CatalogsApi->feeds_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> CatalogsFeed feeds_get(feed_id => $feed_id)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed

eval {
    my $result = $api_instance->feeds_get(feed_id => $feed_id);
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

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> Paginated feeds_list(bookmark => $bookmark, page_size => $page_size)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

eval {
    my $result = $api_instance->feeds_list(bookmark => $bookmark, page_size => $page_size);
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
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> CatalogsFeed feeds_update(feed_id => $feed_id, catalogs_feeds_update_request => $catalogs_feeds_update_request)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $feed_id = "feed_id_example"; # string | Unique identifier of a feed
my $catalogs_feeds_update_request = WWW::OpenAPIClient::Object::CatalogsFeedsUpdateRequest->new(); # CatalogsFeedsUpdateRequest | Request object used to update a feed.

eval {
    my $result = $api_instance->feeds_update(feed_id => $feed_id, catalogs_feeds_update_request => $catalogs_feeds_update_request);
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
 **catalogs_feeds_update_request** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_get**
> CatalogsItemsBatch items_batch_get(batch_id => $batch_id)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $batch_id = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; # string | Id of a catalogs items batch to fetch

eval {
    my $result = $api_instance->items_batch_get(batch_id => $batch_id);
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

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> CatalogsItemsBatch items_batch_post(catalogs_items_batch_request => $catalogs_items_batch_request)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalogs_items_batch_request = WWW::OpenAPIClient::Object::CatalogsItemsBatchRequest->new(); # CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

eval {
    my $result = $api_instance->items_batch_post(catalogs_items_batch_request => $catalogs_items_batch_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogsApi->items_batch_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_request** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_get**
> CatalogsItems items_get(country => $country, item_ids => $item_ids, language => $language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogsApi;
my $api_instance = WWW::OpenAPIClient::CatalogsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $country = US; # string | Country for the Catalogs Items
my $item_ids = [CR123]; # ARRAY[string] | Catalos Item ids
my $language = EN; # string | Language for the Catalogs Items

eval {
    my $result = $api_instance->items_get(country => $country, item_ids => $item_ids, language => $language);
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
 **item_ids** | [**ARRAY[string]**](string.md)| Catalos Item ids | 
 **language** | **string**| Language for the Catalogs Items | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


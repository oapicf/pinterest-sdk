# WWW::OpenAPIClient::CatalogSupplementalApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CatalogSupplementalApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_local_inventory_items_batch_operate**](CatalogSupplementalApi.md#catalogs_local_inventory_items_batch_operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogs_local_inventory_items_post**](CatalogSupplementalApi.md#catalogs_local_inventory_items_post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogs_local_stores_create**](CatalogSupplementalApi.md#catalogs_local_stores_create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogs_local_stores_delete**](CatalogSupplementalApi.md#catalogs_local_stores_delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogs_local_stores_list**](CatalogSupplementalApi.md#catalogs_local_stores_list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogs_local_stores_update**](CatalogSupplementalApi.md#catalogs_local_stores_update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogs_supplemental_items_batch_get**](CatalogSupplementalApi.md#catalogs_supplemental_items_batch_get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogs_local_inventory_items_batch_operate**
> SupplementalItemsBatchResponse catalogs_local_inventory_items_batch_operate(catalog_id => $catalog_id, local_inventory_items_batch_create => $local_inventory_items_batch_create, ad_account_id => $ad_account_id)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $local_inventory_items_batch_create = WWW::OpenAPIClient::Object::LocalInventoryItemsBatchCreate->new(); # LocalInventoryItemsBatchCreate | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_local_inventory_items_batch_operate(catalog_id => $catalog_id, local_inventory_items_batch_create => $local_inventory_items_batch_create, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_inventory_items_batch_operate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_inventory_items_post**
> LocalInventoryItemsGet catalogs_local_inventory_items_post(catalog_id => $catalog_id, local_inventory_items_get_create => $local_inventory_items_get_create, ad_account_id => $ad_account_id)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $local_inventory_items_get_create = WWW::OpenAPIClient::Object::LocalInventoryItemsGetCreate->new(); # LocalInventoryItemsGetCreate | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_local_inventory_items_post(catalog_id => $catalog_id, local_inventory_items_get_create => $local_inventory_items_get_create, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_inventory_items_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_create**
> ARRAY[CatalogsLocalStoresCreate200ResponseInner] catalogs_local_stores_create(catalog_id => $catalog_id, local_store_create => $local_store_create, ad_account_id => $ad_account_id)

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $local_store_create = [WWW::OpenAPIClient::Object::ARRAY[LocalStoreCreate]->new()]; # ARRAY[LocalStoreCreate] | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_local_stores_create(catalog_id => $catalog_id, local_store_create => $local_store_create, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_stores_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **local_store_create** | [**ARRAY[LocalStoreCreate]**](LocalStoreCreate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**ARRAY[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_delete**
> ARRAY[CatalogsLocalStoresDelete200ResponseInner] catalogs_local_stores_delete(catalog_id => $catalog_id, ids => $ids, ad_account_id => $ad_account_id)

Delete local stores

  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $ids = [("null")]; # ARRAY[string] | List of local store IDs to filter by.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_local_stores_delete(catalog_id => $catalog_id, ids => $ids, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_stores_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **ids** | [**ARRAY[string]**](string.md)| List of local store IDs to filter by. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**ARRAY[CatalogsLocalStoresDelete200ResponseInner]**](CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_list**
> CatalogsLocalStoresList200Response catalogs_local_stores_list(catalog_id => $catalog_id, ids => $ids, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size)

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $ids = [("null")]; # ARRAY[string] | List of local store IDs to filter by.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->catalogs_local_stores_list(catalog_id => $catalog_id, ids => $ids, ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_stores_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **ids** | [**ARRAY[string]**](string.md)| List of local store IDs to filter by. | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_local_stores_update**
> ARRAY[CatalogsLocalStoresCreate200ResponseInner] catalogs_local_stores_update(catalog_id => $catalog_id, local_store_batch_update => $local_store_batch_update, ad_account_id => $ad_account_id)

Update local stores

  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $local_store_batch_update = [WWW::OpenAPIClient::Object::ARRAY[LocalStoreBatchUpdate]->new()]; # ARRAY[LocalStoreBatchUpdate] | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_local_stores_update(catalog_id => $catalog_id, local_store_batch_update => $local_store_batch_update, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_local_stores_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **local_store_batch_update** | [**ARRAY[LocalStoreBatchUpdate]**](LocalStoreBatchUpdate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**ARRAY[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_supplemental_items_batch_get**
> SupplementalItemsBatchResponse catalogs_supplemental_items_batch_get(catalog_id => $catalog_id, batch_id => $batch_id, ad_account_id => $ad_account_id)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CatalogSupplementalApi;
my $api_instance = WWW::OpenAPIClient::CatalogSupplementalApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $catalog_id = "catalog_id_example"; # string | Unique identifier of a catalog.
my $batch_id = "batch_id_example"; # string | Unique identifier of an items batch operation.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->catalogs_supplemental_items_batch_get(catalog_id => $catalog_id, batch_id => $batch_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CatalogSupplementalApi->catalogs_supplemental_items_batch_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **string**| Unique identifier of a catalog. | 
 **batch_id** | **string**| Unique identifier of an items batch operation. | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


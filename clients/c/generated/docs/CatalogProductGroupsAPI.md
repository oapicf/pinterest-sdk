# CatalogProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogProductGroupsAPI_catalogsProductGroupPinsList**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogProductGroupsAPI_catalogsProductGroupsCreate**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogProductGroupsAPI_catalogsProductGroupsCreateMany**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**CatalogProductGroupsAPI_catalogsProductGroupsDelete**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogProductGroupsAPI_catalogsProductGroupsDeleteMany**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**CatalogProductGroupsAPI_catalogsProductGroupsGet**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogProductGroupsAPI_catalogsProductGroupsList**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogProductGroupsAPI_catalogsProductGroupsProductCountsGet**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogProductGroupsAPI_catalogsProductGroupsUpdate**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**CatalogProductGroupsAPI_productsByProductGroupFilterList**](CatalogProductGroupsAPI.md#CatalogProductGroupsAPI_productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **CatalogProductGroupsAPI_catalogsProductGroupPinsList**
```c
// List products by product group
//
// Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t* CatalogProductGroupsAPI_catalogsProductGroupPinsList(apiClient_t *apiClient, char *product_group_id, char *bookmark, int *page_size, char *ad_account_id, int *pin_metrics);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**pin_metrics** | **int \*** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[catalogs_product_group_pins_list_200_response_t](catalogs_product_group_pins_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsCreate**
```c
// Create product group
//
// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_vertical_product_group_t* CatalogProductGroupsAPI_catalogsProductGroupsCreate(apiClient_t *apiClient, multiple_product_groups_inner_t *multiple_product_groups_inner, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**multiple_product_groups_inner** | **[multiple_product_groups_inner_t](multiple_product_groups_inner.md) \*** | Request object used to create a single catalogs product groups. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_vertical_product_group_t](catalogs_vertical_product_group.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsCreateMany**
```c
// Create product groups
//
// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
list_t* CatalogProductGroupsAPI_catalogsProductGroupsCreateMany(apiClient_t *apiClient, list_t *multiple_product_groups_inner, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**multiple_product_groups_inner** | **[list_t](multiple_product_groups_inner.md) \*** | Request object used to create one or more catalogs product groups. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type


[list_t](char.md) *




### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsDelete**
```c
// Delete product group
//
// Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
void CatalogProductGroupsAPI_catalogsProductGroupsDelete(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsDeleteMany**
```c
// Delete product groups
//
// Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
void CatalogProductGroupsAPI_catalogsProductGroupsDeleteMany(apiClient_t *apiClient, list_t *id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **[list_t](int.md) \*** | Comma-separated list of product group ids | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsGet**
```c
// Get product group
//
// Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_vertical_product_group_t* CatalogProductGroupsAPI_catalogsProductGroupsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_vertical_product_group_t](catalogs_vertical_product_group.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsList**
```c
// List product groups
//
// Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_groups_list_200_response_t* CatalogProductGroupsAPI_catalogsProductGroupsList(apiClient_t *apiClient, list_t *id, char *feed_id, char *catalog_id, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**id** | **[list_t](int.md) \*** | Comma-separated list of product group ids | [optional] 
**feed_id** | **char \*** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
**catalog_id** | **char \*** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_groups_list_200_response_t](catalogs_product_groups_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsProductCountsGet**
```c
// Get product counts
//
// Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_product_counts_vertical_t* CatalogProductGroupsAPI_catalogsProductGroupsProductCountsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_group_product_counts_vertical_t](catalogs_product_group_product_counts_vertical.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_catalogsProductGroupsUpdate**
```c
// Update single product group
//
// Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
//
catalogs_vertical_product_group_t* CatalogProductGroupsAPI_catalogsProductGroupsUpdate(apiClient_t *apiClient, char *product_group_id, catalogs_product_groups_update_request_t *catalogs_product_groups_update_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**catalogs_product_groups_update_request** | **[catalogs_product_groups_update_request_t](catalogs_product_groups_update_request.md) \*** | Request object used to Update a catalogs product group. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_vertical_product_group_t](catalogs_vertical_product_group.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogProductGroupsAPI_productsByProductGroupFilterList**
```c
// List products by filter
//
// List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t* CatalogProductGroupsAPI_productsByProductGroupFilterList(apiClient_t *apiClient, catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request, char *bookmark, int *page_size, char *ad_account_id, int *pin_metrics);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalogs_list_products_by_filter_request** | **[catalogs_list_products_by_filter_request_t](catalogs_list_products_by_filter_request.md) \*** | Object holding a group of filters for a catalog product group | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**pin_metrics** | **int \*** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[catalogs_product_group_pins_list_200_response_t](catalogs_product_group_pins_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


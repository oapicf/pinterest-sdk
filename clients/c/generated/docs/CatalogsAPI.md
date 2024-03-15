# CatalogsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsAPI_catalogsList**](CatalogsAPI.md#CatalogsAPI_catalogsList) | **GET** /catalogs | List catalogs
[**CatalogsAPI_catalogsProductGroupPinsList**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**CatalogsAPI_catalogsProductGroupsCreate**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsAPI_catalogsProductGroupsDelete**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsAPI_catalogsProductGroupsGet**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsAPI_catalogsProductGroupsList**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogsAPI_catalogsProductGroupsProductCountsGet**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**CatalogsAPI_catalogsProductGroupsUpdate**](CatalogsAPI.md#CatalogsAPI_catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**CatalogsAPI_feedProcessingResultsList**](CatalogsAPI.md#CatalogsAPI_feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**CatalogsAPI_feedsCreate**](CatalogsAPI.md#CatalogsAPI_feedsCreate) | **POST** /catalogs/feeds | Create feed
[**CatalogsAPI_feedsDelete**](CatalogsAPI.md#CatalogsAPI_feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**CatalogsAPI_feedsGet**](CatalogsAPI.md#CatalogsAPI_feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**CatalogsAPI_feedsList**](CatalogsAPI.md#CatalogsAPI_feedsList) | **GET** /catalogs/feeds | List feeds
[**CatalogsAPI_feedsUpdate**](CatalogsAPI.md#CatalogsAPI_feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**CatalogsAPI_itemsBatchGet**](CatalogsAPI.md#CatalogsAPI_itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**CatalogsAPI_itemsBatchPost**](CatalogsAPI.md#CatalogsAPI_itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**CatalogsAPI_itemsGet**](CatalogsAPI.md#CatalogsAPI_itemsGet) | **GET** /catalogs/items | Get catalogs items
[**CatalogsAPI_itemsIssuesList**](CatalogsAPI.md#CatalogsAPI_itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**CatalogsAPI_productsByProductGroupFilterList**](CatalogsAPI.md#CatalogsAPI_productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


# **CatalogsAPI_catalogsList**
```c
// List catalogs
//
// Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_list_200_response_t* CatalogsAPI_catalogsList(apiClient_t *apiClient, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_list_200_response_t](catalogs_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupPinsList**
```c
// List products for a Product Group
//
// Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t* CatalogsAPI_catalogsProductGroupPinsList(apiClient_t *apiClient, char *product_group_id, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_group_pins_list_200_response_t](catalogs_product_group_pins_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupsCreate**
```c
// Create product group
//
// Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_groups_create_201_response_t* CatalogsAPI_catalogsProductGroupsCreate(apiClient_t *apiClient, catalogs_product_groups_create_request_t *catalogs_product_groups_create_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalogs_product_groups_create_request** | **[catalogs_product_groups_create_request_t](catalogs_product_groups_create_request.md) \*** | Request object used to created a catalogs product group. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_groups_create_201_response_t](catalogs_product_groups_create_201_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupsDelete**
```c
// Delete product group
//
// Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
void CatalogsAPI_catalogsProductGroupsDelete(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
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

# **CatalogsAPI_catalogsProductGroupsGet**
```c
// Get product group
//
// Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_groups_create_201_response_t* CatalogsAPI_catalogsProductGroupsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_groups_create_201_response_t](catalogs_product_groups_create_201_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupsList**
```c
// List product groups
//
// Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_groups_list_200_response_t* CatalogsAPI_catalogsProductGroupsList(apiClient_t *apiClient, char *feed_id, char *catalog_id, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
**catalog_id** | **char \*** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_groups_list_200_response_t](catalogs_product_groups_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupsProductCountsGet**
```c
// Get product counts for a Product Group
//
// Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_group_product_counts_t* CatalogsAPI_catalogsProductGroupsProductCountsGet(apiClient_t *apiClient, char *product_group_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_group_product_counts_t](catalogs_product_group_product_counts.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_catalogsProductGroupsUpdate**
```c
// Update product group
//
// Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_groups_create_201_response_t* CatalogsAPI_catalogsProductGroupsUpdate(apiClient_t *apiClient, char *product_group_id, catalogs_product_groups_update_request_t *catalogs_product_groups_update_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_group_id** | **char \*** | Unique identifier of a product group | 
**catalogs_product_groups_update_request** | **[catalogs_product_groups_update_request_t](catalogs_product_groups_update_request.md) \*** | Request object used to Update a catalogs product group. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_groups_create_201_response_t](catalogs_product_groups_create_201_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedProcessingResultsList**
```c
// List processing results for a given feed
//
// Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
feed_processing_results_list_200_response_t* CatalogsAPI_feedProcessingResultsList(apiClient_t *apiClient, char *feed_id, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[feed_processing_results_list_200_response_t](feed_processing_results_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedsCreate**
```c
// Create feed
//
// Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
//
catalogs_feed_t* CatalogsAPI_feedsCreate(apiClient_t *apiClient, feeds_create_request_t *feeds_create_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feeds_create_request** | **[feeds_create_request_t](feeds_create_request.md) \*** | Request object used to created a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedsDelete**
```c
// Delete feed
//
// Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
//
void CatalogsAPI_feedsDelete(apiClient_t *apiClient, char *feed_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedsGet**
```c
// Get feed
//
// Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
//
catalogs_feed_t* CatalogsAPI_feedsGet(apiClient_t *apiClient, char *feed_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedsList**
```c
// List feeds
//
// Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
//
feeds_list_200_response_t* CatalogsAPI_feedsList(apiClient_t *apiClient, char *bookmark, int *page_size, char *catalog_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**catalog_id** | **char \*** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[feeds_list_200_response_t](feeds_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_feedsUpdate**
```c
// Update feed
//
// Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.
//
catalogs_feed_t* CatalogsAPI_feedsUpdate(apiClient_t *apiClient, char *feed_id, feeds_update_request_t *feeds_update_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**feed_id** | **char \*** | Unique identifier of a feed | 
**feeds_update_request** | **[feeds_update_request_t](feeds_update_request.md) \*** | Request object used to update a feed. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_feed_t](catalogs_feed.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_itemsBatchGet**
```c
// Get catalogs item batch status
//
// Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_items_batch_t* CatalogsAPI_itemsBatchGet(apiClient_t *apiClient, char *batch_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**batch_id** | **char \*** | Id of a catalogs items batch to fetch | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_items_batch_t](catalogs_items_batch.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_itemsBatchPost**
```c
// Operate on item batch
//
// This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_items_batch_t* CatalogsAPI_itemsBatchPost(apiClient_t *apiClient, items_batch_post_request_t *items_batch_post_request, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**items_batch_post_request** | **[items_batch_post_request_t](items_batch_post_request.md) \*** | Request object used to create catalogs items in a batch | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_items_batch_t](catalogs_items_batch.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_itemsGet**
```c
// Get catalogs items
//
// Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_items_t* CatalogsAPI_itemsGet(apiClient_t *apiClient, char *country, char *language, char *ad_account_id, list_t *item_ids, catalogs_items_filters_t *filters);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**country** | **char \*** | Country for the Catalogs Items | 
**language** | **char \*** | Language for the Catalogs Items | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**item_ids** | **[list_t](char.md) \*** | This parameter is deprecated. Use filters instead. | [optional] 
**filters** | **[catalogs_items_filters_t](.md) \*** | Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[catalogs_items_t](catalogs_items.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_itemsIssuesList**
```c
// List item issues for a given processing result
//
// List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
items_issues_list_200_response_t* CatalogsAPI_itemsIssuesList(apiClient_t *apiClient, char *processing_result_id, char *bookmark, int *page_size, list_t *item_numbers, catalogs_item_validation_issue_e item_validation_issue, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**processing_result_id** | **char \*** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**item_numbers** | **[list_t](int.md) \*** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
**item_validation_issue** | **catalogs_item_validation_issue_e** | Filter item validation issues that have a given type of item validation issue. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[items_issues_list_200_response_t](items_issues_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CatalogsAPI_productsByProductGroupFilterList**
```c
// List filtered products
//
// List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>
//
catalogs_product_group_pins_list_200_response_t* CatalogsAPI_productsByProductGroupFilterList(apiClient_t *apiClient, catalogs_list_products_by_filter_request_t *catalogs_list_products_by_filter_request, char *bookmark, int *page_size, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**catalogs_list_products_by_filter_request** | **[catalogs_list_products_by_filter_request_t](catalogs_list_products_by_filter_request.md) \*** | Object holding a group of filters for a catalog product group | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[catalogs_product_group_pins_list_200_response_t](catalogs_product_group_pins_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


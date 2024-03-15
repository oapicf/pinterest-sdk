# CATALOGS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_list**](CATALOGS_API.md#catalogs_list) | **Get** /catalogs | List catalogs
[**catalogs_product_group_pins_list**](CATALOGS_API.md#catalogs_product_group_pins_list) | **Get** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**catalogs_product_groups_create**](CATALOGS_API.md#catalogs_product_groups_create) | **Post** /catalogs/product_groups | Create product group
[**catalogs_product_groups_delete**](CATALOGS_API.md#catalogs_product_groups_delete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_get**](CATALOGS_API.md#catalogs_product_groups_get) | **Get** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogs_product_groups_list**](CATALOGS_API.md#catalogs_product_groups_list) | **Get** /catalogs/product_groups | List product groups
[**catalogs_product_groups_product_counts_get**](CATALOGS_API.md#catalogs_product_groups_product_counts_get) | **Get** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**catalogs_product_groups_update**](CATALOGS_API.md#catalogs_product_groups_update) | **Patch** /catalogs/product_groups/{product_group_id} | Update product group
[**feed_processing_results_list**](CATALOGS_API.md#feed_processing_results_list) | **Get** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds_create**](CATALOGS_API.md#feeds_create) | **Post** /catalogs/feeds | Create feed
[**feeds_delete**](CATALOGS_API.md#feeds_delete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CATALOGS_API.md#feeds_get) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**feeds_list**](CATALOGS_API.md#feeds_list) | **Get** /catalogs/feeds | List feeds
[**feeds_update**](CATALOGS_API.md#feeds_update) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**items_batch_get**](CATALOGS_API.md#items_batch_get) | **Get** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**items_batch_post**](CATALOGS_API.md#items_batch_post) | **Post** /catalogs/items/batch | Operate on item batch
[**items_get**](CATALOGS_API.md#items_get) | **Get** /catalogs/items | Get catalogs items
[**items_issues_list**](CATALOGS_API.md#items_issues_list) | **Get** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**products_by_product_group_filter_list**](CATALOGS_API.md#products_by_product_group_filter_list) | **Post** /catalogs/products/get_by_product_group_filters | List filtered products


# **catalogs_list**
> catalogs_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_LIST_200_RESPONSE


List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_LIST_200_RESPONSE**](catalogs_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_group_pins_list**
> catalogs_product_group_pins_list (product_group_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE


List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE**](catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_create**
> catalogs_product_groups_create (catalogs_product_groups_create_request: CATALOGS_PRODUCT_GROUPS_CREATE_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE


Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_request** | [**CATALOGS_PRODUCT_GROUPS_CREATE_REQUEST**](CATALOGS_PRODUCT_GROUPS_CREATE_REQUEST.md)| Request object used to created a catalogs product group. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE**](catalogs_product_groups_create_201_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> catalogs_product_groups_delete (product_group_id: STRING_32 ; ad_account_id:  detachable STRING_32 )


Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_get**
> catalogs_product_groups_get (product_group_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE


Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE**](catalogs_product_groups_create_201_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> catalogs_product_groups_list (feed_id:  detachable STRING_32 ; catalog_id:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE


List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] [default to null]
 **catalog_id** | **STRING_32**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUPS_LIST_200_RESPONSE**](catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_product_counts_get**
> catalogs_product_groups_product_counts_get (product_group_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUP_PRODUCT_COUNTS


Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUP_PRODUCT_COUNTS**](CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_update**
> catalogs_product_groups_update (product_group_id: STRING_32 ; catalogs_product_groups_update_request: CATALOGS_PRODUCT_GROUPS_UPDATE_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE


Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **catalogs_product_groups_update_request** | [**CATALOGS_PRODUCT_GROUPS_UPDATE_REQUEST**](CATALOGS_PRODUCT_GROUPS_UPDATE_REQUEST.md)| Request object used to Update a catalogs product group. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUPS_CREATE_201_RESPONSE**](catalogs_product_groups_create_201_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feed_processing_results_list**
> feed_processing_results_list (feed_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable FEED_PROCESSING_RESULTS_LIST_200_RESPONSE


List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**FEED_PROCESSING_RESULTS_LIST_200_RESPONSE**](feed_processing_results_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> feeds_create (feeds_create_request: FEEDS_CREATE_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_FEED


Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeds_create_request** | [**FEEDS_CREATE_REQUEST**](FEEDS_CREATE_REQUEST.md)| Request object used to created a feed. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> feeds_delete (feed_id: STRING_32 ; ad_account_id:  detachable STRING_32 )


Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> feeds_get (feed_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_FEED


Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> feeds_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; catalog_id:  detachable STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable FEEDS_LIST_200_RESPONSE


List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalog_id** | **STRING_32**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**FEEDS_LIST_200_RESPONSE**](feeds_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> feeds_update (feed_id: STRING_32 ; feeds_update_request: FEEDS_UPDATE_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_FEED


Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **feeds_update_request** | [**FEEDS_UPDATE_REQUEST**](FEEDS_UPDATE_REQUEST.md)| Request object used to update a feed. | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_get**
> items_batch_get (batch_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_ITEMS_BATCH


Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **STRING_32**| Id of a catalogs items batch to fetch | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> items_batch_post (items_batch_post_request: ITEMS_BATCH_POST_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_ITEMS_BATCH


Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **items_batch_post_request** | [**ITEMS_BATCH_POST_REQUEST**](ITEMS_BATCH_POST_REQUEST.md)| Request object used to create catalogs items in a batch | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_get**
> items_get (country: STRING_32 ; language: STRING_32 ; ad_account_id:  detachable STRING_32 ; item_ids:  detachable LIST [STRING_32] ; filters:  detachable CATALOGS_ITEMS_FILTERS ): detachable CATALOGS_ITEMS


Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **STRING_32**| Country for the Catalogs Items | [default to null]
 **language** | **STRING_32**| Language for the Catalogs Items | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]
 **item_ids** | [**LIST [STRING_32]**](STRING_32.md)| This parameter is deprecated. Use filters instead. | [optional] [default to null]
 **filters** | [**CATALOGS_ITEMS_FILTERS**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] [default to null]

### Return type

[**CATALOGS_ITEMS**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_issues_list**
> items_issues_list (processing_result_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; item_numbers:  detachable LIST [INTEGER_32] ; item_validation_issue:  detachable CATALOGS_ITEM_VALIDATION_ISSUE ; ad_account_id:  detachable STRING_32 ): detachable ITEMS_ISSUES_LIST_200_RESPONSE


List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processing_result_id** | **STRING_32**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **item_numbers** | [**LIST [INTEGER_32]**](INTEGER_32.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] [default to null]
 **item_validation_issue** | [**CATALOGS_ITEM_VALIDATION_ISSUE**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ITEMS_ISSUES_LIST_200_RESPONSE**](items_issues_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **products_by_product_group_filter_list**
> products_by_product_group_filter_list (catalogs_list_products_by_filter_request: CATALOGS_LIST_PRODUCTS_BY_FILTER_REQUEST ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE


List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_list_products_by_filter_request** | [**CATALOGS_LIST_PRODUCTS_BY_FILTER_REQUEST**](CATALOGS_LIST_PRODUCTS_BY_FILTER_REQUEST.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_PRODUCT_GROUP_PINS_LIST_200_RESPONSE**](catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


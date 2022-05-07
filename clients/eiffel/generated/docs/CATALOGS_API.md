# CATALOGS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_groups_create**](CATALOGS_API.md#catalogs_product_groups_create) | **Post** /catalogs/product_groups | Create product group
[**catalogs_product_groups_delete**](CATALOGS_API.md#catalogs_product_groups_delete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_list**](CATALOGS_API.md#catalogs_product_groups_list) | **Get** /catalogs/product_groups | Get product groups list
[**catalogs_product_groups_update**](CATALOGS_API.md#catalogs_product_groups_update) | **Patch** /catalogs/product_groups/{product_group_id} | Update product group
[**feed_processing_results_list**](CATALOGS_API.md#feed_processing_results_list) | **Get** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds_create**](CATALOGS_API.md#feeds_create) | **Post** /catalogs/feeds | Create feed
[**feeds_delete**](CATALOGS_API.md#feeds_delete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CATALOGS_API.md#feeds_get) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**feeds_list**](CATALOGS_API.md#feeds_list) | **Get** /catalogs/feeds | List feeds
[**feeds_update**](CATALOGS_API.md#feeds_update) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**items_batch_get**](CATALOGS_API.md#items_batch_get) | **Get** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**items_batch_post**](CATALOGS_API.md#items_batch_post) | **Post** /catalogs/items/batch | Perform an operation on an item batch
[**items_get**](CATALOGS_API.md#items_get) | **Get** /catalogs/items | Get catalogs items


# **catalogs_product_groups_create**
> catalogs_product_groups_create (catalogs_product_group_create_request: CATALOGS_PRODUCT_GROUP_CREATE_REQUEST ): detachable ANY


Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_group_create_request** | [**CATALOGS_PRODUCT_GROUP_CREATE_REQUEST**](CATALOGS_PRODUCT_GROUP_CREATE_REQUEST.md)| Request object used to created a catalogs product group. | 

### Return type

[**ANY**](ANY.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> catalogs_product_groups_delete (product_group_id: STRING_32 )


Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> catalogs_product_groups_list (feed_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable PAGINATED


Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_update**
> catalogs_product_groups_update (product_group_id: STRING_32 ; catalogs_product_group_update_request: CATALOGS_PRODUCT_GROUP_UPDATE_REQUEST ): detachable CATALOGS_PRODUCT_GROUP


Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **STRING_32**| Unique identifier of a product group | [default to null]
 **catalogs_product_group_update_request** | [**CATALOGS_PRODUCT_GROUP_UPDATE_REQUEST**](CATALOGS_PRODUCT_GROUP_UPDATE_REQUEST.md)| Request object used to Update a catalogs product group. | 

### Return type

[**CATALOGS_PRODUCT_GROUP**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feed_processing_results_list**
> feed_processing_results_list (feed_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable PAGINATED


List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> feeds_create (catalogs_feeds_create_request: CATALOGS_FEEDS_CREATE_REQUEST ): detachable CATALOGS_FEED


Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_feeds_create_request** | [**CATALOGS_FEEDS_CREATE_REQUEST**](CATALOGS_FEEDS_CREATE_REQUEST.md)| Request object used to created a feed. | 

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> feeds_delete (feed_id: STRING_32 )


Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> feeds_get (feed_id: STRING_32 ): detachable CATALOGS_FEED


Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> feeds_list (bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable PAGINATED


List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**PAGINATED**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> feeds_update (feed_id: STRING_32 ; catalogs_feeds_update_request: CATALOGS_FEEDS_UPDATE_REQUEST ): detachable CATALOGS_FEED


Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **STRING_32**| Unique identifier of a feed | [default to null]
 **catalogs_feeds_update_request** | [**CATALOGS_FEEDS_UPDATE_REQUEST**](CATALOGS_FEEDS_UPDATE_REQUEST.md)| Request object used to update a feed. | 

### Return type

[**CATALOGS_FEED**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_get**
> items_batch_get (batch_id: STRING_32 ): detachable CATALOGS_ITEMS_BATCH


Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **STRING_32**| Id of a catalogs items batch to fetch | [default to null]

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> items_batch_post (catalogs_items_batch_request: CATALOGS_ITEMS_BATCH_REQUEST ): detachable CATALOGS_ITEMS_BATCH


Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_request** | [**CATALOGS_ITEMS_BATCH_REQUEST**](CATALOGS_ITEMS_BATCH_REQUEST.md)| Request object used to create catalogs items in a batch | 

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_get**
> items_get (country: STRING_32 ; item_ids: LIST [STRING_32] ; language: STRING_32 ): detachable CATALOGS_ITEMS


Get catalogs items

Get the items of the catalog created by the \"operating user_account\"


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **STRING_32**| Country for the Catalogs Items | [default to null]
 **item_ids** | [**LIST [STRING_32]**](STRING_32.md)| Catalos Item ids | [default to null]
 **language** | **STRING_32**| Language for the Catalogs Items | [default to null]

### Return type

[**CATALOGS_ITEMS**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


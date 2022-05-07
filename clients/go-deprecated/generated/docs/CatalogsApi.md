# \CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupsCreate**](CatalogsApi.md#CatalogsProductGroupsCreate) | **Post** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsDelete**](CatalogsApi.md#CatalogsProductGroupsDelete) | **Delete** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsList**](CatalogsApi.md#CatalogsProductGroupsList) | **Get** /catalogs/product_groups | Get product groups list
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#CatalogsProductGroupsUpdate) | **Patch** /catalogs/product_groups/{product_group_id} | Update product group
[**FeedProcessingResultsList**](CatalogsApi.md#FeedProcessingResultsList) | **Get** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**FeedsCreate**](CatalogsApi.md#FeedsCreate) | **Post** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#FeedsDelete) | **Delete** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#FeedsGet) | **Get** /catalogs/feeds/{feed_id} | Get feed
[**FeedsList**](CatalogsApi.md#FeedsList) | **Get** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#FeedsUpdate) | **Patch** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#ItemsBatchGet) | **Get** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**ItemsBatchPost**](CatalogsApi.md#ItemsBatchPost) | **Post** /catalogs/items/batch | Perform an operation on an item batch
[**ItemsGet**](CatalogsApi.md#ItemsGet) | **Get** /catalogs/items | Get catalogs items



## CatalogsProductGroupsCreate

> interface{} CatalogsProductGroupsCreate(ctx, catalogsProductGroupCreateRequest)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. | 

### Return type

**interface{}**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsDelete

> CatalogsProductGroupsDelete(ctx, productGroupId)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string**| Unique identifier of a product group | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsList

> Paginated CatalogsProductGroupsList(ctx, feedId, optional)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string**| Unique identifier of a feed | 
 **optional** | ***CatalogsProductGroupsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a CatalogsProductGroupsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CatalogsProductGroupsUpdate

> CatalogsProductGroup CatalogsProductGroupsUpdate(ctx, productGroupId, catalogsProductGroupUpdateRequest)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productGroupId** | **string**| Unique identifier of a product group | 
**catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedProcessingResultsList

> Paginated FeedProcessingResultsList(ctx, feedId, optional)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string**| Unique identifier of a feed | 
 **optional** | ***FeedProcessingResultsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a FeedProcessingResultsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsCreate

> CatalogsFeed FeedsCreate(ctx, catalogsFeedsCreateRequest)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsDelete

> FeedsDelete(ctx, feedId)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string**| Unique identifier of a feed | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsGet

> CatalogsFeed FeedsGet(ctx, feedId)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string**| Unique identifier of a feed | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsList

> Paginated FeedsList(ctx, optional)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***FeedsListOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a FeedsListOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **optional.String**| Cursor used to fetch the next page of items | 
 **pageSize** | **optional.Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FeedsUpdate

> CatalogsFeed FeedsUpdate(ctx, feedId, catalogsFeedsUpdateRequest)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**feedId** | **string**| Unique identifier of a feed | 
**catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchGet

> CatalogsItemsBatch ItemsBatchGet(ctx, batchId)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string**| Id of a catalogs items batch to fetch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsBatchPost

> CatalogsItemsBatch ItemsBatchPost(ctx, catalogsItemsBatchRequest)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ItemsGet

> CatalogsItems ItemsGet(ctx, country, itemIds, language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**country** | **string**| Country for the Catalogs Items | 
**itemIds** | [**[]string**](string.md)| Catalos Item ids | 
**language** | **string**| Language for the Catalogs Items | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroups/create**](CatalogsApi.md#catalogsProductGroups/create) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroups/delete**](CatalogsApi.md#catalogsProductGroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroups/list**](CatalogsApi.md#catalogsProductGroups/list) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroups/update**](CatalogsApi.md#catalogsProductGroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResults/list**](CatalogsApi.md#feedProcessingResults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds/create**](CatalogsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed
[**feeds/delete**](CatalogsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feeds/get**](CatalogsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feeds/list**](CatalogsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds
[**feeds/update**](CatalogsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**items/get**](CatalogsApi.md#items/get) | **GET** /catalogs/items | Get catalogs items
[**itemsBatch/get**](CatalogsApi.md#itemsBatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatch/post**](CatalogsApi.md#itemsBatch/post) | **POST** /catalogs/items/batch | Perform an operation on an item batch


<a name="catalogsProductGroups/create"></a>
# **catalogsProductGroups/create**
> Object catalogsProductGroups/create(CatalogsProductGroupCreateRequest)

Create product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](../Models/CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |

### Return type

**Object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsProductGroups/delete"></a>
# **catalogsProductGroups/delete**
> catalogsProductGroups/delete(product\_group\_id)

Delete product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product\_group\_id** | **String**| Unique identifier of a product group | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/list"></a>
# **catalogsProductGroups/list**
> Paginated catalogsProductGroups/list(feed\_id, bookmark, page\_size)

Get product groups list

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed\_id** | **String**| Unique identifier of a feed | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Models/Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/update"></a>
# **catalogsProductGroups/update**
> CatalogsProductGroup catalogsProductGroups/update(product\_group\_id, CatalogsProductGroupUpdateRequest)

Update product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product\_group\_id** | **String**| Unique identifier of a product group | [default to null]
 **CatalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](../Models/CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |

### Return type

[**CatalogsProductGroup**](../Models/CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="feedProcessingResults/list"></a>
# **feedProcessingResults/list**
> Paginated feedProcessingResults/list(feed\_id, bookmark, page\_size)

List processing results for a given feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed\_id** | **String**| Unique identifier of a feed | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Models/Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/create"></a>
# **feeds/create**
> CatalogsFeed feeds/create(CatalogsFeedsCreateRequest)

Create feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](../Models/CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |

### Return type

[**CatalogsFeed**](../Models/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="feeds/delete"></a>
# **feeds/delete**
> feeds/delete(feed\_id)

Delete feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed\_id** | **String**| Unique identifier of a feed | [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/get"></a>
# **feeds/get**
> CatalogsFeed feeds/get(feed\_id)

Get feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed\_id** | **String**| Unique identifier of a feed | [default to null]

### Return type

[**CatalogsFeed**](../Models/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/list"></a>
# **feeds/list**
> Paginated feeds/list(bookmark, page\_size)

List feeds

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Models/Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/update"></a>
# **feeds/update**
> CatalogsFeed feeds/update(feed\_id, CatalogsFeedsUpdateRequest)

Update feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed\_id** | **String**| Unique identifier of a feed | [default to null]
 **CatalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](../Models/CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |

### Return type

[**CatalogsFeed**](../Models/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="items/get"></a>
# **items/get**
> CatalogsItems items/get(country, item\_ids, language)

Get catalogs items

    Get the items of the catalog created by the \&quot;operating user_account\&quot;

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| Country for the Catalogs Items | [default to null]
 **item\_ids** | [**List**](../Models/String.md)| Catalos Item ids | [default to null]
 **language** | **String**| Language for the Catalogs Items | [default to null]

### Return type

[**CatalogsItems**](../Models/CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemsBatch/get"></a>
# **itemsBatch/get**
> CatalogsItemsBatch itemsBatch/get(batch\_id)

Get catalogs items batch

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch\_id** | **String**| Id of a catalogs items batch to fetch | [default to null]

### Return type

[**CatalogsItemsBatch**](../Models/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemsBatch/post"></a>
# **itemsBatch/post**
> CatalogsItemsBatch itemsBatch/post(CatalogsItemsBatchRequest)

Perform an operation on an item batch

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](../Models/CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |

### Return type

[**CatalogsItemsBatch**](../Models/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


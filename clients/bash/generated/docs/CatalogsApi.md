# CatalogsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items



## catalogsProductGroupsCreate

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Create product group to use in Catalogs.

### Example

```bash
 catalogsProductGroupsCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md) | Request object used to created a catalogs product group. |

### Return type

**map**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogsProductGroupsDelete

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Delete a product group from being in use in Catalogs.

### Example

```bash
 catalogsProductGroupsDelete product_group_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string** | Unique identifier of a product group | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogsProductGroupsList

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a list of product groups for a given Catalogs Feed Id.

### Example

```bash
 catalogsProductGroupsList  feed_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogsProductGroupsUpdate

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Update product group to use in Catalogs.

### Example

```bash
 catalogsProductGroupsUpdate product_group_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string** | Unique identifier of a product group | [default to null]
 **catalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md) | Request object used to Update a catalogs product group. |

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedProcessingResultsList

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Fetch a feed processing results owned by the owner user account.

### Example

```bash
 feedProcessingResultsList feed_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedsCreate

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Create a new feed owned by the \"operating user_account\".

### Example

```bash
 feedsCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md) | Request object used to created a feed. |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedsDelete

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Delete a feed owned by the \"operating user_account\".

### Example

```bash
 feedsDelete feed_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedsGet

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a single feed owned by the \"operating user_account\".

### Example

```bash
 feedsGet feed_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | [default to null]

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedsList

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Fetch feeds owned by the \"operating user_account\".

### Example

```bash
 feedsList  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feedsUpdate

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Update a feed owned by the \"operating user_account\".

### Example

```bash
 feedsUpdate feed_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string** | Unique identifier of a feed | [default to null]
 **catalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md) | Request object used to update a feed. |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## itemsBatchGet

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

Get a single catalogs items batch created by the \"operating user_account\".

### Example

```bash
 itemsBatchGet batch_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string** | Id of a catalogs items batch to fetch | [default to null]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## itemsBatchPost

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>

This endpoint supports multiple operations on a set of one or more catalog items.

### Example

```bash
 itemsBatchPost
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md) | Request object used to create catalogs items in a batch |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## itemsGet

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example

```bash
 itemsGet  country=value  Specify as:  item_ids=value1 item_ids=value2 item_ids=...  language=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string** | Country for the Catalogs Items | [default to null]
 **itemIds** | [**array[string]**](string.md) | Catalos Item ids | [default to null]
 **language** | **string** | Language for the Catalogs Items | [default to null]

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


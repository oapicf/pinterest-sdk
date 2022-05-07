# \CatalogsApi

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



## catalogs_product_groups_create

> serde_json::Value catalogs_product_groups_create(catalogs_product_group_create_request)
Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**catalogs_product_group_create_request** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md) | Request object used to created a catalogs product group. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogs_product_groups_delete

> catalogs_product_groups_delete(product_group_id)
Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**product_group_id** | **String** | Unique identifier of a product group | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogs_product_groups_list

> crate::models::Paginated catalogs_product_groups_list(feed_id, bookmark, page_size)
Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**feed_id** | **String** | Unique identifier of a feed | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## catalogs_product_groups_update

> crate::models::CatalogsProductGroup catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request)
Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**product_group_id** | **String** | Unique identifier of a product group | [required] |
**catalogs_product_group_update_request** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md) | Request object used to Update a catalogs product group. | [required] |

### Return type

[**crate::models::CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feed_processing_results_list

> crate::models::Paginated feed_processing_results_list(feed_id, bookmark, page_size)
List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**feed_id** | **String** | Unique identifier of a feed | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feeds_create

> crate::models::CatalogsFeed feeds_create(catalogs_feeds_create_request)
Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**catalogs_feeds_create_request** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md) | Request object used to created a feed. | [required] |

### Return type

[**crate::models::CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feeds_delete

> feeds_delete(feed_id)
Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**feed_id** | **String** | Unique identifier of a feed | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feeds_get

> crate::models::CatalogsFeed feeds_get(feed_id)
Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**feed_id** | **String** | Unique identifier of a feed | [required] |

### Return type

[**crate::models::CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feeds_list

> crate::models::Paginated feeds_list(bookmark, page_size)
List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## feeds_update

> crate::models::CatalogsFeed feeds_update(feed_id, catalogs_feeds_update_request)
Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**feed_id** | **String** | Unique identifier of a feed | [required] |
**catalogs_feeds_update_request** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md) | Request object used to update a feed. | [required] |

### Return type

[**crate::models::CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## items_batch_get

> crate::models::CatalogsItemsBatch items_batch_get(batch_id)
Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**batch_id** | **String** | Id of a catalogs items batch to fetch | [required] |

### Return type

[**crate::models::CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## items_batch_post

> crate::models::CatalogsItemsBatch items_batch_post(catalogs_items_batch_request)
Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**catalogs_items_batch_request** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md) | Request object used to create catalogs items in a batch | [required] |

### Return type

[**crate::models::CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## items_get

> crate::models::CatalogsItems items_get(country, item_ids, language)
Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**country** | **String** | Country for the Catalogs Items | [required] |
**item_ids** | [**Vec<String>**](String.md) | Catalos Item ids | [required] |
**language** | **String** | Language for the Catalogs Items | [required] |

### Return type

[**crate::models::CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


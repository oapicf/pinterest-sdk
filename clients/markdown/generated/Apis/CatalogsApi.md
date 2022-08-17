# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**catalogsProductGroupPins/list**](CatalogsApi.md#catalogsProductGroupPins/list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a given product group |
| [**catalogsProductGroups/create**](CatalogsApi.md#catalogsProductGroups/create) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroups/delete**](CatalogsApi.md#catalogsProductGroups/delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroups/get**](CatalogsApi.md#catalogsProductGroups/get) | **GET** /catalogs/product_groups/{product_group_id} | Get a product group |
| [**catalogsProductGroups/list**](CatalogsApi.md#catalogsProductGroups/list) | **GET** /catalogs/product_groups | Get product groups list |
| [**catalogsProductGroups/productCountsGet**](CatalogsApi.md#catalogsProductGroups/productCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a given product group |
| [**catalogsProductGroups/update**](CatalogsApi.md#catalogsProductGroups/update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feedProcessingResults/list**](CatalogsApi.md#feedProcessingResults/list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feeds/create**](CatalogsApi.md#feeds/create) | **POST** /catalogs/feeds | Create feed |
| [**feeds/delete**](CatalogsApi.md#feeds/delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feeds/get**](CatalogsApi.md#feeds/get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feeds/list**](CatalogsApi.md#feeds/list) | **GET** /catalogs/feeds | List feeds |
| [**feeds/update**](CatalogsApi.md#feeds/update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**items/get**](CatalogsApi.md#items/get) | **GET** /catalogs/items | Get catalogs items |
| [**itemsBatch/get**](CatalogsApi.md#itemsBatch/get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch |
| [**itemsBatch/post**](CatalogsApi.md#itemsBatch/post) | **POST** /catalogs/items/batch | Perform an operation on an item batch |
| [**itemsIssues/list**](CatalogsApi.md#itemsIssues/list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**productsByProductGroupFilter/list**](CatalogsApi.md#productsByProductGroupFilter/list) | **POST** /catalogs/products/get_by_product_group_filters | List products that meet the criteria of the filter you provide. |


<a name="catalogsProductGroupPins/list"></a>
# **catalogsProductGroupPins/list**
> products_by_product_group_filter_list_200_response catalogsProductGroupPins/list(product\_group\_id, bookmark, page\_size)

List products for a given product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product pins for a given Catalogs Product Group Id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**products_by_product_group_filter_list_200_response**](../Models/products_by_product_group_filter_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/create"></a>
# **catalogsProductGroups/create**
> CatalogsProductGroup catalogsProductGroups/create(CatalogsProductGroupCreateRequest)

Create product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsProductGroupCreateRequest** | [**CatalogsProductGroupCreateRequest**](../Models/CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. | |

### Return type

[**CatalogsProductGroup**](../Models/CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="catalogsProductGroups/delete"></a>
# **catalogsProductGroups/delete**
> catalogsProductGroups/delete(product\_group\_id)

Delete product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/get"></a>
# **catalogsProductGroups/get**
> CatalogsProductGroup catalogsProductGroups/get(product\_group\_id)

Get a product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a singe product group for a given Catalogs Product Group Id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |

### Return type

[**CatalogsProductGroup**](../Models/CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/list"></a>
# **catalogsProductGroups/list**
> catalogs_product_groups_list_200_response catalogsProductGroups/list(feed\_id, bookmark, page\_size)

Get product groups list

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feed\_id** | **String**| Unique identifier of a feed | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**catalogs_product_groups_list_200_response**](../Models/catalogs_product_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/productCountsGet"></a>
# **catalogsProductGroups/productCountsGet**
> CatalogsProductGroupProductCounts catalogsProductGroups/productCountsGet(product\_group\_id)

Get product counts for a given product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; Get a product counts for a given Catalogs Product Group.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |

### Return type

[**CatalogsProductGroupProductCounts**](../Models/CatalogsProductGroupProductCounts.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="catalogsProductGroups/update"></a>
# **catalogsProductGroups/update**
> CatalogsProductGroup catalogsProductGroups/update(product\_group\_id, CatalogsProductGroupUpdateRequest)

Update product group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_group\_id** | **String**| Unique identifier of a product group | [default to null] |
| **CatalogsProductGroupUpdateRequest** | [**CatalogsProductGroupUpdateRequest**](../Models/CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | |

### Return type

[**CatalogsProductGroup**](../Models/CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="feedProcessingResults/list"></a>
# **feedProcessingResults/list**
> feed_processing_results_list_200_response feedProcessingResults/list(feed\_id, bookmark, page\_size)

List processing results for a given feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feed\_id** | **String**| Unique identifier of a feed | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**feed_processing_results_list_200_response**](../Models/feed_processing_results_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/create"></a>
# **feeds/create**
> CatalogsFeed feeds/create(CatalogsFeedsCreateRequest)

Create feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsFeedsCreateRequest** | [**CatalogsFeedsCreateRequest**](../Models/CatalogsFeedsCreateRequest.md)| Request object used to created a feed. | |

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

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feed\_id** | **String**| Unique identifier of a feed | [default to null] |

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

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feed\_id** | **String**| Unique identifier of a feed | [default to null] |

### Return type

[**CatalogsFeed**](../Models/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/list"></a>
# **feeds/list**
> feeds_list_200_response feeds/list(bookmark, page\_size)

List feeds

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**feeds_list_200_response**](../Models/feeds_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="feeds/update"></a>
# **feeds/update**
> CatalogsFeed feeds/update(feed\_id, CatalogsFeedsUpdateRequest)

Update feed

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **feed\_id** | **String**| Unique identifier of a feed | [default to null] |
| **CatalogsFeedsUpdateRequest** | [**CatalogsFeedsUpdateRequest**](../Models/CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | |

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

    Get the items of the catalog created by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **country** | **String**| Country for the Catalogs Items | [default to null] |
| **item\_ids** | [**List**](../Models/String.md)| Catalogs Item ids | [default to null] |
| **language** | **String**| Language for the Catalogs Items | [default to null] |

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

    Get a single catalogs items batch created by the \&quot;operating user_account\&quot;. &lt;a href&#x3D;\&quot;/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batch\_id** | **String**| Id of a catalogs items batch to fetch | [default to null] |

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

    This endpoint supports multiple operations on a set of one or more catalog items. &lt;a href&#x3D;\&quot;/docs/features/catalog-management/#Using%20batch%20updates%20for%20catalog%20management\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See detailed documentation here.&lt;/a&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsItemsBatchRequest** | [**CatalogsItemsBatchRequest**](../Models/CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch | |

### Return type

[**CatalogsItemsBatch**](../Models/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="itemsIssues/list"></a>
# **itemsIssues/list**
> items_issues_list_200_response itemsIssues/list(processing\_result\_id, bookmark, page\_size, item\_numbers, item\_validation\_issue)

List item issues for a given processing result

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  List item validation issues for a given feed processing result. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **processing\_result\_id** | **String**| Unique identifier of a feed processing result | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **item\_numbers** | [**List**](../Models/Integer.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] [default to null] |
| **item\_validation\_issue** | [**CatalogsItemValidationIssue**](../Models/.md)| Filter item validation issues that have a given type of item validation issue. | [optional] [default to null] [enum: ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, AGE_GROUP_NORMALIZED, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, AVAILABILITY_NORMALIZED, BLOCKLISTED_IMAGE_SIGNATURE, CONDITION_NORMALIZED, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GENDER_NORMALIZED, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SHIPPING_INVALID, SHIPPING_WEIGHT_INVALID, SIZE_TYPE_INVALID, SIZE_TYPE_NORMALIZED, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID] |

### Return type

[**items_issues_list_200_response**](../Models/items_issues_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="productsByProductGroupFilter/list"></a>
# **productsByProductGroupFilter/list**
> products_by_product_group_filter_list_200_response productsByProductGroupFilter/list(CatalogsListProductsByFilterRequest, bookmark, page\_size)

List products that meet the criteria of the filter you provide.

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/catalog-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; List products Pins that meet the criteria specified in the Catalogs Product Group Filter given in the request. Note: This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CatalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](../Models/CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**products_by_product_group_filter_list_200_response**](../Models/products_by_product_group_filter_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


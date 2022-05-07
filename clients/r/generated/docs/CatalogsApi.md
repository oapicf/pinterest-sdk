# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupsCreate**](CatalogsApi.md#CatalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsDelete**](CatalogsApi.md#CatalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsList**](CatalogsApi.md#CatalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#CatalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**FeedProcessingResultsList**](CatalogsApi.md#FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**FeedsCreate**](CatalogsApi.md#FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**FeedsList**](CatalogsApi.md#FeedsList) | **GET** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**ItemsBatchPost**](CatalogsApi.md#ItemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**ItemsGet**](CatalogsApi.md#ItemsGet) | **GET** /catalogs/items | Get catalogs items


# **CatalogsProductGroupsCreate**
> object CatalogsProductGroupsCreate(catalogs.product.group.create.request)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example
```R
library(openapi)

var.catalogs.product.group.create.request <- CatalogsProductGroupCreateRequest$new("feed_id_example", "name_example", CatalogsProductGroupFilters$new(list(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"))), list(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example")))), "description_example") # CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

#Create product group
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$CatalogsProductGroupsCreate(var.catalogs.product.group.create.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs.product.group.create.request** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. | 

### Return type

**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Invalid body. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsDelete**
> CatalogsProductGroupsDelete(product.group.id)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example
```R
library(openapi)

var.product.group.id <- 'product.group.id_example' # character | Unique identifier of a product group

#Delete product group
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
api.instance$CatalogsProductGroupsDelete(var.product.group.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product.group.id** | **character**| Unique identifier of a product group | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Catalogs Product Group deleted successfully. |  -  |
| **400** | Invalid catalogs product group id parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsList**
> Paginated CatalogsProductGroupsList(feed.id, bookmark=var.bookmark, page.size=25)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Example
```R
library(openapi)

var.feed.id <- 'feed.id_example' # character | Unique identifier of a feed
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#Get product groups list
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$CatalogsProductGroupsList(var.feed.id, bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed.id** | **character**| Unique identifier of a feed | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsUpdate**
> CatalogsProductGroup CatalogsProductGroupsUpdate(product.group.id, catalogs.product.group.update.request)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example
```R
library(openapi)

var.product.group.id <- 'product.group.id_example' # character | Unique identifier of a product group
var.catalogs.product.group.update.request <- CatalogsProductGroupUpdateRequest$new("feed_id_example", "name_example", CatalogsProductGroupFilters$new(list(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"))), list(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupPricingCriteria$new("inclusion_example", 123, "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(list("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(list(list("values_example")), "negated_example")))), "description_example") # CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

#Update product group
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$CatalogsProductGroupsUpdate(var.product.group.id, var.catalogs.product.group.update.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product.group.id** | **character**| Unique identifier of a product group | 
 **catalogs.product.group.update.request** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. | 

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t update this catalogs product group to this value. |  -  |
| **0** | Unexpected error. |  -  |

# **FeedProcessingResultsList**
> Paginated FeedProcessingResultsList(feed.id, bookmark=var.bookmark, page.size=25)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Example
```R
library(openapi)

var.feed.id <- 'feed.id_example' # character | Unique identifier of a feed
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#List processing results for a given feed
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$FeedProcessingResultsList(var.feed.id, bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed.id** | **character**| Unique identifier of a feed | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Feed not found. |  -  |
| **0** | Unexpected error. |  -  |

# **FeedsCreate**
> CatalogsFeed FeedsCreate(catalogs.feeds.create.request)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.catalogs.feeds.create.request <- CatalogsFeedsCreateRequest$new("name_example", CatalogsFormat$new(), "location_example", Country$new(), ProductAvailabilityType$new(), NullableCurrency$new(), "default_locale_example", CatalogsFeedCredentials$new("password_example", "username_example"), CatalogsFeedProcessingSchedule$new("time_example", "Africa/Abidjan")) # CatalogsFeedsCreateRequest | Request object used to created a feed.

#Create feed
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$FeedsCreate(var.catalogs.feeds.create.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs.feeds.create.request** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Business account required. |  -  |
| **409** | User website required. |  -  |
| **422** | Unique feed name is required. |  -  |
| **0** | Unexpected error |  -  |

# **FeedsDelete**
> FeedsDelete(feed.id)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.feed.id <- 'feed.id_example' # character | Unique identifier of a feed

#Delete feed
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
api.instance$FeedsDelete(var.feed.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed.id** | **character**| Unique identifier of a feed | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Feed deleted successfully. |  -  |
| **400** | Invalid feed parameters. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Conflict. Can&#39;t delete a feed with active promotions. |  -  |
| **0** | Unexpected error |  -  |

# **FeedsGet**
> CatalogsFeed FeedsGet(feed.id)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.feed.id <- 'feed.id_example' # character | Unique identifier of a feed

#Get feed
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$FeedsGet(var.feed.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed.id** | **character**| Unique identifier of a feed | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Data feed not found. |  -  |
| **0** | Unexpected error. |  -  |

# **FeedsList**
> Paginated FeedsList(bookmark=var.bookmark, page.size=25)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#List feeds
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$FeedsList(bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **0** | Unexpected error. |  -  |

# **FeedsUpdate**
> CatalogsFeed FeedsUpdate(feed.id, catalogs.feeds.update.request)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.feed.id <- 'feed.id_example' # character | Unique identifier of a feed
var.catalogs.feeds.update.request <- CatalogsFeedsUpdateRequest$new(ProductAvailabilityType$new(), NullableCurrency$new(), "name_example", CatalogsFormat$new(), CatalogsFeedCredentials$new("password_example", "username_example"), "location_example", CatalogsFeedProcessingSchedule$new("time_example", "Africa/Abidjan"), CatalogsStatus$new()) # CatalogsFeedsUpdateRequest | Request object used to update a feed.

#Update feed
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$FeedsUpdate(var.feed.id, var.catalogs.feeds.update.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed.id** | **character**| Unique identifier of a feed | 
 **catalogs.feeds.update.request** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. | 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid feed parameters. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **0** | Unexpected error |  -  |

# **ItemsBatchGet**
> CatalogsItemsBatch ItemsBatchGet(batch.id)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example
```R
library(openapi)

var.batch.id <- '595953100599279259-66753b9bb65c46c49bd8503b27fecf9e' # character | Id of a catalogs items batch to fetch

#Get catalogs items batch
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$ItemsBatchGet(var.batch.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch.id** | **character**| Id of a catalogs items batch to fetch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **401** | Not authorized to access catalogs items batch |  -  |
| **403** | Not authorized to access catalogs items batch |  -  |
| **404** | Catalogs items batch not found |  -  |
| **0** | Unexpected error |  -  |

# **ItemsBatchPost**
> CatalogsItemsBatch ItemsBatchPost(catalogs.items.batch.request)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example
```R
library(openapi)

var.catalogs.items.batch.request <- CatalogsItemsBatchRequest$new(Country$new(), Language$new(), BatchOperation$new(), list(ItemBatchRecord$new("item_id_example", ItemAttributes$new("ad_link_example", list("additional_image_link_example"), "adult_example", "age_group_example", "availability_example", 123, "brand_example", "color_example", "condition_example", "custom_label_0_example", "custom_label_1_example", "custom_label_2_example", "custom_label_3_example", "custom_label_4_example", "description_example", "free_shipping_label_example", "free_shipping_limit_example", "gender_example", "google_product_category_example", 123, "id_example", list("image_link_example"), "item_group_id_example", 123, "link_example", "material_example", "min_ad_price_example", "mobile_link_example", "mpn_example", 123, 123, "pattern_example", "price_example", "product_type_example", "sale_price_example", "shipping_example", "shipping_height_example", "shipping_weight_example", "shipping_width_example", "size_example", "size_system_example", "size_type_example", "tax_example", "title_example")))) # CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

#Perform an operation on an item batch
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$ItemsBatchPost(var.catalogs.items.batch.request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs.items.batch.request** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch | 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **401** | Not authorized to post catalogs items |  -  |
| **403** | Not authorized to post catalogs items |  -  |
| **0** | Unexpected error |  -  |

# **ItemsGet**
> CatalogsItems ItemsGet(country, item.ids, language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example
```R
library(openapi)

var.country <- 'US' # character | Country for the Catalogs Items
var.item.ids <- list("inner_example") # array[character] | Catalos Item ids
var.language <- 'EN' # character | Language for the Catalogs Items

#Get catalogs items
api.instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$ItemsGet(var.country, var.item.ids, var.language)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **character**| Country for the Catalogs Items | 
 **item.ids** | list( **character** )| Catalos Item ids | 
 **language** | **character**| Language for the Catalogs Items | 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items |  -  |
| **401** | Not authorized to access catalogs items |  -  |
| **403** | Not authorized to access catalogs items |  -  |
| **0** | Unexpected error |  -  |


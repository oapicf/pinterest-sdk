# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsCreate**](CatalogsApi.md#CatalogsCreate) | **POST** /catalogs | Create catalog
[**CatalogsList**](CatalogsApi.md#CatalogsList) | **GET** /catalogs | List catalogs
[**CatalogsProductGroupPinsList**](CatalogsApi.md#CatalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogsProductGroupsCreate**](CatalogsApi.md#CatalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsCreateMany**](CatalogsApi.md#CatalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**CatalogsProductGroupsDelete**](CatalogsApi.md#CatalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsDeleteMany**](CatalogsApi.md#CatalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**CatalogsProductGroupsGet**](CatalogsApi.md#CatalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](CatalogsApi.md#CatalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](CatalogsApi.md#CatalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#CatalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**FeedProcessingResultsList**](CatalogsApi.md#FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**FeedsCreate**](CatalogsApi.md#FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**FeedsIngest**](CatalogsApi.md#FeedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**FeedsList**](CatalogsApi.md#FeedsList) | **GET** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**ItemsBatchPost**](CatalogsApi.md#ItemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**ItemsGet**](CatalogsApi.md#ItemsGet) | **GET** /catalogs/items | Get catalogs items
[**ItemsIssuesList**](CatalogsApi.md#ItemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
[**ItemsPost**](CatalogsApi.md#ItemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
[**ProductsByProductGroupFilterList**](CatalogsApi.md#ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
[**ReportsCreate**](CatalogsApi.md#ReportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**ReportsGet**](CatalogsApi.md#ReportsGet) | **GET** /catalogs/reports | Get catalogs report
[**ReportsStats**](CatalogsApi.md#ReportsStats) | **GET** /catalogs/reports/stats | List report stats


# **CatalogsCreate**
> Catalog CatalogsCreate(catalogs_create_request, ad_account_id = var.ad_account_id)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: this API only supports the catalog type of HOTEL for now.

### Example
```R
library(openapi)

# Create catalog
#
# prepare function argument(s)
var_catalogs_create_request <- CatalogsCreateRequest$new("HOTEL", "name_example") # CatalogsCreateRequest | Request object used to created a feed.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsCreate(var_catalogs_create_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsCreate(var_catalogs_create_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_create_request** | [**CatalogsCreateRequest**](CatalogsCreateRequest.md)| Request object used to created a feed. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Catalog**](Catalog.md)

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
| **0** | Unexpected error. |  -  |

# **CatalogsList**
> CatalogsList200Response CatalogsList(bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List catalogs
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsList(bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsList(bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsList200Response**](catalogs_list_200_response.md)

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

# **CatalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(product_group_id, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id, pin_metrics = FALSE)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List products by product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metricsdata_file = "result.txt")
result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]

### Return type

[**CatalogsProductGroupPinsList200Response**](catalogs_product_group_pins_list_200_response.md)

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
| **404** | Catalogs product group not found. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsCreate**
> CatalogsVerticalProductGroup CatalogsProductGroupsCreate(multiple_product_groups_inner, ad_account_id = var.ad_account_id)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create product group
#
# prepare function argument(s)
var_multiple_product_groups_inner <- multiple_product_groups_inner$new("name_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example")))), "feed_id_example", "CREATIVE_ASSETS", "catalog_id_example", Country$new(), CatalogsLocale$new(), "description_example", "is_featured_example") # MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsCreate(var_multiple_product_groups_inner, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsCreate(var_multiple_product_groups_inner, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multiple_product_groups_inner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md)| Request object used to create a single catalogs product groups. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsCreateMany**
> array[character] CatalogsProductGroupsCreateMany(multiple_product_groups_inner, ad_account_id = var.ad_account_id)

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create product groups
#
# prepare function argument(s)
var_multiple_product_groups_inner <- c(multiple_product_groups_inner$new("name_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(...), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(...), "negated_example")))), "feed_id_example", "CREATIVE_ASSETS", "catalog_id_example", Country$new(), CatalogsLocale$new(), "description_example", "is_featured_example")) # array[MultipleProductGroupsInner] | Request object used to create one or more catalogs product groups.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsCreateMany(var_multiple_product_groups_inner, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsCreateMany(var_multiple_product_groups_inner, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multiple_product_groups_inner** | list( [**MultipleProductGroupsInner**](multiple_product_groups_inner.md) )| Request object used to create one or more catalogs product groups. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

**array[character]**

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
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsDelete**
> CatalogsProductGroupsDelete(product_group_id, ad_account_id = var.ad_account_id)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# Delete product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$CatalogsProductGroupsDelete(var_product_group_id, ad_account_id = var_ad_account_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsDeleteMany**
> CatalogsProductGroupsDeleteMany(id, ad_account_id = var.ad_account_id)

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# Delete product groups
#
# prepare function argument(s)
var_id <- c(123) # array[integer] | Comma-separated list of product group ids
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$CatalogsProductGroupsDeleteMany(var_id, ad_account_id = var_ad_account_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | list( **integer** )| Comma-separated list of product group ids | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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
| **204** | Catalogs Product Groups deleted successfully. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsGet**
> CatalogsVerticalProductGroup CatalogsProductGroupsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# Get product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsGet(var_product_group_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsGet(var_product_group_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid catalogs product group id parameters. |  -  |
| **401** | Unauthorized access. |  -  |
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t get a catalogs product group without an existing catalog. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsList**
> CatalogsProductGroupsList200Response CatalogsProductGroupsList(id = var.id, feed_id = var.feed_id, catalog_id = var.catalog_id, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List product groups
#
# prepare function argument(s)
var_id <- c(123) # array[integer] | Comma-separated list of product group ids (Optional)
var_feed_id <- "feed_id_example" # character | Filter entities for a given feed_id. If not given, all feeds are considered. (Optional)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id. If not given, all catalogs are considered. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsList(id = var_id, feed_id = var_feed_id, catalog_id = var_catalog_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsList(id = var_id, feed_id = var_feed_id, catalog_id = var_catalog_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | list( **integer** )| Comma-separated list of product group ids | [optional] 
 **feed_id** | **character**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalog_id** | **character**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsList200Response**](catalogs_product_groups_list_200_response.md)

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
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical CatalogsProductGroupsProductCountsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# Get product counts
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsProductCountsGet(var_product_group_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsProductCountsGet(var_product_group_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Product Group Not Found. |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup CatalogsProductGroupsUpdate(product_group_id, catalogs_product_groups_update_request, ad_account_id = var.ad_account_id)

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Update single product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_catalogs_product_groups_update_request <- catalogs_product_groups_update_request$new("name_example", "description_example", "is_featured_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example")))), "CREATIVE_ASSETS", Country$new(), CatalogsLocale$new()) # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsUpdate(var_product_group_id, var_catalogs_product_groups_update_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsUpdate(var_product_group_id, var_catalogs_product_groups_update_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **catalogs_product_groups_update_request** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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
| **403** | Forbidden. Account not approved for catalog product group mutations yet. |  -  |
| **404** | Catalogs product group not found. |  -  |
| **409** | Conflict. Can&#39;t update this catalogs product group to this value. |  -  |
| **0** | Unexpected error. |  -  |

# **FeedProcessingResultsList**
> FeedProcessingResultsList200Response FeedProcessingResultsList(feed_id, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List feed processing results
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedProcessingResultsList(var_feed_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedProcessingResultsList(var_feed_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Unique identifier of a feed | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedProcessingResultsList200Response**](feed_processing_results_list_200_response.md)

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
> CatalogsFeed FeedsCreate(feeds_create_request, ad_account_id = var.ad_account_id)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create feed
#
# prepare function argument(s)
var_feeds_create_request <- feeds_create_request$new("name_example", CatalogsFormat$new(), CatalogsFeedsCreateRequest_default_locale$new(), "location_example", CatalogsType$new(), Country$new(), NullableCurrency$new(), CatalogsFeedCredentials$new("password_example", "username_example"), CatalogsFeedProcessingSchedule$new("time_example", "Africa/Abidjan"), ProductAvailabilityType$new(), CatalogsStatus$new(), "catalog_id_example") # FeedsCreateRequest | Request object used to created a feed.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsCreate(var_feeds_create_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsCreate(var_feeds_create_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeds_create_request** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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
| **501** | Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;). |  -  |
| **0** | Unexpected error |  -  |

# **FeedsDelete**
> FeedsDelete(feed_id, ad_account_id = var.ad_account_id)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```R
library(openapi)

# Delete feed
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$FeedsDelete(var_feed_id, ad_account_id = var_ad_account_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Unique identifier of a feed | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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
> CatalogsFeed FeedsGet(feed_id, ad_account_id = var.ad_account_id)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```R
library(openapi)

# Get feed
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsGet(var_feed_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsGet(var_feed_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Unique identifier of a feed | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **FeedsIngest**
> CatalogsFeedIngestion FeedsIngest(feed_id, ad_account_id = var.ad_account_id)

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Ingest feed items
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsIngest(var_feed_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsIngest(var_feed_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Unique identifier of a feed | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The ingestion process was successfully started. |  -  |
| **400** | Invalid feed parameters. |  -  |
| **403** | Forbidden. Account not approved for feed mutations yet. |  -  |
| **404** | Data feed not found. |  -  |
| **0** | Unexpected error |  -  |

# **FeedsList**
> FeedsList200Response FeedsList(bookmark = var.bookmark, page_size = 25, catalog_id = var.catalog_id, ad_account_id = var.ad_account_id)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

### Example
```R
library(openapi)

# List feeds
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id. If not given, all catalogs are considered. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsList(bookmark = var_bookmark, page_size = var_page_size, catalog_id = var_catalog_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsList(bookmark = var_bookmark, page_size = var_page_size, catalog_id = var_catalog_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalog_id** | **character**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](feeds_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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
> CatalogsFeed FeedsUpdate(feed_id, feeds_update_request, ad_account_id = var.ad_account_id)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Update feed
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_feeds_update_request <- feeds_update_request$new(CatalogsType$new(), NullableCurrency$new(), "name_example", CatalogsFormat$new(), CatalogsFeedCredentials$new("password_example", "username_example"), "location_example", CatalogsFeedProcessingSchedule$new("time_example", "Africa/Abidjan"), CatalogsStatus$new(), ProductAvailabilityType$new()) # FeedsUpdateRequest | Request object used to update a feed.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsUpdate(var_feed_id, var_feeds_update_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsUpdate(var_feed_id, var_feeds_update_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Unique identifier of a feed | 
 **feeds_update_request** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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
> CatalogsItemsBatch ItemsBatchGet(batch_id, ad_account_id = var.ad_account_id)

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Get item batch status
#
# prepare function argument(s)
var_batch_id <- "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" # character | Id of a catalogs items batch to fetch
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemsBatchGet(var_batch_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ItemsBatchGet(var_batch_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **character**| Id of a catalogs items batch to fetch | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **401** | Not authenticated to access catalogs items batch |  -  |
| **403** | Not authorized to access catalogs items batch |  -  |
| **404** | Catalogs items batch not found |  -  |
| **405** | Method Not Allowed. |  -  |
| **0** | Unexpected error |  -  |

# **ItemsBatchPost**
> CatalogsItemsBatch ItemsBatchPost(items_batch_post_request, ad_account_id = var.ad_account_id)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.

### Example
```R
library(openapi)

# Operate on item batch
#
# prepare function argument(s)
var_items_batch_post_request <- items_batch_post_request$new("CREATIVE_ASSETS", Country$new(), CatalogsItemsRequest_language$new(), c(ItemDeleteBatchRecord$new("item_id_example")), BatchOperation$new(), "catalog_id_example") # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemsBatchPost(var_items_batch_post_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ItemsBatchPost(var_items_batch_post_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **items_batch_post_request** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items batch |  -  |
| **400** | Invalid request parameters. |  -  |
| **401** | Not authenticated to post catalogs items |  -  |
| **403** | Not authorized to post catalogs items |  -  |
| **0** | Unexpected error |  -  |

# **ItemsGet**
> CatalogsItems ItemsGet(country, language, ad_account_id = var.ad_account_id, item_ids = var.item_ids, filters = var.filters)

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead.

### Example
```R
library(openapi)

# Get catalogs items
#
# prepare function argument(s)
var_country <- "US" # character | Country for the Catalogs Items
var_language <- "EN" # character | Language for the Catalogs Items
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_item_ids <- c("inner_example") # array[character] | This parameter is deprecated. Use filters instead. (Optional)
var_filters <- CatalogsItemsFilters$new(CatalogsType$new(), c("item_ids_example"), c("hotel_ids_example"), c("creative_assets_ids_example"), "catalog_id_example") # CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemsGet(var_country, var_language, ad_account_id = var_ad_account_id, item_ids = var_item_ids, filters = var_filtersdata_file = "result.txt")
result <- api_instance$ItemsGet(var_country, var_language, ad_account_id = var_ad_account_id, item_ids = var_item_ids, filters = var_filters)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **character**| Country for the Catalogs Items | 
 **language** | **character**| Language for the Catalogs Items | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **item_ids** | list( **character** )| This parameter is deprecated. Use filters instead. | [optional] 
 **filters** | [**CatalogsItemsFilters**](.md)| Identifies items to be retrieved. This is a required parameter. | [optional] 

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
| **400** | Invalid request parameters. |  -  |
| **401** | Not authorized to access catalogs items |  -  |
| **403** | Not authorized to access catalogs items |  -  |
| **0** | Unexpected error |  -  |

# **ItemsIssuesList**
> ItemsIssuesList200Response ItemsIssuesList(processing_result_id, bookmark = var.bookmark, page_size = 25, item_numbers = var.item_numbers, item_validation_issue = var.item_validation_issue, ad_account_id = var.ad_account_id)

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List item issues
#
# prepare function argument(s)
var_processing_result_id <- "5224831246441439241" # character | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_item_numbers <- c(123) # array[integer] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (Optional)
var_item_validation_issue <- CatalogsItemValidationIssue$new() # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemsIssuesList(var_processing_result_id, bookmark = var_bookmark, page_size = var_page_size, item_numbers = var_item_numbers, item_validation_issue = var_item_validation_issue, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ItemsIssuesList(var_processing_result_id, bookmark = var_bookmark, page_size = var_page_size, item_numbers = var_item_numbers, item_validation_issue = var_item_validation_issue, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processing_result_id** | **character**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **item_numbers** | list( **integer** )| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **item_validation_issue** | [**CatalogsItemValidationIssue**](.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsIssuesList200Response**](items_issues_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized access. |  -  |
| **404** | Processing Result not found. |  -  |
| **501** | Not implemented. |  -  |
| **0** | Unexpected error. |  -  |

# **ItemsPost**
> CatalogsItems ItemsPost(catalogs_items_request, ad_account_id = var.ad_account_id)

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Get catalogs items (POST)
#
# prepare function argument(s)
var_catalogs_items_request <- CatalogsItemsRequest$new(Country$new(), CatalogsItemsRequest_language$new(), CatalogsItemsPostFilters$new(CatalogsType$new(), c("item_ids_example"), c("hotel_ids_example"), c("creative_assets_ids_example"), "catalog_id_example")) # CatalogsItemsRequest | Request object used to get catalogs items
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemsPost(var_catalogs_items_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ItemsPost(var_catalogs_items_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_request** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)| Request object used to get catalogs items | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the requested catalogs items |  -  |
| **400** | Invalid request |  -  |
| **401** | Not authorized to access catalogs items |  -  |
| **403** | Not authorized to access catalogs items |  -  |
| **0** | Unexpected error |  -  |

# **ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(catalogs_list_products_by_filter_request, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id, pin_metrics = FALSE)

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List products by filter
#
# prepare function argument(s)
var_catalogs_list_products_by_filter_request <- CatalogsListProductsByFilterRequest$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example")))), "CREATIVE_ASSETS", "catalog_id_example", Country$new(), CatalogsLocale$new()) # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductsByProductGroupFilterList(var_catalogs_list_products_by_filter_request, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metricsdata_file = "result.txt")
result <- api_instance$ProductsByProductGroupFilterList(var_catalogs_list_products_by_filter_request, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]

### Return type

[**CatalogsProductGroupPinsList200Response**](catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized access. |  -  |
| **409** | Conflict. Can&#39;t get products. |  -  |
| **0** | Unexpected error. |  -  |

# **ReportsCreate**
> CatalogsCreateReportResponse ReportsCreate(catalogs_report_parameters, ad_account_id = var.ad_account_id)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Build catalogs report
#
# prepare function argument(s)
var_catalogs_report_parameters <- CatalogsReportParameters$new(CatalogsType$new(), CatalogsHotelReportParameters_report$new("feed_id_example", "FEED_INGESTION_ISSUES", "processing_result_id_example", "catalog_id_example")) # CatalogsReportParameters | Request object to asynchronously create a report.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsCreate(var_catalogs_report_parameters, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ReportsCreate(var_catalogs_report_parameters, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_report_parameters** | [**CatalogsReportParameters**](CatalogsReportParameters.md)| Request object to asynchronously create a report. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsCreateReportResponse**](CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the report token |  -  |
| **404** | Entity (e.g., catalog, feed or processing_result) not found |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error |  -  |

# **ReportsGet**
> CatalogsReport ReportsGet(token, ad_account_id = var.ad_account_id)

Get catalogs report

This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Get catalogs report
#
# prepare function argument(s)
var_token <- "token_example" # character | Token returned from async build report call
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsGet(var_token, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ReportsGet(var_token, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **character**| Token returned from async build report call | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsReport**](CatalogsReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response that contains a link to download the report |  -  |
| **400** | The token you provided is not valid or has expired. |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error |  -  |

# **ReportsStats**
> ReportsStats200Response ReportsStats(parameters, ad_account_id = var.ad_account_id, page_size = 25, bookmark = var.bookmark)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# List report stats
#
# prepare function argument(s)
var_parameters <- CatalogsReportParameters$new(CatalogsType$new(), CatalogsHotelReportParameters_report$new("feed_id_example", "FEED_INGESTION_ISSUES", "processing_result_id_example", "catalog_id_example")) # CatalogsReportParameters | Contains the parameters for report identification.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ReportsStats(var_parameters, ad_account_id = var_ad_account_id, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$ReportsStats(var_parameters, ad_account_id = var_ad_account_id, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**CatalogsReportParameters**](.md)| Contains the parameters for report identification. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**ReportsStats200Response**](reports_stats_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing the diagnostics aggregated counters |  -  |
| **401** | Not authorized to access catalogs |  -  |
| **0** | Unexpected error |  -  |


# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsList**](CatalogsApi.md#CatalogsList) | **GET** /catalogs | List catalogs
[**CatalogsProductGroupPinsList**](CatalogsApi.md#CatalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**CatalogsProductGroupsCreate**](CatalogsApi.md#CatalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsDelete**](CatalogsApi.md#CatalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsGet**](CatalogsApi.md#CatalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](CatalogsApi.md#CatalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](CatalogsApi.md#CatalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**CatalogsProductGroupsUpdate**](CatalogsApi.md#CatalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**FeedProcessingResultsList**](CatalogsApi.md#FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**FeedsCreate**](CatalogsApi.md#FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**FeedsDelete**](CatalogsApi.md#FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**FeedsGet**](CatalogsApi.md#FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**FeedsList**](CatalogsApi.md#FeedsList) | **GET** /catalogs/feeds | List feeds
[**FeedsUpdate**](CatalogsApi.md#FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**ItemsBatchGet**](CatalogsApi.md#ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**ItemsBatchPost**](CatalogsApi.md#ItemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**ItemsGet**](CatalogsApi.md#ItemsGet) | **GET** /catalogs/items | Get catalogs items
[**ItemsIssuesList**](CatalogsApi.md#ItemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**ProductsByProductGroupFilterList**](CatalogsApi.md#ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


# **CatalogsList**
> CatalogsList200Response CatalogsList(bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List catalogs
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
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
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
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
> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(product_group_id, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List products for a Product Group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsCreate(catalogs_product_groups_create_request, ad_account_id = var.ad_account_id)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# Create product group
#
# prepare function argument(s)
var_catalogs_product_groups_create_request <- catalogs_product_groups_create_request$new("name_example", CatalogsHotelProductGroupFilters$new(c(CatalogsHotelProductGroupFilterKeys$new(catalogs_product_group_pricing_currency_criteria$new("GREATER_THAN", 123, NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleCountriesCriteria$new(c(Country$new()), "negated_example"))), c(CatalogsHotelProductGroupFilterKeys$new(catalogs_product_group_pricing_currency_criteria$new("GREATER_THAN", 123, NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleCountriesCriteria$new(c(Country$new()), "negated_example")))), "feed_id_example", "HOTEL", "catalog_id_example", "description_example", "is_featured_example") # CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsCreate(var_catalogs_product_groups_create_request, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsCreate(var_catalogs_product_groups_create_request, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_request** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](catalogs_product_groups_create_201_response.md)

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

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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

# **CatalogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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

[**CatalogsProductGroupsCreate201Response**](catalogs_product_groups_create_201_response.md)

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
> CatalogsProductGroupsList200Response CatalogsProductGroupsList(feed_id = var.feed_id, catalog_id = var.catalog_id, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List product groups
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Filter entities for a given feed_id. If not given, all feeds are considered. (Optional)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id. If not given, all catalogs are considered. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsList(feed_id = var_feed_id, catalog_id = var_catalog_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsList(feed_id = var_feed_id, catalog_id = var_catalog_id, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **character**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalog_id** | **character**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
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
> CatalogsProductGroupProductCounts CatalogsProductGroupsProductCountsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# Get product counts for a Product Group
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

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md)

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
> CatalogsProductGroupsCreate201Response CatalogsProductGroupsUpdate(product_group_id, catalogs_product_groups_update_request, ad_account_id = var.ad_account_id)

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# Update product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_catalogs_product_groups_update_request <- catalogs_product_groups_update_request$new("name_example", "description_example", "is_featured_example", CatalogsHotelProductGroupFilters$new(c(CatalogsHotelProductGroupFilterKeys$new(catalogs_product_group_pricing_currency_criteria$new("GREATER_THAN", 123, NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleCountriesCriteria$new(c(Country$new()), "negated_example"))), c(CatalogsHotelProductGroupFilterKeys$new(catalogs_product_group_pricing_currency_criteria$new("GREATER_THAN", 123, NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleCountriesCriteria$new(c(Country$new()), "negated_example")))), "HOTEL") # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
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

[**CatalogsProductGroupsCreate201Response**](catalogs_product_groups_create_201_response.md)

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

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List processing results for a given feed
#
# prepare function argument(s)
var_feed_id <- "feed_id_example" # character | Unique identifier of a feed
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
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
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
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

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```R
library(openapi)

# Create feed
#
# prepare function argument(s)
var_feeds_create_request <- feeds_create_request$new("name_example", CatalogsFormat$new(), CatalogsFeedsCreateRequest_default_locale$new(), "location_example", CatalogsType$new(), Country$new(), NullableCurrency$new(), CatalogsFeedCredentials$new("password_example", "username_example"), CatalogsFeedProcessingSchedule$new("time_example", "Africa/Abidjan"), ProductAvailabilityType$new(), "catalog_id_example") # FeedsCreateRequest | Request object used to created a feed.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
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
| **501** | Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;). |  -  |
| **0** | Unexpected error |  -  |

# **FeedsDelete**
> FeedsDelete(feed_id, ad_account_id = var.ad_account_id)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
> CatalogsFeed FeedsGet(feed_id, ad_account_id = var.ad_account_id)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
> FeedsList200Response FeedsList(bookmark = var.bookmark, page_size = 25, catalog_id = var.catalog_id, ad_account_id = var.ad_account_id)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```R
library(openapi)

# List feeds
#
# prepare function argument(s)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id. If not given, all catalogs are considered. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$FeedsList(bookmark = var_bookmark, page_size = var_page_size, catalog_id = var_catalog_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$FeedsList(bookmark = var_bookmark, page_size = var_page_size, catalog_id = var_catalog_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalog_id** | **character**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](feeds_list_200_response.md)

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
> CatalogsFeed FeedsUpdate(feed_id, feeds_update_request, ad_account_id = var.ad_account_id)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

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
> CatalogsItemsBatch ItemsBatchGet(batch_id, ad_account_id = var.ad_account_id)

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Get catalogs item batch status
#
# prepare function argument(s)
var_batch_id <- "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" # character | Id of a catalogs items batch to fetch
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
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

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```R
library(openapi)

# Operate on item batch
#
# prepare function argument(s)
var_items_batch_post_request <- items_batch_post_request$new(CatalogsType$new(), Country$new(), Language$new(), c(ItemDeleteBatchRecord$new("item_id_example")), BatchOperation$new(), "catalog_id_example") # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
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

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
var_filters <- CatalogsItemsFilters$new(CatalogsType$new(), c("item_ids_example"), c("hotel_ids_example"), "catalog_id_example") # CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (Optional)

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

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List item issues for a given processing result
#
# prepare function argument(s)
var_processing_result_id <- "5224831246441439241" # character | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
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
 **processing_result_id** | **character**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
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

# **ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(catalogs_list_products_by_filter_request, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id)

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```R
library(openapi)

# List filtered products
#
# prepare function argument(s)
var_catalogs_list_products_by_filter_request <- CatalogsListProductsByFilterRequest$new("feed_id_example", CatalogsProductGroupFilters$new(c(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new(123, "inclusion_example", "negated_example"), CatalogsProductGroupPricingCriteria$new(123, "inclusion_example", "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleGenderCriteria$new(c(Gender$new()), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"))), c(CatalogsProductGroupFilterKeys$new(CatalogsProductGroupPricingCriteria$new(123, "inclusion_example", "negated_example"), CatalogsProductGroupPricingCriteria$new(123, "inclusion_example", "negated_example"), CatalogsProductGroupCurrencyCriteria$new(NonNullableCatalogsCurrency$new(), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupMultipleGenderCriteria$new(c(Gender$new()), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"))))) # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductsByProductGroupFilterList(var_catalogs_list_products_by_filter_request, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$ProductsByProductGroupFilterList(var_catalogs_list_products_by_filter_request, bookmark = var_bookmark, page_size = var_page_size, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

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


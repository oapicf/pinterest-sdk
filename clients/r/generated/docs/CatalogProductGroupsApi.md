# CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsProductGroupPinsList**](CatalogProductGroupsApi.md#CatalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**CatalogsProductGroupsCreate**](CatalogProductGroupsApi.md#CatalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**CatalogsProductGroupsCreateMany**](CatalogProductGroupsApi.md#CatalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**CatalogsProductGroupsDelete**](CatalogProductGroupsApi.md#CatalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**CatalogsProductGroupsDeleteMany**](CatalogProductGroupsApi.md#CatalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**CatalogsProductGroupsGet**](CatalogProductGroupsApi.md#CatalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**CatalogsProductGroupsList**](CatalogProductGroupsApi.md#CatalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**CatalogsProductGroupsProductCountsGet**](CatalogProductGroupsApi.md#CatalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**CatalogsProductGroupsUpdate**](CatalogProductGroupsApi.md#CatalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**ProductsByProductGroupFilterList**](CatalogProductGroupsApi.md#ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **CatalogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response CatalogsProductGroupPinsList(product_group_id, ad_account_id = var.ad_account_id, pin_metrics = FALSE, bookmark = var.bookmark, page_size = 25)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# List products by product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$CatalogsProductGroupPinsList(var_product_group_id, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupPinsList200Response**](catalogs_product_group_pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsCreate**
> CatalogsVerticalProductGroup CatalogsProductGroupsCreate(catalogs_product_groups_create_request_schema, ad_account_id = var.ad_account_id)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create product group
#
# prepare function argument(s)
var_catalogs_product_groups_create_request_schema <- CatalogsProductGroupsCreateRequestSchema$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example")))), "name_example", "catalog_id_example", "CREATIVE_ASSETS", "description_example", "is_featured_example", Country$new(), CatalogsLocale$new()) # CatalogsProductGroupsCreateRequestSchema | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsCreate(var_catalogs_product_groups_create_request_schema, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsCreate(var_catalogs_product_groups_create_request_schema, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_request_schema** | [**CatalogsProductGroupsCreateRequestSchema**](CatalogsProductGroupsCreateRequestSchema.md)|  | 
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
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsCreateMany**
> array[character] CatalogsProductGroupsCreateMany(catalogs_product_groups_create_many_request_items, ad_account_id = var.ad_account_id)

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create product groups
#
# prepare function argument(s)
var_catalogs_product_groups_create_many_request_items <- c(CatalogsProductGroupsCreateManyRequestItems$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(...), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c(...)), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(...), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example")))), "name_example", "catalog_id_example", "CREATIVE_ASSETS", "description_example", "is_featured_example", Country$new(), CatalogsLocale$new())) # array[CatalogsProductGroupsCreateManyRequestItems] | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsCreateMany(var_catalogs_product_groups_create_many_request_items, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsCreateMany(var_catalogs_product_groups_create_many_request_items, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_many_request_items** | list( [**CatalogsProductGroupsCreateManyRequestItems**](CatalogsProductGroupsCreateManyRequestItems.md) )|  | 
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
| **201** | The request has succeeded and a new resource has been created as a result. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsDelete**
> CatalogsVerticalProductGroup CatalogsProductGroupsDelete(product_group_id, ad_account_id = var.ad_account_id)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Delete product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsDelete(var_product_group_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsDelete(var_product_group_id, ad_account_id = var_ad_account_id)
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
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsDeleteMany**
> CatalogsProductGroupsDeleteMany(id, ad_account_id = var.ad_account_id)

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Delete product groups
#
# prepare function argument(s)
var_id <- c(123) # array[integer] | Comma-separated list of product group ids
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
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
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsGet**
> CatalogsVerticalProductGroup CatalogsProductGroupsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Get product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsList**
> CatalogsProductGroupsList200Response CatalogsProductGroupsList(id = var.id, feed_id = var.feed_id, catalog_id = var.catalog_id, ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# List product groups
#
# prepare function argument(s)
var_id <- c(123) # array[integer] | Comma-separated list of product group ids (Optional)
var_feed_id <- "feed_id_example" # character | Filter entities for a given feed_id. If not given, all feeds are considered. (Optional)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id. If not given, all catalogs are considered. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsList(id = var_id, feed_id = var_feed_id, catalog_id = var_catalog_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsList(id = var_id, feed_id = var_feed_id, catalog_id = var_catalog_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | list( **integer** )| Comma-separated list of product group ids | [optional] 
 **feed_id** | **character**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalog_id** | **character**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical CatalogsProductGroupsProductCountsGet(product_group_id, ad_account_id = var.ad_account_id)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# Get product counts
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CatalogsProductGroupsUpdate**
> CatalogsVerticalProductGroup CatalogsProductGroupsUpdate(product_group_id, catalogs_product_groups_update_request_schema, ad_account_id = var.ad_account_id)

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Update single product group
#
# prepare function argument(s)
var_product_group_id <- "product_group_id_example" # character | Unique identifier of a product group
var_catalogs_product_groups_update_request_schema <- CatalogsProductGroupsUpdateRequestSchema$new("description_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example")))), "is_featured_example", "name_example", "CREATIVE_ASSETS", Country$new(), CatalogsLocale$new()) # CatalogsProductGroupsUpdateRequestSchema | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogProductGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsProductGroupsUpdate(var_product_group_id, var_catalogs_product_groups_update_request_schema, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsProductGroupsUpdate(var_product_group_id, var_catalogs_product_groups_update_request_schema, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **character**| Unique identifier of a product group | 
 **catalogs_product_groups_update_request_schema** | [**CatalogsProductGroupsUpdateRequestSchema**](CatalogsProductGroupsUpdateRequestSchema.md)|  | 
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response ProductsByProductGroupFilterList(catalogs_list_products_by_filter_request, bookmark = var.bookmark, page_size = 25, ad_account_id = var.ad_account_id, pin_metrics = FALSE)

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```R
library(openapi)

# List products by filter
#
# prepare function argument(s)
var_catalogs_list_products_by_filter_request <- CatalogsListProductsByFilterRequest$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"))), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleStringListCriteria$new(c(c("values_example")), "negated_example"), CatalogsProductGroupMultipleMediaTypesCriteria$new(c(MediaType$new()), "negated_example"), CatalogsProductGroupMultipleStringCriteria$new(c("values_example"), "negated_example"), CatalogsProductGroupFilterOperatorTypeCriteria$new(c("values_example"), FilterOperatorType$new(), "negated_example")))), "catalog_id_example", "CREATIVE_ASSETS", Country$new(), CatalogsLocale$new()) # CatalogsListProductsByFilterRequest | 
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)

api_instance <- CatalogProductGroupsApi$new()
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
 **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)|  | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |


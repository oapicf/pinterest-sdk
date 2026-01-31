# CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CatalogsAvailableFilterValues**](CatalogsApi.md#CatalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**CatalogsCreate**](CatalogsApi.md#CatalogsCreate) | **POST** /catalogs | Create catalog
[**CatalogsList**](CatalogsApi.md#CatalogsList) | **GET** /catalogs | List catalogs


# **CatalogsAvailableFilterValues**
> CatalogsAvailableFilterValues CatalogsAvailableFilterValues(catalog_id, feed_id = var.feed_id, country = var.country, language = var.language, ad_account_id = var.ad_account_id)

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - <code>country</code>, <code>language</code>, and <code>feed_id</code> are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```R
library(openapi)

# List available filter values
#
# prepare function argument(s)
var_catalog_id <- "catalog_id_example" # character | Filter entities for a given catalog_id.
var_feed_id <- "feed_id_example" # character | Filter entities for a given feed_id. If not given, all feeds are considered. (Optional)
var_country <- Country$new() # Country | Country for the Catalogs Items (Optional)
var_language <- CatalogsLocale$new() # CatalogsLocale | Language for the Catalogs Items (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- CatalogsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CatalogsAvailableFilterValues(var_catalog_id, feed_id = var_feed_id, country = var_country, language = var_language, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$CatalogsAvailableFilterValues(var_catalog_id, feed_id = var_feed_id, country = var_country, language = var_language, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **character**| Filter entities for a given catalog_id. | 
 **feed_id** | **character**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **country** | [**Country**](.md)| Country for the Catalogs Items | [optional] 
 **language** | [**CatalogsLocale**](.md)| Language for the Catalogs Items | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

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
| **403** | Forbidden. Account not authorized to access available filter values. |  -  |
| **404** | Data feed not found. |  -  |
| **409** | Can&#39;t access this feature without an existing catalog. |  -  |
| **0** | Unexpected error. |  -  |

# **CatalogsCreate**
> Catalog CatalogsCreate(catalogs_create_request, ad_account_id = var.ad_account_id)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```R
library(openapi)

# Create catalog
#
# prepare function argument(s)
var_catalogs_create_request <- CatalogsCreateRequest$new(CatalogsType$new(), "name_example") # CatalogsCreateRequest | Request object used to created a feed.
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


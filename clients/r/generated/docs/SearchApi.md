# SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SearchPartnerPins**](SearchApi.md#SearchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**SearchUserBoardsGet**](SearchApi.md#SearchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**SearchUserPinsList**](SearchApi.md#SearchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins


# **SearchPartnerPins**
> SearchPartnerPins200Response SearchPartnerPins(term, country_code, bookmark = var.bookmark, locale = var.locale, limit = 10)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```R
library(openapi)

# Search pins by a given search term
#
# prepare function argument(s)
var_term <- "term_example" # character | Search term to look up pins.
var_country_code <- "US" # character | Two letter country code (ISO 3166-1 alpha-2)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_locale <- "locale_example" # character | Search locale. (Optional)
var_limit <- 10 # integer | Max search result size (Optional)

api_instance <- SearchApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SearchPartnerPins(var_term, var_country_code, bookmark = var_bookmark, locale = var_locale, limit = var_limitdata_file = "result.txt")
result <- api_instance$SearchPartnerPins(var_term, var_country_code, bookmark = var_bookmark, locale = var_locale, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **character**| Search term to look up pins. | 
 **country_code** | **character**| Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **locale** | **character**| Search locale. | [optional] 
 **limit** | **integer**| Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](search_partner_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid pins |  -  |
| **0** | Unexpected error |  -  |

# **SearchUserBoardsGet**
> SearchUserBoardsGet200Response SearchUserBoardsGet(ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25, query = var.query)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```R
library(openapi)

# Search user's boards
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_query <- "query_example" # character | Search query. Can contain pin description keywords or comma-separated pin IDs. (Optional)

api_instance <- SearchApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SearchUserBoardsGet(ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, query = var_querydata_file = "result.txt")
result <- api_instance$SearchUserBoardsGet(ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, query = var_query)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **query** | **character**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**SearchUserBoardsGet200Response**](search_user_boards_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList(query, ad_account_id = var.ad_account_id, bookmark = var.bookmark)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```R
library(openapi)

# Search user's Pins
#
# prepare function argument(s)
var_query <- "Plants" # character | Search query. Can contain pin description keywords or comma-separated pin IDs.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- SearchApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SearchUserPinsList(var_query, ad_account_id = var_ad_account_id, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$SearchUserPinsList(var_query, ad_account_id = var_ad_account_id, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **character**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PinsList200Response**](pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | User not found |  -  |
| **0** | Unexpected error |  -  |


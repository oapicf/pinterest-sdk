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

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.

### Example
```R
library(openapi)

# Search pins by a given search term
#
# prepare function argument(s)
var_term <- "term_example" # character | Search term to look up pins.
var_country_code <- "country_code_example" # character | Two letter country code (ISO 3166-1 alpha-2)
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **SearchUserBoardsGet**
> BoardsList200Response SearchUserBoardsGet(ad_account_id = var.ad_account_id, query = var.query, bookmark = var.bookmark, page_size = 25)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

### Example
```R
library(openapi)

# Search user's boards
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_query <- "query_example" # character | Search query. Can contain pin description keywords or comma-separated pin IDs. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- SearchApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SearchUserBoardsGet(ad_account_id = var_ad_account_id, query = var_query, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$SearchUserBoardsGet(ad_account_id = var_ad_account_id, query = var_query, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **query** | **character**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](boards_list_200_response.md)

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

# **SearchUserPinsList**
> PinsList200Response SearchUserPinsList(query, ad_account_id = var.ad_account_id, bookmark = var.bookmark)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

### Example
```R
library(openapi)

# Search user's Pins
#
# prepare function argument(s)
var_query <- "query_example" # character | Search query. Can contain pin description keywords or comma-separated pin IDs.
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |


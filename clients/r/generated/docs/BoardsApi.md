# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardSectionsCreate**](BoardsApi.md#BoardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**BoardSectionsDelete**](BoardsApi.md#BoardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardSectionsList**](BoardsApi.md#BoardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**BoardSectionsListPins**](BoardsApi.md#BoardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardSectionsUpdate**](BoardsApi.md#BoardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsCreate**](BoardsApi.md#BoardsCreate) | **POST** /boards | Create board
[**BoardsDelete**](BoardsApi.md#BoardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**BoardsGet**](BoardsApi.md#BoardsGet) | **GET** /boards/{board_id} | Get board
[**BoardsList**](BoardsApi.md#BoardsList) | **GET** /boards | List boards
[**BoardsListPins**](BoardsApi.md#BoardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**BoardsUpdate**](BoardsApi.md#BoardsUpdate) | **PATCH** /boards/{board_id} | Update board


# **BoardSectionsCreate**
> BoardSection BoardSectionsCreate(board_id, board_section_create, ad_account_id = var.ad_account_id)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Create board section
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_board_section_create <- BoardSectionCreate$new("name_example", "id_example") # BoardSectionCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsCreate(var_board_id, var_board_section_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardSectionsCreate(var_board_id, var_board_section_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **board_section_create** | [**BoardSectionCreate**](BoardSectionCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md)

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

# **BoardSectionsDelete**
> BoardSection BoardSectionsDelete(board_id, section_id, ad_account_id = var.ad_account_id)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Delete board section
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_section_id <- "section_id_example" # character | Unique identifier of a board section.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsDelete(var_board_id, var_section_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardSectionsDelete(var_board_id, var_section_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **section_id** | **character**| Unique identifier of a board section. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md)

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

# **BoardSectionsList**
> BoardSectionsList200Response BoardSectionsList(board_id, ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# List board sections
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsList(var_board_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BoardSectionsList(var_board_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](board_sections_list_200_response.md)

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

# **BoardSectionsListPins**
> BoardsListPins200Response BoardSectionsListPins(board_id, section_id, ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# List Pins on board section
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_section_id <- "section_id_example" # character | Unique identifier of a board section.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsListPins(var_board_id, var_section_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BoardSectionsListPins(var_board_id, var_section_id, ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **section_id** | **character**| Unique identifier of a board section. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](boards_list_pins_200_response.md)

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

# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate(board_id, section_id, board_section_update_with_required_body, ad_account_id = var.ad_account_id)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Update board section
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_section_id <- "section_id_example" # character | Unique identifier of a board section.
var_board_section_update_with_required_body <- BoardSectionUpdateWithRequiredBody$new("name_example", "id_example") # BoardSectionUpdateWithRequiredBody | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsUpdate(var_board_id, var_section_id, var_board_section_update_with_required_body, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardSectionsUpdate(var_board_id, var_section_id, var_board_section_update_with_required_body, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **section_id** | **character**| Unique identifier of a board section. | 
 **board_section_update_with_required_body** | [**BoardSectionUpdateWithRequiredBody**](BoardSectionUpdateWithRequiredBody.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md)

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

# **BoardsCreate**
> Board BoardsCreate(board_create, ad_account_id = var.ad_account_id)

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Create board
#
# prepare function argument(s)
var_board_create <- BoardCreate$new("name_example", "description_example", "is_ads_only_example", BoardPrivacy$new()) # BoardCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsCreate(var_board_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsCreate(var_board_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_create** | [**BoardCreate**](BoardCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **BoardsDelete**
> Board BoardsDelete(board_id, ad_account_id = var.ad_account_id)

Delete board

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Delete board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsDelete(var_board_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsDelete(var_board_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

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

# **BoardsGet**
> Board BoardsGet(board_id, ad_account_id = var.ad_account_id)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Get board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsGet(var_board_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsGet(var_board_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

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

# **BoardsList**
> BoardsList200Response BoardsList(ad_account_id = var.ad_account_id, privacy = var.privacy, bookmark = var.bookmark, page_size = 25)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```R
library(openapi)

# List boards
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_privacy <- BoardPrivacyFilter$new() # BoardPrivacyFilter | The privacy level of the board (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsList(ad_account_id = var_ad_account_id, privacy = var_privacy, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BoardsList(ad_account_id = var_ad_account_id, privacy = var_privacy, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **privacy** | [**BoardPrivacyFilter**](.md)| The privacy level of the board | [optional] 
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

# **BoardsListPins**
> BoardsListPins200Response BoardsListPins(board_id, creative_types = var.creative_types, ad_account_id = var.ad_account_id, pin_metrics = FALSE, bookmark = var.bookmark, page_size = 25)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# List Pins on board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_creative_types <- c(CreativeType$new()) # array[CreativeType] | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsListPins(var_board_id, creative_types = var_creative_types, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BoardsListPins(var_board_id, creative_types = var_creative_types, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **creative_types** | list( [**CreativeType**](CreativeType.md) )| Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](boards_list_pins_200_response.md)

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

# **BoardsUpdate**
> BoardWithUpdatePrivacy BoardsUpdate(board_id, board_with_update_privacy_update, ad_account_id = var.ad_account_id)

Update board

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Update board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | 
var_board_with_update_privacy_update <- BoardWithUpdatePrivacyUpdate$new("description_example", "name_example", BoardUpdatePrivacy$new()) # BoardWithUpdatePrivacyUpdate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsUpdate(var_board_id, var_board_with_update_privacy_update, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsUpdate(var_board_id, var_board_with_update_privacy_update, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**|  | 
 **board_with_update_privacy_update** | [**BoardWithUpdatePrivacyUpdate**](BoardWithUpdatePrivacyUpdate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardWithUpdatePrivacy**](BoardWithUpdatePrivacy.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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


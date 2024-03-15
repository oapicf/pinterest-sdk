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
> BoardSection BoardSectionsCreate(board_id, board_section, ad_account_id = var.ad_account_id)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Create board section
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_board_section <- BoardSection$new("name_example", "id_example") # BoardSection | Create a board section.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsCreate(var_board_id, var_board_section, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardSectionsCreate(var_board_id, var_board_section, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Create a board section. | 
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
| **201** | response |  -  |
| **400** | Invalid board section parameters. |  -  |
| **403** | Not authorized to create board sections. |  -  |
| **409** | Could not get exclusive access to the board to create a new section. |  -  |
| **500** | Could not create a new board section. |  -  |
| **0** | Unexpected error |  -  |

# **BoardSectionsDelete**
> BoardSectionsDelete(board_id, section_id, ad_account_id = var.ad_account_id)

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
api_instance$BoardSectionsDelete(var_board_id, var_section_id, ad_account_id = var_ad_account_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **section_id** | **character**| Unique identifier of a board section. | 
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
| **204** | Board section deleted successfully |  -  |
| **403** | Not authorized to delete board section. |  -  |
| **404** | Board section not found. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

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
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
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
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](board_sections_list_200_response.md)

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
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
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
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **403** | Not authorized to access Pins on board section. |  -  |
| **404** | Board or section not found. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate(board_id, section_id, board_section, ad_account_id = var.ad_account_id)

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
var_board_section <- BoardSection$new("name_example", "id_example") # BoardSection | Update a board section.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardSectionsUpdate(var_board_id, var_section_id, var_board_section, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardSectionsUpdate(var_board_id, var_section_id, var_board_section, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **section_id** | **character**| Unique identifier of a board section. | 
 **board_section** | [**BoardSection**](BoardSection.md)| Update a board section. | 
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
| **200** | response |  -  |
| **400** | Invalid board section parameters. |  -  |
| **403** | Not authorized to update board section. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsCreate**
> Board BoardsCreate(board, ad_account_id = var.ad_account_id)

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Create board
#
# prepare function argument(s)
var_board <- Board$new("name_example", "id_example", "created_at_example", "board_pins_modified_at_example", "description_example", 123, 123, 123, Board_media$new("image_cover_url_example", c("pin_thumbnail_urls_example")), Board_owner$new("username_example"), "PUBLIC") # Board | Create a board using a single board json object.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsCreate(var_board, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsCreate(var_board, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | response |  -  |
| **400** | The board name is invalid or duplicated. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsDelete**
> BoardsDelete(board_id, ad_account_id = var.ad_account_id)

Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Delete board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$BoardsDelete(var_board_id, ad_account_id = var_ad_account_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
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
| **204** | Board deleted successfully |  -  |
| **403** | Not authorized to delete the board. |  -  |
| **404** | Board not found. |  -  |
| **409** | Could not get exclusive access to delete the board. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsGet**
> Board BoardsGet(board_id, ad_account_id = var.ad_account_id)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Get board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsGet(var_board_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsGet(var_board_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
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
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsList**
> BoardsList200Response BoardsList(ad_account_id = var.ad_account_id, bookmark = var.bookmark, page_size = 25, privacy = var.privacy)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```R
library(openapi)

# List boards
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_privacy <- "privacy_example" # character | Privacy setting for a board. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsList(ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, privacy = var_privacydata_file = "result.txt")
result <- api_instance$BoardsList(ad_account_id = var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, privacy = var_privacy)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | Enum [ALL, PROTECTED, PUBLIC, SECRET, PUBLIC_AND_SECRET] | Privacy setting for a board. | [optional] 

### Return type

[**BoardsList200Response**](boards_list_200_response.md)

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

# **BoardsListPins**
> BoardsListPins200Response BoardsListPins(board_id, bookmark = var.bookmark, page_size = 25, creative_types = var.creative_types, ad_account_id = var.ad_account_id, pin_metrics = FALSE)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# List Pins on board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_creative_types <- c("REGULAR") # array[character] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsListPins(var_board_id, bookmark = var_bookmark, page_size = var_page_size, creative_types = var_creative_types, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metricsdata_file = "result.txt")
result <- api_instance$BoardsListPins(var_board_id, bookmark = var_bookmark, page_size = var_page_size, creative_types = var_creative_types, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **creative_types** | Enum [REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA] | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]

### Return type

[**BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsUpdate**
> Board BoardsUpdate(board_id, board_update, ad_account_id = var.ad_account_id)

Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

# Update board
#
# prepare function argument(s)
var_board_id <- "board_id_example" # character | Unique identifier of a board.
var_board_update <- BoardUpdate$new("name_example", "description_example", "PUBLIC") # BoardUpdate | Update a board.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BoardsUpdate(var_board_id, var_board_update, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$BoardsUpdate(var_board_id, var_board_update, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **character**| Unique identifier of a board. | 
 **board_update** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **400** | Invalid board parameters. |  -  |
| **403** | Not authorized to update the board. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. |  -  |
| **0** | Unexpected error |  -  |


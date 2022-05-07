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
> BoardSection BoardSectionsCreate(board.id, board.section)

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.board.section <- BoardSection$new("id_example", "name_example") # BoardSection | Create a board section.

#Create board section
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardSectionsCreate(var.board.id, var.board.section)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
 **board.section** | [**BoardSection**](BoardSection.md)| Create a board section. | 

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
> BoardSectionsDelete(board.id, section.id)

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.section.id <- 'section.id_example' # character | Unique identifier of a board section.

#Delete board section
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
api.instance$BoardSectionsDelete(var.board.id, var.section.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
 **section.id** | **character**| Unique identifier of a board section. | 

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
> Paginated BoardSectionsList(board.id, bookmark=var.bookmark, page.size=25)

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#List board sections
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardSectionsList(var.board.id, bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **BoardSectionsListPins**
> Paginated BoardSectionsListPins(board.id, section.id, bookmark=var.bookmark, page.size=25)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.section.id <- 'section.id_example' # character | Unique identifier of a board section.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#List Pins on board section
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardSectionsListPins(var.board.id, var.section.id, bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
 **section.id** | **character**| Unique identifier of a board section. | 
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
| **200** | response |  -  |
| **403** | Not authorized to access Pins on board section. |  -  |
| **404** | Board or section not found. |  -  |
| **409** | Board section conflict. |  -  |
| **0** | Unexpected error |  -  |

# **BoardSectionsUpdate**
> BoardSection BoardSectionsUpdate(board.id, section.id, board.section)

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.section.id <- 'section.id_example' # character | Unique identifier of a board section.
var.board.section <- BoardSection$new("id_example", "name_example") # BoardSection | Update a board section.

#Update board section
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardSectionsUpdate(var.board.id, var.section.id, var.board.section)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
 **section.id** | **character**| Unique identifier of a board section. | 
 **board.section** | [**BoardSection**](BoardSection.md)| Update a board section. | 

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
> Board BoardsCreate(board)

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board <- Board$new("name_example", "id_example", "description_example", TODO, "PUBLIC") # Board | Create a board using a single board json object.

#Create board
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardsCreate(var.board)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 

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
> BoardsDelete(board.id)

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.

#Delete board
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
api.instance$BoardsDelete(var.board.id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 

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
> Board BoardsGet(board.id)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.

#Get board
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardsGet(var.board.id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 

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
> Paginated BoardsList(bookmark=var.bookmark, page.size=25, privacy=var.privacy)

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```R
library(openapi)

var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
var.privacy <- 'privacy_example' # character | Privacy setting for a board.

#List boards
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardsList(bookmark=var.bookmark, page.size=var.page.size, privacy=var.privacy)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page.size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | Enum [PUBLIC, PROTECTED, SECRET] | Privacy setting for a board. | [optional] 

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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **BoardsListPins**
> Paginated BoardsListPins(board.id, bookmark=var.bookmark, page.size=25)

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.bookmark <- 'bookmark_example' # character | Cursor used to fetch the next page of items
var.page.size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

#List Pins on board
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardsListPins(var.board.id, bookmark=var.bookmark, page.size=var.page.size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
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
| **200** | response |  -  |
| **404** | Board not found. |  -  |
| **0** | Unexpected error |  -  |

# **BoardsUpdate**
> Board BoardsUpdate(board.id, board.update)

Update board

Update a board owned by the \"operating user_account\".

### Example
```R
library(openapi)

var.board.id <- 'board.id_example' # character | Unique identifier of a board.
var.board.update <- BoardUpdate$new("name_example", "description_example", "PUBLIC") # BoardUpdate | Update a board.

#Update board
api.instance <- BoardsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api.instance$apiClient$accessToken <- 'TODO_YOUR_ACCESS_TOKEN';
result <- api.instance$BoardsUpdate(var.board.id, var.board.update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board.id** | **character**| Unique identifier of a board. | 
 **board.update** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 

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


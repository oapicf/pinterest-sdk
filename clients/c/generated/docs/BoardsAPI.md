# BoardsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardsAPI_boardSectionsCreate**](BoardsAPI.md#BoardsAPI_boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**BoardsAPI_boardSectionsDelete**](BoardsAPI.md#BoardsAPI_boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**BoardsAPI_boardSectionsList**](BoardsAPI.md#BoardsAPI_boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**BoardsAPI_boardSectionsListPins**](BoardsAPI.md#BoardsAPI_boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**BoardsAPI_boardSectionsUpdate**](BoardsAPI.md#BoardsAPI_boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**BoardsAPI_boardsCreate**](BoardsAPI.md#BoardsAPI_boardsCreate) | **POST** /boards | Create board
[**BoardsAPI_boardsDelete**](BoardsAPI.md#BoardsAPI_boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**BoardsAPI_boardsGet**](BoardsAPI.md#BoardsAPI_boardsGet) | **GET** /boards/{board_id} | Get board
[**BoardsAPI_boardsList**](BoardsAPI.md#BoardsAPI_boardsList) | **GET** /boards | List boards
[**BoardsAPI_boardsListPins**](BoardsAPI.md#BoardsAPI_boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**BoardsAPI_boardsUpdate**](BoardsAPI.md#BoardsAPI_boardsUpdate) | **PATCH** /boards/{board_id} | Update board


# **BoardsAPI_boardSectionsCreate**
```c
// Create board section
//
// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t* BoardsAPI_boardSectionsCreate(apiClient_t *apiClient, char *board_id, board_section_t *board_section, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**board_section** | **[board_section_t](board_section.md) \*** | Create a board section. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[board_section_t](board_section.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardSectionsDelete**
```c
// Delete board section
//
// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void BoardsAPI_boardSectionsDelete(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**section_id** | **char \*** | Unique identifier of a board section. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardSectionsList**
```c
// List board sections
//
// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_sections_list_200_response_t* BoardsAPI_boardSectionsList(apiClient_t *apiClient, char *board_id, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[board_sections_list_200_response_t](board_sections_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardSectionsListPins**
```c
// List Pins on board section
//
// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t* BoardsAPI_boardSectionsListPins(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**section_id** | **char \*** | Unique identifier of a board section. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[boards_list_pins_200_response_t](boards_list_pins_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardSectionsUpdate**
```c
// Update board section
//
// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t* BoardsAPI_boardSectionsUpdate(apiClient_t *apiClient, char *board_id, char *section_id, board_section_t *board_section, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**section_id** | **char \*** | Unique identifier of a board section. | 
**board_section** | **[board_section_t](board_section.md) \*** | Update a board section. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[board_section_t](board_section.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsCreate**
```c
// Create board
//
// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t* BoardsAPI_boardsCreate(apiClient_t *apiClient, board_t *board, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board** | **[board_t](board.md) \*** | Create a board using a single board json object. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[board_t](board.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsDelete**
```c
// Delete board
//
// Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void BoardsAPI_boardsDelete(apiClient_t *apiClient, char *board_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsGet**
```c
// Get board
//
// Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t* BoardsAPI_boardsGet(apiClient_t *apiClient, char *board_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[board_t](board.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsList**
```c
// List boards
//
// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
//
boards_list_200_response_t* BoardsAPI_boardsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_rest_api_boardsList_privacy_e privacy);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**privacy** | **pinterest_rest_api_boardsList_privacy_e** | Privacy setting for a board. | [optional] 

### Return type

[boards_list_200_response_t](boards_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsListPins**
```c
// List Pins on board
//
// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t* BoardsAPI_boardsListPins(apiClient_t *apiClient, char *board_id, char *bookmark, int *page_size, list_t *creative_types, char *ad_account_id, int *pin_metrics);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**creative_types** | **[list_t](char.md) \*** | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 
**pin_metrics** | **int \*** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[boards_list_pins_200_response_t](boards_list_pins_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BoardsAPI_boardsUpdate**
```c
// Update board
//
// Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t* BoardsAPI_boardsUpdate(apiClient_t *apiClient, char *board_id, board_update_t *board_update, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**board_id** | **char \*** | Unique identifier of a board. | 
**board_update** | **[board_update_t](board_update.md) \*** | Update a board. | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | [optional] 

### Return type

[board_t](board.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


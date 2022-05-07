# \BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**board_sections_create**](BoardsApi.md#board_sections_create) | **POST** /boards/{board_id}/sections | Create board section
[**board_sections_delete**](BoardsApi.md#board_sections_delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**board_sections_list**](BoardsApi.md#board_sections_list) | **GET** /boards/{board_id}/sections | List board sections
[**board_sections_list_pins**](BoardsApi.md#board_sections_list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**board_sections_update**](BoardsApi.md#board_sections_update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boards_create**](BoardsApi.md#boards_create) | **POST** /boards | Create board
[**boards_delete**](BoardsApi.md#boards_delete) | **DELETE** /boards/{board_id} | Delete board
[**boards_get**](BoardsApi.md#boards_get) | **GET** /boards/{board_id} | Get board
[**boards_list**](BoardsApi.md#boards_list) | **GET** /boards | List boards
[**boards_list_pins**](BoardsApi.md#boards_list_pins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boards_update**](BoardsApi.md#boards_update) | **PATCH** /boards/{board_id} | Update board



## board_sections_create

> crate::models::BoardSection board_sections_create(board_id, board_section)
Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**board_section** | [**BoardSection**](BoardSection.md) | Create a board section. | [required] |

### Return type

[**crate::models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_delete

> board_sections_delete(board_id, section_id)
Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_list

> crate::models::Paginated board_sections_list(board_id, bookmark, page_size)
List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_list_pins

> crate::models::Paginated board_sections_list_pins(board_id, section_id, bookmark, page_size)
List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_update

> crate::models::BoardSection board_sections_update(board_id, section_id, board_section)
Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |
**board_section** | [**BoardSection**](BoardSection.md) | Update a board section. | [required] |

### Return type

[**crate::models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_create

> crate::models::Board boards_create(board)
Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board** | [**Board**](Board.md) | Create a board using a single board json object. | [required] |

### Return type

[**crate::models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_delete

> boards_delete(board_id)
Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_get

> crate::models::Board boards_get(board_id)
Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |

### Return type

[**crate::models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_list

> crate::models::Paginated boards_list(bookmark, page_size, privacy)
List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]
**privacy** | Option<**String**> | Privacy setting for a board. |  |

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_list_pins

> crate::models::Paginated boards_list_pins(board_id, bookmark, page_size)
List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**crate::models::Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_update

> crate::models::Board boards_update(board_id, board_update)
Update board

Update a board owned by the \"operating user_account\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**board_update** | [**BoardUpdate**](BoardUpdate.md) | Update a board. | [required] |

### Return type

[**crate::models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


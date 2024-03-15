# \BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**board_sections_slash_create**](BoardsApi.md#board_sections_slash_create) | **POST** /boards/{board_id}/sections | Create board section
[**board_sections_slash_delete**](BoardsApi.md#board_sections_slash_delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**board_sections_slash_list**](BoardsApi.md#board_sections_slash_list) | **GET** /boards/{board_id}/sections | List board sections
[**board_sections_slash_list_pins**](BoardsApi.md#board_sections_slash_list_pins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**board_sections_slash_update**](BoardsApi.md#board_sections_slash_update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boards_slash_create**](BoardsApi.md#boards_slash_create) | **POST** /boards | Create board
[**boards_slash_delete**](BoardsApi.md#boards_slash_delete) | **DELETE** /boards/{board_id} | Delete board
[**boards_slash_get**](BoardsApi.md#boards_slash_get) | **GET** /boards/{board_id} | Get board
[**boards_slash_list**](BoardsApi.md#boards_slash_list) | **GET** /boards | List boards
[**boards_slash_list_pins**](BoardsApi.md#boards_slash_list_pins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boards_slash_update**](BoardsApi.md#boards_slash_update) | **PATCH** /boards/{board_id} | Update board



## board_sections_slash_create

> models::BoardSection board_sections_slash_create(board_id, board_section, ad_account_id)
Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**board_section** | [**BoardSection**](BoardSection.md) | Create a board section. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_slash_delete

> board_sections_slash_delete(board_id, section_id, ad_account_id)
Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_slash_list

> models::BoardSectionsList200Response board_sections_slash_list(board_id, ad_account_id, bookmark, page_size)
List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::BoardSectionsList200Response**](board_sections_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_slash_list_pins

> models::BoardsListPins200Response board_sections_slash_list_pins(board_id, section_id, ad_account_id, bookmark, page_size)
List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## board_sections_slash_update

> models::BoardSection board_sections_slash_update(board_id, section_id, board_section, ad_account_id)
Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**section_id** | **String** | Unique identifier of a board section. | [required] |
**board_section** | [**BoardSection**](BoardSection.md) | Update a board section. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_create

> models::Board boards_slash_create(board, ad_account_id)
Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board** | [**Board**](Board.md) | Create a board using a single board json object. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_delete

> boards_slash_delete(board_id, ad_account_id)
Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_get

> models::Board boards_slash_get(board_id, ad_account_id)
Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_list

> models::BoardsList200Response boards_slash_list(ad_account_id, bookmark, page_size, privacy)
List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**privacy** | Option<**String**> | Privacy setting for a board. |  |

### Return type

[**models::BoardsList200Response**](boards_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_list_pins

> models::BoardsListPins200Response boards_slash_list_pins(board_id, bookmark, page_size, creative_types, ad_account_id, pin_metrics)
List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**creative_types** | Option<[**Vec<String>**](String.md)> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |
**pin_metrics** | Option<**bool**> | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. |  |[default to false]

### Return type

[**models::BoardsListPins200Response**](boards_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boards_slash_update

> models::Board boards_slash_update(board_id, board_update, ad_account_id)
Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**board_id** | **String** | Unique identifier of a board. | [required] |
**board_update** | [**BoardUpdate**](BoardUpdate.md) | Update a board. | [required] |
**ad_account_id** | Option<**String**> | Unique identifier of an ad account. |  |

### Return type

[**models::Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


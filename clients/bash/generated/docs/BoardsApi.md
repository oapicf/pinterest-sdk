# BoardsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](BoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](BoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](BoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](BoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](BoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](BoardsApi.md#boardsCreate) | **POST** /boards | Create board
[**boardsDelete**](BoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](BoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board
[**boardsList**](BoardsApi.md#boardsList) | **GET** /boards | List boards
[**boardsListPins**](BoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](BoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board



## boardSectionsCreate

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardSectionsCreate board_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **boardSection** | [**BoardSection**](BoardSection.md) | Create a board section. |

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardSectionsDelete

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardSectionsDelete board_id=value section_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **sectionId** | **string** | Unique identifier of a board section. | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardSectionsList

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardSectionsList board_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardSectionsListPins

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardSectionsListPins board_id=value section_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **sectionId** | **string** | Unique identifier of a board section. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardSectionsUpdate

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardSectionsUpdate board_id=value section_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **sectionId** | **string** | Unique identifier of a board section. | [default to null]
 **boardSection** | [**BoardSection**](BoardSection.md) | Update a board section. |

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsCreate

Create board

Create a board owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardsCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md) | Create a board using a single board json object. |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsDelete

Delete board

Delete a board owned by the \"operation user_account\".
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardsDelete board_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsGet

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardsGet board_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsList

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator

Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return.
- If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example

```bash
 boardsList  bookmark=value  page_size=value  privacy=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]
 **privacy** | **string** | Privacy setting for a board. | [optional] [default to null]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsListPins

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account.
- By default, the \"operation user_account\" is the token user_account.

### Example

```bash
 boardsListPins board_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## boardsUpdate

Update board

Update a board owned by the \"operating user_account\".

### Example

```bash
 boardsUpdate board_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **string** | Unique identifier of a board. | [default to null]
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md) | Update a board. |

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


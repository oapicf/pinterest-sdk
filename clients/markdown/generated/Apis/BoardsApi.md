# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**boardSections/create**](BoardsApi.md#boardSections/create) | **POST** /boards/{board_id}/sections | Create board section |
| [**boardSections/delete**](BoardsApi.md#boardSections/delete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section |
| [**boardSections/list**](BoardsApi.md#boardSections/list) | **GET** /boards/{board_id}/sections | List board sections |
| [**boardSections/listPins**](BoardsApi.md#boardSections/listPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section |
| [**boardSections/update**](BoardsApi.md#boardSections/update) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section |
| [**boards/create**](BoardsApi.md#boards/create) | **POST** /boards | Create board |
| [**boards/delete**](BoardsApi.md#boards/delete) | **DELETE** /boards/{board_id} | Delete board |
| [**boards/get**](BoardsApi.md#boards/get) | **GET** /boards/{board_id} | Get board |
| [**boards/list**](BoardsApi.md#boards/list) | **GET** /boards | List boards |
| [**boards/listPins**](BoardsApi.md#boards/listPins) | **GET** /boards/{board_id}/pins | List Pins on board |
| [**boards/update**](BoardsApi.md#boards/update) | **PATCH** /boards/{board_id} | Update board |


<a name="boardSections/create"></a>
# **boardSections/create**
> BoardSection boardSections/create(board\_id, BoardSection)

Create board section

    Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **BoardSection** | [**BoardSection**](../Models/BoardSection.md)| Create a board section. | |

### Return type

[**BoardSection**](../Models/BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="boardSections/delete"></a>
# **boardSections/delete**
> boardSections/delete(board\_id, section\_id)

Delete board section

    Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **section\_id** | **String**| Unique identifier of a board section. | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boardSections/list"></a>
# **boardSections/list**
> board_sections_list_200_response boardSections/list(board\_id, bookmark, page\_size)

List board sections

    Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**board_sections_list_200_response**](../Models/board_sections_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boardSections/listPins"></a>
# **boardSections/listPins**
> board_sections_list_pins_200_response boardSections/listPins(board\_id, section\_id, bookmark, page\_size)

List Pins on board section

    Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **section\_id** | **String**| Unique identifier of a board section. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**board_sections_list_pins_200_response**](../Models/board_sections_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boardSections/update"></a>
# **boardSections/update**
> BoardSection boardSections/update(board\_id, section\_id, BoardSection)

Update board section

    Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **section\_id** | **String**| Unique identifier of a board section. | [default to null] |
| **BoardSection** | [**BoardSection**](../Models/BoardSection.md)| Update a board section. | |

### Return type

[**BoardSection**](../Models/BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="boards/create"></a>
# **boards/create**
> Board boards/create(Board)

Create board

    Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **Board** | [**Board**](../Models/Board.md)| Create a board using a single board json object. | |

### Return type

[**Board**](../Models/Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="boards/delete"></a>
# **boards/delete**
> boards/delete(board\_id)

Delete board

    Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boards/get"></a>
# **boards/get**
> Board boards/get(board\_id)

Get board

    Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |

### Return type

[**Board**](../Models/Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boards/list"></a>
# **boards/list**
> boards_list_200_response boards/list(bookmark, page\_size, privacy)

List boards

    Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **privacy** | **String**| Privacy setting for a board. | [optional] [default to null] [enum: PUBLIC, PROTECTED, SECRET] |

### Return type

[**boards_list_200_response**](../Models/boards_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boards/listPins"></a>
# **boards/listPins**
> board_sections_list_pins_200_response boards/listPins(board\_id, bookmark, page\_size)

List Pins on board

    Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**board_sections_list_pins_200_response**](../Models/board_sections_list_pins_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="boards/update"></a>
# **boards/update**
> Board boards/update(board\_id, BoardUpdate)

Update board

    Update a board owned by the \&quot;operating user_account\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **board\_id** | **String**| Unique identifier of a board. | [default to null] |
| **BoardUpdate** | [**BoardUpdate**](../Models/BoardUpdate.md)| Update a board. | |

### Return type

[**Board**](../Models/Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


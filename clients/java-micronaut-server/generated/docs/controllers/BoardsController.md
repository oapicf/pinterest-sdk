# BoardsController

All URIs are relative to `"/v5"`

The controller class is defined in **[BoardsController.java](../../src/main/java/org/openapitools/controller/BoardsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](#boardsCreate) | **POST** /boards | Create board
[**boardsDelete**](#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](#boardsGet) | **GET** /boards/{board_id} | Get board
[**boardsList**](#boardsList) | **GET** /boards | List boards
[**boardsListPins**](#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](#boardsUpdate) | **PATCH** /boards/{board_id} | Update board

<a name="boardSectionsCreate"></a>
# **boardSectionsCreate**
```java
Mono<BoardSection> BoardsController.boardSectionsCreate(boardIdboardSection)
```

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**boardSection** | [**BoardSection**](../../docs/models/BoardSection.md) | Create a board section. |

### Return type
[**BoardSection**](../../docs/models/BoardSection.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a name="boardSectionsDelete"></a>
# **boardSectionsDelete**
```java
Mono<Object> BoardsController.boardSectionsDelete(boardIdsectionId)
```

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardSectionsList"></a>
# **boardSectionsList**
```java
Mono<Paginated> BoardsController.boardSectionsList(boardIdbookmarkpageSize)
```

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**Paginated**](../../docs/models/Paginated.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardSectionsListPins"></a>
# **boardSectionsListPins**
```java
Mono<Paginated> BoardsController.boardSectionsListPins(boardIdsectionIdbookmarkpageSize)
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**Paginated**](../../docs/models/Paginated.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
```java
Mono<BoardSection> BoardsController.boardSectionsUpdate(boardIdsectionIdboardSection)
```

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**boardSection** | [**BoardSection**](../../docs/models/BoardSection.md) | Update a board section. |

### Return type
[**BoardSection**](../../docs/models/BoardSection.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a name="boardsCreate"></a>
# **boardsCreate**
```java
Mono<Board> BoardsController.boardsCreate(board)
```

Create board

Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**board** | [**Board**](../../docs/models/Board.md) | Create a board using a single board json object. |

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a name="boardsDelete"></a>
# **boardsDelete**
```java
Mono<Object> BoardsController.boardsDelete(boardId)
```

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardsGet"></a>
# **boardsGet**
```java
Mono<Board> BoardsController.boardsGet(boardId)
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardsList"></a>
# **boardsList**
```java
Mono<Paginated> BoardsController.boardsList(bookmarkpageSizeprivacy)
```

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**privacy** | `String` | Privacy setting for a board. | [optional parameter] [enum: `PUBLIC`, `PROTECTED`, `SECRET`]

### Return type
[**Paginated**](../../docs/models/Paginated.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardsListPins"></a>
# **boardsListPins**
```java
Mono<Paginated> BoardsController.boardsListPins(boardIdbookmarkpageSize)
```

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**Paginated**](../../docs/models/Paginated.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="boardsUpdate"></a>
# **boardsUpdate**
```java
Mono<Board> BoardsController.boardsUpdate(boardIdboardUpdate)
```

Update board

Update a board owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**boardUpdate** | [**BoardUpdate**](../../docs/models/BoardUpdate.md) | Update a board. |

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


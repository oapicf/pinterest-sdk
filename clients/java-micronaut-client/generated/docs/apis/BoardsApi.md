# BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

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


## Creating BoardsApi

To initiate an instance of `BoardsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.BoardsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(BoardsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    BoardsApi boardsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="boardSectionsCreate"></a>
# **boardSectionsCreate**
```java
Mono<BoardSection> BoardsApi.boardSectionsCreate(boardIdboardSection)
```

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. |


### Return type
[**BoardSection**](BoardSection.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="boardSectionsDelete"></a>
# **boardSectionsDelete**
```java
Mono<Void> BoardsApi.boardSectionsDelete(boardIdsectionId)
```

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **sectionId** | `String`| Unique identifier of a board section. |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardSectionsList"></a>
# **boardSectionsList**
```java
Mono<Paginated> BoardsApi.boardSectionsList(boardIdbookmarkpageSize)
```

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardSectionsListPins"></a>
# **boardSectionsListPins**
```java
Mono<Paginated> BoardsApi.boardSectionsListPins(boardIdsectionIdbookmarkpageSize)
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **sectionId** | `String`| Unique identifier of a board section. |
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
```java
Mono<BoardSection> BoardsApi.boardSectionsUpdate(boardIdsectionIdboardSection)
```

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **sectionId** | `String`| Unique identifier of a board section. |
 **boardSection** | [**BoardSection**](BoardSection.md)| Update a board section. |


### Return type
[**BoardSection**](BoardSection.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="boardsCreate"></a>
# **boardsCreate**
```java
Mono<Board> BoardsApi.boardsCreate(board)
```

Create board

Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. |


### Return type
[**Board**](Board.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="boardsDelete"></a>
# **boardsDelete**
```java
Mono<Void> BoardsApi.boardsDelete(boardId)
```

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardsGet"></a>
# **boardsGet**
```java
Mono<Board> BoardsApi.boardsGet(boardId)
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |


### Return type
[**Board**](Board.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardsList"></a>
# **boardsList**
```java
Mono<Paginated> BoardsApi.boardsList(bookmarkpageSizeprivacy)
```

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
 **privacy** | `String`| Privacy setting for a board. | [optional parameter] [enum: `PUBLIC`, `PROTECTED`, `SECRET`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardsListPins"></a>
# **boardsListPins**
```java
Mono<Paginated> BoardsApi.boardsListPins(boardIdbookmarkpageSize)
```

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="boardsUpdate"></a>
# **boardsUpdate**
```java
Mono<Board> BoardsApi.boardsUpdate(boardIdboardUpdate)
```

Update board

Update a board owned by the \&quot;operating user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | `String`| Unique identifier of a board. |
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. |


### Return type
[**Board**](Board.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`


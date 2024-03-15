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

<a id="boardSectionsCreate"></a>
# **boardSectionsCreate**
```java
Mono<BoardSection> BoardsController.boardSectionsCreate(boardIdboardSectionadAccountId)
```

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**boardSection** | [**BoardSection**](../../docs/models/BoardSection.md) | Create a board section. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**BoardSection**](../../docs/models/BoardSection.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="boardSectionsDelete"></a>
# **boardSectionsDelete**
```java
Mono<Object> BoardsController.boardSectionsDelete(boardIdsectionIdadAccountId)
```

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardSectionsList"></a>
# **boardSectionsList**
```java
Mono<BoardSectionsList200Response> BoardsController.boardSectionsList(boardIdadAccountIdbookmarkpageSize)
```

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardSectionsList200Response**](../../docs/models/BoardSectionsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardSectionsListPins"></a>
# **boardSectionsListPins**
```java
Mono<BoardsListPins200Response> BoardsController.boardSectionsListPins(boardIdsectionIdadAccountIdbookmarkpageSize)
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardsListPins200Response**](../../docs/models/BoardsListPins200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
```java
Mono<BoardSection> BoardsController.boardSectionsUpdate(boardIdsectionIdboardSectionadAccountId)
```

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**boardSection** | [**BoardSection**](../../docs/models/BoardSection.md) | Update a board section. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**BoardSection**](../../docs/models/BoardSection.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="boardsCreate"></a>
# **boardsCreate**
```java
Mono<Board> BoardsController.boardsCreate(boardadAccountId)
```

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**board** | [**Board**](../../docs/models/Board.md) | Create a board using a single board json object. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="boardsDelete"></a>
# **boardsDelete**
```java
Mono<Object> BoardsController.boardsDelete(boardIdadAccountId)
```

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsGet"></a>
# **boardsGet**
```java
Mono<Board> BoardsController.boardsGet(boardIdadAccountId)
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsList"></a>
# **boardsList**
```java
Mono<BoardsList200Response> BoardsController.boardsList(adAccountIdbookmarkpageSizeprivacy)
```

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**privacy** | `String` | Privacy setting for a board. | [optional parameter] [enum: `ALL`, `PROTECTED`, `PUBLIC`, `SECRET`, `PUBLIC_AND_SECRET`]

### Return type
[**BoardsList200Response**](../../docs/models/BoardsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsListPins"></a>
# **boardsListPins**
```java
Mono<BoardsListPins200Response> BoardsController.boardsListPins(boardIdbookmarkpageSizecreativeTypesadAccountIdpinMetrics)
```

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
**creativeTypes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional parameter] [enum: `REGULAR`, `VIDEO`, `SHOPPING`, `CAROUSEL`, `MAX_VIDEO`, `SHOP_THE_PIN`, `COLLECTION`, `IDEA`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]

### Return type
[**BoardsListPins200Response**](../../docs/models/BoardsListPins200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsUpdate"></a>
# **boardsUpdate**
```java
Mono<Board> BoardsController.boardsUpdate(boardIdboardUpdateadAccountId)
```

Update board

Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**boardUpdate** | [**BoardUpdate**](../../docs/models/BoardUpdate.md) | Update a board. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


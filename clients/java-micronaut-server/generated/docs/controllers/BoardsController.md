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
Mono<BoardSection> BoardsController.boardSectionsCreate(boardIdboardSectionCreateadAccountId)
```

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**boardSectionCreate** | [**BoardSectionCreate**](../../docs/models/BoardSectionCreate.md) |  |
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
Mono<BoardSection> BoardsController.boardSectionsDelete(boardIdsectionIdadAccountId)
```

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**BoardSection**](../../docs/models/BoardSection.md)

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
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardSectionsList200Response**](../../docs/models/BoardSectionsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`
* **client_credentials**, scopes: `boards:read`

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
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardsListPins200Response**](../../docs/models/BoardsListPins200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardSectionsUpdate"></a>
# **boardSectionsUpdate**
```java
Mono<BoardSection> BoardsController.boardSectionsUpdate(boardIdsectionIdboardSectionUpdateWithRequiredBodyadAccountId)
```

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**sectionId** | `String` | Unique identifier of a board section. |
**boardSectionUpdateWithRequiredBody** | [**BoardSectionUpdateWithRequiredBody**](../../docs/models/BoardSectionUpdateWithRequiredBody.md) |  |
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
Mono<Board> BoardsController.boardsCreate(boardCreateadAccountId)
```

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardCreate** | [**BoardCreate**](../../docs/models/BoardCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`
* **client_credentials**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="boardsDelete"></a>
# **boardsDelete**
```java
Mono<Board> BoardsController.boardsDelete(boardIdadAccountId)
```

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

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

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Board**](../../docs/models/Board.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`
* **client_credentials**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsList"></a>
# **boardsList**
```java
Mono<BoardsList200Response> BoardsController.boardsList(adAccountIdprivacybookmarkpageSize)
```

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**privacy** | [**BoardPrivacyFilter**](../../docs/models/.md) | The privacy level of the board | [optional parameter] [enum: `ALL`, `PUBLIC`, `PROTECTED`, `SECRET`, `PUBLIC_AND_SECRET`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardsList200Response**](../../docs/models/BoardsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`
* **client_credentials**, scopes: `boards:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsListPins"></a>
# **boardsListPins**
```java
Mono<BoardsListPins200Response> BoardsController.boardsListPins(boardIdcreativeTypesadAccountIdpinMetricsbookmarkpageSize)
```

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` | Unique identifier of a board. |
**creativeTypes** | [**List&lt;CreativeType&gt;**](../../docs/models/CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional parameter]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**BoardsListPins200Response**](../../docs/models/BoardsListPins200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="boardsUpdate"></a>
# **boardsUpdate**
```java
Mono<BoardWithUpdatePrivacy> BoardsController.boardsUpdate(boardIdboardWithUpdatePrivacyUpdateadAccountId)
```

Update board

Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**boardId** | `String` |  |
**boardWithUpdatePrivacyUpdate** | [**BoardWithUpdatePrivacyUpdate**](../../docs/models/BoardWithUpdatePrivacyUpdate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**BoardWithUpdatePrivacy**](../../docs/models/BoardWithUpdatePrivacy.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`
* **client_credentials**, scopes: `boards:read`, `boards:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


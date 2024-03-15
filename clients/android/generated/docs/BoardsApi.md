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



## boardSectionsCreate

> BoardSection boardSectionsCreate(boardId, boardSection, adAccountId)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
BoardSection boardSection = new BoardSection(); // BoardSection | Create a board section.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    BoardSection result = apiInstance.boardSectionsCreate(boardId, boardSection, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardSectionsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardSectionsDelete

> boardSectionsDelete(boardId, sectionId, adAccountId)

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String sectionId = null; // String | Unique identifier of a board section.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    apiInstance.boardSectionsDelete(boardId, sectionId, adAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardSectionsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **sectionId** | **String**| Unique identifier of a board section. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsList

> BoardSectionsList200Response boardSectionsList(boardId, adAccountId, bookmark, pageSize)

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    BoardSectionsList200Response result = apiInstance.boardSectionsList(boardId, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardSectionsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsListPins

> BoardsListPins200Response boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String sectionId = null; // String | Unique identifier of a board section.
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
try {
    BoardsListPins200Response result = apiInstance.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardSectionsListPins");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **sectionId** | **String**| Unique identifier of a board section. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsUpdate

> BoardSection boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId)

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String sectionId = null; // String | Unique identifier of a board section.
BoardSection boardSection = new BoardSection(); // BoardSection | Update a board section.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    BoardSection result = apiInstance.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardSectionsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **sectionId** | **String**| Unique identifier of a board section. | [default to null]
 **boardSection** | [**BoardSection**](BoardSection.md)| Update a board section. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardsCreate

> Board boardsCreate(board, adAccountId)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
Board board = new Board(); // Board | Create a board using a single board json object.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Board result = apiInstance.boardsCreate(board, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardsDelete

> boardsDelete(boardId, adAccountId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    apiInstance.boardsDelete(boardId, adAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsGet

> Board boardsGet(boardId, adAccountId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Board result = apiInstance.boardsGet(boardId, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsList

> BoardsList200Response boardsList(adAccountId, bookmark, pageSize, privacy)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
String privacy = null; // String | Privacy setting for a board.
try {
    BoardsList200Response result = apiInstance.boardsList(adAccountId, bookmark, pageSize, privacy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **String**| Privacy setting for a board. | [optional] [default to null] [enum: ALL, PROTECTED, PUBLIC, SECRET, PUBLIC_AND_SECRET]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsListPins

> BoardsListPins200Response boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
List<String> creativeTypes = null; // List<String> | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
String adAccountId = null; // String | Unique identifier of an ad account.
Boolean pinMetrics = false; // Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
try {
    BoardsListPins200Response result = apiInstance.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsListPins");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **creativeTypes** | [**List&lt;String&gt;**](String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null] [enum: REGULAR, VIDEO, SHOPPING, CAROUSEL, MAX_VIDEO, SHOP_THE_PIN, COLLECTION, IDEA]
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]
 **pinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsUpdate

> Board boardsUpdate(boardId, boardUpdate, adAccountId)

Update board

Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BoardsApi;

BoardsApi apiInstance = new BoardsApi();
String boardId = null; // String | Unique identifier of a board.
BoardUpdate boardUpdate = new BoardUpdate(); // BoardUpdate | Update a board.
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    Board result = apiInstance.boardsUpdate(boardId, boardUpdate, adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoardsApi#boardsUpdate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | [default to null]
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. |
 **adAccountId** | **String**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


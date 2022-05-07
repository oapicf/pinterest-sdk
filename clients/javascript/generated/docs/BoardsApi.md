# PinterestSdk.BoardsApi

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

> BoardSection boardSectionsCreate(boardId, boardSection)

Create board section

Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let boardSection = new PinterestSdk.BoardSection(); // BoardSection | Create a board section.
apiInstance.boardSectionsCreate(boardId, boardSection, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **boardSection** | [**BoardSection**](BoardSection.md)| Create a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardSectionsDelete

> boardSectionsDelete(boardId, sectionId)

Delete board section

Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let sectionId = "sectionId_example"; // String | Unique identifier of a board section.
apiInstance.boardSectionsDelete(boardId, sectionId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **sectionId** | **String**| Unique identifier of a board section. | 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsList

> Paginated boardSectionsList(boardId, opts)

List board sections

Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
};
apiInstance.boardSectionsList(boardId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsListPins

> Paginated boardSectionsListPins(boardId, sectionId, opts)

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let sectionId = "sectionId_example"; // String | Unique identifier of a board section.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
};
apiInstance.boardSectionsListPins(boardId, sectionId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **sectionId** | **String**| Unique identifier of a board section. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardSectionsUpdate

> BoardSection boardSectionsUpdate(boardId, sectionId, boardSection)

Update board section

Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let sectionId = "sectionId_example"; // String | Unique identifier of a board section.
let boardSection = new PinterestSdk.BoardSection(); // BoardSection | Update a board section.
apiInstance.boardSectionsUpdate(boardId, sectionId, boardSection, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **sectionId** | **String**| Unique identifier of a board section. | 
 **boardSection** | [**BoardSection**](BoardSection.md)| Update a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardsCreate

> Board boardsCreate(board)

Create board

Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let board = new PinterestSdk.Board(); // Board | Create a board using a single board json object.
apiInstance.boardsCreate(board, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**Board**](Board.md)| Create a board using a single board json object. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## boardsDelete

> boardsDelete(boardId)

Delete board

Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
apiInstance.boardsDelete(boardId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsGet

> Board boardsGet(boardId)

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
apiInstance.boardsGet(boardId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsList

> Paginated boardsList(opts)

List boards

Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
  'privacy': "privacy_example" // String | Privacy setting for a board.
};
apiInstance.boardsList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **String**| Privacy setting for a board. | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsListPins

> Paginated boardsListPins(boardId, opts)

List Pins on board

Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
};
apiInstance.boardsListPins(boardId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## boardsUpdate

> Board boardsUpdate(boardId, boardUpdate)

Update board

Update a board owned by the \&quot;operating user_account\&quot;.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BoardsApi();
let boardId = "boardId_example"; // String | Unique identifier of a board.
let boardUpdate = new PinterestSdk.BoardUpdate(); // BoardUpdate | Update a board.
apiInstance.boardsUpdate(boardId, boardUpdate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String**| Unique identifier of a board. | 
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


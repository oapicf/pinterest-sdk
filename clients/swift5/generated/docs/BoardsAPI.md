# BoardsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate**](BoardsAPI.md#boardsectionscreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete**](BoardsAPI.md#boardsectionsdelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList**](BoardsAPI.md#boardsectionslist) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins**](BoardsAPI.md#boardsectionslistpins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate**](BoardsAPI.md#boardsectionsupdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate**](BoardsAPI.md#boardscreate) | **POST** /boards | Create board
[**boardsDelete**](BoardsAPI.md#boardsdelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet**](BoardsAPI.md#boardsget) | **GET** /boards/{board_id} | Get board
[**boardsList**](BoardsAPI.md#boardslist) | **GET** /boards | List boards
[**boardsListPins**](BoardsAPI.md#boardslistpins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate**](BoardsAPI.md#boardsupdate) | **PATCH** /boards/{board_id} | Update board


# **boardSectionsCreate**
```swift
    open class func boardSectionsCreate(boardId: String, boardSection: BoardSection, completion: @escaping (_ data: BoardSection?, _ error: Error?) -> Void)
```

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let boardSection = BoardSection(id: "id_example", name: "name_example") // BoardSection | Create a board section.

// Create board section
BoardsAPI.boardSectionsCreate(boardId: boardId, boardSection: boardSection) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **boardSection** | [**BoardSection**](BoardSection.md) | Create a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsDelete**
```swift
    open class func boardSectionsDelete(boardId: String, sectionId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.

// Delete board section
BoardsAPI.boardSectionsDelete(boardId: boardId, sectionId: sectionId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsList**
```swift
    open class func boardSectionsList(boardId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// List board sections
BoardsAPI.boardSectionsList(boardId: boardId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsListPins**
```swift
    open class func boardSectionsListPins(boardId: String, sectionId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// List Pins on board section
BoardsAPI.boardSectionsListPins(boardId: boardId, sectionId: sectionId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsUpdate**
```swift
    open class func boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection, completion: @escaping (_ data: BoardSection?, _ error: Error?) -> Void)
```

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let boardSection = BoardSection(id: "id_example", name: "name_example") // BoardSection | Update a board section.

// Update board section
BoardsAPI.boardSectionsUpdate(boardId: boardId, sectionId: sectionId, boardSection: boardSection) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 
 **boardSection** | [**BoardSection**](BoardSection.md) | Update a board section. | 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsCreate**
```swift
    open class func boardsCreate(board: Board, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let board = Board(id: "id_example", name: "name_example", description: "description_example", owner: "TODO", privacy: "privacy_example") // Board | Create a board using a single board json object.

// Create board
BoardsAPI.boardsCreate(board: board) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
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

# **boardsDelete**
```swift
    open class func boardsDelete(boardId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.

// Delete board
BoardsAPI.boardsDelete(boardId: boardId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsGet**
```swift
    open class func boardsGet(boardId: String, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.

// Get board
BoardsAPI.boardsGet(boardId: boardId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsList**
```swift
    open class func boardsList(bookmark: String? = nil, pageSize: Int? = nil, privacy: Privacy_boardsList? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
let privacy = "privacy_example" // String | Privacy setting for a board. (optional)

// List boards
BoardsAPI.boardsList(bookmark: bookmark, pageSize: pageSize, privacy: privacy) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **String** | Privacy setting for a board. | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsListPins**
```swift
    open class func boardsListPins(boardId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)

// List Pins on board
BoardsAPI.boardsListPins(boardId: boardId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsUpdate**
```swift
    open class func boardsUpdate(boardId: String, boardUpdate: BoardUpdate, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Update board

Update a board owned by the \"operating user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let boardUpdate = BoardUpdate(name: "name_example", description: "description_example", privacy: "privacy_example") // BoardUpdate | Update a board.

// Update board
BoardsAPI.boardsUpdate(boardId: boardId, boardUpdate: boardUpdate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **boardUpdate** | [**BoardUpdate**](BoardUpdate.md) | Update a board. | 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


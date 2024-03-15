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
    open class func boardSectionsCreate(boardId: String, boardSection: BoardSection, adAccountId: String? = nil, completion: @escaping (_ data: BoardSection?, _ error: Error?) -> Void)
```

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let boardSection = BoardSection(id: "id_example", name: "name_example") // BoardSection | Create a board section.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create board section
BoardsAPI.boardSectionsCreate(boardId: boardId, boardSection: boardSection, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardSectionsDelete(boardId: String, sectionId: String, adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete board section
BoardsAPI.boardSectionsDelete(boardId: boardId, sectionId: sectionId, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardSectionsList(boardId: String, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: BoardSectionsList200Response?, _ error: Error?) -> Void)
```

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List board sections
BoardsAPI.boardSectionsList(boardId: boardId, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsListPins**
```swift
    open class func boardSectionsListPins(boardId: String, sectionId: String, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: BoardsListPins200Response?, _ error: Error?) -> Void)
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List Pins on board section
BoardsAPI.boardSectionsListPins(boardId: boardId, sectionId: sectionId, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsUpdate**
```swift
    open class func boardSectionsUpdate(boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: String? = nil, completion: @escaping (_ data: BoardSection?, _ error: Error?) -> Void)
```

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let boardSection = BoardSection(id: "id_example", name: "name_example") // BoardSection | Update a board section.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update board section
BoardsAPI.boardSectionsUpdate(boardId: boardId, sectionId: sectionId, boardSection: boardSection, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardsCreate(board: Board, adAccountId: String? = nil, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let board = Board(id: "id_example", createdAt: Date(), boardPinsModifiedAt: Date(), name: "name_example", description: "description_example", collaboratorCount: 123, pinCount: 123, followerCount: 123, media: Board_media(imageCoverUrl: "imageCoverUrl_example", pinThumbnailUrls: ["pinThumbnailUrls_example"]), owner: Board_owner(username: "username_example"), privacy: "privacy_example") // Board | Create a board using a single board json object.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create board
BoardsAPI.boardsCreate(board: board, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardsDelete(boardId: String, adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete board

Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete board
BoardsAPI.boardsDelete(boardId: boardId, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardsGet(boardId: String, adAccountId: String? = nil, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get board
BoardsAPI.boardsGet(boardId: boardId, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

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
    open class func boardsList(adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, privacy: Privacy_boardsList? = nil, completion: @escaping (_ data: BoardsList200Response?, _ error: Error?) -> Void)
```

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let privacy = "privacy_example" // String | Privacy setting for a board. (optional)

// List boards
BoardsAPI.boardsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, privacy: privacy) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **String** | Privacy setting for a board. | [optional] 

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsListPins**
```swift
    open class func boardsListPins(boardId: String, bookmark: String? = nil, pageSize: Int? = nil, creativeTypes: [CreativeTypes_boardsListPins]? = nil, adAccountId: String? = nil, pinMetrics: Bool? = nil, completion: @escaping (_ data: BoardsListPins200Response?, _ error: Error?) -> Void)
```

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let creativeTypes = ["creativeTypes_example"] // [String] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

// List Pins on board
BoardsAPI.boardsListPins(boardId: boardId, bookmark: bookmark, pageSize: pageSize, creativeTypes: creativeTypes, adAccountId: adAccountId, pinMetrics: pinMetrics) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **creativeTypes** | [**[String]**](String.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsUpdate**
```swift
    open class func boardsUpdate(boardId: String, boardUpdate: BoardUpdate, adAccountId: String? = nil, completion: @escaping (_ data: Board?, _ error: Error?) -> Void)
```

Update board

Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let boardUpdate = BoardUpdate(name: "name_example", description: "description_example", privacy: "privacy_example") // BoardUpdate | Update a board.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update board
BoardsAPI.boardsUpdate(boardId: boardId, boardUpdate: boardUpdate, adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


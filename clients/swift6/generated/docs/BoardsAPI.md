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
    open class func boardSectionsCreate(boardId: String, boardSectionCreate: BoardSectionCreate, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardSection
```

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let boardSectionCreate = BoardSectionCreate(id: "id_example", name: "name_example") // BoardSectionCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create board section
do {
    let response = try await BoardsAPI.boardSectionsCreate(boardId: boardId, boardSectionCreate: boardSectionCreate, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **boardSectionCreate** | [**BoardSectionCreate**](BoardSectionCreate.md) |  | 
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
    open class func boardSectionsDelete(boardId: String, sectionId: String, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardSection?
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
do {
    let response = try await BoardsAPI.boardSectionsDelete(boardId: boardId, sectionId: sectionId, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsList**
```swift
    open class func boardSectionsList(boardId: String, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardSectionsList200Response
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
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List board sections
do {
    let response = try await BoardsAPI.boardSectionsList(boardId: boardId, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsListPins**
```swift
    open class func boardSectionsListPins(boardId: String, sectionId: String, adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardsListPins200Response
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
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List Pins on board section
do {
    let response = try await BoardsAPI.boardSectionsListPins(boardId: boardId, sectionId: sectionId, adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardSectionsUpdate**
```swift
    open class func boardSectionsUpdate(boardId: String, sectionId: String, boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardSection
```

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let sectionId = "sectionId_example" // String | Unique identifier of a board section.
let boardSectionUpdateWithRequiredBody = BoardSectionUpdateWithRequiredBody(id: "id_example", name: "name_example") // BoardSectionUpdateWithRequiredBody | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update board section
do {
    let response = try await BoardsAPI.boardSectionsUpdate(boardId: boardId, sectionId: sectionId, boardSectionUpdateWithRequiredBody: boardSectionUpdateWithRequiredBody, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **sectionId** | **String** | Unique identifier of a board section. | 
 **boardSectionUpdateWithRequiredBody** | [**BoardSectionUpdateWithRequiredBody**](BoardSectionUpdateWithRequiredBody.md) |  | 
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
    open class func boardsCreate(boardCreate: BoardCreate, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Board
```

Create board

Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardCreate = BoardCreate(description: "description_example", isAdsOnly: true, name: "name_example", privacy: BoardPrivacy()) // BoardCreate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create board
do {
    let response = try await BoardsAPI.boardsCreate(boardCreate: boardCreate, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardCreate** | [**BoardCreate**](BoardCreate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsDelete**
```swift
    open class func boardsDelete(boardId: String, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Board?
```

Delete board

Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete board
do {
    let response = try await BoardsAPI.boardsDelete(boardId: boardId, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsGet**
```swift
    open class func boardsGet(boardId: String, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Board
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get board
do {
    let response = try await BoardsAPI.boardsGet(boardId: boardId, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsList**
```swift
    open class func boardsList(adAccountId: String? = nil, privacy: BoardPrivacyFilter? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardsList200Response
```

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let privacy = BoardPrivacyFilter() // BoardPrivacyFilter | The privacy level of the board (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List boards
do {
    let response = try await BoardsAPI.boardsList(adAccountId: adAccountId, privacy: privacy, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **privacy** | [**BoardPrivacyFilter**](.md) | The privacy level of the board | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsListPins**
```swift
    open class func boardsListPins(boardId: String, creativeTypes: [CreativeType]? = nil, adAccountId: String? = nil, pinMetrics: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardsListPins200Response
```

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | Unique identifier of a board.
let creativeTypes = [CreativeType()] // [CreativeType] | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List Pins on board
do {
    let response = try await BoardsAPI.boardsListPins(boardId: boardId, creativeTypes: creativeTypes, adAccountId: adAccountId, pinMetrics: pinMetrics, bookmark: bookmark, pageSize: pageSize)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** | Unique identifier of a board. | 
 **creativeTypes** | [**[CreativeType]**](CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **boardsUpdate**
```swift
    open class func boardsUpdate(boardId: String, boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, adAccountId: String? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> BoardWithUpdatePrivacy
```

Update board

Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let boardId = "boardId_example" // String | 
let boardWithUpdatePrivacyUpdate = BoardWithUpdatePrivacyUpdate(description: "description_example", name: "name_example", privacy: BoardUpdatePrivacy()) // BoardWithUpdatePrivacyUpdate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update board
do {
    let response = try await BoardsAPI.boardsUpdate(boardId: boardId, boardWithUpdatePrivacyUpdate: boardWithUpdatePrivacyUpdate, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **boardId** | **String** |  | 
 **boardWithUpdatePrivacyUpdate** | [**BoardWithUpdatePrivacyUpdate**](BoardWithUpdatePrivacyUpdate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**BoardWithUpdatePrivacy**](BoardWithUpdatePrivacy.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


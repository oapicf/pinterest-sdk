# SearchAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](SearchAPI.md#searchpartnerpins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](SearchAPI.md#searchuserboardsget) | **GET** /search/boards | Search user&#39;s boards
[**searchUserPinsList**](SearchAPI.md#searchuserpinslist) | **GET** /search/pins | Search user&#39;s Pins


# **searchPartnerPins**
```swift
    open class func searchPartnerPins(term: String, countryCode: String, bookmark: String? = nil, locale: String? = nil, limit: Int? = nil, completion: @escaping (_ data: SearchPartnerPins200Response?, _ error: Error?) -> Void)
```

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let term = "term_example" // String | Search term to look up pins.
let countryCode = "countryCode_example" // String | Two letter country code (ISO 3166-1 alpha-2)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let locale = "locale_example" // String | Search locale. (optional)
let limit = 987 // Int | Max search result size (optional) (default to 10)

// Search pins by a given search term
SearchAPI.searchPartnerPins(term: term, countryCode: countryCode, bookmark: bookmark, locale: locale, limit: limit) { (response, error) in
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
 **term** | **String** | Search term to look up pins. | 
 **countryCode** | **String** | Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **locale** | **String** | Search locale. | [optional] 
 **limit** | **Int** | Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchUserBoardsGet**
```swift
    open class func searchUserBoardsGet(adAccountId: String? = nil, bookmark: String? = nil, pageSize: Int? = nil, query: String? = nil, completion: @escaping (_ data: SearchUserBoardsGet200Response?, _ error: Error?) -> Void)
```

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let query = "query_example" // String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

// Search user's boards
SearchAPI.searchUserBoardsGet(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, query: query) { (response, error) in
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
 **query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchUserPinsList**
```swift
    open class func searchUserPinsList(query: String, adAccountId: String? = nil, bookmark: String? = nil, completion: @escaping (_ data: PinsList200Response?, _ error: Error?) -> Void)
```

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let query = "query_example" // String | Search query. Can contain pin description keywords or comma-separated pin IDs.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Search user's Pins
SearchAPI.searchUserPinsList(query: query, adAccountId: adAccountId, bookmark: bookmark) { (response, error) in
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
 **query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


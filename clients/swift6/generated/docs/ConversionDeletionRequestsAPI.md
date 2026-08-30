# ConversionDeletionRequestsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](ConversionDeletionRequestsAPI.md#conversiondeletionrequestcreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](ConversionDeletionRequestsAPI.md#conversiondeletionrequestdelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](ConversionDeletionRequestsAPI.md#conversiondeletionrequestget) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](ConversionDeletionRequestsAPI.md#conversiondeletionrequestlist) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


# **conversionDeletionRequestCreate**
```swift
    open class func conversionDeletionRequestCreate(adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate, completion: @escaping (_ data: ConversionDeletionRequest?, _ error: Error?) -> Void)
```

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionDeletionRequestCreate = ConversionDeletionRequestCreate(deletionTargets: ConversionDeletionRequestTargets(userEmails: ["userEmails_example"], epiks: ["epiks_example"])) // ConversionDeletionRequestCreate | 

// Create a conversion deletion request
ConversionDeletionRequestsAPI.conversionDeletionRequestCreate(adAccountId: adAccountId, conversionDeletionRequestCreate: conversionDeletionRequestCreate) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **conversionDeletionRequestCreate** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md) |  | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionDeletionRequestDelete**
```swift
    open class func conversionDeletionRequestDelete(requestId: String, adAccountId: String, completion: @escaping (_ data: ConversionDeletionRequest?, _ error: Error?) -> Void)
```

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let requestId = "requestId_example" // String | Unique identifier of the conversion deletion request
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Delete a conversion deletion request
ConversionDeletionRequestsAPI.conversionDeletionRequestDelete(requestId: requestId, adAccountId: adAccountId) { (response, error) in
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
 **requestId** | **String** | Unique identifier of the conversion deletion request | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionDeletionRequestGet**
```swift
    open class func conversionDeletionRequestGet(requestId: String, adAccountId: String, completion: @escaping (_ data: ConversionDeletionRequest?, _ error: Error?) -> Void)
```

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let requestId = "requestId_example" // String | Unique identifier of the conversion deletion request
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get a single conversion deletion request
ConversionDeletionRequestsAPI.conversionDeletionRequestGet(requestId: requestId, adAccountId: adAccountId) { (response, error) in
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
 **requestId** | **String** | Unique identifier of the conversion deletion request | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionDeletionRequestList**
```swift
    open class func conversionDeletionRequestList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, completion: @escaping (_ data: ConversionDeletionRequestList200Response?, _ error: Error?) -> Void)
```

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

// List conversion deletion requests
ConversionDeletionRequestsAPI.conversionDeletionRequestList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


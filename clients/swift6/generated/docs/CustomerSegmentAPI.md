# CustomerSegmentAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](CustomerSegmentAPI.md#customersegmentcreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](CustomerSegmentAPI.md#customersegmentlist) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](CustomerSegmentAPI.md#customersegmentupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customerSegmentCreate**
```swift
    open class func customerSegmentCreate(adAccountId: String, customerSegmentCreate: CustomerSegmentCreate, completion: @escaping (_ data: CustomerSegment?, _ error: Error?) -> Void)
```

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let customerSegmentCreate = CustomerSegmentCreate(audienceIds: ["audienceIds_example"], name: "name_example") // CustomerSegmentCreate | 

// Create customer segments
CustomerSegmentAPI.customerSegmentCreate(adAccountId: adAccountId, customerSegmentCreate: customerSegmentCreate) { (response, error) in
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
 **customerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentList**
```swift
    open class func customerSegmentList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, includeSizing: Bool? = nil, searchQuery: String? = nil, completion: @escaping (_ data: CustomerSegmentList200Response?, _ error: Error?) -> Void)
```

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let includeSizing = true // Bool | Include audience sizing in result or not (optional) (default to false)
let searchQuery = "searchQuery_example" // String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

// List customer segments
CustomerSegmentAPI.customerSegmentList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, includeSizing: includeSizing, searchQuery: searchQuery) { (response, error) in
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
 **includeSizing** | **Bool** | Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerSegmentUpdate**
```swift
    open class func customerSegmentUpdate(adAccountId: String, customerSegmentUpdateRequestUpdateWithRequiredBody: CustomerSegmentUpdateRequestUpdateWithRequiredBody, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let customerSegmentUpdateRequestUpdateWithRequiredBody = CustomerSegmentUpdateRequestUpdateWithRequiredBody(audienceIds: ["audienceIds_example"], id: "id_example", operationType: AudienceUpdateOperationType()) // CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

// Update customer segments
CustomerSegmentAPI.customerSegmentUpdate(adAccountId: adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody: customerSegmentUpdateRequestUpdateWithRequiredBody) { (response, error) in
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
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


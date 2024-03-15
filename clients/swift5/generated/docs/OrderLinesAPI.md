# OrderLinesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](OrderLinesAPI.md#orderlinesget) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](OrderLinesAPI.md#orderlineslist) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


# **orderLinesGet**
```swift
    open class func orderLinesGet(adAccountId: String, orderLineId: String, completion: @escaping (_ data: OrderLine?, _ error: Error?) -> Void)
```

Get order line

Get a specific existing order line associated with an ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let orderLineId = "orderLineId_example" // String | Unique identifier of an order line.

// Get order line
OrderLinesAPI.orderLinesGet(adAccountId: adAccountId, orderLineId: orderLineId) { (response, error) in
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
 **orderLineId** | **String** | Unique identifier of an order line. | 

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **orderLinesList**
```swift
    open class func orderLinesList(adAccountId: String, pageSize: Int? = nil, order: Order_orderLinesList? = nil, bookmark: String? = nil, completion: @escaping (_ data: OrderLinesList200Response?, _ error: Error?) -> Void)
```

Get order lines

List existing order lines associated with an ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get order lines
OrderLinesAPI.orderLinesList(adAccountId: adAccountId, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


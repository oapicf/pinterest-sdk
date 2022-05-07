# PinsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsAPI.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsAPI.md#pinscreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsAPI.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsAPI.md#pinsget) | **GET** /pins/{pin_id} | Get Pin


# **pinsAnalytics**
```swift
    open class func pinsAnalytics(pinId: String, startDate: Date, endDate: Date, metricTypes: [MetricTypes_pinsAnalytics], appTypes: AppTypes_pinsAnalytics? = nil, splitField: SplitField_pinsAnalytics? = nil, adAccountId: String? = nil, completion: @escaping (_ data: [String: AnalyticsMetricsResponse]?, _ error: Error?) -> Void)
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let metricTypes = ["metricTypes_example"] // [String] | Pin metric types to get data for, default is all.
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let splitField = "splitField_example" // String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to .noSplit)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get Pin analytics
PinsAPI.pinsAnalytics(pinId: pinId, startDate: startDate, endDate: endDate, metricTypes: metricTypes, appTypes: appTypes, splitField: splitField, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **metricTypes** | [**[String]**](String.md) | Pin metric types to get data for, default is all. | 
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **splitField** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to .noSplit]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[String: AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsCreate**
```swift
    open class func pinsCreate(pin: Pin, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pin = Pin(id: "id_example", createdAt: Date(), link: "link_example", title: "title_example", description: "description_example", altText: "altText_example", boardId: "boardId_example", boardSectionId: "boardSectionId_example", boardOwner: "TODO", media: "TODO", mediaSource: "TODO") // Pin | Create a new Pin.

// Create Pin
PinsAPI.pinsCreate(pin: pin) { (response, error) in
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
 **pin** | [**Pin**](Pin.md) | Create a new Pin. | 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
```swift
    open class func pinsDelete(pinId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.

// Delete Pin
PinsAPI.pinsDelete(pinId: pinId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
```swift
    open class func pinsGet(pinId: String, adAccountId: String? = nil, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get Pin
PinsAPI.pinsGet(pinId: pinId, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


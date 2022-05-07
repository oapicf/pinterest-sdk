# UserAccountAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountAPI.md#useraccountanalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountAPI.md#useraccountget) | **GET** /user_account | Get user account


# **userAccountAnalytics**
```swift
    open class func userAccountAnalytics(startDate: Date, endDate: Date, fromClaimedContent: FromClaimedContent_userAccountAnalytics? = nil, pinFormat: PinFormat_userAccountAnalytics? = nil, appTypes: AppTypes_userAccountAnalytics? = nil, metricTypes: [MetricTypes_userAccountAnalytics]? = nil, splitField: SplitField_userAccountAnalytics? = nil, adAccountId: String? = nil, completion: @escaping (_ data: [String: AnalyticsMetricsResponse]?, _ error: Error?) -> Void)
```

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let fromClaimedContent = "fromClaimedContent_example" // String | Filter on Pins that match your claimed domain. (optional) (default to .both)
let pinFormat = "pinFormat_example" // String | Pin formats to get data for, default is all. (optional) (default to .all)
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let metricTypes = ["metricTypes_example"] // [String] | Metric types to get data for, default is all.  (optional)
let splitField = "splitField_example" // String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to .noSplit)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account analytics
UserAccountAPI.userAccountAnalytics(startDate: startDate, endDate: endDate, fromClaimedContent: fromClaimedContent, pinFormat: pinFormat, appTypes: appTypes, metricTypes: metricTypes, splitField: splitField, adAccountId: adAccountId) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **fromClaimedContent** | **String** | Filter on Pins that match your claimed domain. | [optional] [default to .both]
 **pinFormat** | **String** | Pin formats to get data for, default is all. | [optional] [default to .all]
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **metricTypes** | [**[String]**](String.md) | Metric types to get data for, default is all.  | [optional] 
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

# **userAccountGet**
```swift
    open class func userAccountGet(adAccountId: String? = nil, completion: @escaping (_ data: Account?, _ error: Error?) -> Void)
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get user account
UserAccountAPI.userAccountGet(adAccountId: adAccountId) { (response, error) in
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

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


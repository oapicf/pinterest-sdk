# AudienceInsightsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsAPI.md#audienceinsightsget) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsAPI.md#audienceinsightsscopeandtypeget) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audienceInsightsGet**
```swift
    open class func audienceInsightsGet(adAccountId: String, audienceInsightType: AudienceInsightType, completion: @escaping (_ data: AudienceInsightsResponse?, _ error: Error?) -> Void)
```

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceInsightType = AudienceInsightType() // AudienceInsightType | Type of audience insights.

// Get audience insights
AudienceInsightsAPI.audienceInsightsGet(adAccountId: adAccountId, audienceInsightType: audienceInsightType) { (response, error) in
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
 **audienceInsightType** | [**AudienceInsightType**](.md) | Type of audience insights. | 

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audienceInsightsScopeAndTypeGet**
```swift
    open class func audienceInsightsScopeAndTypeGet(adAccountId: String, completion: @escaping (_ data: AudienceDefinitionResponse?, _ error: Error?) -> Void)
```

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get audience insights scope and type
AudienceInsightsAPI.audienceInsightsScopeAndTypeGet(adAccountId: adAccountId) { (response, error) in
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

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


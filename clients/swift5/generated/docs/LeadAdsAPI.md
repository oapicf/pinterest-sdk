# LeadAdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsAPI.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsAPI.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**adAccountsSubscriptionsGetList**](LeadAdsAPI.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsAPI.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
```swift
    open class func adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let subscriptionId = "subscriptionId_example" // String | Unique identifier of a subscription.

// Delete lead ads subscription
LeadAdsAPI.adAccountsSubscriptionsDelById(adAccountId: adAccountId, subscriptionId: subscriptionId) { (response, error) in
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
 **subscriptionId** | **String** | Unique identifier of a subscription. | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetById**
```swift
    open class func adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String, completion: @escaping (_ data: AdAccountGetSubscriptionResponse?, _ error: Error?) -> Void)
```

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let subscriptionId = "subscriptionId_example" // String | Unique identifier of a subscription.

// Get lead ads subscription
LeadAdsAPI.adAccountsSubscriptionsGetById(adAccountId: adAccountId, subscriptionId: subscriptionId) { (response, error) in
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
 **subscriptionId** | **String** | Unique identifier of a subscription. | 

### Return type

[**AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetList**
```swift
    open class func adAccountsSubscriptionsGetList(adAccountId: String, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: AdAccountsSubscriptionsGetList200Response?, _ error: Error?) -> Void)
```

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get lead ads subscriptions
LeadAdsAPI.adAccountsSubscriptionsGetList(adAccountId: adAccountId, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsPost**
```swift
    open class func adAccountsSubscriptionsPost(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest, completion: @escaping (_ data: AdAccountCreateSubscriptionResponse?, _ error: Error?) -> Void)
```

Create lead ads subscription

Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adAccountCreateSubscriptionRequest = AdAccountCreateSubscriptionRequest(webhookUrl: "webhookUrl_example", leadFormId: "leadFormId_example", partnerAccessToken: "partnerAccessToken_example", partnerRefreshToken: "partnerRefreshToken_example") // AdAccountCreateSubscriptionRequest | Subscription to create.

// Create lead ads subscription
LeadAdsAPI.adAccountsSubscriptionsPost(adAccountId: adAccountId, adAccountCreateSubscriptionRequest: adAccountCreateSubscriptionRequest) { (response, error) in
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
 **adAccountCreateSubscriptionRequest** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md) | Subscription to create. | 

### Return type

[**AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


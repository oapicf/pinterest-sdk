# LeadAdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsAPI.md#adaccountssubscriptionsdelbyid) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsAPI.md#adaccountssubscriptionsgetbyid) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](LeadAdsAPI.md#adaccountssubscriptionsgetlist) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsAPI.md#adaccountssubscriptionspost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **adAccountsSubscriptionsDelById**
```swift
    open class func adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String, completion: @escaping (_ data: LeadSubscription?, _ error: Error?) -> Void)
```

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

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

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetById**
```swift
    open class func adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String, completion: @escaping (_ data: LeadSubscription?, _ error: Error?) -> Void)
```

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let subscriptionId = "subscriptionId_example" // String | Unique identifier of a subscription.

// Get lead ads subscription by ID
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

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsSubscriptionsGetList**
```swift
    open class func adAccountsSubscriptionsGetList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: AdAccountsSubscriptionsGetList200Response?, _ error: Error?) -> Void)
```

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// Get lead ads subscriptions
LeadAdsAPI.adAccountsSubscriptionsGetList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
    open class func adAccountsSubscriptionsPost(adAccountId: String, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate, completion: @escaping (_ data: LeadSubscription?, _ error: Error?) -> Void)
```

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let leadSubscriptionPostParamsCreate = LeadSubscriptionPostParamsCreate(leadFormId: "leadFormId_example", webhookUrl: "webhookUrl_example", partnerAccessToken: "partnerAccessToken_example", partnerMetadata: PartnerMetadata(subscriberKey: "subscriberKey_example"), partnerRefreshToken: "partnerRefreshToken_example") // LeadSubscriptionPostParamsCreate | 

// Create lead ads subscription
LeadAdsAPI.adAccountsSubscriptionsPost(adAccountId: adAccountId, leadSubscriptionPostParamsCreate: leadSubscriptionPostParamsCreate) { (response, error) in
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
 **leadSubscriptionPostParamsCreate** | [**LeadSubscriptionPostParamsCreate**](LeadSubscriptionPostParamsCreate.md) |  | 

### Return type

[**LeadSubscription**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


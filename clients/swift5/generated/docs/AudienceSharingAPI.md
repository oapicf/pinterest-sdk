# AudienceSharingAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsAudiencesSharedAccountsList**](AudienceSharingAPI.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**businessAccountAudiencesSharedAccountsList**](AudienceSharingAPI.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**sharedAudiencesForBusinessList**](AudienceSharingAPI.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**updateAdAccountToAdAccountSharedAudience**](AudienceSharingAPI.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**updateAdAccountToBusinessSharedAudience**](AudienceSharingAPI.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**updateBusinessToAdAccountSharedAudience**](AudienceSharingAPI.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**updateBusinessToBusinessSharedAudience**](AudienceSharingAPI.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **adAccountsAudiencesSharedAccountsList**
```swift
    open class func adAccountsAudiencesSharedAccountsList(adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: AdAccountsAudiencesSharedAccountsList200Response?, _ error: Error?) -> Void)
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceId = "audienceId_example" // String | Unique identifier of the audience to use to filter the results.
let accountType = AudienceAccountType() // AudienceAccountType | Filter accounts by account type.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List accounts with access to an audience owned by an ad account
AudienceSharingAPI.adAccountsAudiencesSharedAccountsList(adAccountId: adAccountId, audienceId: audienceId, accountType: accountType, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **audienceId** | **String** | Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**AudienceAccountType**](.md) | Filter accounts by account type. | 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAccountAudiencesSharedAccountsList**
```swift
    open class func businessAccountAudiencesSharedAccountsList(businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: AdAccountsAudiencesSharedAccountsList200Response?, _ error: Error?) -> Void)
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let audienceId = "audienceId_example" // String | Unique identifier of the audience to use to filter the results.
let accountType = AudienceAccountType() // AudienceAccountType | Filter accounts by account type.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List accounts with access to an audience owned by a business
AudienceSharingAPI.businessAccountAudiencesSharedAccountsList(businessId: businessId, audienceId: audienceId, accountType: accountType, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **audienceId** | **String** | Unique identifier of the audience to use to filter the results. | 
 **accountType** | [**AudienceAccountType**](.md) | Filter accounts by account type. | 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sharedAudiencesForBusinessList**
```swift
    open class func sharedAudiencesForBusinessList(businessId: String, bookmark: String? = nil, order: Order_sharedAudiencesForBusinessList? = nil, pageSize: Int? = nil, completion: @escaping (_ data: AudiencesList200Response?, _ error: Error?) -> Void)
```

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

// List received audiences for a business
AudienceSharingAPI.sharedAudiencesForBusinessList(businessId: businessId, bookmark: bookmark, order: order, pageSize: pageSize) { (response, error) in
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
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToAdAccountSharedAudience**
```swift
    open class func updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience, completion: @escaping (_ data: SharedAudienceResponse?, _ error: Error?) -> Void)
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let sharedAudience = SharedAudience(audienceId: "audienceId_example", operationType: OperationType(), recipientAccountIds: ["recipientAccountIds_example"]) // SharedAudience | 

// Update audience sharing between ad accounts
AudienceSharingAPI.updateAdAccountToAdAccountSharedAudience(adAccountId: adAccountId, sharedAudience: sharedAudience) { (response, error) in
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
 **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToBusinessSharedAudience**
```swift
    open class func updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience, completion: @escaping (_ data: BusinessSharedAudienceResponse?, _ error: Error?) -> Void)
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let businessSharedAudience = BusinessSharedAudience(audienceId: "audienceId_example", operationType: OperationType(), recipientBusinessIds: ["recipientBusinessIds_example"]) // BusinessSharedAudience | 

// Update audience sharing from an ad account to businesses
AudienceSharingAPI.updateAdAccountToBusinessSharedAudience(adAccountId: adAccountId, businessSharedAudience: businessSharedAudience) { (response, error) in
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
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToAdAccountSharedAudience**
```swift
    open class func updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience, completion: @escaping (_ data: SharedAudienceResponse?, _ error: Error?) -> Void)
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let sharedAudience = SharedAudience(audienceId: "audienceId_example", operationType: OperationType(), recipientAccountIds: ["recipientAccountIds_example"]) // SharedAudience | 

// Update audience sharing from a business to ad accounts
AudienceSharingAPI.updateBusinessToAdAccountSharedAudience(businessId: businessId, sharedAudience: sharedAudience) { (response, error) in
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
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **sharedAudience** | [**SharedAudience**](SharedAudience.md) |  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToBusinessSharedAudience**
```swift
    open class func updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience, completion: @escaping (_ data: BusinessSharedAudienceResponse?, _ error: Error?) -> Void)
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let businessId = "businessId_example" // String | Unique identifier of the requesting business.
let businessSharedAudience = BusinessSharedAudience(audienceId: "audienceId_example", operationType: OperationType(), recipientBusinessIds: ["recipientBusinessIds_example"]) // BusinessSharedAudience | 

// Update audience sharing between businesses
AudienceSharingAPI.updateBusinessToBusinessSharedAudience(businessId: businessId, businessSharedAudience: businessSharedAudience) { (response, error) in
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
 **businessId** | **String** | Unique identifier of the requesting business. | 
 **businessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md) |  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


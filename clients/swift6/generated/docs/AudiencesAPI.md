# AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesAPI.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](AudiencesAPI.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesAPI.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesAPI.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiencesCreate**
```swift
    open class func audiencesCreate(adAccountId: String, adAccountsAudienceCreate: AdAccountsAudienceCreate, completion: @escaping (_ data: AdAccountsAudience?, _ error: Error?) -> Void)
```

Create audience

Create a new audience for the ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adAccountsAudienceCreate = AdAccountsAudienceCreate(adAccountId: "adAccountId_example", audienceType: AudienceType(), description: "description_example", name: "name_example", rule: AdAccountsAudienceRule(adAccountId: "adAccountId_example", adId: ["adId_example"], campaignId: ["campaignId_example"], country: "country_example", customerListId: "customerListId_example", engagementDomain: ["engagementDomain_example"], engagementType: "engagementType_example", engagerType: 123, event: "event_example", eventData: EventData(currency: Currency(), leadType: "leadType_example", lineItems: LineItem(productBrand: "productBrand_example", productCategory: "productCategory_example", productId: 123, productName: "productName_example", productPrice: "productPrice_example", productQuantity: 123, productVariant: "productVariant_example", productVariantId: "productVariantId_example"), orderId: "orderId_example", orderQuantity: 123, pageName: "pageName_example", promoCode: "promoCode_example", property: "property_example", searchQuery: "searchQuery_example", value: "value_example", videoTitle: "videoTitle_example"), eventSource: 123, ingestionSource: 123, objectiveType: [AudienceObjectiveType()], percentage: 123, pinId: ["pinId_example"], prefill: false, retentionDays: 123, seedId: ["seedId_example"], url: ["url_example"], visitorSourceId: "visitorSourceId_example")) // AdAccountsAudienceCreate | 

// Create audience
AudiencesAPI.audiencesCreate(adAccountId: adAccountId, adAccountsAudienceCreate: adAccountsAudienceCreate) { (response, error) in
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
 **adAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md) |  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesGet**
```swift
    open class func audiencesGet(audienceId: String, adAccountId: String, completion: @escaping (_ data: AdAccountsAudience?, _ error: Error?) -> Void)
```

Get audience

Get a specific audience given the audience ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let audienceId = "audienceId_example" // String | Audience ID.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get audience
AudiencesAPI.audiencesGet(audienceId: audienceId, adAccountId: adAccountId) { (response, error) in
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
 **audienceId** | **String** | Audience ID. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesList**
```swift
    open class func audiencesList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, ownershipType: AudienceOwnershipType? = nil, excludeNca: Bool? = nil, completion: @escaping (_ data: AudiencesList200Response?, _ error: Error?) -> Void)
```

List audiences

Get list of audiences for the ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let ownershipType = AudienceOwnershipType() // AudienceOwnershipType |  (optional)
let excludeNca = true // Bool | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to false)

// List audiences
AudiencesAPI.audiencesList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, ownershipType: ownershipType, excludeNca: excludeNca) { (response, error) in
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
 **ownershipType** | [**AudienceOwnershipType**](.md) |  | [optional] 
 **excludeNca** | **Bool** | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesUpdate**
```swift
    open class func audiencesUpdate(audienceId: String, adAccountId: String, adAccountsAudienceUpdate: AdAccountsAudienceUpdate, completion: @escaping (_ data: AdAccountsAudience?, _ error: Error?) -> Void)
```

Update audience

Update an existing audience for the ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let audienceId = "audienceId_example" // String | Audience ID.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adAccountsAudienceUpdate = AdAccountsAudienceUpdate(adAccountId: "adAccountId_example", audienceType: AudienceType(), description: "description_example", name: "name_example", operationType: AudienceUpdateOperationType(), rule: AdAccountsAudienceRule(adAccountId: "adAccountId_example", adId: ["adId_example"], campaignId: ["campaignId_example"], country: "country_example", customerListId: "customerListId_example", engagementDomain: ["engagementDomain_example"], engagementType: "engagementType_example", engagerType: 123, event: "event_example", eventData: EventData(currency: Currency(), leadType: "leadType_example", lineItems: LineItem(productBrand: "productBrand_example", productCategory: "productCategory_example", productId: 123, productName: "productName_example", productPrice: "productPrice_example", productQuantity: 123, productVariant: "productVariant_example", productVariantId: "productVariantId_example"), orderId: "orderId_example", orderQuantity: 123, pageName: "pageName_example", promoCode: "promoCode_example", property: "property_example", searchQuery: "searchQuery_example", value: "value_example", videoTitle: "videoTitle_example"), eventSource: 123, ingestionSource: 123, objectiveType: [AudienceObjectiveType()], percentage: 123, pinId: ["pinId_example"], prefill: false, retentionDays: 123, seedId: ["seedId_example"], url: ["url_example"], visitorSourceId: "visitorSourceId_example")) // AdAccountsAudienceUpdate | 

// Update audience
AudiencesAPI.audiencesUpdate(audienceId: audienceId, adAccountId: adAccountId, adAccountsAudienceUpdate: adAccountsAudienceUpdate) { (response, error) in
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
 **audienceId** | **String** | Audience ID. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **adAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md) |  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


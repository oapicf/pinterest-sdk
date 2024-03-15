# AudiencesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesAPI.md#audiencescreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](AudiencesAPI.md#audiencescreatecustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiencesGet**](AudiencesAPI.md#audiencesget) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesAPI.md#audienceslist) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesAPI.md#audiencesupdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiencesCreate**
```swift
    open class func audiencesCreate(adAccountId: String, audienceCreateRequest: AudienceCreateRequest, completion: @escaping (_ data: Audience?, _ error: Error?) -> Void)
```

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceCreateRequest = AudienceCreateRequest(adAccountId: "adAccountId_example", name: "name_example", rule: AudienceRule(country: "country_example", customerListId: "customerListId_example", engagementDomain: ["engagementDomain_example"], engagementType: "engagementType_example", event: "event_example", eventData: PinterestTagEventData(currency: Currency(), leadType: "leadType_example", lineItems: LineItem(productBrand: "productBrand_example", productCategory: "productCategory_example", productId: 123, productName: "productName_example", productPrice: "productPrice_example", productQuantity: 123, productVariant: "productVariant_example", productVariantId: "productVariantId_example"), orderId: "orderId_example", orderQuantity: 123, pageName: "pageName_example", promoCode: "promoCode_example", property: "property_example", searchQuery: "searchQuery_example", value: "value_example", videoTitle: "videoTitle_example"), percentage: 123, pinId: ["pinId_example"], prefill: true, retentionDays: 123, seedId: ["seedId_example"], url: ["url_example"], visitorSourceId: "visitorSourceId_example", eventSource: 123, ingestionSource: 123, engagerType: 123, campaignId: ["campaignId_example"], adId: ["adId_example"], objectiveType: [ObjectiveType()], adAccountId: "adAccountId_example"), description: "description_example", audienceType: AudienceCreateRequest_1_audience_type()) // AudienceCreateRequest | List of ads to create, size limit [1, 30]

// Create audience
AudiencesAPI.audiencesCreate(adAccountId: adAccountId, audienceCreateRequest: audienceCreateRequest) { (response, error) in
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
 **audienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesCreateCustom**
```swift
    open class func audiencesCreateCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest, completion: @escaping (_ data: Audience?, _ error: Error?) -> Void)
```

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceCreateCustomRequest = AudienceCreateCustomRequest(adAccountId: "adAccountId_example", name: "name_example", rule: AudienceRule(country: "country_example", customerListId: "customerListId_example", engagementDomain: ["engagementDomain_example"], engagementType: "engagementType_example", event: "event_example", eventData: PinterestTagEventData(currency: Currency(), leadType: "leadType_example", lineItems: LineItem(productBrand: "productBrand_example", productCategory: "productCategory_example", productId: 123, productName: "productName_example", productPrice: "productPrice_example", productQuantity: 123, productVariant: "productVariant_example", productVariantId: "productVariantId_example"), orderId: "orderId_example", orderQuantity: 123, pageName: "pageName_example", promoCode: "promoCode_example", property: "property_example", searchQuery: "searchQuery_example", value: "value_example", videoTitle: "videoTitle_example"), percentage: 123, pinId: ["pinId_example"], prefill: true, retentionDays: 123, seedId: ["seedId_example"], url: ["url_example"], visitorSourceId: "visitorSourceId_example", eventSource: 123, ingestionSource: 123, engagerType: 123, campaignId: ["campaignId_example"], adId: ["adId_example"], objectiveType: [ObjectiveType()], adAccountId: "adAccountId_example"), sharingType: AudienceSharingType(), dataParty: AudienceDataParty(), category: "category_example") // AudienceCreateCustomRequest | Custom audience to create.

// Create custom audience
AudiencesAPI.audiencesCreateCustom(adAccountId: adAccountId, audienceCreateCustomRequest: audienceCreateCustomRequest) { (response, error) in
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
 **audienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md) | Custom audience to create. | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesGet**
```swift
    open class func audiencesGet(adAccountId: String, audienceId: String, completion: @escaping (_ data: Audience?, _ error: Error?) -> Void)
```

Get audience

Get a specific audience given the audience ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceId = "audienceId_example" // String | Unique identifier of an audience

// Get audience
AudiencesAPI.audiencesGet(adAccountId: adAccountId, audienceId: audienceId) { (response, error) in
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
 **audienceId** | **String** | Unique identifier of an audience | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesList**
```swift
    open class func audiencesList(adAccountId: String, bookmark: String? = nil, order: Order_audiencesList? = nil, pageSize: Int? = nil, ownershipType: OwnershipType_audiencesList? = nil, completion: @escaping (_ data: AudiencesList200Response?, _ error: Error?) -> Void)
```

List audiences

Get list of audiences for the ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let ownershipType = "ownershipType_example" // String | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (optional) (default to .owned)

// List audiences
AudiencesAPI.audiencesList(adAccountId: adAccountId, bookmark: bookmark, order: order, pageSize: pageSize, ownershipType: ownershipType) { (response, error) in
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
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownershipType** | **String** | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to .owned]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audiencesUpdate**
```swift
    open class func audiencesUpdate(adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest? = nil, completion: @escaping (_ data: Audience?, _ error: Error?) -> Void)
```

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let audienceId = "audienceId_example" // String | Unique identifier of an audience
let audienceUpdateRequest = AudienceUpdateRequest(adAccountId: "adAccountId_example", name: "name_example", rule: AudienceRule(country: "country_example", customerListId: "customerListId_example", engagementDomain: ["engagementDomain_example"], engagementType: "engagementType_example", event: "event_example", eventData: PinterestTagEventData(currency: Currency(), leadType: "leadType_example", lineItems: LineItem(productBrand: "productBrand_example", productCategory: "productCategory_example", productId: 123, productName: "productName_example", productPrice: "productPrice_example", productQuantity: 123, productVariant: "productVariant_example", productVariantId: "productVariantId_example"), orderId: "orderId_example", orderQuantity: 123, pageName: "pageName_example", promoCode: "promoCode_example", property: "property_example", searchQuery: "searchQuery_example", value: "value_example", videoTitle: "videoTitle_example"), percentage: 123, pinId: ["pinId_example"], prefill: true, retentionDays: 123, seedId: ["seedId_example"], url: ["url_example"], visitorSourceId: "visitorSourceId_example", eventSource: 123, ingestionSource: 123, engagerType: 123, campaignId: ["campaignId_example"], adId: ["adId_example"], objectiveType: [ObjectiveType()], adAccountId: "adAccountId_example"), description: "description_example", operationType: AudienceUpdateOperationType()) // AudienceUpdateRequest | The audience to be updated. (optional)

// Update audience
AudiencesAPI.audiencesUpdate(adAccountId: adAccountId, audienceId: audienceId, audienceUpdateRequest: audienceUpdateRequest) { (response, error) in
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
 **audienceId** | **String** | Unique identifier of an audience | 
 **audienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md) | The audience to be updated. | [optional] 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


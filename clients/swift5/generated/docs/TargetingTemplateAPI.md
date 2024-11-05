# TargetingTemplateAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateAPI.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateAPI.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateAPI.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targetingTemplateCreate**
```swift
    open class func targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate, completion: @escaping (_ data: TargetingTemplateGetResponseData?, _ error: Error?) -> Void)
```

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let targetingTemplateCreate = TargetingTemplateCreate(name: "name_example", autoTargetingEnabled: false, targetingAttributes: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), placementGroup: PlacementGroupType(), keywords: [TargetingTemplateKeyword(matchType: MatchType(), value: "value_example")], trackingUrls: TrackingUrls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"])) // TargetingTemplateCreate | targeting template creation entity

// Create targeting templates
TargetingTemplateAPI.targetingTemplateCreate(adAccountId: adAccountId, targetingTemplateCreate: targetingTemplateCreate) { (response, error) in
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
 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) | targeting template creation entity | 

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateList**
```swift
    open class func targetingTemplateList(adAccountId: String, order: Order_targetingTemplateList? = nil, includeSizing: Bool? = nil, searchQuery: String? = nil, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: TargetingTemplateList200Response?, _ error: Error?) -> Void)
```

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let includeSizing = true // Bool | Include audience sizing in result or not (optional) (default to false)
let searchQuery = "searchQuery_example" // String | Search keyword for targeting templates (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List targeting templates
TargetingTemplateAPI.targetingTemplateList(adAccountId: adAccountId, order: order, includeSizing: includeSizing, searchQuery: searchQuery, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **includeSizing** | **Bool** | Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String** | Search keyword for targeting templates | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateUpdate**
```swift
    open class func targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let targetingTemplateUpdateRequest = TargetingTemplateUpdateRequest(operationType: "operationType_example", id: "id_example") // TargetingTemplateUpdateRequest | Operation type and targeting template ID

// Update targeting templates
TargetingTemplateAPI.targetingTemplateUpdate(adAccountId: adAccountId, targetingTemplateUpdateRequest: targetingTemplateUpdateRequest) { (response, error) in
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
 **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


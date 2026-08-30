# TargetingTemplateAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateAPI.md#targetingtemplatecreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateAPI.md#targetingtemplatelist) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateAPI.md#targetingtemplateupdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targetingTemplateCreate**
```swift
    open class func targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate, completion: @escaping (_ data: TargetingTemplate?, _ error: Error?) -> Void)
```

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let targetingTemplateCreate = TargetingTemplateCreate(autoTargetingEnabled: false, keywords: [TargetingTemplateKeyword(matchType: MatchType(), value: "value_example")], name: "name_example", placementGroup: PlacementGroupType(), targetingAttributes: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()]), trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"])) // TargetingTemplateCreate | 

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
 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) |  | 

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateList**
```swift
    open class func targetingTemplateList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, includeSizing: Bool? = nil, searchQuery: String? = nil, completion: @escaping (_ data: TargetingTemplateList200Response?, _ error: Error?) -> Void)
```

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let includeSizing = true // Bool | Include audience sizing in result or not (optional) (default to false)
let searchQuery = "searchQuery_example" // String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

// List targeting templates
TargetingTemplateAPI.targetingTemplateList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, includeSizing: includeSizing, searchQuery: searchQuery) { (response, error) in
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
 **includeSizing** | **Bool** | Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targetingTemplateUpdate**
```swift
    open class func targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequestReadOrUpdate: TargetingTemplateUpdateRequestReadOrUpdate, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let targetingTemplateUpdateRequestReadOrUpdate = TargetingTemplateUpdateRequestReadOrUpdate(id: "id_example", operationType: AudienceUpdateOperationType(), targetingAttributes: TargetingSpecOptimal(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: [TargetingStrategy()])) // TargetingTemplateUpdateRequestReadOrUpdate | 

// Update targeting templates
TargetingTemplateAPI.targetingTemplateUpdate(adAccountId: adAccountId, targetingTemplateUpdateRequestReadOrUpdate: targetingTemplateUpdateRequestReadOrUpdate) { (response, error) in
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
 **targetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md) |  | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


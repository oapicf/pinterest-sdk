# PromotionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsAPI.md#promotionscreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsAPI.md#promotionsdelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsAPI.md#promotionsget) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsAPI.md#promotionslist) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsAPI.md#promotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **promotionsCreate**
```swift
    open class func promotionsCreate(adAccountId: String, promotionCreate: [PromotionCreate], apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> PromotionsResponse
```

Create promotions

Create multiple new promotions.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionCreate = [PromotionCreate(discountStatus: DiscountStatus(), endTime: 123, externalId: "externalId_example", platformType: "platformType_example", promotionCode: "promotionCode_example", promotionCustomId: "promotionCustomId_example", promotionTitle: "promotionTitle_example", promotionType: PromotionType(), startTime: 123, templateValues: [PromotionTemplateValue(amount: 123, currencyCode: Currency(), customText: "customText_example", percent: 123)])] // [PromotionCreate] | 

// Create promotions
do {
    let response = try await PromotionsAPI.promotionsCreate(adAccountId: adAccountId, promotionCreate: promotionCreate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **promotionCreate** | [**[PromotionCreate]**](PromotionCreate.md) |  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsDelete**
```swift
    open class func promotionsDelete(promotionId: String, adAccountId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Promotion?
```

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let promotionId = "promotionId_example" // String | Promotion ID
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Delete promotion by id
do {
    let response = try await PromotionsAPI.promotionsDelete(promotionId: promotionId, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String** | Promotion ID | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
```swift
    open class func promotionsGet(promotionId: String, adAccountId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> Promotion
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let promotionId = "promotionId_example" // String | Promotion ID
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get promotion by id
do {
    let response = try await PromotionsAPI.promotionsGet(promotionId: promotionId, adAccountId: adAccountId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **String** | Promotion ID | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsList**
```swift
    open class func promotionsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> PromotionsList200Response
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

// Get promotions
do {
    let response = try await PromotionsAPI.promotionsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**PromotionsList200Response**](PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsUpdate**
```swift
    open class func promotionsUpdate(adAccountId: String, promotionBatchUpdate: [PromotionBatchUpdate], apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> PromotionsResponse
```

Update promotions

Update multiple promotions.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionBatchUpdate = [PromotionBatchUpdate(discountStatus: DiscountStatus(), endTime: 123, externalId: "externalId_example", id: "id_example", platformType: "platformType_example", promotionCode: "promotionCode_example", promotionCustomId: "promotionCustomId_example", promotionTitle: "promotionTitle_example", promotionType: PromotionType(), startTime: 123, templateValues: [PromotionTemplateValue(amount: 123, currencyCode: Currency(), customText: "customText_example", percent: 123)])] // [PromotionBatchUpdate] | 

// Update promotions
do {
    let response = try await PromotionsAPI.promotionsUpdate(adAccountId: adAccountId, promotionBatchUpdate: promotionBatchUpdate)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **promotionBatchUpdate** | [**[PromotionBatchUpdate]**](PromotionBatchUpdate.md) |  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


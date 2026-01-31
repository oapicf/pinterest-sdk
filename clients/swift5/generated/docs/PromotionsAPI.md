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
    open class func promotionsCreate(adAccountId: String, promotionCreateRequest: [PromotionCreateRequest], completion: @escaping (_ data: PromotionsResponse?, _ error: Error?) -> Void)
```

Create promotions

Create multiple new promotions.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionCreateRequest = [PromotionCreateRequest(discountStatus: "discountStatus_example", endTime: 123, externalId: "externalId_example", platformType: "platformType_example", promotionCode: "promotionCode_example", promotionCustomId: "promotionCustomId_example", promotionTitle: "promotionTitle_example", promotionType: PromotionType(), startTime: 123, templateValues: [PromotionTemplateValue(amount: 123, currencyCode: Currency(), customText: "customText_example", percent: 123)])] // [PromotionCreateRequest] | List of promotions to create, size limit [1, 30].

// Create promotions
PromotionsAPI.promotionsCreate(adAccountId: adAccountId, promotionCreateRequest: promotionCreateRequest) { (response, error) in
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
 **promotionCreateRequest** | [**[PromotionCreateRequest]**](PromotionCreateRequest.md) | List of promotions to create, size limit [1, 30]. | 

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
    open class func promotionsDelete(adAccountId: String, promotionId: String, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionId = "promotionId_example" // String | Unique identifier of a promotion

// Delete promotion by id
PromotionsAPI.promotionsDelete(adAccountId: adAccountId, promotionId: promotionId) { (response, error) in
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
 **promotionId** | **String** | Unique identifier of a promotion | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsGet**
```swift
    open class func promotionsGet(adAccountId: String, promotionId: String, completion: @escaping (_ data: PromotionResponse?, _ error: Error?) -> Void)
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionId = "promotionId_example" // String | Unique identifier of a promotion

// Get promotion by id
PromotionsAPI.promotionsGet(adAccountId: adAccountId, promotionId: promotionId) { (response, error) in
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
 **promotionId** | **String** | Unique identifier of a promotion | 

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **promotionsList**
```swift
    open class func promotionsList(adAccountId: String, pageSize: Int? = nil, order: Order_promotionsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: PromotionsList200Response?, _ error: Error?) -> Void)
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get promotions
PromotionsAPI.promotionsList(adAccountId: adAccountId, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

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
    open class func promotionsUpdate(adAccountId: String, promotionUpdateRequest: [PromotionUpdateRequest], completion: @escaping (_ data: PromotionsResponse?, _ error: Error?) -> Void)
```

Update promotions

Update multiple promotions.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let promotionUpdateRequest = [PromotionUpdateRequest(discountStatus: "discountStatus_example", endTime: 123, externalId: "externalId_example", platformType: "platformType_example", promotionCode: "promotionCode_example", promotionCustomId: "promotionCustomId_example", promotionTitle: "promotionTitle_example", promotionType: PromotionType(), startTime: 123, templateValues: [PromotionTemplateValue(amount: 123, currencyCode: Currency(), customText: "customText_example", percent: 123)], id: "id_example", status: EntityStatus())] // [PromotionUpdateRequest] | List of promotions to create, size limit [1, 30].

// Update promotions
PromotionsAPI.promotionsUpdate(adAccountId: adAccountId, promotionUpdateRequest: promotionUpdateRequest) { (response, error) in
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
 **promotionUpdateRequest** | [**[PromotionUpdateRequest]**](PromotionUpdateRequest.md) | List of promotions to create, size limit [1, 30]. | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


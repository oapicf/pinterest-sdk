# ConversionTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionTagsCreate**](ConversionTagsAPI.md#conversiontagscreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversionTagsGet**](ConversionTagsAPI.md#conversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversionTagsList**](ConversionTagsAPI.md#conversiontagslist) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**ocpmEligibleConversionTagsGet**](ConversionTagsAPI.md#ocpmeligibleconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**pageVisitConversionTagsGet**](ConversionTagsAPI.md#pagevisitconversiontagsget) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversionTagsCreate**
```swift
    open class func conversionTagsCreate(adAccountId: String, conversionTagCreate: ConversionTagCreate, completion: @escaping (_ data: ConversionTagResponse?, _ error: Error?) -> Void)
```

Create conversion tag

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionTagCreate = ConversionTagCreate(name: "name_example", aemEnabled: true, mdFrequency: 123, aemFnlnEnabled: true, aemPhEnabled: true, aemGeEnabled: true, aemDbEnabled: true, aemLocEnabled: true) // ConversionTagCreate | Conversion Tag to create

// Create conversion tag
ConversionTagsAPI.conversionTagsCreate(adAccountId: adAccountId, conversionTagCreate: conversionTagCreate) { (response, error) in
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
 **conversionTagCreate** | [**ConversionTagCreate**](ConversionTagCreate.md) | Conversion Tag to create | 

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionTagsGet**
```swift
    open class func conversionTagsGet(adAccountId: String, conversionTagId: String, completion: @escaping (_ data: ConversionTagResponse?, _ error: Error?) -> Void)
```

Get conversion tag

Get information about an existing conversion tag.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionTagId = "conversionTagId_example" // String | Id of the conversion tag.

// Get conversion tag
ConversionTagsAPI.conversionTagsGet(adAccountId: adAccountId, conversionTagId: conversionTagId) { (response, error) in
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
 **conversionTagId** | **String** | Id of the conversion tag. | 

### Return type

[**ConversionTagResponse**](ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversionTagsList**
```swift
    open class func conversionTagsList(adAccountId: String, filterDeleted: Bool? = nil, completion: @escaping (_ data: ConversionTagListResponse?, _ error: Error?) -> Void)
```

Get conversion tags

List conversion tags associated with an ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let filterDeleted = true // Bool | Filter out deleted tags. (optional) (default to false)

// Get conversion tags
ConversionTagsAPI.conversionTagsList(adAccountId: adAccountId, filterDeleted: filterDeleted) { (response, error) in
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
 **filterDeleted** | **Bool** | Filter out deleted tags. | [optional] [default to false]

### Return type

[**ConversionTagListResponse**](ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ocpmEligibleConversionTagsGet**
```swift
    open class func ocpmEligibleConversionTagsGet(adAccountId: String, completion: @escaping (_ data: [String: [ConversionEventResponse]]?, _ error: Error?) -> Void)
```

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get Ocpm eligible conversion tags
ConversionTagsAPI.ocpmEligibleConversionTagsGet(adAccountId: adAccountId) { (response, error) in
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

[**[String: [ConversionEventResponse]]**](Array.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pageVisitConversionTagsGet**
```swift
    open class func pageVisitConversionTagsGet(adAccountId: String, pageSize: Int? = nil, order: Order_pageVisitConversionTagsGet? = nil, bookmark: String? = nil, completion: @escaping (_ data: PageVisitConversionTagsGet200Response?, _ error: Error?) -> Void)
```

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get page visit conversion tags
ConversionTagsAPI.pageVisitConversionTagsGet(adAccountId: adAccountId, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**PageVisitConversionTagsGet200Response**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


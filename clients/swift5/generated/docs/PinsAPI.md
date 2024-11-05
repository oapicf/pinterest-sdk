# PinsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multiPinsAnalytics**](PinsAPI.md#multipinsanalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**pinsAnalytics**](PinsAPI.md#pinsanalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsAPI.md#pinscreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsAPI.md#pinsdelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsAPI.md#pinsget) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](PinsAPI.md#pinslist) | **GET** /pins | List Pins
[**pinsSave**](PinsAPI.md#pinssave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](PinsAPI.md#pinsupdate) | **PATCH** /pins/{pin_id} | Update Pin


# **multiPinsAnalytics**
```swift
    open class func multiPinsAnalytics(pinIds: [String], startDate: Date, endDate: Date, metricTypes: [PinsAnalyticsMetricTypesParameterInner], appTypes: AppTypes_multiPinsAnalytics? = nil, adAccountId: String? = nil, completion: @escaping (_ data: [String: Dictionary]?, _ error: Error?) -> Void)
```

Get multiple Pin analytics

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinIds = ["inner_example"] // [String] | List of Pin IDs.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let metricTypes = [pins_analytics_metric_types_parameter_inner()] // [PinsAnalyticsMetricTypesParameterInner] | Pin metric types to get data for.
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get multiple Pin analytics
PinsAPI.multiPinsAnalytics(pinIds: pinIds, startDate: startDate, endDate: endDate, metricTypes: metricTypes, appTypes: appTypes, adAccountId: adAccountId) { (response, error) in
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
 **pinIds** | [**[String]**](String.md) | List of Pin IDs. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**[PinsAnalyticsMetricTypesParameterInner]**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for. | 
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[String: Dictionary]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsAnalytics**
```swift
    open class func pinsAnalytics(pinId: String, startDate: Date, endDate: Date, metricTypes: [PinsAnalyticsMetricTypesParameterInner], appTypes: AppTypes_pinsAnalytics? = nil, splitField: SplitField_pinsAnalytics? = nil, adAccountId: String? = nil, completion: @escaping (_ data: [String: PinAnalyticsMetricsResponse]?, _ error: Error?) -> Void)
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let metricTypes = [pins_analytics_metric_types_parameter_inner()] // [PinsAnalyticsMetricTypesParameterInner] | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
let appTypes = "appTypes_example" // String | Apps or devices to get data for, default is all. (optional) (default to .all)
let splitField = "splitField_example" // String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to .noSplit)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get Pin analytics
PinsAPI.pinsAnalytics(pinId: pinId, startDate: startDate, endDate: endDate, metricTypes: metricTypes, appTypes: appTypes, splitField: splitField, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metricTypes** | [**[PinsAnalyticsMetricTypesParameterInner]**](PinsAnalyticsMetricTypesParameterInner.md) | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | 
 **appTypes** | **String** | Apps or devices to get data for, default is all. | [optional] [default to .all]
 **splitField** | **String** | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to .noSplit]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**[String: PinAnalyticsMetricsResponse]**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsCreate**
```swift
    open class func pinsCreate(pinCreate: PinCreate, adAccountId: String? = nil, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/web-features/add-ons-overview/'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/api-features/content-overview/'>Content App Solutions Guide</a>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinCreate = PinCreate(id: "id_example", createdAt: Date(), link: "link_example", title: "title_example", description: "description_example", dominantColor: "dominantColor_example", altText: "altText_example", boardId: "boardId_example", boardSectionId: "boardSectionId_example", boardOwner: BoardOwner(username: "username_example"), media: PinMedia(mediaType: "mediaType_example"), mediaSource: PinMediaSource(sourceType: "sourceType_example", contentType: "contentType_example", data: "data_example", isStandard: false, url: "url_example", coverImageUrl: "coverImageUrl_example", coverImageContentType: "coverImageContentType_example", coverImageData: "coverImageData_example", mediaId: "mediaId_example", items: [PinMediaSourceImagesURL_items_inner(title: "title_example", description: "description_example", link: "link_example", url: "url_example")], index: 123, isAffiliateLink: false), parentPinId: "parentPinId_example", note: "note_example") // PinCreate | Create a new Pin.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Create Pin
PinsAPI.pinsCreate(pinCreate: pinCreate, adAccountId: adAccountId) { (response, error) in
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
 **pinCreate** | [**PinCreate**](PinCreate.md) | Create a new Pin. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsDelete**
```swift
    open class func pinsDelete(pinId: String, adAccountId: String? = nil, completion: @escaping (_ data: Void?, _ error: Error?) -> Void)
```

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Delete Pin
PinsAPI.pinsDelete(pinId: pinId, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsGet**
```swift
    open class func pinsGet(pinId: String, pinMetrics: Bool? = nil, adAccountId: String? = nil, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Get Pin
PinsAPI.pinsGet(pinId: pinId, pinMetrics: pinMetrics, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsList**
```swift
    open class func pinsList(bookmark: String? = nil, pageSize: Int? = nil, pinFilter: PinFilter_pinsList? = nil, includeProtectedPins: Bool? = nil, pinType: PinType_pinsList? = nil, creativeTypes: [CreativeTypes_pinsList]? = nil, adAccountId: String? = nil, pinMetrics: Bool? = nil, completion: @escaping (_ data: PinsList200Response?, _ error: Error?) -> Void)
```

List Pins

Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href='/docs/api/v5/#operation/boards/list_pins'>GET List Pins on Board</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let pinFilter = "pinFilter_example" // String | Pin filter. (optional)
let includeProtectedPins = true // Bool | Specify if return pins from protected boards (optional) (default to false)
let pinType = "pinType_example" // String | The type of pins to return, currently only enabled for private pins (optional)
let creativeTypes = ["creativeTypes_example"] // [String] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)
let pinMetrics = true // Bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to false)

// List Pins
PinsAPI.pinsList(bookmark: bookmark, pageSize: pageSize, pinFilter: pinFilter, includeProtectedPins: includeProtectedPins, pinType: pinType, creativeTypes: creativeTypes, adAccountId: adAccountId, pinMetrics: pinMetrics) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinFilter** | **String** | Pin filter. | [optional] 
 **includeProtectedPins** | **Bool** | Specify if return pins from protected boards | [optional] [default to false]
 **pinType** | **String** | The type of pins to return, currently only enabled for private pins | [optional] 
 **creativeTypes** | [**[String]**](String.md) | Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 
 **pinMetrics** | **Bool** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsSave**
```swift
    open class func pinsSave(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: String? = nil, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let pinsSaveRequest = pins_save_request(boardId: "boardId_example", boardSectionId: "boardSectionId_example") // PinsSaveRequest | Request object used to save an existing pin
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Save Pin
PinsAPI.pinsSave(pinId: pinId, pinsSaveRequest: pinsSaveRequest, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **pinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md) | Request object used to save an existing pin | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pinsUpdate**
```swift
    open class func pinsUpdate(pinId: String, pinUpdate: PinUpdate, adAccountId: String? = nil, completion: @escaping (_ data: Pin?, _ error: Error?) -> Void)
```

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of a Pin.
let pinUpdate = PinUpdate(altText: "altText_example", boardId: "boardId_example", boardSectionId: "boardSectionId_example", description: "description_example", link: "link_example", title: "title_example", carouselSlots: [PinUpdate_carousel_slots_inner(title: "title_example", description: "description_example", link: "link_example")], note: "note_example") // PinUpdate | 
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account. (optional)

// Update Pin
PinsAPI.pinsUpdate(pinId: pinId, pinUpdate: pinUpdate, adAccountId: adAccountId) { (response, error) in
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
 **pinId** | **String** | Unique identifier of a Pin. | 
 **pinUpdate** | [**PinUpdate**](PinUpdate.md) |  | 
 **adAccountId** | **String** | Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


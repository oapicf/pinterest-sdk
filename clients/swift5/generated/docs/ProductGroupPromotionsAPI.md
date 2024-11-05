# ProductGroupPromotionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productGroupPromotionsCreate**](ProductGroupPromotionsAPI.md#productgrouppromotionscreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsGet**](ProductGroupPromotionsAPI.md#productgrouppromotionsget) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsList**](ProductGroupPromotionsAPI.md#productgrouppromotionslist) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsUpdate**](ProductGroupPromotionsAPI.md#productgrouppromotionsupdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupsAnalytics**](ProductGroupPromotionsAPI.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **productGroupPromotionsCreate**
```swift
    open class func productGroupPromotionsCreate(adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest, completion: @escaping (_ data: ProductGroupPromotionResponse?, _ error: Error?) -> Void)
```

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let productGroupPromotionCreateRequest = ProductGroupPromotionCreateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotionCreateRequestElement(id: "id_example", adGroupId: "adGroupId_example", bidInMicroCurrency: 123, included: true, definition: "definition_example", relativeDefinition: "relativeDefinition_example", parentId: "parentId_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", isMdl: true, status: EntityStatus(), trackingUrl: "trackingUrl_example", catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeroPinId: "collectionsHeroPinId_example", collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", gridClickType: GridClickType(), creativeType: CreativeType())]) // ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].

// Create product group promotions
ProductGroupPromotionsAPI.productGroupPromotionsCreate(adAccountId: adAccountId, productGroupPromotionCreateRequest: productGroupPromotionCreateRequest) { (response, error) in
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
 **productGroupPromotionCreateRequest** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsGet**
```swift
    open class func productGroupPromotionsGet(adAccountId: String, productGroupPromotionId: String, completion: @escaping (_ data: ProductGroupPromotionResponse?, _ error: Error?) -> Void)
```

Get a product group promotion by id

Get a product group promotion by id

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let productGroupPromotionId = "productGroupPromotionId_example" // String | Unique identifier of a product group promotion

// Get a product group promotion by id
ProductGroupPromotionsAPI.productGroupPromotionsGet(adAccountId: adAccountId, productGroupPromotionId: productGroupPromotionId) { (response, error) in
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
 **productGroupPromotionId** | **String** | Unique identifier of a product group promotion | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsList**
```swift
    open class func productGroupPromotionsList(adAccountId: String, productGroupPromotionIds: [String]? = nil, entityStatuses: [EntityStatuses_productGroupPromotionsList]? = nil, adGroupId: String? = nil, pageSize: Int? = nil, order: Order_productGroupPromotionsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: ProductGroupPromotionsList200Response?, _ error: Error?) -> Void)
```

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let productGroupPromotionIds = ["inner_example"] // [String] | List of Product group promotion Ids. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let adGroupId = "adGroupId_example" // String | Ad group Id. (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get product group promotions
ProductGroupPromotionsAPI.productGroupPromotionsList(adAccountId: adAccountId, productGroupPromotionIds: productGroupPromotionIds, entityStatuses: entityStatuses, adGroupId: adGroupId, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **productGroupPromotionIds** | [**[String]**](String.md) | List of Product group promotion Ids. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **adGroupId** | **String** | Ad group Id. | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupPromotionsUpdate**
```swift
    open class func productGroupPromotionsUpdate(adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest, completion: @escaping (_ data: ProductGroupPromotionResponse?, _ error: Error?) -> Void)
```

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let productGroupPromotionUpdateRequest = ProductGroupPromotionUpdateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotion(id: "id_example", adGroupId: "adGroupId_example", bidInMicroCurrency: 123, included: true, definition: "definition_example", relativeDefinition: "relativeDefinition_example", parentId: "parentId_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", isMdl: true, status: EntityStatus(), trackingUrl: "trackingUrl_example", catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeroPinId: "collectionsHeroPinId_example", collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", gridClickType: GridClickType())]) // ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions

// Update product group promotions
ProductGroupPromotionsAPI.productGroupPromotionsUpdate(adAccountId: adAccountId, productGroupPromotionUpdateRequest: productGroupPromotionUpdateRequest) { (response, error) in
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
 **productGroupPromotionUpdateRequest** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md) | Parameters to update Product group promotions | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupsAnalytics**
```swift
    open class func productGroupsAnalytics(adAccountId: String, startDate: Date, endDate: Date, productGroupIds: [String], columns: [Columns_productGroupsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_productGroupsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_productGroupsAnalytics? = nil, viewWindowDays: ViewWindowDays_productGroupsAnalytics? = nil, conversionReportTime: ConversionReportTime_productGroupsAnalytics? = nil, completion: @escaping (_ data: [ProductGroupAnalyticsResponseInner]?, _ error: Error?) -> Void)
```

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let productGroupIds = ["inner_example"] // [String] | List of Product group Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get product group analytics
ProductGroupPromotionsAPI.productGroupsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, productGroupIds: productGroupIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **productGroupIds** | [**[String]**](String.md) | List of Product group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[ProductGroupAnalyticsResponseInner]**](ProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


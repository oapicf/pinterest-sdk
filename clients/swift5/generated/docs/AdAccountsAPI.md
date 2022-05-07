# AdAccountsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsAPI.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList**](AdAccountsAPI.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics**](AdAccountsAPI.md#adgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList**](AdAccountsAPI.md#adgroupslist) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics**](AdAccountsAPI.md#adsanalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList**](AdAccountsAPI.md#adslist) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport**](AdAccountsAPI.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport**](AdAccountsAPI.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics**](AdAccountsAPI.md#campaignsanalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList**](AdAccountsAPI.md#campaignslist) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics**](AdAccountsAPI.md#productgroupsanalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **adAccountAnalytics**
```swift
    open class func adAccountAnalytics(adAccountId: String, startDate: Date, endDate: Date, columns: [Columns_adAccountAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_adAccountAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adAccountAnalytics? = nil, viewWindowDays: ViewWindowDays_adAccountAnalytics? = nil, conversionReportTime: ConversionReportTime_adAccountAnalytics? = nil, completion: @escaping (_ data: [[String: AnyCodable]]?, _ error: Error?) -> Void)
```

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let columns = ["columns_example"] // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | Granularity
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get ad account analytics
AdAccountsAPI.adAccountAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **columns** | [**[String]**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | Granularity | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[[String: AnyCodable]]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsList**
```swift
    open class func adAccountsList(bookmark: String? = nil, pageSize: Int? = nil, includeSharedAccounts: Bool? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
let includeSharedAccounts = true // Bool | Include shared ad accounts (optional) (default to true)

// List ad accounts
AdAccountsAPI.adAccountsList(bookmark: bookmark, pageSize: pageSize, includeSharedAccounts: includeSharedAccounts) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **Bool** | Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsAnalytics**
```swift
    open class func adGroupsAnalytics(adAccountId: String, startDate: Date, endDate: Date, adGroupIds: [String], columns: [Columns_adGroupsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_adGroupsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adGroupsAnalytics? = nil, viewWindowDays: ViewWindowDays_adGroupsAnalytics? = nil, conversionReportTime: ConversionReportTime_adGroupsAnalytics? = nil, completion: @escaping (_ data: [[String: AnyCodable]]?, _ error: Error?) -> Void)
```

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | Granularity
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get ad group analytics
AdAccountsAPI.adGroupsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, adGroupIds: adGroupIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | Granularity | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[[String: AnyCodable]]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adGroupsList**
```swift
    open class func adGroupsList(adAccountId: String, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, entityStatuses: [EntityStatuses_adGroupsList]? = nil, pageSize: Int? = nil, order: Order_adGroupsList? = nil, bookmark: String? = nil, translateInterestsToNames: Bool? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let translateInterestsToNames = true // Bool | Return interests as text names (if value is true) rather than topic IDs. (optional) (default to false)

// List ad groups
AdAccountsAPI.adGroupsList(adAccountId: adAccountId, campaignIds: campaignIds, adGroupIds: adGroupIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark, translateInterestsToNames: translateInterestsToNames) { (response, error) in
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
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **translateInterestsToNames** | **Bool** | Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsAnalytics**
```swift
    open class func adsAnalytics(adAccountId: String, startDate: Date, endDate: Date, adIds: [String], columns: [Columns_adsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_adsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adsAnalytics? = nil, viewWindowDays: ViewWindowDays_adsAnalytics? = nil, conversionReportTime: ConversionReportTime_adsAnalytics? = nil, completion: @escaping (_ data: [[String: AnyCodable]]?, _ error: Error?) -> Void)
```

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | Granularity
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get ad analytics
AdAccountsAPI.adsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, adIds: adIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | Granularity | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[[String: AnyCodable]]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsList**
```swift
    open class func adsList(adAccountId: String, campaignIds: [String]? = nil, adGroupIds: [String]? = nil, adIds: [String]? = nil, entityStatuses: [EntityStatuses_adsList]? = nil, pageSize: Int? = nil, order: Order_adsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let adGroupIds = ["inner_example"] // [String] | List of Ad group Ids to use to filter the results. (optional)
let adIds = ["inner_example"] // [String] | List of Ad Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List ads
AdAccountsAPI.adsList(adAccountId: adAccountId, campaignIds: campaignIds, adGroupIds: adGroupIds, adIds: adIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **adGroupIds** | [**[String]**](String.md) | List of Ad group Ids to use to filter the results. | [optional] 
 **adIds** | [**[String]**](String.md) | List of Ad Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateReport**
```swift
    open class func analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, completion: @escaping (_ data: AdsAnalyticsCreateAsyncResponse?, _ error: Error?) -> Void)
```

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adsAnalyticsCreateAsyncRequest = AdsAnalyticsCreateAsyncRequest(startDate: "startDate_example", endDate: "endDate_example", granularity: Granularity(), clickWindowDays: ConversionAttributionWindowDays(), engagementWindowDays: nil, viewWindowDays: nil, conversionReportTime: ConversionReportTimeType(), attributionTypes: [ConversionReportAttributionType()], columns: [ReportingColumnAsync()], level: MetricsReportingLevel(), reportFormat: DataOutputFormat(), campaignIds: ["campaignIds_example"], campaignStatuses: [CampaignSummaryStatus()], campaignObjectiveTypes: [ObjectiveType()], adGroupIds: ["adGroupIds_example"], adGroupStatuses: [AdGroupSummaryStatus()], adIds: ["adIds_example"], adStatuses: [PinPromotionSummaryStatus()], productGroupIds: ["productGroupIds_example"], productGroupStatuses: [ProductGroupSummaryStatus()], productItemIds: ["productItemIds_example"], targetingTypes: [AdsAnalyticsTargetingType()], metricsFilters: [AdsAnalyticsMetricsFilter(field: AdsAnalyticsFilterColumn(), _operator: AdsAnalyticsFilterOperator(), values: [123])]) // AdsAnalyticsCreateAsyncRequest | 

// Create async request for an account analytics report
AdAccountsAPI.analyticsCreateReport(adAccountId: adAccountId, adsAnalyticsCreateAsyncRequest: adsAnalyticsCreateAsyncRequest) { (response, error) in
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
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetReport**
```swift
    open class func analyticsGetReport(adAccountId: String, token: String, completion: @escaping (_ data: AdsAnalyticsGetAsyncResponse?, _ error: Error?) -> Void)
```

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let token = "token_example" // String | Token returned from the post request creation call

// Get the account analytics report created by the async call
AdAccountsAPI.analyticsGetReport(adAccountId: adAccountId, token: token) { (response, error) in
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
 **token** | **String** | Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsAnalytics**
```swift
    open class func campaignsAnalytics(adAccountId: String, startDate: Date, endDate: Date, campaignIds: [String], columns: [Columns_campaignsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_campaignsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_campaignsAnalytics? = nil, viewWindowDays: ViewWindowDays_campaignsAnalytics? = nil, conversionReportTime: ConversionReportTime_campaignsAnalytics? = nil, completion: @escaping (_ data: [[String: AnyCodable]]?, _ error: Error?) -> Void)
```

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | Granularity
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get campaign analytics
AdAccountsAPI.campaignsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, campaignIds: campaignIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | Granularity | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[[String: AnyCodable]]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaignsList**
```swift
    open class func campaignsList(adAccountId: String, campaignIds: [String]? = nil, entityStatuses: [EntityStatuses_campaignsList]? = nil, pageSize: Int? = nil, order: Order_campaignsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: Paginated?, _ error: Error?) -> Void)
```

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Entity status (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List campaigns
AdAccountsAPI.campaignsList(adAccountId: adAccountId, campaignIds: campaignIds, entityStatuses: entityStatuses, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Entity status | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productGroupsAnalytics**
```swift
    open class func productGroupsAnalytics(adAccountId: String, startDate: Date, endDate: Date, productGroupIds: [String], columns: [Columns_productGroupsAnalytics], granularity: Granularity, clickWindowDays: ClickWindowDays_productGroupsAnalytics? = nil, engagementWindowDays: EngagementWindowDays_productGroupsAnalytics? = nil, viewWindowDays: ViewWindowDays_productGroupsAnalytics? = nil, conversionReportTime: ConversionReportTime_productGroupsAnalytics? = nil, completion: @escaping (_ data: [[String: AnyCodable]]?, _ error: Error?) -> Void)
```

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD
let productGroupIds = ["inner_example"] // [String] | List of Product group Ids to use to filter the results.
let columns = ["columns_example"] // [String] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
let granularity = Granularity() // Granularity | Granularity
let clickWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let viewWindowDays = 987 // Int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)

// Get product group analytics
AdAccountsAPI.productGroupsAnalytics(adAccountId: adAccountId, startDate: startDate, endDate: endDate, productGroupIds: productGroupIds, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD | 
 **productGroupIds** | [**[String]**](String.md) | List of Product group Ids to use to filter the results. | 
 **columns** | [**[String]**](String.md) | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md) | Granularity | 
 **clickWindowDays** | **Int** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Int** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **viewWindowDays** | **Int** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]

### Return type

[**[[String: AnyCodable]]**](Dictionary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# AdAccountsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsAPI.md#adaccountanalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsAPI.md#adaccounttargetinganalyticsget) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsAPI.md#adaccountscreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsAPI.md#adaccountsget) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsAPI.md#adaccountslist) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateConversionProductReport**](AdAccountsAPI.md#analyticscreateconversionproductreport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analyticsCreateMmmReport**](AdAccountsAPI.md#analyticscreatemmmreport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsAPI.md#analyticscreatereport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsAPI.md#analyticscreatetemplatereport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetConversionProductReport**](AdAccountsAPI.md#analyticsgetconversionproductreport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analyticsGetMmmReport**](AdAccountsAPI.md#analyticsgetmmmreport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](AdAccountsAPI.md#analyticsgetreport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](AdAccountsAPI.md#sandboxdelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](AdAccountsAPI.md#templateslist) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


# **adAccountAnalytics**
```swift
    open class func adAccountAnalytics(startDate: Date, endDate: Date, columns: [ReportingColumnSync], granularity: Granularity, adAccountId: String, clickWindowDays: ClickWindowDays_adAccountAnalytics? = nil, engagementWindowDays: EngagementWindowDays_adAccountAnalytics? = nil, viewWindowDays: ViewWindowDays_adAccountAnalytics? = nil, conversionReportTime: ConversionReportTime_adAccountAnalytics? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: [AdAccountAnalyticsItems]?, _ error: Error?) -> Void)
```

Get ad account analytics

  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get ad account analytics
AdAccountsAPI.adAccountAnalytics(startDate: startDate, endDate: endDate, columns: columns, granularity: granularity, adAccountId: adAccountId, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, reportingTimezone: reportingTimezone) { (response, error) in
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
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**[AdAccountAnalyticsItems]**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountTargetingAnalyticsGet**
```swift
    open class func adAccountTargetingAnalyticsGet(adAccountId: String, startDate: Date, endDate: Date, targetingTypes: [AdsAnalyticsAccountTargetingType], columns: [ReportingColumnSync], granularity: Granularity, clickWindowDays: ClickWindowDays_adAccountTargetingAnalyticsGet? = nil, engagementWindowDays: EngagementWindowDays_adAccountTargetingAnalyticsGet? = nil, viewWindowDays: ViewWindowDays_adAccountTargetingAnalyticsGet? = nil, conversionReportTime: ConversionReportTime_adAccountTargetingAnalyticsGet? = nil, attributionTypes: [ConversionReportAttributionType]? = nil, reportingTimezone: ReportingTimeZone? = nil, completion: @escaping (_ data: MetricsResponse?, _ error: Error?) -> Void)
```

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
let targetingTypes = [AdsAnalyticsAccountTargetingType()] // [AdsAnalyticsAccountTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
let columns = [ReportingColumnSync()] // [ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
let clickWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to ._30)
let engagementWindowDays = 987 // Double | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to ._30)
let viewWindowDays = 987 // Double | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to ._1)
let conversionReportTime = "conversionReportTime_example" // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to .timeOfAdAction)
let attributionTypes = [ConversionReportAttributionType()] // [ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
let reportingTimezone = ReportingTimeZone() // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

// Get targeting analytics for an ad account
AdAccountsAPI.adAccountTargetingAnalyticsGet(adAccountId: adAccountId, startDate: startDate, endDate: endDate, targetingTypes: targetingTypes, columns: columns, granularity: granularity, clickWindowDays: clickWindowDays, engagementWindowDays: engagementWindowDays, viewWindowDays: viewWindowDays, conversionReportTime: conversionReportTime, attributionTypes: attributionTypes, reportingTimezone: reportingTimezone) { (response, error) in
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
 **targetingTypes** | [**[AdsAnalyticsAccountTargetingType]**](AdsAnalyticsAccountTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **clickWindowDays** | **Double** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ._30]
 **engagementWindowDays** | **Double** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to ._30]
 **viewWindowDays** | **Double** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ._1]
 **conversionReportTime** | **String** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to .timeOfAdAction]
 **attributionTypes** | [**[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsCreate**
```swift
    open class func adAccountsCreate(adAccountCreate: AdAccountCreate, completion: @escaping (_ data: AdAccount?, _ error: Error?) -> Void)
```

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountCreate = AdAccountCreate(country: Country(), currency: Currency(), name: "name_example", ownerUserId: "ownerUserId_example", timeZone: "timeZone_example") // AdAccountCreate | 

// Create ad account
AdAccountsAPI.adAccountsCreate(adAccountCreate: adAccountCreate) { (response, error) in
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
 **adAccountCreate** | [**AdAccountCreate**](AdAccountCreate.md) |  | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsGet**
```swift
    open class func adAccountsGet(adAccountId: String, completion: @escaping (_ data: AdAccount?, _ error: Error?) -> Void)
```

Get ad account

Get an ad account

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 

// Get ad account
AdAccountsAPI.adAccountsGet(adAccountId: adAccountId) { (response, error) in
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
 **adAccountId** | **String** |  | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adAccountsList**
```swift
    open class func adAccountsList(includeSharedAccounts: Bool? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: AdAccountsList200Response?, _ error: Error?) -> Void)
```

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let includeSharedAccounts = true // Bool | Include shared ad accounts (optional) (default to true)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List ad accounts
AdAccountsAPI.adAccountsList(includeSharedAccounts: includeSharedAccounts, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **includeSharedAccounts** | **Bool** | Include shared ad accounts | [optional] [default to true]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateConversionProductReport**
```swift
    open class func analyticsCreateConversionProductReport(adAccountId: String, conversionProductReportCreate: ConversionProductReportCreate, completion: @escaping (_ data: ConversionProductReport?, _ error: Error?) -> Void)
```

Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let conversionProductReportCreate = ConversionProductReportCreate(adGroupIds: ["adGroupIds_example"], campaignIds: ["campaignIds_example"], campaignObjectiveTypes: [ConversionObjectiveType()], clickWindowDays: ConversionAttributionWindowDays(), columns: [ConversionProductReportingColumn()], conversionProductAttributionType: ConversionProductAttributionType(), conversionProductBreakdown: ConversionProductReportBreakdownType(), conversionReportTime: ConversionReportTimeType(), endDate: "endDate_example", granularity: ConversionProductReportGranularity(), level: ConversionProductReportLevel(), productSkuIds: ["productSkuIds_example"], reportName: "reportName_example", startDate: "startDate_example", viewWindowDays: nil) // ConversionProductReportCreate | 

// Create a request for a brand, category, SKU report
AdAccountsAPI.analyticsCreateConversionProductReport(adAccountId: adAccountId, conversionProductReportCreate: conversionProductReportCreate) { (response, error) in
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
 **conversionProductReportCreate** | [**ConversionProductReportCreate**](ConversionProductReportCreate.md) |  | 

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateMmmReport**
```swift
    open class func analyticsCreateMmmReport(adAccountId: String, mMMReportCreate: MMMReportCreate, completion: @escaping (_ data: MMMReport?, _ error: Error?) -> Void)
```

Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let mMMReportCreate = MMMReportCreate(advertiserIds: ["advertiserIds_example"], columns: [MMMReportingColumn()], countries: [TargetingAdvertiserCountry()], customColumnIds: ["customColumnIds_example"], endDate: "endDate_example", granularity: MMMReportGranularity(), level: MMMReportLevel(), reportName: "reportName_example", startDate: "startDate_example", targetingTypes: [MMMReportingTargetingType()]) // MMMReportCreate | 

// Create a request for a Marketing Mix Modeling (MMM) report
AdAccountsAPI.analyticsCreateMmmReport(adAccountId: adAccountId, mMMReportCreate: mMMReportCreate) { (response, error) in
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
 **adAccountId** | **String** |  | 
 **mMMReportCreate** | [**MMMReportCreate**](MMMReportCreate.md) |  | 

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsCreateReport**
```swift
    open class func analyticsCreateReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest, completion: @escaping (_ data: AdsAnalyticsCreateAsyncResponse?, _ error: Error?) -> Void)
```

Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let adsAnalyticsCreateAsyncRequest = AdsAnalyticsCreateAsyncRequest(adGroupIds: ["adGroupIds_example"], adGroupStatuses: [AdGroupSummaryStatus()], adIds: ["adIds_example"], adStatuses: [PinPromotionSummaryStatus()], attributionTypes: [ConversionReportAttributionType()], campaignBrandLabel: "campaignBrandLabel_example", campaignCustomLabel: "campaignCustomLabel_example", campaignIds: ["campaignIds_example"], campaignObjectiveTypes: [CampaignObjectiveType()], campaignStatuses: [CampaignSummaryStatus()], clickWindowDays: ConversionAttributionWindowDays(), columns: [ReportingColumnAsync()], combineTargetingTypes: false, conversionReportTime: ConversionReportTimeType(), customConversionEventMetrics: [CustomConversionEventMetrics(customEventMetricsType: AdeColumnType(), customEventName: "customEventName_example")], endDate: "endDate_example", endHour: 123, engagementWindowDays: nil, granularity: Granularity(), level: MetricsReportingLevel(), metricsFilters: [AdsAnalyticsMetricsFilter(field: AdsAnalyticsFilterColumn(), _operator: AdsAnalyticsFilterOperator(), values: [123])], primarySort: PrimarySort(), productGroupIds: ["productGroupIds_example"], productGroupStatuses: [ProductGroupSummaryStatus()], productItemIds: ["productItemIds_example"], reportFormat: DataOutputFormat(), reportingTimezone: ReportingTimeZone(), startDate: "startDate_example", startHour: 123, targetingTypes: [AdAdsAnalyticsAsyncTargetingTypes()], viewWindowDays: nil) // AdsAnalyticsCreateAsyncRequest | 

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

# **analyticsCreateTemplateReport**
```swift
    open class func analyticsCreateTemplateReport(adAccountId: String, templateId: String, startDate: Date? = nil, endDate: Date? = nil, granularity: Granularity? = nil, completion: @escaping (_ data: TemplateBasedReport?, _ error: Error?) -> Void)
```

Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let templateId = "templateId_example" // String | Unique identifier of a template.
let startDate = Date() // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
let endDate = Date() // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
let granularity = Granularity() // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (optional)

// Create async request for an analytics report using a template
AdAccountsAPI.analyticsCreateTemplateReport(adAccountId: adAccountId, templateId: templateId, startDate: startDate, endDate: endDate, granularity: granularity) { (response, error) in
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
 **adAccountId** | **String** |  | 
 **templateId** | **String** | Unique identifier of a template. | 
 **startDate** | **Date** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] 
 **endDate** | **Date** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] 
 **granularity** | [**Granularity**](.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] 

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetConversionProductReport**
```swift
    open class func analyticsGetConversionProductReport(adAccountId: String, token: String, completion: @escaping (_ data: ConversionProductReport?, _ error: Error?) -> Void)
```

Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let token = "token_example" // String | Token returned from the post request creation call

// Get advertiser brand, category, SKU report
AdAccountsAPI.analyticsGetConversionProductReport(adAccountId: adAccountId, token: token) { (response, error) in
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

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetMmmReport**
```swift
    open class func analyticsGetMmmReport(adAccountId: String, token: String, completion: @escaping (_ data: MMMReport?, _ error: Error?) -> Void)
```

Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let token = "token_example" // String | Token returned from the post request creation call

// Get advertiser Marketing Mix Modeling (MMM) report.
AdAccountsAPI.analyticsGetMmmReport(adAccountId: adAccountId, token: token) { (response, error) in
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
 **adAccountId** | **String** |  | 
 **token** | **String** | Token returned from the post request creation call | 

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyticsGetReport**
```swift
    open class func analyticsGetReport(adAccountId: String, token: String, completion: @escaping (_ data: AdsAnalyticsGetAsyncResponse?, _ error: Error?) -> Void)
```

Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

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

# **sandboxDelete**
```swift
    open class func sandboxDelete(adAccountId: String, completion: @escaping (_ data: String?, _ error: Error?) -> Void)
```

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Delete ads data for ad account in API Sandbox
AdAccountsAPI.sandboxDelete(adAccountId: adAccountId) { (response, error) in
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

**String**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templatesList**
```swift
    open class func templatesList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, completion: @escaping (_ data: TemplatesList200Response?, _ error: Error?) -> Void)
```

List templates

Gets all Templates associated with an ad account ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

// List templates
AdAccountsAPI.templatesList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order) { (response, error) in
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

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsApi.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsApi.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsApi.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateConversionProductReport**](AdAccountsApi.md#analyticsCreateConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analyticsCreateMmmReport**](AdAccountsApi.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsApi.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetConversionProductReport**](AdAccountsApi.md#analyticsGetConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analyticsGetMmmReport**](AdAccountsApi.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](AdAccountsApi.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](AdAccountsApi.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates



## adAccountAnalytics

> List&lt;AdAccountAnalyticsItems&gt; adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)

Get ad account analytics

  Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
List<ReportingColumnSync> columns = null; // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
Granularity granularity = null; // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
String adAccountId = null; // String | Unique identifier of an ad account.
BigDecimal clickWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
BigDecimal engagementWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
BigDecimal viewWindowDays = 1; // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
String conversionReportTime = TIME_OF_AD_ACTION; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
ReportingTimeZone reportingTimezone = null; // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    List<AdAccountAnalyticsItems> result = apiInstance.adAccountAnalytics(startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#adAccountAnalytics");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **clickWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]

### Return type

[**List&lt;AdAccountAnalyticsItems&gt;**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountTargetingAnalyticsGet

> MetricsResponse adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
List<AdsAnalyticsAccountTargetingType> targetingTypes = null; // List<AdsAnalyticsAccountTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
List<ReportingColumnSync> columns = null; // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
Granularity granularity = null; // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
BigDecimal clickWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
BigDecimal engagementWindowDays = 30; // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
BigDecimal viewWindowDays = 1; // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
String conversionReportTime = TIME_OF_AD_ACTION; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
List<ConversionReportAttributionType> attributionTypes = null; // List<ConversionReportAttributionType> | List of types of attribution for the conversion report
ReportingTimeZone reportingTimezone = null; // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    MetricsResponse result = apiInstance.adAccountTargetingAnalyticsGet(adAccountId, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#adAccountTargetingAnalyticsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targetingTypes** | [**List&lt;AdsAnalyticsAccountTargetingType&gt;**](AdsAnalyticsAccountTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH]
 **clickWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **engagementWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60]
 **viewWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60]
 **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION]
 **attributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] [default to null]
 **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsCreate

> AdAccount adAccountsCreate(adAccountCreate)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
AdAccountCreate adAccountCreate = new AdAccountCreate(); // AdAccountCreate | 
try {
    AdAccount result = apiInstance.adAccountsCreate(adAccountCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#adAccountsCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreate** | [**AdAccountCreate**](AdAccountCreate.md)|  |

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## adAccountsGet

> AdAccount adAccountsGet(adAccountId)

Get ad account

Get an ad account

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | 
try {
    AdAccount result = apiInstance.adAccountsGet(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#adAccountsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adAccountsList

> AdAccountsList200Response adAccountsList(includeSharedAccounts, bookmark, pageSize)

List ad accounts

Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
Boolean includeSharedAccounts = true; // Boolean | Include shared ad accounts
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
try {
    AdAccountsList200Response result = apiInstance.adAccountsList(includeSharedAccounts, bookmark, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#adAccountsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSharedAccounts** | **Boolean**| Include shared ad accounts | [optional] [default to true]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analyticsCreateConversionProductReport

> ConversionProductReport analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate)

Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
ConversionProductReportCreate conversionProductReportCreate = new ConversionProductReportCreate(); // ConversionProductReportCreate | 
try {
    ConversionProductReport result = apiInstance.analyticsCreateConversionProductReport(adAccountId, conversionProductReportCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsCreateConversionProductReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **conversionProductReportCreate** | [**ConversionProductReportCreate**](ConversionProductReportCreate.md)|  |

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analyticsCreateMmmReport

> MMMReport analyticsCreateMmmReport(adAccountId, mMMReportCreate)

Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | 
MMMReportCreate mMMReportCreate = new MMMReportCreate(); // MMMReportCreate | 
try {
    MMMReport result = apiInstance.analyticsCreateMmmReport(adAccountId, mMMReportCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsCreateMmmReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **mMMReportCreate** | [**MMMReportCreate**](MMMReportCreate.md)|  |

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analyticsCreateReport

> AdsAnalyticsCreateAsyncResponse analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new AdsAnalyticsCreateAsyncRequest(); // AdsAnalyticsCreateAsyncRequest | 
try {
    AdsAnalyticsCreateAsyncResponse result = apiInstance.analyticsCreateReport(adAccountId, adsAnalyticsCreateAsyncRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsCreateReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  |

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## analyticsCreateTemplateReport

> TemplateBasedReport analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity)

Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | 
String templateId = null; // String | Unique identifier of a template.
Date startDate = null; // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
Date endDate = null; // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
Granularity granularity = null; // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
try {
    TemplateBasedReport result = apiInstance.analyticsCreateTemplateReport(adAccountId, templateId, startDate, endDate, granularity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsCreateTemplateReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **templateId** | **String**| Unique identifier of a template. | [default to null]
 **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] [default to null]
 **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] [default to null]
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] [default to null] [enum: TOTAL, DAY, HOUR, WEEK, MONTH]

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analyticsGetConversionProductReport

> ConversionProductReport analyticsGetConversionProductReport(adAccountId, token)

Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String token = null; // String | Token returned from the post request creation call
try {
    ConversionProductReport result = apiInstance.analyticsGetConversionProductReport(adAccountId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsGetConversionProductReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **token** | **String**| Token returned from the post request creation call | [default to null]

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analyticsGetMmmReport

> MMMReport analyticsGetMmmReport(adAccountId, token)

Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | 
String token = null; // String | Token returned from the post request creation call
try {
    MMMReport result = apiInstance.analyticsGetMmmReport(adAccountId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsGetMmmReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | [default to null]
 **token** | **String**| Token returned from the post request creation call | [default to null]

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## analyticsGetReport

> AdsAnalyticsGetAsyncResponse analyticsGetReport(adAccountId, token)

Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String token = null; // String | Token returned from the post request creation call
try {
    AdsAnalyticsGetAsyncResponse result = apiInstance.analyticsGetReport(adAccountId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#analyticsGetReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **token** | **String**| Token returned from the post request creation call | [default to null]

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## sandboxDelete

> String sandboxDelete(adAccountId)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
try {
    String result = apiInstance.sandboxDelete(adAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#sandboxDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]

### Return type

**String**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## templatesList

> TemplatesList200Response templatesList(adAccountId, bookmark, pageSize, order)

List templates

Gets all Templates associated with an ad account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdAccountsApi;

AdAccountsApi apiInstance = new AdAccountsApi();
String adAccountId = null; // String | Unique identifier of an ad account.
String bookmark = null; // String | Cursor used to fetch the next page of items
Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
PinterestLibPaginationOrder order = null; // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
try {
    TemplatesList200Response result = apiInstance.templatesList(adAccountId, bookmark, pageSize, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdAccountsApi#templatesList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING]

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adGroupsAnalytics**](AdGroupsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**adGroupsAudienceSizing**](AdGroupsApi.md#adGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**adGroupsBidFloorGet**](AdGroupsApi.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**adGroupsCreate**](AdGroupsApi.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**adGroupsDynamicTitlesDownloadCsv**](AdGroupsApi.md#adGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL |
| [**adGroupsDynamicTitlesGetStatus**](AdGroupsApi.md#adGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status |
| [**adGroupsDynamicTitlesGetUploadUrl**](AdGroupsApi.md#adGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL |
| [**adGroupsDynamicTitlesProcessCsv**](AdGroupsApi.md#adGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV |
| [**adGroupsGet**](AdGroupsApi.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**adGroupsList**](AdGroupsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**adGroupsTargetingAnalyticsGet**](AdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**adGroupsUpdate**](AdGroupsApi.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
| [**getAdGroupsByPromotionIdsList**](AdGroupsApi.md#getAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs. |


## Creating AdGroupsApi

To initiate an instance of `AdGroupsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AdGroupsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AdGroupsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AdGroupsApi adGroupsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adGroupsAnalytics"></a>
# **adGroupsAnalytics**
```java
Mono<List<AdGroupsAnalyticsMetrics>> AdGroupsApi.adGroupsAnalytics(startDateendDateadGroupIdscolumnsgranularityadAccountIdclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeaggregateReportRowsreportingTimezone)
```

Get ad group analytics

Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **clickWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
| **aggregateReportRows** | `Boolean`| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional parameter] [default to `false`] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`] |


### Return type
[**List&lt;AdGroupsAnalyticsMetrics&gt;**](AdGroupsAnalyticsMetrics.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsAudienceSizing"></a>
# **adGroupsAudienceSizing**
```java
Mono<AdGroupAudienceSizing> AdGroupsApi.adGroupsAudienceSizing(adAccountIdadGroupAudienceSizingCreate)
```

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupAudienceSizingCreate** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md)|  | |


### Return type
[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adGroupsBidFloorGet"></a>
# **adGroupsBidFloorGet**
```java
Mono<BidFloor> AdGroupsApi.adGroupsBidFloorGet(adAccountIdbidFloorCreate)
```

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bidFloorCreate** | [**BidFloorCreate**](BidFloorCreate.md)|  | |


### Return type
[**BidFloor**](BidFloor.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adGroupsCreate"></a>
# **adGroupsCreate**
```java
Mono<AdGroupsCreate200Response> AdGroupsApi.adGroupsCreate(adAccountIdadGroupCreateCreate)
```

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupCreateCreate** | [**List&lt;@Valid AdGroupCreateCreate&gt;**](AdGroupCreateCreate.md)|  | |


### Return type
[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adGroupsDynamicTitlesDownloadCsv"></a>
# **adGroupsDynamicTitlesDownloadCsv**
```java
Mono<DynamicTitlesDownloadCSV> AdGroupsApi.adGroupsDynamicTitlesDownloadCsv(adAccountIdadGroupId)
```

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupId** | `String`| Ad group ID. | |


### Return type
[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsDynamicTitlesGetStatus"></a>
# **adGroupsDynamicTitlesGetStatus**
```java
Mono<DynamicTitlesGetStatus> AdGroupsApi.adGroupsDynamicTitlesGetStatus(adAccountIdadGroupId)
```

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupId** | `String`| Ad group ID. | |


### Return type
[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsDynamicTitlesGetUploadUrl"></a>
# **adGroupsDynamicTitlesGetUploadUrl**
```java
Mono<DynamicTitlesUploadURL> AdGroupsApi.adGroupsDynamicTitlesGetUploadUrl(adAccountIdadGroupId)
```

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupId** | `String`| Ad group ID. | |


### Return type
[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsDynamicTitlesProcessCsv"></a>
# **adGroupsDynamicTitlesProcessCsv**
```java
Mono<DynamicTitlesProcessCSV> AdGroupsApi.adGroupsDynamicTitlesProcessCsv(adAccountIdadGroupIddynamicTitlesProcessCSVCreate)
```

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupId** | `String`| Ad group ID. | |
| **dynamicTitlesProcessCSVCreate** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md)|  | |


### Return type
[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adGroupsGet"></a>
# **adGroupsGet**
```java
Mono<AdGroup> AdGroupsApi.adGroupsGet(adGroupIdadAccountId)
```

Get ad group

Get a specific ad group given the ad group ID.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adGroupId** | `String`| Ad group ID. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**AdGroup**](AdGroup.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsList"></a>
# **adGroupsList**
```java
Mono<AdGroupsList200Response> AdGroupsApi.adGroupsList(adAccountIdbookmarkpageSizeordercampaignIdsadGroupIdsentityStatusestranslateInterestsToNames)
```

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter] |
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional parameter] |
| **entityStatuses** | [**List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional parameter] [default to `ACTIVE,PAUSED`] |
| **translateInterestsToNames** | `Boolean`| Return interests as text names (if value is true) rather than topic IDs. | [optional parameter] [default to `false`] |


### Return type
[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsTargetingAnalyticsGet"></a>
# **adGroupsTargetingAnalyticsGet**
```java
Mono<MetricsResponse> AdGroupsApi.adGroupsTargetingAnalyticsGet(adAccountIdadGroupIdsstartDateendDatetargetingTypescolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeattributionTypesreportingTimezonesortColumnssortAscending)
```

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | |
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targetingTypes** | [**List&lt;AdsAnalyticsAdGroupTargetingType&gt;**](AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **clickWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
| **attributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional parameter] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`] |
| **sortColumns** | [**List&lt;String&gt;**](String.md)| Sort Columns. | [optional parameter] |
| **sortAscending** | `Boolean`| Sort ascending. | [optional parameter] |


### Return type
[**MetricsResponse**](MetricsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adGroupsUpdate"></a>
# **adGroupsUpdate**
```java
Mono<AdGroupsCreate200Response> AdGroupsApi.adGroupsUpdate(adAccountIdadGroupUpdateBatchUpdate)
```

Update ad groups

Update multiple existing ad groups.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adGroupUpdateBatchUpdate** | [**List&lt;@Valid AdGroupUpdateBatchUpdate&gt;**](AdGroupUpdateBatchUpdate.md)|  | |


### Return type
[**AdGroupsCreate200Response**](AdGroupsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getAdGroupsByPromotionIdsList"></a>
# **getAdGroupsByPromotionIdsList**
```java
Mono<AdGroupsList200Response> AdGroupsApi.getAdGroupsByPromotionIdsList(adAccountIdpromotionIdsbookmarkpageSizeorder)
```

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **promotionIds** | [**List&lt;String&gt;**](String.md)| List of Promotion IDs to use to filter the results. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |


### Return type
[**AdGroupsList200Response**](AdGroupsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`


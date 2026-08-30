# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPreviewsCreate**](AdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**adTargetingAnalyticsGet**](AdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**adsAnalytics**](AdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**adsCreate**](AdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**adsGet**](AdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**adsList**](AdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**adsUpdate**](AdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| [**campaignAdPreviewCreate**](AdsApi.md#campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
| [**campaignAdPreviewDelete**](AdsApi.md#campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
| [**campaignAdPreviewRead**](AdsApi.md#campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |


## Creating AdsApi

To initiate an instance of `AdsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AdsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AdsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AdsApi adsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="adPreviewsCreate"></a>
# **adPreviewsCreate**
```java
Mono<AdPreviewURLResponse> AdsApi.adPreviewsCreate(adAccountIdadPreviewRequest)
```

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | |


### Return type
[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adTargetingAnalyticsGet"></a>
# **adTargetingAnalyticsGet**
```java
Mono<MetricsResponse> AdsApi.adTargetingAnalyticsGet(adAccountIdadIdsstartDateendDatetargetingTypescolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeattributionTypesreportingTimezonesortColumnssortAscending)
```

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Ad Ids to use to filter the results. | |
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targetingTypes** | [**List&lt;AdsAnalyticsAdTargetingType&gt;**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **clickWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | [**ConversionReportTimeType**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
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

<a id="adsAnalytics"></a>
# **adsAnalytics**
```java
Mono<List<AdsAnalytics>> AdsApi.adsAnalytics(startDateendDatecolumnsgranularityadAccountIdpinIdsadIdsclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimecampaignIdsreportingTimezone)
```

Get ad analytics

    Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **pinIds** | [**List&lt;String&gt;**](String.md)| List of Pin IDs. | [optional parameter] |
| **adIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Ad Ids to use to filter the results. | [optional parameter] |
| **clickWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`] |


### Return type
[**List&lt;AdsAnalytics&gt;**](AdsAnalytics.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adsCreate"></a>
# **adsCreate**
```java
Mono<AdBatchWriteResponseModel> AdsApi.adsCreate(adAccountIdadCreate)
```

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adCreate** | [**List&lt;@Valid AdCreate&gt;**](AdCreate.md)|  | |


### Return type
[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="adsGet"></a>
# **adsGet**
```java
Mono<Ad> AdsApi.adsGet(adIdadAccountId)
```

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adId** | `String`| The ID of this ad. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**Ad**](Ad.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adsList"></a>
# **adsList**
```java
Mono<AdsList200Response> AdsApi.adsList(adAccountIdbookmarkpageSizeordercampaignIdsadGroupIdsadIdsentityStatuses)
```

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter] |
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional parameter] |
| **adIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Ad Ids to use to filter the results. | [optional parameter] |
| **entityStatuses** | [**List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional parameter] [default to `ACTIVE,PAUSED`] |


### Return type
[**AdsList200Response**](AdsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="adsUpdate"></a>
# **adsUpdate**
```java
Mono<AdBatchWriteResponseModel> AdsApi.adsUpdate(adAccountIdadBatchUpdate)
```

Update ads

Update multiple existing ads

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **adBatchUpdate** | [**List&lt;@Valid AdBatchUpdate&gt;**](AdBatchUpdate.md)|  | |


### Return type
[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="campaignAdPreviewCreate"></a>
# **campaignAdPreviewCreate**
```java
Mono<List<CampaignAdPreviewCreate200ResponseInner>> AdsApi.campaignAdPreviewCreate(adAccountIdcampaignAdPreviewCreate)
```

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **campaignAdPreviewCreate** | [**List&lt;@Valid CampaignAdPreviewCreate&gt;**](CampaignAdPreviewCreate.md)|  | |


### Return type
[**List&lt;CampaignAdPreviewCreate200ResponseInner&gt;**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="campaignAdPreviewDelete"></a>
# **campaignAdPreviewDelete**
```java
Mono<List<CampaignAdPreviewDelete200ResponseInner>> AdsApi.campaignAdPreviewDelete(adGroupIdsadAccountId)
```

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**List&lt;CampaignAdPreviewDelete200ResponseInner&gt;**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="campaignAdPreviewRead"></a>
# **campaignAdPreviewRead**
```java
Mono<List<CampaignAdPreview>> AdsApi.campaignAdPreviewRead(adGroupIdsadAccountId)
```

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | |
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**List&lt;CampaignAdPreview&gt;**](CampaignAdPreview.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`


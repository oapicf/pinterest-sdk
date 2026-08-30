# CampaignsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CampaignsController.java](../../src/main/java/org/openapitools/controller/CampaignsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPinsAnalytics**](#adPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaignTargetingAnalyticsGet**](#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaignsAnalytics**](#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsCreate**](#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaignsGet**](#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaignsList**](#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaignsUpdate**](#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**getCampaignDeliveryEstimates**](#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates

<a id="adPinsAnalytics"></a>
# **adPinsAnalytics**
```java
Mono<List<AdPinAnalytics>> CampaignsController.adPinsAnalytics(campaignIdpinIdsstartDateendDatecolumnsgranularityadAccountIdclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `String` | Campaign Id to use to filter the results. |
**pinIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](../../docs/models/String.md) | List of Pin IDs. |
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**columns** | [**List&lt;ReportingColumnSync&gt;**](../../docs/models/ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**granularity** | [**Granularity**](../../docs/models/.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
**adAccountId** | `String` | Unique identifier of an ad account. |
**clickWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**engagementWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**viewWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**conversionReportTime** | `String` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]

### Return type
[**List&lt;AdPinAnalytics&gt;**](../../docs/models/AdPinAnalytics.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="campaignTargetingAnalyticsGet"></a>
# **campaignTargetingAnalyticsGet**
```java
Mono<MetricsResponse> CampaignsController.campaignTargetingAnalyticsGet(adAccountIdcampaignIdsstartDateendDatetargetingTypescolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeattributionTypesreportingTimezone)
```

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Campaign Ids to use to filter the results. |
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**targetingTypes** | [**List&lt;AdsAnalyticsCampaignTargetingType&gt;**](../../docs/models/AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
**columns** | [**List&lt;ReportingColumnSync&gt;**](../../docs/models/ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**granularity** | [**Granularity**](../../docs/models/.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
**clickWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**engagementWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**viewWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**conversionReportTime** | `String` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]
**attributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](../../docs/models/ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional parameter]
**reportingTimezone** | [**ReportingTimeZone**](../../docs/models/.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`]

### Return type
[**MetricsResponse**](../../docs/models/MetricsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="campaignsAnalytics"></a>
# **campaignsAnalytics**
```java
Mono<List<CampaignsAnalyticsMetrics>> CampaignsController.campaignsAnalytics(startDateendDatecampaignIdscolumnsgranularityadAccountIdclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimeaggregateReportRowsreportingTimezone)
```

Get campaign analytics

Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Campaign Ids to use to filter the results. |
**columns** | [**List&lt;ReportingColumnSync&gt;**](../../docs/models/ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**granularity** | [**Granularity**](../../docs/models/.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
**adAccountId** | `String` | Unique identifier of an ad account. |
**clickWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**engagementWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**viewWindowDays** | `BigDecimal` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`]
**conversionReportTime** | `String` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]
**aggregateReportRows** | `Boolean` | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional parameter] [default to `false`]
**reportingTimezone** | [**ReportingTimeZone**](../../docs/models/.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`]

### Return type
[**List&lt;CampaignsAnalyticsMetrics&gt;**](../../docs/models/CampaignsAnalyticsMetrics.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="campaignsCreate"></a>
# **campaignsCreate**
```java
Mono<CampaignBatchWriteResponseModel> CampaignsController.campaignsCreate(adAccountIdcampaignCreateItem)
```

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignCreateItem** | [**List&lt;@Valid CampaignCreateItem&gt;**](../../docs/models/CampaignCreateItem.md) |  |

### Return type
[**CampaignBatchWriteResponseModel**](../../docs/models/CampaignBatchWriteResponseModel.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="campaignsGet"></a>
# **campaignsGet**
```java
Mono<Campaign> CampaignsController.campaignsGet(campaignIdadAccountId)
```

Get campaign

Get a specific campaign given the campaign ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `String` | Campaign ID, must be associated with the ad account ID provided in the path. |
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**Campaign**](../../docs/models/Campaign.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="campaignsList"></a>
# **campaignsList**
```java
Mono<CampaignsList200Response> CampaignsController.campaignsList(adAccountIdbookmarkpageSizeordercampaignIdsentityStatuses)
```

List campaigns

Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]
**order** | [**PinterestLibPaginationOrder**](../../docs/models/.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
**campaignIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)@Size(max &#x3D; 18)String&gt;**](../../docs/models/String.md) | List of Campaign Ids to use to filter the results. | [optional parameter]
**entityStatuses** | [**List&lt;EntityStatus&gt;**](../../docs/models/EntityStatus.md) | Entity status | [optional parameter] [default to `ACTIVE,PAUSED`]

### Return type
[**CampaignsList200Response**](../../docs/models/CampaignsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="campaignsUpdate"></a>
# **campaignsUpdate**
```java
Mono<CampaignBatchWriteResponseModel> CampaignsController.campaignsUpdate(adAccountIdcampaignBatchUpdateItem)
```

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignBatchUpdateItem** | [**List&lt;@Valid CampaignBatchUpdateItem&gt;**](../../docs/models/CampaignBatchUpdateItem.md) |  |

### Return type
[**CampaignBatchWriteResponseModel**](../../docs/models/CampaignBatchWriteResponseModel.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getCampaignDeliveryEstimates"></a>
# **getCampaignDeliveryEstimates**
```java
Mono<CampaignDeliveryEstimatesResponse> CampaignsController.getCampaignDeliveryEstimates(adAccountIdcampaignDeliveryEstimatesCampaign)
```

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**campaignDeliveryEstimatesCampaign** | [**List&lt;@Valid CampaignDeliveryEstimatesCampaign&gt;**](../../docs/models/CampaignDeliveryEstimatesCampaign.md) |  |

### Return type
[**CampaignDeliveryEstimatesResponse**](../../docs/models/CampaignDeliveryEstimatesResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`


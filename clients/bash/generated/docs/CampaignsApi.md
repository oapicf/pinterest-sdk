# CampaignsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPinsAnalytics**](CampaignsApi.md#adPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaignTargetingAnalyticsGet**](CampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaignsAnalytics**](CampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsCreate**](CampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaignsList**](CampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaignsUpdate**](CampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**getCampaignDeliveryEstimates**](CampaignsApi.md#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates



## adPinsAnalytics

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified 'ad_account_id', filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days.
- If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example

```bash
 adPinsAnalytics  campaign_id=value  Specify as:  pin_ids=value1 pin_ids=value2 pin_ids=...  start_date=value  end_date=value  Specify as:  columns="value1,value2,..."  granularity=value ad_account_id=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **string** | Campaign Id to use to filter the results. | [default to null]
 **pinIds** | [**array[string]**](string.md) | List of Pin IDs. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]

### Return type

[**array[AdPinAnalytics]**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignTargetingAnalyticsGet

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 campaignTargetingAnalyticsGet ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  start_date=value  end_date=value  Specify as:  targeting_types="value1,value2,..."  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  Specify as:  attribution_types="value1,value2,..."  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targetingTypes** | [**array[AdsAnalyticsCampaignTargetingType]**](AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **attributionTypes** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to null]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsAnalytics

Get campaign analytics

Get analytics for the specified campaigns in the specified 'ad_account_id', filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
- If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
- If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 campaignsAnalytics  start_date=value  end_date=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  columns="value1,value2,..."  granularity=value ad_account_id=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  aggregate_report_rows=value  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **aggregateReportRows** | **boolean** | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**array[CampaignsAnalyticsMetrics]**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsCreate

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id
and houses one or more ad groups, which contain one or more ads.

For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).

**Note:**
- The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.

A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:

- $1 = 1,000,000 microdollars
- 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:

- To convert dollars to microdollars, multiply dollars by 1,000,000
- To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```bash
 campaignsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignCreateItem** | [**array[CampaignCreateItem]**](CampaignCreateItem.md) |  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsGet

Get campaign

Get a specific campaign given the campaign ID.

### Example

```bash
 campaignsGet campaign_id=value ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **string** | Campaign ID, must be associated with the ad account ID provided in the path. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsList

List campaigns

Get a list of the campaigns in the specified 'ad_account_id', filtered by the specified options.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary
roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```bash
 campaignsList ad_account_id=value  bookmark=value  page_size=value  order=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID.
Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[EntityStatus]**](EntityStatus.md) | Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignsUpdate

Update campaigns

Update multiple ad campaigns based on campaign_ids.

**Note:**
- The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).

Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.

A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.

**Equivalency equations**, using dollars as an example currency:

- $1 = 1,000,000 microdollars
- 1 microdollar = $0.000001

**To convert between currency and microcurrency**, using dollars as an example currency:

- To convert dollars to microdollars, multiply dollars by 1,000,000
- To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```bash
 campaignsUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignBatchUpdateItem** | [**array[CampaignBatchUpdateItem]**](CampaignBatchUpdateItem.md) |  |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignDeliveryEstimates

Get campaign delivery estimates

Get delivery estimates for an ads campaign

**This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example

```bash
 getCampaignDeliveryEstimates ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignDeliveryEstimatesCampaign** | [**array[CampaignDeliveryEstimatesCampaign]**](CampaignDeliveryEstimatesCampaign.md) |  |

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


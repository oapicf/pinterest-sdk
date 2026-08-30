# AdsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](AdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](AdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](AdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](AdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](AdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](AdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](AdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaignAdPreviewCreate**](AdsApi.md#campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaignAdPreviewDelete**](AdsApi.md#campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaignAdPreviewRead**](AdsApi.md#campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups



## adPreviewsCreate

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.

If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)

You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example

```bash
 adPreviewsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adPreviewRequest** | [**AdPreviewRequest**](AdPreviewRequest.md) |  |

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adTargetingAnalyticsGet

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 adTargetingAnalyticsGet ad_account_id=value  Specify as:  ad_ids=value1 ad_ids=value2 ad_ids=...  start_date=value  end_date=value  Specify as:  targeting_types="value1,value2,..."  Specify as:  columns="value1,value2,..."  granularity=value  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  Specify as:  attribution_types="value1,value2,..."  reporting_timezone=value  Specify as:  sort_columns=value1 sort_columns=value2 sort_columns=...  sort_ascending=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adIds** | [**array[string]**](string.md) | List of Ad Ids to use to filter the results. | [default to null]
 **startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [default to null]
 **endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [default to null]
 **targetingTypes** | [**array[AdsAnalyticsAdTargetingType]**](AdsAnalyticsAdTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [default to null]
 **columns** | [**array[ReportingColumnSync]**](ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.

For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).

If a column has no value, it may not be returned. | [default to null]
 **granularity** | [**Granularity**](.md) | TOTAL - metrics are aggregated over the specified date range.

  DAY - metrics are broken down daily.

  HOUR - metrics are broken down hourly.

  WEEK - metrics are broken down weekly.

  MONTH - metrics are broken down monthly | [default to null]
 **clickWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to null]
 **engagementWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to null]
 **viewWindowDays** | [**ConversionAttributionWindowDays**](.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to null]
 **conversionReportTime** | [**ConversionReportTimeType**](.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to null]
 **attributionTypes** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to null]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]
 **sortColumns** | [**array[string]**](string.md) | Sort Columns. | [optional] [default to null]
 **sortAscending** | **boolean** | Sort ascending. | [optional] [default to null]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsAnalytics

Get ad analytics

Get analytics for the specified ads in the specified 'ad_account_id', filtered by the specified options.
    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    - The request must contain either ad_ids or both campaign_ids and pin_ids.
    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```bash
 adsAnalytics  start_date=value  end_date=value  Specify as:  columns="value1,value2,..."  granularity=value ad_account_id=value  Specify as:  pin_ids=value1 pin_ids=value2 pin_ids=...  Specify as:  ad_ids=value1 ad_ids=value2 ad_ids=...  click_window_days=value  engagement_window_days=value  view_window_days=value  conversion_report_time=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  reporting_timezone=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
 **pinIds** | [**array[string]**](string.md) | List of Pin IDs. | [optional] [default to null]
 **adIds** | [**array[string]**](string.md) | List of Ad Ids to use to filter the results. | [optional] [default to null]
 **clickWindowDays** | **integer** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. | [optional] [default to 30]
 **engagementWindowDays** | **integer** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '30' days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **integer** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to '1' day. | [optional] [default to 1]
 **conversionReportTime** | **string** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **reportingTimezone** | [**ReportingTimeZone**](.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [default to null]

### Return type

[**array[AdsAnalytics]**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsCreate

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

```bash
 adsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adCreate** | [**array[AdCreate]**](AdCreate.md) |  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsGet

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example

```bash
 adsGet ad_id=value ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adId** | **string** | The ID of this ad. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsList

List ads

List ads that meet the filters provided:
    - Listed campaign ids or ad group ids or ad ids
    - Listed entity statuses

If no filter is provided, all ads in the ad account are returned.

**Note:**
Provide only 'campaign_id' or 'ad_group_id' or 'ad_id'. Do not provide more than one type.

Review status is provided for each ad; if 'review_status' is 'REJECTED', the 'rejected_reasons' field will contain additional information.

For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example

```bash
 adsList ad_account_id=value  bookmark=value  page_size=value  order=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=...  Specify as:  ad_ids=value1 ad_ids=value2 ad_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...
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
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] [default to null]
 **adIds** | [**array[string]**](string.md) | List of Ad Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[EntityStatus]**](EntityStatus.md) | Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**AdsList200Response**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsUpdate

Update ads

Update multiple existing ads

### Example

```bash
 adsUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adBatchUpdate** | [**array[AdBatchUpdate]**](AdBatchUpdate.md) |  |

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignAdPreviewCreate

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared.
Each ad group is processed independently; individual failures do not block other previews.

### Example

```bash
 campaignAdPreviewCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignAdPreviewCreate** | [**array[CampaignAdPreviewCreate]**](CampaignAdPreviewCreate.md) |  |

### Return type

[**array[CampaignAdPreviewCreate200ResponseInner]**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignAdPreviewDelete

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups.
All ad groups are validated before deleting any records.

### Example

```bash
 campaignAdPreviewDelete  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=... ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to use to filter the results. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**array[CampaignAdPreviewDelete200ResponseInner]**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaignAdPreviewRead

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups.
Returns all active previews associated with the provided ad group IDs.

### Example

```bash
 campaignAdPreviewRead  Specify as:  ad_group_ids=value1 ad_group_ids=value2 ad_group_ids=... ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupIds** | [**array[string]**](string.md) | List of Ad group Ids to use to filter the results. | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**array[CampaignAdPreview]**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


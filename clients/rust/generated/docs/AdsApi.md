# \AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_slash_create**](AdsApi.md#ad_previews_slash_create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_slash_get**](AdsApi.md#ad_targeting_analytics_slash_get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_slash_analytics**](AdsApi.md#ads_slash_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_slash_create**](AdsApi.md#ads_slash_create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_slash_get**](AdsApi.md#ads_slash_get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_slash_list**](AdsApi.md#ads_slash_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_slash_update**](AdsApi.md#ads_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaign_ad_preview_slash_create**](AdsApi.md#campaign_ad_preview_slash_create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaign_ad_preview_slash_delete**](AdsApi.md#campaign_ad_preview_slash_delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaign_ad_preview_slash_read**](AdsApi.md#campaign_ad_preview_slash_read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups



## ad_previews_slash_create

> models::AdPreviewUrlResponse ad_previews_slash_create(ad_account_id, ad_preview_request)
Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md) |  | [required] |

### Return type

[**models::AdPreviewUrlResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ad_targeting_analytics_slash_get

> models::MetricsResponse ad_targeting_analytics_slash_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending)
Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_ids** | [**Vec<String>**](String.md) | List of Ad Ids to use to filter the results. | [required] |
**start_date** | **chrono::NaiveDate** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **chrono::NaiveDate** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**targeting_types** | [**Vec<models::AdsAnalyticsAdTargetingType>**](Models__AdsAnalyticsAdTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [required] |
**columns** | [**Vec<models::ReportingColumnSync>**](Models__ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [required] |
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [required] |
**click_window_days** | Option<[**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |
**engagement_window_days** | Option<[**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. |  |
**view_window_days** | Option<[**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |
**conversion_report_time** | Option<[**ConversionReportTimeType**](ConversionReportTimeType.md)> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |
**attribution_types** | Option<[**Vec<models::ConversionReportAttributionType>**](Models__ConversionReportAttributionType.md)> | List of types of attribution for the conversion report |  |
**reporting_timezone** | Option<[**ReportingTimeZone**](ReportingTimeZone.md)> | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. |  |
**sort_columns** | Option<[**Vec<String>**](String.md)> | Sort Columns. |  |
**sort_ascending** | Option<**bool**> | Sort ascending. |  |

### Return type

[**models::MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ads_slash_analytics

> Vec<models::AdsAnalytics> ads_slash_analytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids, ad_ids, click_window_days, engagement_window_days, view_window_days, conversion_report_time, campaign_ids, reporting_timezone)
Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **chrono::NaiveDate** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **chrono::NaiveDate** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**columns** | [**Vec<models::ReportingColumnSync>**](Models__ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [required] |
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**pin_ids** | Option<[**Vec<String>**](String.md)> | List of Pin IDs. |  |
**ad_ids** | Option<[**Vec<String>**](String.md)> | List of Ad Ids to use to filter the results. |  |
**click_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. |  |[default to 30]
**view_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]
**campaign_ids** | Option<[**Vec<String>**](String.md)> | List of Campaign Ids to use to filter the results. |  |
**reporting_timezone** | Option<[**ReportingTimeZone**](ReportingTimeZone.md)> | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. |  |

### Return type

[**Vec<models::AdsAnalytics>**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ads_slash_create

> models::AdBatchWriteResponseModel ads_slash_create(ad_account_id, ad_create)
Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_create** | [**Vec<models::AdCreate>**](AdCreate.md) |  | [required] |

### Return type

[**models::AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ads_slash_get

> models::Ad ads_slash_get(ad_id, ad_account_id)
Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_id** | **String** | The ID of this ad. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ads_slash_list

> models::AdsList200Response ads_slash_list(ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, ad_ids, entity_statuses)
List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**campaign_ids** | Option<[**Vec<String>**](String.md)> | List of Campaign Ids to use to filter the results. |  |
**ad_group_ids** | Option<[**Vec<String>**](String.md)> | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. |  |
**ad_ids** | Option<[**Vec<String>**](String.md)> | List of Ad Ids to use to filter the results. |  |
**entity_statuses** | Option<[**Vec<models::EntityStatus>**](Models__EntityStatus.md)> | Entity status |  |[default to ["ACTIVE","PAUSED"]]

### Return type

[**models::AdsList200Response**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ads_slash_update

> models::AdBatchWriteResponseModel ads_slash_update(ad_account_id, ad_batch_update)
Update ads

Update multiple existing ads

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**ad_batch_update** | [**Vec<models::AdBatchUpdate>**](AdBatchUpdate.md) |  | [required] |

### Return type

[**models::AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaign_ad_preview_slash_create

> Vec<models::CampaignAdPreviewCreate200ResponseInner> campaign_ad_preview_slash_create(ad_account_id, campaign_ad_preview_create)
Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_ad_preview_create** | [**Vec<models::CampaignAdPreviewCreate>**](CampaignAdPreviewCreate.md) |  | [required] |

### Return type

[**Vec<models::CampaignAdPreviewCreate200ResponseInner>**](campaign_ad_preview_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaign_ad_preview_slash_delete

> Vec<models::CampaignAdPreviewDelete200ResponseInner> campaign_ad_preview_slash_delete(ad_group_ids, ad_account_id)
Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_group_ids** | [**Vec<String>**](String.md) | List of Ad group Ids to use to filter the results. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**Vec<models::CampaignAdPreviewDelete200ResponseInner>**](campaign_ad_preview_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaign_ad_preview_slash_read

> Vec<models::CampaignAdPreview> campaign_ad_preview_slash_read(ad_group_ids, ad_account_id)
Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_group_ids** | [**Vec<String>**](String.md) | List of Ad group Ids to use to filter the results. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**Vec<models::CampaignAdPreview>**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


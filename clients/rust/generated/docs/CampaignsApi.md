# \CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_pins_slash_analytics**](CampaignsApi.md#ad_pins_slash_analytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaign_targeting_analytics_slash_get**](CampaignsApi.md#campaign_targeting_analytics_slash_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaigns_slash_analytics**](CampaignsApi.md#campaigns_slash_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_slash_create**](CampaignsApi.md#campaigns_slash_create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaigns_slash_get**](CampaignsApi.md#campaigns_slash_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaigns_slash_list**](CampaignsApi.md#campaigns_slash_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaigns_slash_update**](CampaignsApi.md#campaigns_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**get_campaign_delivery_estimates**](CampaignsApi.md#get_campaign_delivery_estimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates



## ad_pins_slash_analytics

> Vec<models::AdPinAnalytics> ad_pins_slash_analytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time)
Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**campaign_id** | **String** | Campaign Id to use to filter the results. | [required] |
**pin_ids** | [**Vec<String>**](String.md) | List of Pin IDs. | [required] |
**start_date** | **chrono::NaiveDate** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **chrono::NaiveDate** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**columns** | [**Vec<models::ReportingColumnSync>**](Models__ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [required] |
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**click_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. |  |[default to 30]
**view_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]

### Return type

[**Vec<models::AdPinAnalytics>**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaign_targeting_analytics_slash_get

> models::MetricsResponse campaign_targeting_analytics_slash_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone)
Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_ids** | [**Vec<String>**](String.md) | List of Campaign Ids to use to filter the results. | [required] |
**start_date** | **chrono::NaiveDate** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **chrono::NaiveDate** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**targeting_types** | [**Vec<models::AdsAnalyticsCampaignTargetingType>**](Models__AdsAnalyticsCampaignTargetingType.md) | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [required] |
**columns** | [**Vec<models::ReportingColumnSync>**](Models__ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [required] |
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [required] |
**click_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. |  |[default to 30]
**view_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]
**attribution_types** | Option<[**Vec<models::ConversionReportAttributionType>**](Models__ConversionReportAttributionType.md)> | List of types of attribution for the conversion report |  |
**reporting_timezone** | Option<[**ReportingTimeZone**](ReportingTimeZone.md)> | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. |  |

### Return type

[**models::MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaigns_slash_analytics

> Vec<models::CampaignsAnalyticsMetrics> campaigns_slash_analytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone)
Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**start_date** | **chrono::NaiveDate** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | [required] |
**end_date** | **chrono::NaiveDate** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | [required] |
**campaign_ids** | [**Vec<String>**](String.md) | List of Campaign Ids to use to filter the results. | [required] |
**columns** | [**Vec<models::ReportingColumnSync>**](Models__ReportingColumnSync.md) | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | [required] |
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**click_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. |  |[default to 30]
**engagement_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. |  |[default to 30]
**view_window_days** | Option<**f64**> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. |  |[default to 1]
**conversion_report_time** | Option<**String**> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  |[default to TIME_OF_AD_ACTION]
**aggregate_report_rows** | Option<**bool**> | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. |  |[default to false]
**reporting_timezone** | Option<[**ReportingTimeZone**](ReportingTimeZone.md)> | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. |  |

### Return type

[**Vec<models::CampaignsAnalyticsMetrics>**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaigns_slash_create

> models::CampaignBatchWriteResponseModel campaigns_slash_create(ad_account_id, campaign_create_item)
Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_create_item** | [**Vec<models::CampaignCreateItem>**](CampaignCreateItem.md) |  | [required] |

### Return type

[**models::CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaigns_slash_get

> models::Campaign campaigns_slash_get(campaign_id, ad_account_id)
Get campaign

Get a specific campaign given the campaign ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**campaign_id** | **String** | Campaign ID, must be associated with the ad account ID provided in the path. | [required] |
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaigns_slash_list

> models::CampaignsList200Response campaigns_slash_list(ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses)
List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]
**order** | Option<[**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)> | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**campaign_ids** | Option<[**Vec<String>**](String.md)> | List of Campaign Ids to use to filter the results. |  |
**entity_statuses** | Option<[**Vec<models::EntityStatus>**](Models__EntityStatus.md)> | Entity status |  |[default to ["ACTIVE","PAUSED"]]

### Return type

[**models::CampaignsList200Response**](campaigns_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## campaigns_slash_update

> models::CampaignBatchWriteResponseModel campaigns_slash_update(ad_account_id, campaign_batch_update_item)
Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_batch_update_item** | [**Vec<models::CampaignBatchUpdateItem>**](CampaignBatchUpdateItem.md) |  | [required] |

### Return type

[**models::CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_campaign_delivery_estimates

> models::CampaignDeliveryEstimatesResponse get_campaign_delivery_estimates(ad_account_id, campaign_delivery_estimates_campaign)
Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_delivery_estimates_campaign** | [**Vec<models::CampaignDeliveryEstimatesCampaign>**](CampaignDeliveryEstimatesCampaign.md) |  | [required] |

### Return type

[**models::CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


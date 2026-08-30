# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_pins_analytics**](CampaignsApi.md#ad_pins_analytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**campaign_targeting_analytics_get**](CampaignsApi.md#campaign_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**campaigns_analytics**](CampaignsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_create**](CampaignsApi.md#campaigns_create) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**campaigns_get**](CampaignsApi.md#campaigns_get) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**campaigns_list**](CampaignsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**campaigns_update**](CampaignsApi.md#campaigns_update) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**get_campaign_delivery_estimates**](CampaignsApi.md#get_campaign_delivery_estimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates


# **ad_pins_analytics**
> `ad_pins_analytics`(req::`HTTP.Request`, `campaign_id`::`String`, `pin_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing,) -> `Vector{AdPinAnalytics}`

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`campaign_id`** | **`String`**| Campaign Id to use to filter the results. |
**`pin_ids`** | [**`Vector{String}`**](String.md)| List of Pin IDs. |
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**`Vector{AdPinAnalytics}`**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_targeting_analytics_get**
> `campaign_targeting_analytics_get`(req::`HTTP.Request`, `ad_account_id`::`String`, `campaign_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `targeting_types`::`Vector{AdsAnalyticsCampaignTargetingType}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `attribution_types`=nothing, `reporting_timezone`=nothing,) -> `MetricsResponse`

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`campaign_ids`** | [**`Vector{String}`**](String.md)| List of Campaign Ids to use to filter the results. |
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`targeting_types`** | [**`Vector{AdsAnalyticsCampaignTargetingType}`**](AdsAnalyticsCampaignTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`attribution_types`** | [**`Vector{ConversionReportAttributionType}`**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [default to nothing]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]

### Return type

[**`MetricsResponse`**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> `campaigns_analytics`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`, `campaign_ids`::`Vector{String}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `aggregate_report_rows`=nothing, `reporting_timezone`=nothing,) -> `Vector{CampaignsAnalyticsMetrics}`

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`campaign_ids`** | [**`Vector{String}`**](String.md)| List of Campaign Ids to use to filter the results. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`aggregate_report_rows`** | **`Bool`**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [default to false]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]

### Return type

[**`Vector{CampaignsAnalyticsMetrics}`**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_create**
> `campaigns_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `campaign_create_item`::`Vector{CampaignCreateItem}`;) -> `CampaignBatchWriteResponseModel`

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`campaign_create_item`** | [**`Vector{CampaignCreateItem}`**](CampaignCreateItem.md)|  |

### Return type

[**`CampaignBatchWriteResponseModel`**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_get**
> `campaigns_get`(req::`HTTP.Request`, `campaign_id`::`String`, `ad_account_id`::`String`;) -> `Campaign`

Get campaign

Get a specific campaign given the campaign ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`campaign_id`** | **`String`**| Campaign ID, must be associated with the ad account ID provided in the path. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Campaign`**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> `campaigns_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `campaign_ids`=nothing, `entity_statuses`=nothing,) -> `CampaignsList200Response`

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`campaign_ids`** | [**`Vector{String}`**](String.md)| List of Campaign Ids to use to filter the results. | [default to nothing]
 **`entity_statuses`** | [**`Vector{EntityStatus}`**](EntityStatus.md)| Entity status | [default to nothing]

### Return type

[**`CampaignsList200Response`**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_update**
> `campaigns_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `campaign_batch_update_item`::`Vector{CampaignBatchUpdateItem}`;) -> `CampaignBatchWriteResponseModel`

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`campaign_batch_update_item`** | [**`Vector{CampaignBatchUpdateItem}`**](CampaignBatchUpdateItem.md)|  |

### Return type

[**`CampaignBatchWriteResponseModel`**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_delivery_estimates**
> `get_campaign_delivery_estimates`(req::`HTTP.Request`, `ad_account_id`::`String`, `campaign_delivery_estimates_campaign`::`Vector{CampaignDeliveryEstimatesCampaign}`;) -> `CampaignDeliveryEstimatesResponse`

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`campaign_delivery_estimates_campaign`** | [**`Vector{CampaignDeliveryEstimatesCampaign}`**](CampaignDeliveryEstimatesCampaign.md)|  |

### Return type

[**`CampaignDeliveryEstimatesResponse`**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


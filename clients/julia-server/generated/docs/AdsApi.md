# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_create**](AdsApi.md#ad_previews_create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_get**](AdsApi.md#ad_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_analytics**](AdsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_create**](AdsApi.md#ads_create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_get**](AdsApi.md#ads_get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_list**](AdsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_update**](AdsApi.md#ads_update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaign_ad_preview_create**](AdsApi.md#campaign_ad_preview_create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaign_ad_preview_delete**](AdsApi.md#campaign_ad_preview_delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaign_ad_preview_read**](AdsApi.md#campaign_ad_preview_read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **ad_previews_create**
> `ad_previews_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_preview_request`::`AdPreviewRequest`;) -> `AdPreviewURLResponse`

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_preview_request`** | [**`AdPreviewRequest`**](AdPreviewRequest.md)|  |

### Return type

[**`AdPreviewURLResponse`**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_targeting_analytics_get**
> `ad_targeting_analytics_get`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `targeting_types`::`Vector{AdsAnalyticsAdTargetingType}`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`; `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `attribution_types`=nothing, `reporting_timezone`=nothing, `sort_columns`=nothing, `sort_ascending`=nothing,) -> `MetricsResponse`

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_ids`** | [**`Vector{String}`**](String.md)| List of Ad Ids to use to filter the results. |
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`targeting_types`** | [**`Vector{AdsAnalyticsAdTargetingType}`**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`click_window_days`** | [**`ConversionAttributionWindowDays`**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to nothing]
 **`engagement_window_days`** | [**`ConversionAttributionWindowDays`**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to nothing]
 **`view_window_days`** | [**`ConversionAttributionWindowDays`**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to nothing]
 **`conversion_report_time`** | [**`ConversionReportTimeType`**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to nothing]
 **`attribution_types`** | [**`Vector{ConversionReportAttributionType}`**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [default to nothing]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]
 **`sort_columns`** | [**`Vector{String}`**](String.md)| Sort Columns. | [default to nothing]
 **`sort_ascending`** | **`Bool`**| Sort ascending. | [default to nothing]

### Return type

[**`MetricsResponse`**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> `ads_analytics`(req::`HTTP.Request`, `start_date`::`Date`, `end_date`::`Date`, `columns`::`Vector{ReportingColumnSync}`, `granularity`::`Granularity`, `ad_account_id`::`String`; `pin_ids`=nothing, `ad_ids`=nothing, `click_window_days`=nothing, `engagement_window_days`=nothing, `view_window_days`=nothing, `conversion_report_time`=nothing, `campaign_ids`=nothing, `reporting_timezone`=nothing,) -> `Vector{AdsAnalytics}`

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`start_date`** | **`Date`**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`columns`** | [**`Vector{ReportingColumnSync}`**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
**`granularity`** | [**`Granularity`**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`pin_ids`** | [**`Vector{String}`**](String.md)| List of Pin IDs. | [default to nothing]
 **`ad_ids`** | [**`Vector{String}`**](String.md)| List of Ad Ids to use to filter the results. | [default to nothing]
 **`click_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [default to 30]
 **`engagement_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [default to 30]
 **`view_window_days`** | **`Float64`**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [default to 1]
 **`conversion_report_time`** | **`String`**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [default to &quot;TIME_OF_AD_ACTION&quot;]
 **`campaign_ids`** | [**`Vector{String}`**](String.md)| List of Campaign Ids to use to filter the results. | [default to nothing]
 **`reporting_timezone`** | [**`ReportingTimeZone`**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [default to nothing]

### Return type

[**`Vector{AdsAnalytics}`**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_create**
> `ads_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_create`::`Vector{AdCreate}`;) -> `AdBatchWriteResponseModel`

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_create`** | [**`Vector{AdCreate}`**](AdCreate.md)|  |

### Return type

[**`AdBatchWriteResponseModel`**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_get**
> `ads_get`(req::`HTTP.Request`, `ad_id`::`String`, `ad_account_id`::`String`;) -> `Ad`

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_id`** | **`String`**| The ID of this ad. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Ad`**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> `ads_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `campaign_ids`=nothing, `ad_group_ids`=nothing, `ad_ids`=nothing, `entity_statuses`=nothing,) -> `AdsList200Response`

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

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
 **`ad_group_ids`** | [**`Vector{String}`**](String.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [default to nothing]
 **`ad_ids`** | [**`Vector{String}`**](String.md)| List of Ad Ids to use to filter the results. | [default to nothing]
 **`entity_statuses`** | [**`Vector{EntityStatus}`**](EntityStatus.md)| Entity status | [default to nothing]

### Return type

[**`AdsList200Response`**](AdsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_update**
> `ads_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `ad_batch_update`::`Vector{AdBatchUpdate}`;) -> `AdBatchWriteResponseModel`

Update ads

Update multiple existing ads

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`ad_batch_update`** | [**`Vector{AdBatchUpdate}`**](AdBatchUpdate.md)|  |

### Return type

[**`AdBatchWriteResponseModel`**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_create**
> `campaign_ad_preview_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `campaign_ad_preview_create_param`::`Vector{CampaignAdPreviewCreate}`;) -> `Vector{CampaignAdPreviewCreate200ResponseInner}`

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`campaign_ad_preview_create_param`** | [**`Vector{CampaignAdPreviewCreate}`**](CampaignAdPreviewCreate.md)|  |

### Return type

[**`Vector{CampaignAdPreviewCreate200ResponseInner}`**](CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_delete**
> `campaign_ad_preview_delete`(req::`HTTP.Request`, `ad_group_ids`::`Vector{String}`, `ad_account_id`::`String`;) -> `Vector{CampaignAdPreviewDelete200ResponseInner}`

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_group_ids`** | [**`Vector{String}`**](String.md)| List of Ad group Ids to use to filter the results. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Vector{CampaignAdPreviewDelete200ResponseInner}`**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_read**
> `campaign_ad_preview_read`(req::`HTTP.Request`, `ad_group_ids`::`Vector{String}`, `ad_account_id`::`String`;) -> `Vector{CampaignAdPreview}`

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_group_ids`** | [**`Vector{String}`**](String.md)| List of Ad group Ids to use to filter the results. |
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`Vector{CampaignAdPreview}`**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdPreviewsCreate**](AdsApi.md#AdPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**AdTargetingAnalyticsGet**](AdsApi.md#AdTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**AdsAnalytics**](AdsApi.md#AdsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**AdsCreate**](AdsApi.md#AdsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**AdsGet**](AdsApi.md#AdsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**AdsList**](AdsApi.md#AdsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**AdsUpdate**](AdsApi.md#AdsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**CampaignAdPreviewCreate**](AdsApi.md#CampaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**CampaignAdPreviewDelete**](AdsApi.md#CampaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**CampaignAdPreviewRead**](AdsApi.md#CampaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **AdPreviewsCreate**
> AdPreviewURLResponse AdPreviewsCreate(ad_account_id, ad_preview_request)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example
```R
library(openapi)

# Create ad preview with pin or image
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_preview_request <- AdPreviewRequest$new("image_url_example", "title_example", AdShoppingPreviewCreativeType$new(), "pin_id_example", "catalog_product_group_id_example", "promotion_id_example", CustomizableCTAType$new(), "hero_image_title_example", "hero_image_url_example", "hero_pin_id_example", "image_tag_example", "item_id_example", BasePreferredMediaType$new(), "show_promotion_example", "video_tag_example") # AdPreviewRequest | 

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdPreviewsCreate(var_ad_account_id, var_ad_preview_requestdata_file = "result.txt")
result <- api_instance$AdPreviewsCreate(var_ad_account_id, var_ad_preview_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdTargetingAnalyticsGet**
> MetricsResponse AdTargetingAnalyticsGet(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days = var.click_window_days, engagement_window_days = var.engagement_window_days, view_window_days = var.view_window_days, conversion_report_time = var.conversion_report_time, attribution_types = var.attribution_types, reporting_timezone = var.reporting_timezone, sort_columns = var.sort_columns, sort_ascending = var.sort_ascending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get targeting analytics for ads
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_ids <- c("inner_example") # array[character] | List of Ad Ids to use to filter the results.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_targeting_types <- c(AdsAnalyticsAdTargetingType$new()) # array[AdsAnalyticsAdTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_click_window_days <- ConversionAttributionWindowDays$new() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- ConversionAttributionWindowDays$new() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- ConversionAttributionWindowDays$new() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- ConversionReportTimeType$new() # ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_attribution_types <- c(ConversionReportAttributionType$new()) # array[ConversionReportAttributionType] | List of types of attribution for the conversion report (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)
var_sort_columns <- c("inner_example") # array[character] | Sort Columns. (Optional)
var_sort_ascending <- "sort_ascending_example" # character | Sort ascending. (Optional)

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdTargetingAnalyticsGet(var_ad_account_id, var_ad_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezone, sort_columns = var_sort_columns, sort_ascending = var_sort_ascendingdata_file = "result.txt")
result <- api_instance$AdTargetingAnalyticsGet(var_ad_account_id, var_ad_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezone, sort_columns = var_sort_columns, sort_ascending = var_sort_ascending)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_ids** | list( **character** )| List of Ad Ids to use to filter the results. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | list( [**AdsAnalyticsAdTargetingType**](AdsAnalyticsAdTargetingType.md) )| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
 **engagement_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
 **view_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
 **conversion_report_time** | [**ConversionReportTimeType**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
 **attribution_types** | list( [**ConversionReportAttributionType**](ConversionReportAttributionType.md) )| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sort_columns** | list( **character** )| Sort Columns. | [optional] 
 **sort_ascending** | **character**| Sort ascending. | [optional] 

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdsAnalytics**
> array[AdsAnalytics] AdsAnalytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids = var.pin_ids, ad_ids = var.ad_ids, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", campaign_ids = var.campaign_ids, reporting_timezone = var.reporting_timezone)

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get ad analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_pin_ids <- c("inner_example") # array[character] | List of Pin IDs. (Optional)
var_ad_ids <- c("inner_example") # array[character] | List of Ad Ids to use to filter the results. (Optional)
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsAnalytics(var_start_date, var_end_date, var_columns, var_granularity, var_ad_account_id, pin_ids = var_pin_ids, ad_ids = var_ad_ids, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, campaign_ids = var_campaign_ids, reporting_timezone = var_reporting_timezonedata_file = "result.txt")
result <- api_instance$AdsAnalytics(var_start_date, var_end_date, var_columns, var_granularity, var_ad_account_id, pin_ids = var_pin_ids, ad_ids = var_ad_ids, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, campaign_ids = var_campaign_ids, reporting_timezone = var_reporting_timezone)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **pin_ids** | list( **character** )| List of Pin IDs. | [optional] 
 **ad_ids** | list( **character** )| List of Ad Ids to use to filter the results. | [optional] 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**array[AdsAnalytics]**](AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdsCreate**
> AdBatchWriteResponseModel AdsCreate(ad_account_id, ad_create)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example
```R
library(openapi)

# Create ads
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_create <- c(AdCreate$new("ad_group_id_example", CreativeType$new(), "pin_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", "collection_items_destination_url_template_example", AdCollectionsHeaderType$new(), CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_carting_example", "is_collage_accepted_terms_example", "is_collage_single_destination_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", QuizPinData$new(c(QuizPinQuestion$new(c(QuizPinOption$new(123, "text_example")), 123, "question_text_example")), c(QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123)), QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123), TieBreakerType$new()), EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), "view_tracking_url_example")) # array[AdCreate] | 

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsCreate(var_ad_account_id, var_ad_createdata_file = "result.txt")
result <- api_instance$AdsCreate(var_ad_account_id, var_ad_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_create** | list( [**AdCreate**](AdCreate.md) )|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdsGet**
> Ad AdsGet(ad_id, ad_account_id)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example
```R
library(openapi)

# Get ad
#
# prepare function argument(s)
var_ad_id <- "ad_id_example" # character | The ID of this ad.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsGet(var_ad_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$AdsGet(var_ad_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_id** | **character**| The ID of this ad. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**Ad**](Ad.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdsList**
> AdsList200Response AdsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, campaign_ids = var.campaign_ids, ad_group_ids = var.ad_group_ids, ad_ids = var.ad_ids, entity_statuses = ["ACTIVE","PAUSED"])

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example
```R
library(openapi)

# List ads
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (Optional)
var_ad_ids <- c("inner_example") # array[character] | List of Ad Ids to use to filter the results. (Optional)
var_entity_statuses <- c(EntityStatus$new()) # array[EntityStatus] | Entity status (Optional)

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, ad_group_ids = var_ad_group_ids, ad_ids = var_ad_ids, entity_statuses = var_entity_statusesdata_file = "result.txt")
result <- api_instance$AdsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, ad_group_ids = var_ad_group_ids, ad_ids = var_ad_ids, entity_statuses = var_entity_statuses)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | list( **character** )| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **ad_ids** | list( **character** )| List of Ad Ids to use to filter the results. | [optional] 
 **entity_statuses** | list( [**EntityStatus**](EntityStatus.md) )| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**AdsList200Response**](ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AdsUpdate**
> AdBatchWriteResponseModel AdsUpdate(ad_account_id, ad_batch_update)

Update ads

Update multiple existing ads

### Example
```R
library(openapi)

# Update ads
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_batch_update <- c(AdBatchUpdate$new("id_example", "ad_group_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", "collection_items_destination_url_template_example", AdCollectionsHeaderType$new(), CreativeType$new(), CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_carting_example", "is_collage_accepted_terms_example", "is_collage_single_destination_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", "pin_id_example", QuizPinData$new(c(QuizPinQuestion$new(c(QuizPinOption$new(123, "text_example")), 123, "question_text_example")), c(QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123)), QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123), TieBreakerType$new()), EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), "view_tracking_url_example")) # array[AdBatchUpdate] | 

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsUpdate(var_ad_account_id, var_ad_batch_updatedata_file = "result.txt")
result <- api_instance$AdsUpdate(var_ad_account_id, var_ad_batch_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_batch_update** | list( [**AdBatchUpdate**](AdBatchUpdate.md) )|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CampaignAdPreviewCreate**
> array[CampaignAdPreviewCreate200ResponseInner] CampaignAdPreviewCreate(ad_account_id, campaign_ad_preview_create)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example
```R
library(openapi)

# Create ad preview records for one or more ad groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_ad_preview_create <- c(CampaignAdPreviewCreate$new("ad_group_id_example")) # array[CampaignAdPreviewCreate] | 

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignAdPreviewCreate(var_ad_account_id, var_campaign_ad_preview_createdata_file = "result.txt")
result <- api_instance$CampaignAdPreviewCreate(var_ad_account_id, var_campaign_ad_preview_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_ad_preview_create** | list( [**CampaignAdPreviewCreate**](CampaignAdPreviewCreate.md) )|  | 

### Return type

[**array[CampaignAdPreviewCreate200ResponseInner]**](campaign_ad_preview_create_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CampaignAdPreviewDelete**
> array[CampaignAdPreviewDelete200ResponseInner] CampaignAdPreviewDelete(ad_group_ids, ad_account_id)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example
```R
library(openapi)

# Delete ad preview records for one or more ad groups
#
# prepare function argument(s)
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignAdPreviewDelete(var_ad_group_ids, var_ad_account_iddata_file = "result.txt")
result <- api_instance$CampaignAdPreviewDelete(var_ad_group_ids, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | list( **character** )| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**array[CampaignAdPreviewDelete200ResponseInner]**](campaign_ad_preview_delete_200_response_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CampaignAdPreviewRead**
> array[CampaignAdPreview] CampaignAdPreviewRead(ad_group_ids, ad_account_id)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example
```R
library(openapi)

# Fetch ad preview records for one or more ad groups
#
# prepare function argument(s)
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AdsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignAdPreviewRead(var_ad_group_ids, var_ad_account_iddata_file = "result.txt")
result <- api_instance$CampaignAdPreviewRead(var_ad_group_ids, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | list( **character** )| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**array[CampaignAdPreview]**](CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |


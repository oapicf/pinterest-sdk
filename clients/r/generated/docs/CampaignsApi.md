# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdPinsAnalytics**](CampaignsApi.md#AdPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics
[**CampaignTargetingAnalyticsGet**](CampaignsApi.md#CampaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns
[**CampaignsAnalytics**](CampaignsApi.md#CampaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**CampaignsCreate**](CampaignsApi.md#CampaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns
[**CampaignsGet**](CampaignsApi.md#CampaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign
[**CampaignsList**](CampaignsApi.md#CampaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**CampaignsUpdate**](CampaignsApi.md#CampaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns
[**GetCampaignDeliveryEstimates**](CampaignsApi.md#GetCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates


# **AdPinsAnalytics**
> array[AdPinAnalytics] AdPinsAnalytics(campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION")

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example
```R
library(openapi)

# Get pins analytics
#
# prepare function argument(s)
var_campaign_id <- "campaign_id_example" # character | Campaign Id to use to filter the results.
var_pin_ids <- c("inner_example") # array[character] | List of Pin IDs.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdPinsAnalytics(var_campaign_id, var_pin_ids, var_start_date, var_end_date, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_timedata_file = "result.txt")
result <- api_instance$AdPinsAnalytics(var_campaign_id, var_pin_ids, var_start_date, var_end_date, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **character**| Campaign Id to use to filter the results. | 
 **pin_ids** | list( **character** )| List of Pin IDs. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**array[AdPinAnalytics]**](AdPinAnalytics.md)

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

# **CampaignTargetingAnalyticsGet**
> MetricsResponse CampaignTargetingAnalyticsGet(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", attribution_types = var.attribution_types, reporting_timezone = var.reporting_timezone)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get targeting analytics for campaigns
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_targeting_types <- c(AdsAnalyticsCampaignTargetingType$new()) # array[AdsAnalyticsCampaignTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_attribution_types <- c(ConversionReportAttributionType$new()) # array[ConversionReportAttributionType] | List of types of attribution for the conversion report (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignTargetingAnalyticsGet(var_ad_account_id, var_campaign_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezonedata_file = "result.txt")
result <- api_instance$CampaignTargetingAnalyticsGet(var_ad_account_id, var_campaign_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezone)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | list( [**AdsAnalyticsCampaignTargetingType**](AdsAnalyticsCampaignTargetingType.md) )| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **attribution_types** | list( [**ConversionReportAttributionType**](ConversionReportAttributionType.md) )| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

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

# **CampaignsAnalytics**
> array[CampaignsAnalyticsMetrics] CampaignsAnalytics(start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", aggregate_report_rows = FALSE, reporting_timezone = var.reporting_timezone)

Get campaign analytics

Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get campaign analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_aggregate_report_rows <- FALSE # character | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignsAnalytics(var_start_date, var_end_date, var_campaign_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, aggregate_report_rows = var_aggregate_report_rows, reporting_timezone = var_reporting_timezonedata_file = "result.txt")
result <- api_instance$CampaignsAnalytics(var_start_date, var_end_date, var_campaign_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, aggregate_report_rows = var_aggregate_report_rows, reporting_timezone = var_reporting_timezone)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **aggregate_report_rows** | **character**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to FALSE]
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**array[CampaignsAnalyticsMetrics]**](CampaignsAnalyticsMetrics.md)

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

# **CampaignsCreate**
> CampaignBatchWriteResponseModel CampaignsCreate(ad_account_id, campaign_create_item)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```R
library(openapi)

# Create campaigns
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_create_item <- c(CampaignCreateItem$new("name_example", ConversionObjectiveType$new(), "ad_account_id_example", "app_id_example", MobileAppPlatform$new(), CampaignBidOptions$new(AgeBucketMultipliers$new(TargetingSpecAgeBucket$new()), AppTypeMultipliers$new(TargetingSpecAppType$new()), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), FreqBidMultiplierTimeWindow$new(), FrequencyMultipliers$new("IMPRESSION_COUNT_example"), GenderMultipliers$new(TargetingSpecGender$new()), PlacementMultipliers$new(PlacementType$new())), 123, 123, 123, IntendedPromotionType$new(), "is_automated_campaign_example", "is_campaign_budget_optimization_example", "is_flexible_daily_budgets_example", "is_ltv_optimized_example", "is_performance_plus_example", "is_top_of_search_example", 123, "order_line_id_example", 123, EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")))) # array[CampaignCreateItem] | 

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignsCreate(var_ad_account_id, var_campaign_create_itemdata_file = "result.txt")
result <- api_instance$CampaignsCreate(var_ad_account_id, var_campaign_create_item)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_create_item** | list( [**CampaignCreateItem**](CampaignCreateItem.md) )|  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

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

# **CampaignsGet**
> Campaign CampaignsGet(campaign_id, ad_account_id)

Get campaign

Get a specific campaign given the campaign ID.

### Example
```R
library(openapi)

# Get campaign
#
# prepare function argument(s)
var_campaign_id <- "campaign_id_example" # character | Campaign ID, must be associated with the ad account ID provided in the path.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignsGet(var_campaign_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$CampaignsGet(var_campaign_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **character**| Campaign ID, must be associated with the ad account ID provided in the path. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**Campaign**](Campaign.md)

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

# **CampaignsList**
> CampaignsList200Response CampaignsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, campaign_ids = var.campaign_ids, entity_statuses = ["ACTIVE","PAUSED"])

List campaigns

Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example
```R
library(openapi)

# List campaigns
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_entity_statuses <- c(EntityStatus$new()) # array[EntityStatus] | Entity status (Optional)

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, entity_statuses = var_entity_statusesdata_file = "result.txt")
result <- api_instance$CampaignsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, entity_statuses = var_entity_statuses)
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
 **entity_statuses** | list( [**EntityStatus**](EntityStatus.md) )| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**CampaignsList200Response**](campaigns_list_200_response.md)

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

# **CampaignsUpdate**
> CampaignBatchWriteResponseModel CampaignsUpdate(ad_account_id, campaign_batch_update_item)

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example
```R
library(openapi)

# Update campaigns
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_batch_update_item <- c(CampaignBatchUpdateItem$new("id_example", "ad_account_id_example", "app_id_example", MobileAppPlatform$new(), CampaignBidOptionsUpdate$new(c(CampaignBidOptionsUpdateMaskItems$new()), AgeBucketMultipliers$new(TargetingSpecAgeBucket$new()), AppTypeMultipliers$new(TargetingSpecAppType$new()), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), FreqBidMultiplierTimeWindow$new(), FrequencyMultipliers$new("IMPRESSION_COUNT_example"), GenderMultipliers$new(TargetingSpecGender$new()), PlacementMultipliers$new(PlacementType$new())), 123, 123, 123, IntendedPromotionType$new(), "is_automated_campaign_example", "is_campaign_budget_optimization_example", "is_flexible_daily_budgets_example", "is_ltv_optimized_example", "is_performance_plus_example", "is_top_of_search_example", 123, "name_example", ConversionObjectiveType$new(), "order_line_id_example", PerformancePlusCampaignSettings$new("boost_prospecting_ad_group_bid_example", c("pinner_list_exclusions_example")), 123, EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")))) # array[CampaignBatchUpdateItem] | 

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CampaignsUpdate(var_ad_account_id, var_campaign_batch_update_itemdata_file = "result.txt")
result <- api_instance$CampaignsUpdate(var_ad_account_id, var_campaign_batch_update_item)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_batch_update_item** | list( [**CampaignBatchUpdateItem**](CampaignBatchUpdateItem.md) )|  | 

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

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

# **GetCampaignDeliveryEstimates**
> CampaignDeliveryEstimatesResponse GetCampaignDeliveryEstimates(ad_account_id, campaign_delivery_estimates_campaign)

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example
```R
library(openapi)

# Get campaign delivery estimates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_delivery_estimates_campaign <- c(CampaignDeliveryEstimatesCampaign$new(c(AdGroupDeliveryEstimates$new("auto_targeting_enabled_example", c(AdGroupAudienceSizingCreativeTypes$new()), c(AdGroupDeliveryEstimatesKeywordsItems$new(NullalbleMatchType$new(), "value_example")), 123, OptimizationGoalMetadata$new(ConversionTagV3GoalMetadata$new(AttributionWindows$new(..., ..., ...), ConversionEvent$new(), "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "reporting_event_example"), FrequencyGoalMetadata$new(123, FrequencyGoalMetadataTimerange$new()), ScrollupGoalMetadata$new("scrollup_goal_value_in_micro_currency_example")), OptimizationType$new(), PlacementGroupType$new(), c("product_group_ids_example"), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(...))), c(TargetingStrategy$new())))), BudgetDurationType$new(), DeliveryEstimateObjectiveType$new(), "start_date_example", 123, "end_date_example", 123)) # array[CampaignDeliveryEstimatesCampaign] | 

api_instance <- CampaignsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetCampaignDeliveryEstimates(var_ad_account_id, var_campaign_delivery_estimates_campaigndata_file = "result.txt")
result <- api_instance$GetCampaignDeliveryEstimates(var_ad_account_id, var_campaign_delivery_estimates_campaign)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_delivery_estimates_campaign** | list( [**CampaignDeliveryEstimatesCampaign**](CampaignDeliveryEstimatesCampaign.md) )|  | 

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

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
| **503** | The service is temporarily unavailable. |  -  |
| **0** | An unexpected error response. |  -  |


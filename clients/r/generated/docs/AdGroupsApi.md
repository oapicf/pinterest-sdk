# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdGroupsAnalytics**](AdGroupsApi.md#AdGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**AdGroupsAudienceSizing**](AdGroupsApi.md#AdGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**AdGroupsBidFloorGet**](AdGroupsApi.md#AdGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**AdGroupsCreate**](AdGroupsApi.md#AdGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**AdGroupsDynamicTitlesDownloadCsv**](AdGroupsApi.md#AdGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**AdGroupsDynamicTitlesGetStatus**](AdGroupsApi.md#AdGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**AdGroupsDynamicTitlesGetUploadUrl**](AdGroupsApi.md#AdGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**AdGroupsDynamicTitlesProcessCsv**](AdGroupsApi.md#AdGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**AdGroupsGet**](AdGroupsApi.md#AdGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**AdGroupsList**](AdGroupsApi.md#AdGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**AdGroupsTargetingAnalyticsGet**](AdGroupsApi.md#AdGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**AdGroupsUpdate**](AdGroupsApi.md#AdGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**GetAdGroupsByPromotionIdsList**](AdGroupsApi.md#GetAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


# **AdGroupsAnalytics**
> array[AdGroupsAnalyticsMetrics] AdGroupsAnalytics(start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", aggregate_report_rows = FALSE, reporting_timezone = var.reporting_timezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get ad group analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_aggregate_report_rows <- FALSE # character | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsAnalytics(var_start_date, var_end_date, var_ad_group_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, aggregate_report_rows = var_aggregate_report_rows, reporting_timezone = var_reporting_timezonedata_file = "result.txt")
result <- api_instance$AdGroupsAnalytics(var_start_date, var_end_date, var_ad_group_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, aggregate_report_rows = var_aggregate_report_rows, reporting_timezone = var_reporting_timezone)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **ad_group_ids** | list( **character** )| List of Ad group Ids to use to filter the results. | 
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

[**array[AdGroupsAnalyticsMetrics]**](AdGroupsAnalyticsMetrics.md)

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

# **AdGroupsAudienceSizing**
> AdGroupAudienceSizing AdGroupsAudienceSizing(ad_account_id, ad_group_audience_sizing_create)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example
```R
library(openapi)

# Get audience sizing
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_audience_sizing_create <- AdGroupAudienceSizingCreate$new("auto_targeting_enabled_example", c(AdGroupAudienceSizingCreativeTypes$new()), c(AdGroupAudienceSizingKeyword$new(MatchType$new(), "value_example")), AdgroupPlacementGroupType$new(), c("product_group_ids_example"), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new()))) # AdGroupAudienceSizingCreate | 

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsAudienceSizing(var_ad_account_id, var_ad_group_audience_sizing_createdata_file = "result.txt")
result <- api_instance$AdGroupsAudienceSizing(var_ad_account_id, var_ad_group_audience_sizing_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_audience_sizing_create** | [**AdGroupAudienceSizingCreate**](AdGroupAudienceSizingCreate.md)|  | 

### Return type

[**AdGroupAudienceSizing**](AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **AdGroupsBidFloorGet**
> BidFloor AdGroupsBidFloorGet(ad_account_id, bid_floor_create)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

### Example
```R
library(openapi)

# Get bid floors
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bid_floor_create <- BidFloorCreate$new(c(BidFloorSpec$new(ActionType$new(), Currency$new(), c(Country$new()), CreativeType$new(), BidFloorObjectiveType$new(), OptimizationGoalMetadata$new(ConversionTagV3GoalMetadata$new(AttributionWindows$new(123, 123, 123), ConversionEvent$new(), "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "reporting_event_example"), FrequencyGoalMetadata$new(123, FrequencyGoalMetadataTimerange$new()), ScrollupGoalMetadata$new("scrollup_goal_value_in_micro_currency_example")))), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new()))) # BidFloorCreate | 

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsBidFloorGet(var_ad_account_id, var_bid_floor_createdata_file = "result.txt")
result <- api_instance$AdGroupsBidFloorGet(var_ad_account_id, var_bid_floor_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bid_floor_create** | [**BidFloorCreate**](BidFloorCreate.md)|  | 

### Return type

[**BidFloor**](BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **AdGroupsCreate**
> AdGroupsCreate200Response AdGroupsCreate(ad_account_id, ad_group_create_create)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

### Example
```R
library(openapi)

# Create ad groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_create_create <- c(AdGroupCreateCreate$new(ActionType$new(), "campaign_id_example", "name_example", "auto_targeting_enabled_example", 123, 123, BidStrategyType$new(), 123, BudgetType$new(), "customer_segment_id_example", 123, AdgroupTrackingFeatures$new(c(AdgroupTrackingFeatureType$new())), "feed_profile_id_example", "is_creative_optimization_example", "is_local_inventory_example", 123, 123, NullableOptimizationGoalMetadata$new(ConversionTagV3GoalMetadata$new(AttributionWindows$new(123, 123, 123), ConversionEvent$new(), "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "reporting_event_example"), FrequencyGoalMetadata$new(123, FrequencyGoalMetadataTimerange$new()), ScrollupGoalMetadata$new("scrollup_goal_value_in_micro_currency_example")), PacingDeliveryType$new(), PerformancePlusCampaignSettings$new("boost_prospecting_ad_group_bid_example", c("pinner_list_exclusions_example")), PlacementGroupType$new(), PlacementTrafficType$new(), PromotionApplicationLevel$new(), "promotion_id_example", c("promotion_ids_example"), 123, EntityStatus$new(), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new())), c("targeting_template_ids_example"), AdGroupTrackingURLs$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")))) # array[AdGroupCreateCreate] | 

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsCreate(var_ad_account_id, var_ad_group_create_createdata_file = "result.txt")
result <- api_instance$AdGroupsCreate(var_ad_account_id, var_ad_group_create_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_create_create** | list( [**AdGroupCreateCreate**](AdGroupCreateCreate.md) )|  | 

### Return type

[**AdGroupsCreate200Response**](ad_groups_create_200_response.md)

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

# **AdGroupsDynamicTitlesDownloadCsv**
> DynamicTitlesDownloadCSV AdGroupsDynamicTitlesDownloadCsv(ad_account_id, ad_group_id)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

### Example
```R
library(openapi)

# Get dynamic titles CSV download URL
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_id <- "ad_group_id_example" # character | Ad group ID.

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsDynamicTitlesDownloadCsv(var_ad_account_id, var_ad_group_iddata_file = "result.txt")
result <- api_instance$AdGroupsDynamicTitlesDownloadCsv(var_ad_account_id, var_ad_group_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_id** | **character**| Ad group ID. | 

### Return type

[**DynamicTitlesDownloadCSV**](DynamicTitlesDownloadCSV.md)

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

# **AdGroupsDynamicTitlesGetStatus**
> DynamicTitlesGetStatus AdGroupsDynamicTitlesGetStatus(ad_account_id, ad_group_id)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

### Example
```R
library(openapi)

# Get dynamic titles status
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_id <- "ad_group_id_example" # character | Ad group ID.

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsDynamicTitlesGetStatus(var_ad_account_id, var_ad_group_iddata_file = "result.txt")
result <- api_instance$AdGroupsDynamicTitlesGetStatus(var_ad_account_id, var_ad_group_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_id** | **character**| Ad group ID. | 

### Return type

[**DynamicTitlesGetStatus**](DynamicTitlesGetStatus.md)

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

# **AdGroupsDynamicTitlesGetUploadUrl**
> DynamicTitlesUploadURL AdGroupsDynamicTitlesGetUploadUrl(ad_account_id, ad_group_id)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

### Example
```R
library(openapi)

# Get dynamic titles upload URL
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_id <- "ad_group_id_example" # character | Ad group ID.

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsDynamicTitlesGetUploadUrl(var_ad_account_id, var_ad_group_iddata_file = "result.txt")
result <- api_instance$AdGroupsDynamicTitlesGetUploadUrl(var_ad_account_id, var_ad_group_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_id** | **character**| Ad group ID. | 

### Return type

[**DynamicTitlesUploadURL**](DynamicTitlesUploadURL.md)

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

# **AdGroupsDynamicTitlesProcessCsv**
> DynamicTitlesProcessCSV AdGroupsDynamicTitlesProcessCsv(ad_account_id, ad_group_id, dynamic_titles_process_csv_create)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

### Example
```R
library(openapi)

# Process dynamic titles CSV
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_id <- "ad_group_id_example" # character | Ad group ID.
var_dynamic_titles_process_csv_create <- DynamicTitlesProcessCSVCreate$new("request_id_example") # DynamicTitlesProcessCSVCreate | 

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsDynamicTitlesProcessCsv(var_ad_account_id, var_ad_group_id, var_dynamic_titles_process_csv_createdata_file = "result.txt")
result <- api_instance$AdGroupsDynamicTitlesProcessCsv(var_ad_account_id, var_ad_group_id, var_dynamic_titles_process_csv_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_id** | **character**| Ad group ID. | 
 **dynamic_titles_process_csv_create** | [**DynamicTitlesProcessCSVCreate**](DynamicTitlesProcessCSVCreate.md)|  | 

### Return type

[**DynamicTitlesProcessCSV**](DynamicTitlesProcessCSV.md)

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

# **AdGroupsGet**
> AdGroup AdGroupsGet(ad_group_id, ad_account_id)

Get ad group

Get a specific ad group given the ad group ID.

### Example
```R
library(openapi)

# Get ad group
#
# prepare function argument(s)
var_ad_group_id <- "ad_group_id_example" # character | Ad group ID.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsGet(var_ad_group_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$AdGroupsGet(var_ad_group_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_id** | **character**| Ad group ID. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**AdGroup**](AdGroup.md)

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

# **AdGroupsList**
> AdGroupsList200Response AdGroupsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, campaign_ids = var.campaign_ids, ad_group_ids = var.ad_group_ids, entity_statuses = ["ACTIVE","PAUSED"], translate_interests_to_names = FALSE)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

### Example
```R
library(openapi)

# List ad groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (Optional)
var_entity_statuses <- c(EntityStatus$new()) # array[EntityStatus] | Entity status (Optional)
var_translate_interests_to_names <- FALSE # character | Return interests as text names (if value is true) rather than topic IDs. (Optional)

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, ad_group_ids = var_ad_group_ids, entity_statuses = var_entity_statuses, translate_interests_to_names = var_translate_interests_to_namesdata_file = "result.txt")
result <- api_instance$AdGroupsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, campaign_ids = var_campaign_ids, ad_group_ids = var_ad_group_ids, entity_statuses = var_entity_statuses, translate_interests_to_names = var_translate_interests_to_names)
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
 **entity_statuses** | list( [**EntityStatus**](EntityStatus.md) )| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **translate_interests_to_names** | **character**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to FALSE]

### Return type

[**AdGroupsList200Response**](ad_groups_list_200_response.md)

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

# **AdGroupsTargetingAnalyticsGet**
> MetricsResponse AdGroupsTargetingAnalyticsGet(ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", attribution_types = var.attribution_types, reporting_timezone = var.reporting_timezone, sort_columns = var.sort_columns, sort_ascending = var.sort_ascending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get targeting analytics for ad groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_ids <- c("inner_example") # array[character] | List of Ad group Ids to use to filter the results.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_targeting_types <- c(AdsAnalyticsAdGroupTargetingType$new()) # array[AdsAnalyticsAdGroupTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_attribution_types <- c(ConversionReportAttributionType$new()) # array[ConversionReportAttributionType] | List of types of attribution for the conversion report (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)
var_sort_columns <- c("inner_example") # array[character] | Sort Columns. (Optional)
var_sort_ascending <- "sort_ascending_example" # character | Sort ascending. (Optional)

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsTargetingAnalyticsGet(var_ad_account_id, var_ad_group_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezone, sort_columns = var_sort_columns, sort_ascending = var_sort_ascendingdata_file = "result.txt")
result <- api_instance$AdGroupsTargetingAnalyticsGet(var_ad_account_id, var_ad_group_ids, var_start_date, var_end_date, var_targeting_types, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, attribution_types = var_attribution_types, reporting_timezone = var_reporting_timezone, sort_columns = var_sort_columns, sort_ascending = var_sort_ascending)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_ids** | list( **character** )| List of Ad group Ids to use to filter the results. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | list( [**AdsAnalyticsAdGroupTargetingType**](AdsAnalyticsAdGroupTargetingType.md) )| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
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

# **AdGroupsUpdate**
> AdGroupsCreate200Response AdGroupsUpdate(ad_account_id, ad_group_update_batch_update)

Update ad groups

Update multiple existing ad groups.

### Example
```R
library(openapi)

# Update ad groups
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_group_update_batch_update <- c(AdGroupUpdateBatchUpdate$new("id_example", "auto_targeting_enabled_example", 123, 123, BidStrategyType$new(), ActionType$new(), 123, BudgetType$new(), "campaign_id_example", "customer_segment_id_example", 123, AdgroupTrackingFeatures$new(c(AdgroupTrackingFeatureType$new())), "feed_profile_id_example", "is_creative_optimization_example", "is_local_inventory_example", 123, 123, "name_example", NullableOptimizationGoalMetadata$new(ConversionTagV3GoalMetadata$new(AttributionWindows$new(123, 123, 123), ConversionEvent$new(), "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "reporting_event_example"), FrequencyGoalMetadata$new(123, FrequencyGoalMetadataTimerange$new()), ScrollupGoalMetadata$new("scrollup_goal_value_in_micro_currency_example")), PacingDeliveryType$new(), PerformancePlusCampaignSettings$new("boost_prospecting_ad_group_bid_example", c("pinner_list_exclusions_example")), PlacementGroupType$new(), PlacementTrafficType$new(), PromotionApplicationLevel$new(), "promotion_id_example", c("promotion_ids_example"), 123, EntityStatus$new(), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new())), c(TargetingSpecOperations$new("MINIMUM_AGE", "SET", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), "value_example")), c("targeting_template_ids_example"), AdGroupTrackingURLs$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")))) # array[AdGroupUpdateBatchUpdate] | 

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdGroupsUpdate(var_ad_account_id, var_ad_group_update_batch_updatedata_file = "result.txt")
result <- api_instance$AdGroupsUpdate(var_ad_account_id, var_ad_group_update_batch_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_group_update_batch_update** | list( [**AdGroupUpdateBatchUpdate**](AdGroupUpdateBatchUpdate.md) )|  | 

### Return type

[**AdGroupsCreate200Response**](ad_groups_create_200_response.md)

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

# **GetAdGroupsByPromotionIdsList**
> AdGroupsList200Response GetAdGroupsByPromotionIdsList(ad_account_id, promotion_ids, bookmark = var.bookmark, page_size = 25, order = var.order)

List of ad groups using promotions IDs.

  Get a list of ad groups that are associated with those promotion ids

### Example
```R
library(openapi)

# List of ad groups using promotions IDs.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_ids <- c("inner_example") # array[character] | List of Promotion IDs to use to filter the results.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)

api_instance <- AdGroupsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAdGroupsByPromotionIdsList(var_ad_account_id, var_promotion_ids, bookmark = var_bookmark, page_size = var_page_size, order = var_orderdata_file = "result.txt")
result <- api_instance$GetAdGroupsByPromotionIdsList(var_ad_account_id, var_promotion_ids, bookmark = var_bookmark, page_size = var_page_size, order = var_order)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_ids** | list( **character** )| List of Promotion IDs to use to filter the results. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**AdGroupsList200Response**](ad_groups_list_200_response.md)

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


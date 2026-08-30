# AdsAnalyticsCreateAsyncRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_group_ids`** | **`Vector{String}`** | List of ad group ids | [optional] [default to nothing]
**`ad_group_statuses`** | [**`Vector{AdGroupSummaryStatus}`**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to nothing]
**`ad_ids`** | **`Vector{String}`** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to nothing]
**`ad_statuses`** | [**`Vector{PinPromotionSummaryStatus}`**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to nothing]
**`attribution_types`** | [**`Vector{ConversionReportAttributionType}`**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to nothing]
**`campaign_brand_label`** | **`String`** | Campaign brand label for filtering. | [optional] [default to nothing]
**`campaign_custom_label`** | **`String`** | Campaign custom label for filtering. | [optional] [default to nothing]
**`campaign_ids`** | **`Vector{String}`** | List of campaign ids | [optional] [default to nothing]
**`campaign_objective_types`** | [**`Vector{CampaignObjectiveType}`**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [default to nothing]
**`campaign_statuses`** | [**`Vector{CampaignSummaryStatus}`**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to nothing]
**`click_window_days`** | [**`*ConversionAttributionWindowDays`**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to nothing]
**`columns`** | [**`Vector{ReportingColumnAsync}`**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to nothing]
**`combine_targeting_types`** | **`Bool`** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**`conversion_report_time`** | [**`*ConversionReportTimeType`**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to nothing]
**`custom_conversion_event_metrics`** | [**`Vector{CustomConversionEventMetrics}`**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to nothing]
**`end_date`** | **`String`** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to nothing]
**`end_hour`** | **`Int64`** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to nothing]
**`engagement_window_days`** | [**`*ConversionAttributionWindowDays`**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to nothing]
**`granularity`** | [**`*Granularity`**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [default to nothing]
**`level`** | [**`*MetricsReportingLevel`**](MetricsReportingLevel.md) | Level of the report | [optional] [default to nothing]
**`metrics_filters`** | [**`Vector{AdsAnalyticsMetricsFilter}`**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to nothing]
**`primary_sort`** | [**`*PrimarySort`**](PrimarySort.md) |  | [optional] [default to nothing]
**`product_group_ids`** | **`Vector{String}`** | List of product group ids | [optional] [default to nothing]
**`product_group_statuses`** | [**`Vector{ProductGroupSummaryStatus}`**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to nothing]
**`product_item_ids`** | **`Vector{String}`** | List of product item ids | [optional] [default to nothing]
**`report_format`** | [**`*DataOutputFormat`**](DataOutputFormat.md) |  | [optional] [default to nothing]
**`reporting_timezone`** | [**`*ReportingTimeZone`**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to nothing]
**`start_date`** | **`String`** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to nothing]
**`start_hour`** | **`Int64`** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to nothing]
**`targeting_types`** | [**`Vector{AdAdsAnalyticsAsyncTargetingTypes}`**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [default to nothing]
**`view_window_days`** | [**`*ConversionAttributionWindowDays`**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)



# ADS_ANALYTICS_CREATE_ASYNC_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of ad group ids | [optional] [default to null]
**ad_group_statuses** | [**LIST [AD_GROUP_SUMMARY_STATUS]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**ad_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to null]
**ad_statuses** | [**LIST [PIN_PROMOTION_SUMMARY_STATUS]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to null]
**attribution_types** | [**LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to null]
**campaign_brand_label** | [**STRING_32**](STRING_32.md) | Campaign brand label for filtering. | [optional] [default to null]
**campaign_custom_label** | [**STRING_32**](STRING_32.md) | Campaign custom label for filtering. | [optional] [default to null]
**campaign_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of campaign ids | [optional] [default to null]
**campaign_objective_types** | [**LIST [CAMPAIGN_OBJECTIVE_TYPE]**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [default to null]
**campaign_statuses** | [**LIST [CAMPAIGN_SUMMARY_STATUS]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to null]
**click_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]
**columns** | [**LIST [REPORTING_COLUMN_ASYNC]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to null]
**combine_targeting_types** | **BOOLEAN** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversion_report_time** | [**CONVERSION_REPORT_TIME_TYPE**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to TIME_OF_AD_ACTION]
**custom_conversion_event_metrics** | [**LIST [CUSTOM_CONVERSION_EVENT_METRICS]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to null]
**end_date** | [**STRING_32**](STRING_32.md) | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**end_hour** | **INTEGER_32** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to null]
**engagement_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]
**granularity** | [**GRANULARITY**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [default to null]
**level** | [**METRICS_REPORTING_LEVEL**](MetricsReportingLevel.md) | Level of the report | [optional] [default to null]
**metrics_filters** | [**LIST [ADS_ANALYTICS_METRICS_FILTER]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null]
**primary_sort** | [**PRIMARY_SORT**](PrimarySort.md) |  | [optional] [default to BY_ID]
**product_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of product group ids | [optional] [default to null]
**product_group_statuses** | [**LIST [PRODUCT_GROUP_SUMMARY_STATUS]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**product_item_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of product item ids | [optional] [default to null]
**report_format** | [**DATA_OUTPUT_FORMAT**](DataOutputFormat.md) |  | [optional] [default to JSON]
**reporting_timezone** | [**REPORTING_TIME_ZONE**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to null]
**start_date** | [**STRING_32**](STRING_32.md) | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**start_hour** | **INTEGER_32** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to null]
**targeting_types** | [**LIST [AD_ADS_ANALYTICS_ASYNC_TARGETING_TYPES]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [default to null]
**view_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



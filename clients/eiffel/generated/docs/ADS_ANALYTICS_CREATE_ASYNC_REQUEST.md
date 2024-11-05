# ADS_ANALYTICS_CREATE_ASYNC_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | [**STRING_32**](STRING_32.md) | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**end_date** | [**STRING_32**](STRING_32.md) | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**granularity** | [**GRANULARITY**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null]
**click_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]
**engagement_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]
**view_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_1]
**conversion_report_time** | [**CONVERSION_REPORT_TIME_TYPE**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
**attribution_types** | [**LIST [CONVERSION_REPORT_ATTRIBUTION_TYPE]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to null]
**campaign_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of campaign ids | [optional] [default to null]
**campaign_statuses** | [**LIST [CAMPAIGN_SUMMARY_STATUS]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to null]
**campaign_objective_types** | [**LIST [OBJECTIVE_TYPE]**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] [default to null]
**ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of ad group ids | [optional] [default to null]
**ad_group_statuses** | [**LIST [AD_GROUP_SUMMARY_STATUS]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**ad_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] [default to null]
**ad_statuses** | [**LIST [PIN_PROMOTION_SUMMARY_STATUS]**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] [default to null]
**product_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of product group ids | [optional] [default to null]
**product_group_statuses** | [**LIST [PRODUCT_GROUP_SUMMARY_STATUS]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**product_item_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of product item ids | [optional] [default to null]
**targeting_types** | [**LIST [ADS_ANALYTICS_TARGETING_TYPE]**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] [default to null]
**metrics_filters** | [**LIST [ADS_ANALYTICS_METRICS_FILTER]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null]
**columns** | [**LIST [REPORTING_COLUMN_ASYNC]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | [default to null]
**level** | [**METRICS_REPORTING_LEVEL**](MetricsReportingLevel.md) | Level of the report | [default to null]
**report_format** | [**DATA_OUTPUT_FORMAT**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to JSON]
**primary_sort** | [**STRING_32**](STRING_32.md) | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional] [default to null]
**start_hour** | **INTEGER_32** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional] [default to null]
**end_hour** | **INTEGER_32** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



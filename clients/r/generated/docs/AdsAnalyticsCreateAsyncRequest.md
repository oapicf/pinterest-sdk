# openapi::AdsAnalyticsCreateAsyncRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **array[character]** | List of ad group ids | [optional] [Max. items: 500] [Min. items: 1] 
**ad_group_statuses** | [**array[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**ad_ids** | **array[character]** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [Max. items: 500] [Min. items: 1] 
**ad_statuses** | [**array[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [Max. items: 6] [Min. items: 1] 
**attribution_types** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**campaign_brand_label** | **character** | Campaign brand label for filtering. | [optional] 
**campaign_custom_label** | **character** | Campaign custom label for filtering. | [optional] 
**campaign_ids** | **array[character]** | List of campaign ids | [optional] [Max. items: 500] [Min. items: 1] 
**campaign_objective_types** | [**array[CampaignObjectiveType]**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [Max. items: 7] [Min. items: 1] 
**campaign_statuses** | [**array[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [Enum: ] 
**columns** | [**array[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combine_targeting_types** | **character** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to FALSE] 
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [Enum: ] 
**custom_conversion_event_metrics** | [**array[CustomConversionEventMetrics]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**end_date** | **character** | Metric report end date (UTC). Format: YYYY-MM-DD | [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**end_hour** | **integer** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [Max: 23] [Min: 0] 
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [Enum: ] 
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [Enum: ] 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] [Enum: ] 
**metrics_filters** | [**array[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [Min. items: 1] 
**primary_sort** | [**PrimarySort**](PrimarySort.md) |  | [optional] [Enum: ] 
**product_group_ids** | **array[character]** | List of product group ids | [optional] [Max. items: 500] [Min. items: 1] 
**product_group_statuses** | [**array[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**product_item_ids** | **array[character]** | List of product item ids | [optional] [Max. items: 500] [Min. items: 1] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [Enum: ] 
**reporting_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [Enum: ] 
**start_date** | **character** | Metric report start date (UTC). Format: YYYY-MM-DD | [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**start_hour** | **integer** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [Max: 23] [Min: 0] 
**targeting_types** | [**array[AdAdsAnalyticsAsyncTargetingTypes]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [Max. items: 5] [Min. items: 1] 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [Enum: ] 



# openapi::AdsAnalyticsCreateAsyncRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **character** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **character** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**attribution_types** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**columns** | [**array[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to &#39;JSON&#39;]
**campaign_ids** | **array[character]** | List of campaign ids | [optional] 
**campaign_statuses** | [**array[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**campaign_objective_types** | [**array[ObjectiveType]**](ObjectiveType.md) | List of values for filtering | [optional] 
**ad_group_ids** | **array[character]** | List of ad group ids | [optional] 
**ad_group_statuses** | [**array[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ad_ids** | **array[character]** | List of ad ids | [optional] 
**ad_statuses** | [**array[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**product_group_ids** | **array[character]** | List of product group ids | [optional] 
**product_group_statuses** | [**array[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**product_item_ids** | **array[character]** | List of product item ids | [optional] 
**targeting_types** | [**array[AdsAnalyticsTargetingType]**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**metrics_filters** | [**array[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 



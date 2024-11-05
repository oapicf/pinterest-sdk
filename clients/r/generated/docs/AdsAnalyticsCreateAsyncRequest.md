# openapi::AdsAnalyticsCreateAsyncRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **character** | Metric report start date (UTC). Format: YYYY-MM-DD | [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**end_date** | **character** | Metric report end date (UTC). Format: YYYY-MM-DD | [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [Enum: ] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays_30_] [Enum: ] 
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays_30_] [Enum: ] 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ConversionAttributionWindowDays_1_] [Enum: ] 
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;] [Enum: ] 
**attribution_types** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**campaign_ids** | **array[character]** | List of campaign ids | [optional] [Max. items: 500] [Min. items: 1] 
**campaign_statuses** | [**array[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**campaign_objective_types** | [**array[ObjectiveType]**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] [Max. items: 7] [Min. items: 1] 
**ad_group_ids** | **array[character]** | List of ad group ids | [optional] [Max. items: 500] [Min. items: 1] 
**ad_group_statuses** | [**array[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**ad_ids** | **array[character]** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] [Max. items: 500] [Min. items: 1] 
**ad_statuses** | [**array[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] [Max. items: 6] [Min. items: 1] 
**product_group_ids** | **array[character]** | List of product group ids | [optional] [Max. items: 500] [Min. items: 1] 
**product_group_statuses** | [**array[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [Max. items: 6] [Min. items: 1] 
**product_item_ids** | **array[character]** | List of product item ids | [optional] [Max. items: 500] [Min. items: 1] 
**targeting_types** | [**array[AdsAnalyticsTargetingType]**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] [Max. items: 5] [Min. items: 1] 
**metrics_filters** | [**array[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [Min. items: 1] 
**columns** | [**array[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [Enum: ] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to &quot;JSON&quot;] [Enum: ] 
**primary_sort** | **character** | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional] [Enum: [BY_ID, BY_DATE]] 
**start_hour** | **integer** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional] [Max: 23] [Min: 0] 
**end_hour** | **integer** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional] [Max: 23] [Min: 0] 



# # AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD |
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD |
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**attribution_types** | [**\OpenAPI\Client\Model\ConversionReportAttributionType[]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional]
**columns** | [**\OpenAPI\Client\Model\ReportingColumnAsync[]**](ReportingColumnAsync.md) | Metric and entity columns |
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to 'JSON']
**campaign_ids** | **string[]** | List of campaign ids | [optional]
**campaign_statuses** | [**\OpenAPI\Client\Model\CampaignSummaryStatus[]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional]
**campaign_objective_types** | [**\OpenAPI\Client\Model\ObjectiveType[]**](ObjectiveType.md) | List of values for filtering | [optional]
**ad_group_ids** | **string[]** | List of ad group ids | [optional]
**ad_group_statuses** | [**\OpenAPI\Client\Model\AdGroupSummaryStatus[]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional]
**ad_ids** | **string[]** | List of ad ids | [optional]
**ad_statuses** | [**\OpenAPI\Client\Model\PinPromotionSummaryStatus[]**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional]
**product_group_ids** | **string[]** | List of product group ids | [optional]
**product_group_statuses** | [**\OpenAPI\Client\Model\ProductGroupSummaryStatus[]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional]
**product_item_ids** | **string[]** | List of product item ids | [optional]
**targeting_types** | [**\OpenAPI\Client\Model\AdsAnalyticsTargetingType[]**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional]
**metrics_filters** | [**\OpenAPI\Client\Model\AdsAnalyticsMetricsFilter[]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **string[]** | List of ad group ids | [optional]
**ad_group_statuses** | [**\OpenAPI\Client\Model\AdGroupSummaryStatus[]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional]
**ad_ids** | **string[]** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional]
**ad_statuses** | [**\OpenAPI\Client\Model\PinPromotionSummaryStatus[]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional]
**attribution_types** | [**\OpenAPI\Client\Model\ConversionReportAttributionType[]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional]
**campaign_brand_label** | **string** | Campaign brand label for filtering. | [optional]
**campaign_custom_label** | **string** | Campaign custom label for filtering. | [optional]
**campaign_ids** | **string[]** | List of campaign ids | [optional]
**campaign_objective_types** | [**\OpenAPI\Client\Model\CampaignObjectiveType[]**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional]
**campaign_statuses** | [**\OpenAPI\Client\Model\CampaignSummaryStatus[]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional]
**click_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to 30]
**columns** | [**\OpenAPI\Client\Model\ReportingColumnAsync[]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional]
**combine_targeting_types** | **bool** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversion_report_time** | [**\OpenAPI\Client\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to ConversionReportTimeType::TIME_OF_AD_ACTION]
**custom_conversion_event_metrics** | [**\OpenAPI\Client\Model\CustomConversionEventMetrics[]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD |
**end_hour** | **int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional]
**engagement_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to 30]
**granularity** | [**\OpenAPI\Client\Model\Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. |
**level** | [**\OpenAPI\Client\Model\MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional]
**metrics_filters** | [**\OpenAPI\Client\Model\AdsAnalyticsMetricsFilter[]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional]
**primary_sort** | [**\OpenAPI\Client\Model\PrimarySort**](PrimarySort.md) |  | [optional] [default to PrimarySort::BY_ID]
**product_group_ids** | **string[]** | List of product group ids | [optional]
**product_group_statuses** | [**\OpenAPI\Client\Model\ProductGroupSummaryStatus[]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional]
**product_item_ids** | **string[]** | List of product item ids | [optional]
**report_format** | [**\OpenAPI\Client\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to DataOutputFormat::JSON]
**reporting_timezone** | [**\OpenAPI\Client\Model\ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional]
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD |
**start_hour** | **int** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional]
**targeting_types** | [**\OpenAPI\Client\Model\AdAdsAnalyticsAsyncTargetingTypes[]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional]
**view_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to 1]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

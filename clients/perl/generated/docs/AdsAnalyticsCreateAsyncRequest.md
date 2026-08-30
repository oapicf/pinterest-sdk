# WWW::OpenAPIClient::Object::AdsAnalyticsCreateAsyncRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdsAnalyticsCreateAsyncRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **ARRAY[string]** | List of ad group ids | [optional] 
**ad_group_statuses** | [**ARRAY[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ad_ids** | **ARRAY[string]** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**ad_statuses** | [**ARRAY[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**attribution_types** | [**ARRAY[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**campaign_brand_label** | **string** | Campaign brand label for filtering. | [optional] 
**campaign_custom_label** | **string** | Campaign custom label for filtering. | [optional] 
**campaign_ids** | **ARRAY[string]** | List of campaign ids | [optional] 
**campaign_objective_types** | [**ARRAY[CampaignObjectiveType]**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**campaign_statuses** | [**ARRAY[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**columns** | [**ARRAY[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combine_targeting_types** | **boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] 
**custom_conversion_event_metrics** | [**ARRAY[CustomConversionEventMetrics]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**end_hour** | **int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] 
**metrics_filters** | [**ARRAY[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**primary_sort** | [**PrimarySort**](PrimarySort.md) |  | [optional] 
**product_group_ids** | **ARRAY[string]** | List of product group ids | [optional] 
**product_group_statuses** | [**ARRAY[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**product_item_ids** | **ARRAY[string]** | List of product item ids | [optional] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reporting_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] 
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**start_hour** | **int** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**targeting_types** | [**ARRAY[AdAdsAnalyticsAsyncTargetingTypes]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



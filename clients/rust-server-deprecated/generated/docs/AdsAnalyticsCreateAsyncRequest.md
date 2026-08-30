# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **Vec<models::PinterestLibIntegerFormatType>** | List of ad group ids | [optional] [default to None]
**ad_group_statuses** | [**Vec<models::AdGroupSummaryStatus>**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to None]
**ad_ids** | **Vec<models::PinterestLibIntegerFormatType>** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to None]
**ad_statuses** | [**Vec<models::PinPromotionSummaryStatus>**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to None]
**attribution_types** | [**Vec<models::ConversionReportAttributionType>**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to None]
**campaign_brand_label** | **String** | Campaign brand label for filtering. | [optional] [default to None]
**campaign_custom_label** | **String** | Campaign custom label for filtering. | [optional] [default to None]
**campaign_ids** | **Vec<models::PinterestLibIntegerFormatType>** | List of campaign ids | [optional] [default to None]
**campaign_objective_types** | [**Vec<models::CampaignObjectiveType>**](CampaignObjectiveType.md) | List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. | [optional] [default to None]
**campaign_statuses** | [**Vec<models::CampaignSummaryStatus>**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to None]
**click_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to None]
**columns** | [**Vec<models::ReportingColumnAsync>**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to None]
**combine_targeting_types** | **bool** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to Some(false)]
**conversion_report_time** | [***models::ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to None]
**custom_conversion_event_metrics** | [**Vec<models::CustomConversionEventMetrics>**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to None]
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**end_hour** | **u8** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to None]
**engagement_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to None]
**granularity** | [***models::Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | [***models::MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] [default to None]
**metrics_filters** | [**Vec<models::AdsAnalyticsMetricsFilter>**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to None]
**primary_sort** | [***models::PrimarySort**](PrimarySort.md) |  | [optional] [default to None]
**product_group_ids** | **Vec<models::PinterestLibIntegerFormatType>** | List of product group ids | [optional] [default to None]
**product_group_statuses** | [**Vec<models::ProductGroupSummaryStatus>**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to None]
**product_item_ids** | **Vec<models::PinterestLibIntegerFormatType>** | List of product item ids | [optional] [default to None]
**report_format** | [***models::DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to None]
**reporting_timezone** | [***models::ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to None]
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**start_hour** | **u8** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to None]
**targeting_types** | [**Vec<models::AdAdsAnalyticsAsyncTargetingTypes>**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires `level` to be a value ending in `_TARGETING`. | [optional] [default to None]
**view_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



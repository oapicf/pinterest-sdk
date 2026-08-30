# AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | Option<**Vec<String>**> | List of ad group ids | [optional]
**ad_group_statuses** | Option<[**Vec<models::AdGroupSummaryStatus>**](AdGroupSummaryStatus.md)> | List of values for filtering | [optional]
**ad_ids** | Option<**Vec<String>**> | List of ad ids. This parameter is not supported for Product Item level reports. | [optional]
**ad_statuses** | Option<[**Vec<models::PinPromotionSummaryStatus>**](PinPromotionSummaryStatus.md)> | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional]
**attribution_types** | Option<[**Vec<models::ConversionReportAttributionType>**](ConversionReportAttributionType.md)> | List of attribution types for the conversion report. | [optional]
**campaign_brand_label** | Option<**String**> | Campaign brand label for filtering. | [optional]
**campaign_custom_label** | Option<**String**> | Campaign custom label for filtering. | [optional]
**campaign_ids** | Option<**Vec<String>**> | List of campaign ids | [optional]
**campaign_objective_types** | Option<[**Vec<models::CampaignObjectiveType>**](CampaignObjectiveType.md)> | List of values for filtering. [\"WEB_SESSIONS\"] is in BETA. | [optional]
**campaign_statuses** | Option<[**Vec<models::CampaignSummaryStatus>**](CampaignSummaryStatus.md)> | List of status values for filtering | [optional]
**click_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a pin click action. | [optional][default to Variant30]
**columns** | Option<[**Vec<models::ReportingColumnAsync>**](ReportingColumnAsync.md)> | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional]
**combine_targeting_types** | Option<**bool**> | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional][default to false]
**conversion_report_time** | Option<[**models::ConversionReportTimeType**](ConversionReportTimeType.md)> | Date dimension for conversion metrics. | [optional][default to TimeOfAdAction]
**custom_conversion_event_metrics** | Option<[**Vec<models::CustomConversionEventMetrics>**](CustomConversionEventMetrics.md)> | List of advertiser-defined custom conversion event metrics to include in the report | [optional]
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**end_hour** | Option<**i32**> | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional]
**engagement_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for an engagement action. | [optional][default to Variant30]
**granularity** | [**models::Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | Option<[**models::MetricsReportingLevel**](MetricsReportingLevel.md)> | Level of the report | [optional]
**metrics_filters** | Option<[**Vec<models::AdsAnalyticsMetricsFilter>**](AdsAnalyticsMetricsFilter.md)> | List of metrics filters | [optional]
**primary_sort** | Option<[**models::PrimarySort**](PrimarySort.md)> |  | [optional][default to ById]
**product_group_ids** | Option<**Vec<String>**> | List of product group ids | [optional]
**product_group_statuses** | Option<[**Vec<models::ProductGroupSummaryStatus>**](ProductGroupSummaryStatus.md)> | List of values for filtering | [optional]
**product_item_ids** | Option<**Vec<String>**> | List of product item ids | [optional]
**report_format** | Option<[**models::DataOutputFormat**](DataOutputFormat.md)> |  | [optional][default to Json]
**reporting_timezone** | Option<[**models::ReportingTimeZone**](ReportingTimeZone.md)> | Specify the timezone to be applied for the reporting. | [optional]
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**start_hour** | Option<**i32**> | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional]
**targeting_types** | Option<[**Vec<models::AdAdsAnalyticsAsyncTargetingTypes>**](AdAdsAnalyticsAsyncTargetingTypes.md)> | List of targeting types. Requires `level` to be a value ending in `_TARGETING`. | [optional]
**view_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a view action. | [optional][default to Variant1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**models::Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
**click_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional][default to Variant30]
**engagement_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional][default to Variant30]
**view_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [optional][default to Variant1]
**conversion_report_time** | Option<[**models::ConversionReportTimeType**](ConversionReportTimeType.md)> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to AdAction]
**attribution_types** | Option<[**Vec<models::ConversionReportAttributionType>**](ConversionReportAttributionType.md)> | List of types of attribution for the conversion report | [optional]
**campaign_ids** | Option<**Vec<String>**> | List of campaign ids | [optional]
**campaign_statuses** | Option<[**Vec<models::CampaignSummaryStatus>**](CampaignSummaryStatus.md)> | List of status values for filtering | [optional]
**campaign_objective_types** | Option<[**Vec<models::ObjectiveType>**](ObjectiveType.md)> | List of values for filtering. [\"WEB_SESSIONS\"] in BETA. | [optional]
**ad_group_ids** | Option<**Vec<String>**> | List of ad group ids | [optional]
**ad_group_statuses** | Option<[**Vec<models::AdGroupSummaryStatus>**](AdGroupSummaryStatus.md)> | List of values for filtering | [optional]
**ad_ids** | Option<**Vec<String>**> | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional]
**ad_statuses** | Option<[**Vec<models::PinPromotionSummaryStatus>**](PinPromotionSummaryStatus.md)> | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional]
**product_group_ids** | Option<**Vec<String>**> | List of product group ids | [optional]
**product_group_statuses** | Option<[**Vec<models::ProductGroupSummaryStatus>**](ProductGroupSummaryStatus.md)> | List of values for filtering | [optional]
**product_item_ids** | Option<**Vec<String>**> | List of product item ids | [optional]
**targeting_types** | Option<[**Vec<models::AdsAnalyticsTargetingType>**](AdsAnalyticsTargetingType.md)> | List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. | [optional]
**metrics_filters** | Option<[**Vec<models::AdsAnalyticsMetricsFilter>**](AdsAnalyticsMetricsFilter.md)> | List of metrics filters | [optional]
**columns** | [**Vec<models::ReportingColumnAsync>**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | [**models::MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**report_format** | Option<[**models::DataOutputFormat**](DataOutputFormat.md)> | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional][default to Json]
**primary_sort** | Option<**String**> | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional]
**start_hour** | Option<**i32**> | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional]
**end_hour** | Option<**i32**> | Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



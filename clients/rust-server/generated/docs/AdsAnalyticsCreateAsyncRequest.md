# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [***models::Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
**click_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional] [default to Some(30)]
**engagement_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional] [default to Some(30)]
**view_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [optional] [default to Some(1)]
**conversion_report_time** | [***models::ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to Some("TIME_OF_AD_ACTION".to_string())]
**attribution_types** | [**Vec<models::ConversionReportAttributionType>**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to None]
**campaign_ids** | **Vec<String>** | List of campaign ids | [optional] [default to None]
**campaign_statuses** | [**Vec<models::CampaignSummaryStatus>**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to None]
**campaign_objective_types** | [**Vec<models::ObjectiveType>**](ObjectiveType.md) | List of values for filtering. [\"WEB_SESSIONS\"] in BETA. | [optional] [default to None]
**ad_group_ids** | **Vec<String>** | List of ad group ids | [optional] [default to None]
**ad_group_statuses** | [**Vec<models::AdGroupSummaryStatus>**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to None]
**ad_ids** | **Vec<String>** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] [default to None]
**ad_statuses** | [**Vec<models::PinPromotionSummaryStatus>**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] [default to None]
**product_group_ids** | **Vec<String>** | List of product group ids | [optional] [default to None]
**product_group_statuses** | [**Vec<models::ProductGroupSummaryStatus>**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to None]
**product_item_ids** | **Vec<String>** | List of product item ids | [optional] [default to None]
**targeting_types** | [**Vec<models::AdsAnalyticsTargetingType>**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires `level` to be a value ending in `_TARGETING`. | [optional] [default to None]
**metrics_filters** | [**Vec<models::AdsAnalyticsMetricsFilter>**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to None]
**columns** | [**Vec<models::ReportingColumnAsync>**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | [***models::MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**report_format** | [***models::DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to Some("JSON".to_string())]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



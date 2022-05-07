# AdsAnalyticsCreateAsyncRequestAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**crate::models::Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly | 
**click_window_days** | Option<[**crate::models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional][default to 30]
**engagement_window_days** | Option<[**crate::models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional][default to 30]
**view_window_days** | Option<[**crate::models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [optional][default to 1]
**conversion_report_time** | Option<[**crate::models::ConversionReportTimeType**](ConversionReportTimeType.md)> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to TIME_OF_AD_ACTION]
**attribution_types** | Option<[**Vec<crate::models::ConversionReportAttributionType>**](ConversionReportAttributionType.md)> | List of types of attribution for the conversion report | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



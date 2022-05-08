# OAIAdsAnalyticsCreateAsyncRequestAllOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **NSString*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **NSString*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**OAIGranularity***](OAIGranularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
**engagementWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to @30]
**viewWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to @1]
**conversionReportTime** | [**OAIConversionReportTimeType***](OAIConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to @"TIME_OF_AD_ACTION"]
**attributionTypes** | [**NSArray&lt;OAIConversionReportAttributionType&gt;***](OAIConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


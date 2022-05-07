# AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**EngagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
**AttributionTypes** | [**[]ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**Columns** | [**[]ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns | 
**Level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to JSON]
**CampaignIds** | **[]string** | List of campaign ids | [optional] 
**CampaignStatuses** | [**[]CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**CampaignObjectiveTypes** | [**[]ObjectiveType**](ObjectiveType.md) | List of values for filtering | [optional] 
**AdGroupIds** | **[]string** | List of ad group ids | [optional] 
**AdGroupStatuses** | [**[]AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | **[]string** | List of ad ids | [optional] 
**AdStatuses** | [**[]PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**ProductGroupIds** | **[]string** | List of product group ids | [optional] 
**ProductGroupStatuses** | [**[]ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | **[]string** | List of product item ids | [optional] 
**TargetingTypes** | [**[]AdsAnalyticsTargetingType**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**MetricsFilters** | [**[]AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



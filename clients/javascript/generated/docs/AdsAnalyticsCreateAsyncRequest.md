# PinterestSdk.AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
**attributionTypes** | [**[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**columns** | [**[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to &#39;JSON&#39;]
**campaignIds** | **[String]** | List of campaign ids | [optional] 
**campaignStatuses** | [**[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**campaignObjectiveTypes** | [**[ObjectiveType]**](ObjectiveType.md) | List of values for filtering | [optional] 
**adGroupIds** | **[String]** | List of ad group ids | [optional] 
**adGroupStatuses** | [**[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **[String]** | List of ad ids | [optional] 
**adStatuses** | [**[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**productGroupIds** | **[String]** | List of product group ids | [optional] 
**productGroupStatuses** | [**[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **[String]** | List of product item ids | [optional] 
**targetingTypes** | [**[AdsAnalyticsTargetingType]**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**metricsFilters** | [**[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 



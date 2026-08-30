# PinterestSdk.AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **[String]** | List of ad group ids | [optional] 
**adGroupStatuses** | [**[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **[String]** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**adStatuses** | [**[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**attributionTypes** | [**[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**campaignBrandLabel** | **String** | Campaign brand label for filtering. | [optional] 
**campaignCustomLabel** | **String** | Campaign custom label for filtering. | [optional] 
**campaignIds** | **[String]** | List of campaign ids | [optional] 
**campaignObjectiveTypes** | [**[CampaignObjectiveType]**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**campaignStatuses** | [**[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**columns** | [**[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combineTargetingTypes** | **Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] 
**customConversionEventMetrics** | [**[CustomConversionEventMetrics]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**endHour** | **Number** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] 
**metricsFilters** | [**[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**primarySort** | [**PrimarySort**](PrimarySort.md) |  | [optional] 
**productGroupIds** | **[String]** | List of product group ids | [optional] 
**productGroupStatuses** | [**[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **[String]** | List of product item ids | [optional] 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**startHour** | **Number** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**targetingTypes** | [**[AdAdsAnalyticsAsyncTargetingTypes]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 



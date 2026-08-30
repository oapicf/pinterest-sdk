
# AdsAnalyticsCreateAsyncRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endDate** | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. |  |
| **startDate** | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **adGroupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of ad group ids |  [optional] |
| **adGroupStatuses** | [**kotlin.collections.List&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering |  [optional] |
| **adIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. |  [optional] |
| **adStatuses** | [**kotlin.collections.List&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. |  [optional] |
| **attributionTypes** | [**kotlin.collections.List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. |  [optional] |
| **campaignBrandLabel** | **kotlin.String** | Campaign brand label for filtering. |  [optional] |
| **campaignCustomLabel** | **kotlin.String** | Campaign custom label for filtering. |  [optional] |
| **campaignIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of campaign ids |  [optional] |
| **campaignObjectiveTypes** | [**kotlin.collections.List&lt;CampaignObjectiveType&gt;**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. |  [optional] |
| **campaignStatuses** | [**kotlin.collections.List&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering |  [optional] |
| **clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. |  [optional] |
| **columns** | [**kotlin.collections.List&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. |  [optional] |
| **combineTargetingTypes** | **kotlin.Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. |  [optional] |
| **conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. |  [optional] |
| **customConversionEventMetrics** | [**kotlin.collections.List&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report |  [optional] |
| **endHour** | **kotlin.Int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. |  [optional] |
| **engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. |  [optional] |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  [optional] |
| **metricsFilters** | [**kotlin.collections.List&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional] |
| **primarySort** | [**PrimarySort**](PrimarySort.md) |  |  [optional] |
| **productGroupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of product group ids |  [optional] |
| **productGroupStatuses** | [**kotlin.collections.List&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering |  [optional] |
| **productItemIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of product item ids |  [optional] |
| **reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  |  [optional] |
| **reportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. |  [optional] |
| **startHour** | **kotlin.Int** | Which hour of the start date to begin the report. Only allowed for hourly reports. |  [optional] |
| **targetingTypes** | [**kotlin.collections.List&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. |  [optional] |
| **viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. |  [optional] |




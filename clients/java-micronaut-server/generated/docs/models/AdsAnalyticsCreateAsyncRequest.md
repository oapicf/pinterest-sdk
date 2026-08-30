

# AdsAnalyticsCreateAsyncRequest

The class is defined in **[AdsAnalyticsCreateAsyncRequest.java](../../src/main/java/org/openapitools/model/AdsAnalyticsCreateAsyncRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | `List&lt;String&gt;` | List of ad group ids |  [optional property]
**adGroupStatuses** | `List&lt;AdGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**adIds** | `List&lt;String&gt;` | List of ad ids. This parameter is not supported for Product Item level reports. |  [optional property]
**adStatuses** | `List&lt;PinPromotionSummaryStatus&gt;` | List of values for filtering. This parameter is not supported for Product Item level reports. |  [optional property]
**attributionTypes** | `List&lt;ConversionReportAttributionType&gt;` | List of attribution types for the conversion report. |  [optional property]
**campaignBrandLabel** | `String` | Campaign brand label for filtering. |  [optional property]
**campaignCustomLabel** | `String` | Campaign custom label for filtering. |  [optional property]
**campaignIds** | `List&lt;String&gt;` | List of campaign ids |  [optional property]
**campaignObjectiveTypes** | `List&lt;CampaignObjectiveType&gt;` | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. |  [optional property]
**campaignStatuses** | `List&lt;CampaignSummaryStatus&gt;` | List of status values for filtering |  [optional property]
**clickWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a pin click action. |  [optional property]
**columns** | `List&lt;ReportingColumnAsync&gt;` | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. |  [optional property]
**combineTargetingTypes** | `Boolean` | Determines if the targeting types included in the request should be consolidated into a single breakdown. |  [optional property]
**conversionReportTime** | `ConversionReportTimeType` | Date dimension for conversion metrics. |  [optional property]
**customConversionEventMetrics** | [`List&lt;CustomConversionEventMetrics&gt;`](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report |  [optional property]
**endDate** | `String` | Metric report end date (UTC). Format: YYYY-MM-DD | 
**endHour** | `Integer` | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. |  [optional property]
**engagementWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for an engagement action. |  [optional property]
**granularity** | `Granularity` |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | `MetricsReportingLevel` | Level of the report |  [optional property]
**metricsFilters** | [`List&lt;AdsAnalyticsMetricsFilter&gt;`](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional property]
**primarySort** | `PrimarySort` |  |  [optional property]
**productGroupIds** | `List&lt;String&gt;` | List of product group ids |  [optional property]
**productGroupStatuses** | `List&lt;ProductGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**productItemIds** | `List&lt;String&gt;` | List of product item ids |  [optional property]
**reportFormat** | `DataOutputFormat` |  |  [optional property]
**reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. |  [optional property]
**startDate** | `String` | Metric report start date (UTC). Format: YYYY-MM-DD | 
**startHour** | `Integer` | Which hour of the start date to begin the report. Only allowed for hourly reports. |  [optional property]
**targetingTypes** | `List&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;` | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. |  [optional property]
**viewWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a view action. |  [optional property]


































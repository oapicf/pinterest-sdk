

# AdsAnalyticsCreateAsyncRequest

The class is defined in **[AdsAnalyticsCreateAsyncRequest.java](../../src/main/java/org/openapitools/model/AdsAnalyticsCreateAsyncRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | `String` | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | `String` | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [`Granularity`](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [`ConversionAttributionWindowDays`](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional property]
**engagementWindowDays** | [`ConversionAttributionWindowDays`](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional property]
**viewWindowDays** | [`ConversionAttributionWindowDays`](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional property]
**conversionReportTime** | [`ConversionReportTimeType`](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional property]
**attributionTypes** | `List&lt;ConversionReportAttributionType&gt;` | List of types of attribution for the conversion report |  [optional property]
**columns** | `List&lt;ReportingColumnAsync&gt;` | Metric and entity columns | 
**level** | [`MetricsReportingLevel`](MetricsReportingLevel.md) | Level of the report | 
**reportFormat** | [`DataOutputFormat`](DataOutputFormat.md) | Specification for formatting report data |  [optional property]
**campaignIds** | `List&lt;String&gt;` | List of campaign ids |  [optional property]
**campaignStatuses** | `List&lt;CampaignSummaryStatus&gt;` | List of status values for filtering |  [optional property]
**campaignObjectiveTypes** | `List&lt;ObjectiveType&gt;` | List of values for filtering |  [optional property]
**adGroupIds** | `List&lt;String&gt;` | List of ad group ids |  [optional property]
**adGroupStatuses** | `List&lt;AdGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**adIds** | `List&lt;String&gt;` | List of ad ids |  [optional property]
**adStatuses** | `List&lt;PinPromotionSummaryStatus&gt;` | List of values for filtering |  [optional property]
**productGroupIds** | `List&lt;String&gt;` | List of product group ids |  [optional property]
**productGroupStatuses** | `List&lt;ProductGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**productItemIds** | `List&lt;String&gt;` | List of product item ids |  [optional property]
**targetingTypes** | `List&lt;AdsAnalyticsTargetingType&gt;` | List of targeting types |  [optional property]
**metricsFilters** | [`List&lt;AdsAnalyticsMetricsFilter&gt;`](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional property]


























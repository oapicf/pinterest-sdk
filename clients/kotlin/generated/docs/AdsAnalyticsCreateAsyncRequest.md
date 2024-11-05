
# AdsAnalyticsCreateAsyncRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **endDate** | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  |
| **columns** | [**kotlin.collections.List&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. |  |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  |
| **clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] |
| **engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] |
| **viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional] |
| **conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] |
| **attributionTypes** | [**kotlin.collections.List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report |  [optional] |
| **campaignIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of campaign ids |  [optional] |
| **campaignStatuses** | [**kotlin.collections.List&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering |  [optional] |
| **campaignObjectiveTypes** | [**kotlin.collections.List&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. |  [optional] |
| **adGroupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of ad group ids |  [optional] |
| **adGroupStatuses** | [**kotlin.collections.List&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering |  [optional] |
| **adIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of ad ids [This parameter is no supported for Product Item Level Reports] |  [optional] |
| **adStatuses** | [**kotlin.collections.List&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] |  [optional] |
| **productGroupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of product group ids |  [optional] |
| **productGroupStatuses** | [**kotlin.collections.List&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering |  [optional] |
| **productItemIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of product item ids |  [optional] |
| **targetingTypes** | [**kotlin.collections.List&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  [optional] |
| **metricsFilters** | [**kotlin.collections.List&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional] |
| **reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. |  [optional] |
| **primarySort** | [**inline**](#PrimarySort) | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. |  [optional] |
| **startHour** | **kotlin.Int** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. |  [optional] |
| **endHour** | **kotlin.Int** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. |  [optional] |


<a id="PrimarySort"></a>
## Enum: primary_sort
| Name | Value |
| ---- | ----- |
| primarySort | BY_ID, BY_DATE |




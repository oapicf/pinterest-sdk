# AdsAnalyticsCreateAsyncRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **start\_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [default to null] |
| **click\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagement\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **view\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversion\_report\_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] |
| **attribution\_types** | [**List**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] [default to null] |
| **campaign\_ids** | **List** | List of campaign ids | [optional] [default to null] |
| **campaign\_statuses** | [**List**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to null] |
| **campaign\_objective\_types** | [**List**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] [default to null] |
| **ad\_group\_ids** | **List** | List of ad group ids | [optional] [default to null] |
| **ad\_group\_statuses** | [**List**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **ad\_ids** | **List** | List of ad ids | [optional] [default to null] |
| **ad\_statuses** | [**List**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **product\_group\_ids** | **List** | List of product group ids | [optional] [default to null] |
| **product\_group\_statuses** | [**List**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **product\_item\_ids** | **List** | List of product item ids | [optional] [default to null] |
| **targeting\_types** | [**List**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] [default to null] |
| **metrics\_filters** | [**List**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null] |
| **columns** | [**List**](ReportingColumnAsync.md) | Metric and entity columns | [default to null] |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [default to null] |
| **report\_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to JSON] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


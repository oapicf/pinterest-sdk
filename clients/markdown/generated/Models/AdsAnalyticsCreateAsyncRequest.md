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
| **ad\_ids** | **List** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] [default to null] |
| **ad\_statuses** | [**List**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] [default to null] |
| **product\_group\_ids** | **List** | List of product group ids | [optional] [default to null] |
| **product\_group\_statuses** | [**List**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **product\_item\_ids** | **List** | List of product item ids | [optional] [default to null] |
| **targeting\_types** | [**List**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] [default to null] |
| **metrics\_filters** | [**List**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null] |
| **columns** | [**List**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | [default to null] |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [default to null] |
| **report\_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to JSON] |
| **primary\_sort** | **String** | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional] [default to null] |
| **start\_hour** | **Integer** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional] [default to null] |
| **end\_hour** | **Integer** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


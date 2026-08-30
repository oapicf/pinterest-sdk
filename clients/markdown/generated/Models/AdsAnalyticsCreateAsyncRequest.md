# AdsAnalyticsCreateAsyncRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_group\_ids** | **List** | List of ad group ids | [optional] [default to null] |
| **ad\_group\_statuses** | [**List**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **ad\_ids** | **List** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to null] |
| **ad\_statuses** | [**List**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to null] |
| **attribution\_types** | [**List**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to null] |
| **campaign\_brand\_label** | **String** | Campaign brand label for filtering. | [optional] [default to null] |
| **campaign\_custom\_label** | **String** | Campaign custom label for filtering. | [optional] [default to null] |
| **campaign\_ids** | **List** | List of campaign ids | [optional] [default to null] |
| **campaign\_objective\_types** | [**List**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [default to null] |
| **campaign\_statuses** | [**List**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to null] |
| **click\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to 30] |
| **columns** | [**List**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to null] |
| **combine\_targeting\_types** | **Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false] |
| **conversion\_report\_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to TIME_OF_AD_ACTION] |
| **custom\_conversion\_event\_metrics** | [**List**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to null] |
| **end\_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null] |
| **end\_hour** | **Integer** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to null] |
| **engagement\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to 30] |
| **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [default to null] |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] [default to null] |
| **metrics\_filters** | [**List**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null] |
| **primary\_sort** | [**PrimarySort**](PrimarySort.md) |  | [optional] [default to BY_ID] |
| **product\_group\_ids** | **List** | List of product group ids | [optional] [default to null] |
| **product\_group\_statuses** | [**List**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null] |
| **product\_item\_ids** | **List** | List of product item ids | [optional] [default to null] |
| **report\_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to JSON] |
| **reporting\_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to null] |
| **start\_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null] |
| **start\_hour** | **Integer** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to null] |
| **targeting\_types** | [**List**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [default to null] |
| **view\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to 1] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


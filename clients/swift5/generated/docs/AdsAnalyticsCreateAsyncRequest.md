# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays__30]
**engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays__30]
**viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ConversionAttributionWindowDays__1]
**conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to "TIME_OF_AD_ACTION"]
**attributionTypes** | [ConversionReportAttributionType] | List of types of attribution for the conversion report | [optional] 
**campaignIds** | **[String]** | List of campaign ids | [optional] 
**campaignStatuses** | [CampaignSummaryStatus] | List of status values for filtering | [optional] 
**campaignObjectiveTypes** | [ObjectiveType] | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] 
**adGroupIds** | **[String]** | List of ad group ids | [optional] 
**adGroupStatuses** | [AdGroupSummaryStatus] | List of values for filtering | [optional] 
**adIds** | **[String]** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] 
**adStatuses** | [PinPromotionSummaryStatus] | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] 
**productGroupIds** | **[String]** | List of product group ids | [optional] 
**productGroupStatuses** | [ProductGroupSummaryStatus] | List of values for filtering | [optional] 
**productItemIds** | **[String]** | List of product item ids | [optional] 
**targetingTypes** | [AdsAnalyticsTargetingType] | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**metricsFilters** | [AdsAnalyticsMetricsFilter] | List of metrics filters | [optional] 
**columns** | [ReportingColumnAsync] | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to "JSON"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



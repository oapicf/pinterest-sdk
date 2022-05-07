# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**attributionTypes** | [**OpenAPI\Server\Model\ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**columns** | [**OpenAPI\Server\Model\ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns | 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**reportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional] [default to 'JSON']
**campaignIds** | **string** | List of campaign ids | [optional] 
**campaignStatuses** | [**OpenAPI\Server\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**campaignObjectiveTypes** | [**OpenAPI\Server\Model\ObjectiveType**](ObjectiveType.md) | List of values for filtering | [optional] 
**adGroupIds** | **string** | List of ad group ids | [optional] 
**adGroupStatuses** | [**OpenAPI\Server\Model\AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **string** | List of ad ids | [optional] 
**adStatuses** | [**OpenAPI\Server\Model\PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**productGroupIds** | **string** | List of product group ids | [optional] 
**productGroupStatuses** | [**OpenAPI\Server\Model\ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **string** | List of product item ids | [optional] 
**targetingTypes** | [**OpenAPI\Server\Model\AdsAnalyticsTargetingType**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**metricsFilters** | [**OpenAPI\Server\Model\AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



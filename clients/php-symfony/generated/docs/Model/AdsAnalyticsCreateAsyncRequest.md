# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**OpenAPI\Server\Model\Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**clickWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagementWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**viewWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversionReportTime** | [**OpenAPI\Server\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**attributionTypes** | [**OpenAPI\Server\Model\ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**campaignIds** | **string** | List of campaign ids | [optional] 
**campaignStatuses** | [**OpenAPI\Server\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**campaignObjectiveTypes** | [**OpenAPI\Server\Model\ObjectiveType**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] 
**adGroupIds** | **string** | List of ad group ids | [optional] 
**adGroupStatuses** | [**OpenAPI\Server\Model\AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **string** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] 
**adStatuses** | [**OpenAPI\Server\Model\PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] 
**productGroupIds** | **string** | List of product group ids | [optional] 
**productGroupStatuses** | [**OpenAPI\Server\Model\ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **string** | List of product item ids | [optional] 
**targetingTypes** | [**OpenAPI\Server\Model\AdsAnalyticsTargetingType**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] 
**metricsFilters** | [**OpenAPI\Server\Model\AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**columns** | [**OpenAPI\Server\Model\ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | [**OpenAPI\Server\Model\MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**reportFormat** | [**OpenAPI\Server\Model\DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to 'JSON']
**primarySort** | **string** | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional] 
**startHour** | **int** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional] 
**endHour** | **int** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



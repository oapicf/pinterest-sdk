# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **string** | List of ad group ids | [optional] 
**adGroupStatuses** | [**OpenAPI\Server\Model\AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **string** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**adStatuses** | [**OpenAPI\Server\Model\PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**attributionTypes** | [**OpenAPI\Server\Model\ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**campaignBrandLabel** | **string** | Campaign brand label for filtering. | [optional] 
**campaignCustomLabel** | **string** | Campaign custom label for filtering. | [optional] 
**campaignIds** | **string** | List of campaign ids | [optional] 
**campaignObjectiveTypes** | [**OpenAPI\Server\Model\CampaignObjectiveType**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**campaignStatuses** | [**OpenAPI\Server\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**clickWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to 30]
**columns** | [**OpenAPI\Server\Model\ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combineTargetingTypes** | **bool** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversionReportTime** | [**OpenAPI\Server\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to ConversionReportTimeType::TIME_OF_AD_ACTION]
**customConversionEventMetrics** | [**OpenAPI\Server\Model\CustomConversionEventMetrics**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**endHour** | **int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**engagementWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to 30]
**granularity** | [**OpenAPI\Server\Model\Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | [**OpenAPI\Server\Model\MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] 
**metricsFilters** | [**OpenAPI\Server\Model\AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**primarySort** | [**OpenAPI\Server\Model\PrimarySort**](PrimarySort.md) |  | [optional] [default to PrimarySort::BY_ID]
**productGroupIds** | **string** | List of product group ids | [optional] 
**productGroupStatuses** | [**OpenAPI\Server\Model\ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **string** | List of product item ids | [optional] 
**reportFormat** | [**OpenAPI\Server\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to DataOutputFormat::JSON]
**reportingTimezone** | [**OpenAPI\Server\Model\ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] 
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**startHour** | **int** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**targetingTypes** | [**OpenAPI\Server\Model\AdAdsAnalyticsAsyncTargetingTypes**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**viewWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



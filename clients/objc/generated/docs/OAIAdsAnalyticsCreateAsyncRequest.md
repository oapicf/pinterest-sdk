# OAIAdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **NSArray&lt;NSString*&gt;*** | List of ad group ids | [optional] 
**adGroupStatuses** | [**NSArray&lt;OAIAdGroupSummaryStatus&gt;***](OAIAdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**adIds** | **NSArray&lt;NSString*&gt;*** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**adStatuses** | [**NSArray&lt;OAIPinPromotionSummaryStatus&gt;***](OAIPinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**attributionTypes** | [**NSArray&lt;OAIConversionReportAttributionType&gt;***](OAIConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**campaignBrandLabel** | **NSString*** | Campaign brand label for filtering. | [optional] 
**campaignCustomLabel** | **NSString*** | Campaign custom label for filtering. | [optional] 
**campaignIds** | **NSArray&lt;NSString*&gt;*** | List of campaign ids | [optional] 
**campaignObjectiveTypes** | [**NSArray&lt;OAICampaignObjectiveType&gt;***](OAICampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**campaignStatuses** | [**NSArray&lt;OAICampaignSummaryStatus&gt;***](OAICampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**clickWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**columns** | [**NSArray&lt;OAIReportingColumnAsync&gt;***](OAIReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combineTargetingTypes** | **NSNumber*** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to @(NO)]
**conversionReportTime** | [**OAIConversionReportTimeType***](OAIConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] 
**customConversionEventMetrics** | [**NSArray&lt;OAICustomConversionEventMetrics&gt;***](OAICustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**endDate** | **NSString*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**endHour** | **NSNumber*** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**engagementWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**granularity** | [**OAIGranularity***](OAIGranularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | [**OAIMetricsReportingLevel***](OAIMetricsReportingLevel.md) | Level of the report | [optional] 
**metricsFilters** | [**NSArray&lt;OAIAdsAnalyticsMetricsFilter&gt;***](OAIAdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**primarySort** | [**OAIPrimarySort***](OAIPrimarySort.md) |  | [optional] 
**productGroupIds** | **NSArray&lt;NSString*&gt;*** | List of product group ids | [optional] 
**productGroupStatuses** | [**NSArray&lt;OAIProductGroupSummaryStatus&gt;***](OAIProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**productItemIds** | **NSArray&lt;NSString*&gt;*** | List of product item ids | [optional] 
**reportFormat** | [**OAIDataOutputFormat***](OAIDataOutputFormat.md) |  | [optional] 
**reportingTimezone** | [**OAIReportingTimeZone***](OAIReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] 
**startDate** | **NSString*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**startHour** | **NSNumber*** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**targetingTypes** | [**NSArray&lt;OAIAdAdsAnalyticsAsyncTargetingTypes&gt;***](OAIAdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**viewWindowDays** | [**OAIConversionAttributionWindowDays***](OAIConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



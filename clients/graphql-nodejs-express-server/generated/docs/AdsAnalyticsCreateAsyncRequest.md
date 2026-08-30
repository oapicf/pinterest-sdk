# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **String!** | List of ad group ids | [optional] [default to null]
**adGroupStatuses** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**adIds** | **String!** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to null]
**adStatuses** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to null]
**attributionTypes** | [**ConversionReportAttributionType**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to null]
**campaignBrandLabel** | **String!** | Campaign brand label for filtering. | [optional] [default to null]
**campaignCustomLabel** | **String!** | Campaign custom label for filtering. | [optional] [default to null]
**campaignIds** | **String!** | List of campaign ids | [optional] [default to null]
**campaignObjectiveTypes** | [**CampaignObjectiveType**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [default to null]
**campaignStatuses** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to null]
**clickWindowDays** | [***ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to 30]
**columns** | [**ReportingColumnAsync**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to null]
**combineTargetingTypes** | **Boolean!** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversionReportTime** | [***ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to TIME_OF_AD_ACTION]
**customConversionEventMetrics** | [**CustomConversionEventMetrics**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to null]
**endDate** | **String!** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**endHour** | **Int!** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to null]
**engagementWindowDays** | [***ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to 30]
**granularity** | [***Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [default to null]
**level** | [***MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] [default to null]
**metricsFilters** | [**AdsAnalyticsMetricsFilter**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to null]
**primarySort** | [***PrimarySort**](PrimarySort.md) |  | [optional] [default to BY_ID]
**productGroupIds** | **String!** | List of product group ids | [optional] [default to null]
**productGroupStatuses** | [**ProductGroupSummaryStatus**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to null]
**productItemIds** | **String!** | List of product item ids | [optional] [default to null]
**reportFormat** | [***DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to JSON]
**reportingTimezone** | [***ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to null]
**startDate** | **String!** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**startHour** | **Int!** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to null]
**targetingTypes** | [**AdAdsAnalyticsAsyncTargetingTypes**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [default to null]
**viewWindowDays** | [***ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



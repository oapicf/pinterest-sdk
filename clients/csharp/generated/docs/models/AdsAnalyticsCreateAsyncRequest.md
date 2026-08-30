# Org.OpenAPITools.Model.AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**AdGroupIds** | **List&lt;string&gt;** | List of ad group ids | [optional] 
**AdGroupStatuses** | [**List&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | **List&lt;string&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**AdStatuses** | [**List&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**AttributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**CampaignBrandLabel** | **string** | Campaign brand label for filtering. | [optional] 
**CampaignCustomLabel** | **string** | Campaign custom label for filtering. | [optional] 
**CampaignIds** | **List&lt;string&gt;** | List of campaign ids | [optional] 
**CampaignObjectiveTypes** | [**List&lt;CampaignObjectiveType&gt;**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**CampaignStatuses** | [**List&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**ClickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**Columns** | [**List&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**CombineTargetingTypes** | **bool** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**ConversionReportTime** | **ConversionReportTimeType** | Date dimension for conversion metrics. | [optional] 
**CustomConversionEventMetrics** | [**List&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**EndHour** | **int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**EngagementWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**Level** | **MetricsReportingLevel** | Level of the report | [optional] 
**MetricsFilters** | [**List&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**PrimarySort** | **PrimarySort** |  | [optional] 
**ProductGroupIds** | **List&lt;string&gt;** | List of product group ids | [optional] 
**ProductGroupStatuses** | [**List&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | **List&lt;string&gt;** | List of product item ids | [optional] 
**ReportFormat** | **DataOutputFormat** |  | [optional] 
**ReportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. | [optional] 
**StartHour** | **int** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**TargetingTypes** | [**List&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**ViewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

